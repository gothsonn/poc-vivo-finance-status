package com.accenture.pacvivofinancestatus.dao;

import com.accenture.pacvivofinancestatus.model.FinancialAccount;
import com.accenture.pacvivofinancestatus.utility.ApiHelper;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

import static com.mongodb.client.model.Aggregates.match;
import static com.mongodb.client.model.Filters.eq;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

@Component
public class CustomerBillDao {

    private static String FINANCIAL_ACCOUNT_COLLECTION_NAME = "financialAccounts";
    private MongoCollection<FinancialAccount> collection;
    private CodecRegistry registry;
    private Integer defaultLimit = 0;

    private final CodecProvider financialAccountProvider = PojoCodecProvider.builder()
            .register(FinancialAccount.class.getPackage().getName())
            .build();

    @Autowired
    public CustomerBillDao(MongoClient mongoClient, @Value("${db.dbname}") String databaseName, @Value("${db.defaultLimit}") Integer limit) {
        this.registry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(financialAccountProvider),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        defaultLimit = limit;
        collection = mongoClient.getDatabase(databaseName).
                getCollection(FINANCIAL_ACCOUNT_COLLECTION_NAME, FinancialAccount.class)
                .withCodecRegistry(registry);
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

}