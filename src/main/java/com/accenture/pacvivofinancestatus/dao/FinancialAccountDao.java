package com.accenture.pacvivofinancestatus.dao;

import static com.mongodb.client.model.Updates.combine;

import com.accenture.pacvivofinancestatus.model.FinancialAccount;
import com.accenture.pacvivofinancestatus.model.FinancialAccountCreate;
import com.accenture.pacvivofinancestatus.model.FinancialAccountRef;
import com.accenture.pacvivofinancestatus.model.FinancialAccountUpdate;
import com.accenture.pacvivofinancestatus.utility.ApiHelper;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.FindOneAndUpdateOptions;
import com.mongodb.client.model.ReturnDocument;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Aggregates.*;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

@Component
public class FinancialAccountDao {

    private static String FINANCIAL_ACCOUNT_COLLECTION_NAME = "financialAccounts";
    private MongoCollection<FinancialAccount> collection;
    private CodecRegistry registry;
    private Integer defaultLimit = 0;

    private final CodecProvider financialAccountProvider = PojoCodecProvider.builder()
            .register(FinancialAccount.class.getPackage().getName())
            .build();

    @Autowired
    public FinancialAccountDao(MongoClient mongoClient, @Value("${db.dbname}") String databaseName, @Value("${db.defaultLimit}") Integer limit) {
        this.registry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(financialAccountProvider),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        defaultLimit = limit;
        collection = mongoClient.getDatabase(databaseName).
                getCollection(FINANCIAL_ACCOUNT_COLLECTION_NAME, FinancialAccount.class)
                .withCodecRegistry(registry);
    }

    public List<FinancialAccount> getFinancialAccounts(String fields, Integer skip, Integer limit) {
        var accounts = new ArrayList<FinancialAccount>();

        if (skip == null) {
            skip = 0;
        }
        if (limit == null || limit == 0) {
            limit = defaultLimit;
        }
        var projectStage = ApiHelper.createProjectStageFromFieldList(fields);

        var pipeline = new ArrayList<Bson>();

        pipeline.add(skip(skip));
        pipeline.add(limit(limit));

        if (projectStage != null) {
            pipeline.add(projectStage);
        }

        collection.aggregate(pipeline).iterator().forEachRemaining(accounts::add);

        return accounts;
    }

    public FinancialAccount getFinancialAccount(String id, String fields) {
        var projectStage = ApiHelper.createProjectStageFromFieldList(fields);

        var pipeline = new ArrayList<Bson>();

        pipeline.add(match(eq("_id", id)));

        if (projectStage != null) {
            pipeline.add(projectStage);
        }

        var account = collection.aggregate(pipeline).first();

        return account;
    }

    public void deleteFinancialAccount(String id) {
        collection.deleteOne(eq("_id", id));
    }


    public FinancialAccount createFinancialAccount(FinancialAccountCreate financialAccountCreate) {
        var account = new FinancialAccount();

        account.setId(java.util.UUID.randomUUID().toString());
        account.setAccountType(financialAccountCreate.getAccountType());
        account.setDescription(financialAccountCreate.getDescription());
        account.setLastModified(OffsetDateTime.now());
        account.setName(financialAccountCreate.getName());
        account.setState(financialAccountCreate.getState());
        account.setAccountBalance(financialAccountCreate.getAccountBalance());
        account.setAccountRelationship(financialAccountCreate.getAccountRelationship());
        account.setContact(financialAccountCreate.getContact());
        account.setCreditLimit(financialAccountCreate.getCreditLimit());
        account.setRelatedParty(financialAccountCreate.getRelatedParty());
        account.setTaxExemption(financialAccountCreate.getTaxExemption());

        collection.insertOne(account);

        return account;
    }

    public FinancialAccount updateFinancialAccount(String id, FinancialAccountUpdate financialAccountUpdate) {

        var updates = ApiHelper.convertUpdateObjectToUpdateExpr(financialAccountUpdate);

        if (!updates.isEmpty()) {
            updates.add(set("lastModified", LocalDateTime.now()));
            var account = collection.findOneAndUpdate(
                    eq("_id", id),
                    combine(updates),
                    new FindOneAndUpdateOptions().returnDocument(ReturnDocument.AFTER)
            );
            return account;
        }

        return null;
    }
}