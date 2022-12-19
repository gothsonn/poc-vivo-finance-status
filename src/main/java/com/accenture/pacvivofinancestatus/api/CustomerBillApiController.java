package com.accenture.pacvivofinancestatus.api;

import com.accenture.pacvivofinancestatus.dao.CustomerBillDao;
import com.accenture.pacvivofinancestatus.model.*;
import com.accenture.pacvivofinancestatus.repository.CustomerBillRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-12-17T13:51:37.299Z")

@Controller
public class CustomerBillApiController implements CustomerBillApi {

    private static final Logger log = LoggerFactory.getLogger(CustomerBillApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final CustomerBillDao customerBillDao;

    private final CustomerBillRepository customerBillRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public CustomerBillApiController(ObjectMapper objectMapper, HttpServletRequest request, CustomerBillDao customerBillDao, CustomerBillDao customerBillDao1, CustomerBillRepository customerBillRepository) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.customerBillDao = customerBillDao;
        this.customerBillRepository = customerBillRepository;
    }

    public ResponseEntity<CustomerBill> retrieveCustomerBill(
            @ApiParam(value = "Identifier of the CustomerBill",required=true)
            @PathVariable("id") String id,
            @ApiParam(value = "Comma-separated properties to provide in response")
            @Valid @RequestParam(value = "fields", required = false) String fields
    ) {
        if (request.getHeader("Accept") != null && (request.getHeader("Accept").contains("application/json") || request.getContentType().contains("application/json"))) {
            var response = customerBillDao.getFinancialAccount(id, fields);
            CustomerBill customerBill = customerBillRepository.createCustomerBill(response);
            return new ResponseEntity<CustomerBill>(customerBill, HttpStatus.OK);
        }
        return new ResponseEntity<CustomerBill>(HttpStatus.NOT_IMPLEMENTED);
    }




    public ResponseEntity<CustomerBill> requestMock(
            @ApiParam(value = "Identifier of the CustomerBill",required=true)
            @PathVariable("id") String id,
            @ApiParam(value = "Comma-separated properties to provide in response")
            @Valid @RequestParam(value = "fields", required = false) String fields
    ) {
        CustomerBill customerBill = new CustomerBill();
        if (request.getHeader("Accept") != null && (request.getHeader("Accept").contains("application/json") || request.getContentType().contains("application/json"))) {

            FinancialAccount financialAccount = new FinancialAccount();
            OffsetDateTime offsetDateTime = OffsetDateTime.now();
            AccountBalance accountBalance = new AccountBalance();
            AccountRelationship accountRelationship = new AccountRelationship();
            AccountRef accountRef = new AccountRef();
            TimePeriod timePeriod = new TimePeriod();
            Money money = new Money();
            Contact contact = new Contact();
            ContactMedium contactMedium = new ContactMedium();
            MediumCharacteristic mediumCharacteristic = new MediumCharacteristic();
            RelatedParty relatedParty = new RelatedParty();
            AccountTaxExemption accountTaxExemption = new AccountTaxExemption();


            List<AccountBalance> listAccountBalance = new ArrayList<AccountBalance>();
            List<AccountRelationship> listAccountRelationship = new ArrayList<AccountRelationship>();
            List<Contact> listContact = new ArrayList<Contact>();
            List<ContactMedium> listContactMedium = new ArrayList<ContactMedium>();
            List<RelatedParty> listRelatedParty = new ArrayList<RelatedParty>();
            List<AccountTaxExemption> listAccountTaxExemption = new ArrayList<AccountTaxExemption>();

            money.setUnit("UN");
            money.setValue(2000f);
            accountTaxExemption.setCertificateNumber("981");
            accountTaxExemption.setIssuingJurisdiction("Issue");
            accountTaxExemption.setReason("razao");
            accountTaxExemption.setBaseType("tipo de base");
            accountTaxExemption.setSchemaLocation("schema");
            accountTaxExemption.setType("tipo");
            accountTaxExemption.setValidFor(timePeriod);
            listAccountTaxExemption.add(accountTaxExemption);
            listAccountTaxExemption.add(accountTaxExemption);
            listAccountTaxExemption.add(accountTaxExemption);
            listAccountTaxExemption.add(accountTaxExemption);


            relatedParty.setId(UUID.randomUUID().toString());
            relatedParty.setHref("H ref");
            relatedParty.setName("nome rel");
            relatedParty.setRole("regra");
            relatedParty.setBaseType("tipo de base");
            relatedParty.setSchemaLocation("schema loca");
            relatedParty.setType("tipo");
            relatedParty.setReferredType("refe");
            listRelatedParty.add(relatedParty);
            listRelatedParty.add(relatedParty);

            contactMedium.setMediumType("Tipo de Medium");
            contactMedium.setPreferred(true);
            contactMedium.setBaseType("tipo de base");
            contactMedium.setSchemaLocation("local schema");
            contactMedium.setType("tipo");
            contactMedium.setCharacteristic(mediumCharacteristic);
            contactMedium.setValidFor(timePeriod);
            listContactMedium.add(contactMedium);
            listContactMedium.add(contactMedium);
            listContactMedium.add(contactMedium);


            contact.setContactName("Nome do contrat");
            contact.setContactType("tipo do contrato");
            contact.setPartyRoleType("Part de regra do tipo");
            contact.setBaseType("tipo do base");
            contact.setSchemaLocation("local shcema");
            contact.setType("tipo contact");
            contact.setContactMedium(listContactMedium);
            contact.setRelatedParty(relatedParty);
            contact.setValidFor(timePeriod);
            listContact.add(contact);
            listContact.add(contact);


            accountRef.setId(UUID.randomUUID().toString());
            accountRef.setHref("Hfer Acconte REF");
            accountRef.setDescription("Descricao");
            accountRef.setName("Nome do Ref");
            accountRef.setBaseType("TIpo de base");
            accountRef.setSchemaLocation("schema");
            accountRef.setType("tipo");
            accountRef.setReferredType("Refencia do tipo");

            accountBalance.setBalanceType("Tipo do Balance");
            accountBalance.setBaseType("Tipo da base");
            accountBalance.setSchemaLocation("Localicao do Schema");
            accountBalance.setType("tipo do account Balance");
            accountBalance.setValidFor(timePeriod);
            accountBalance.setAmount(money);
            listAccountBalance.add(accountBalance);
            listAccountBalance.add(accountBalance);

            accountRelationship.setRelationshipType("Relacao do Tipo");
            accountRelationship.setBaseType("tipo de base");
            accountRelationship.setSchemaLocation("schema");
            accountRelationship.setType("tipo");
            accountRelationship.setValidFor(timePeriod);
            accountRelationship.setAccount(accountRef);
            listAccountRelationship.add(accountRelationship);
            listAccountRelationship.add(accountRelationship);
            listAccountRelationship.add(accountRelationship);
            listAccountRelationship.add(accountRelationship);

            financialAccount.setId("00085e5f-83c4-4552-ba1d-5e6eec9384e2");
            financialAccount.setHref("h ref");
            financialAccount.setAccountType("tipo de conta");
            financialAccount.setDescription("descricao");
            financialAccount.setLastModified(offsetDateTime);
            financialAccount.setName("nome");
            financialAccount.setState("estado");
            financialAccount.setAccountBalance(listAccountBalance);
            financialAccount.setAccountRelationship(listAccountRelationship);
            financialAccount.setContact(listContact);
            financialAccount.setCreditLimit(money);
            financialAccount.setRelatedParty(listRelatedParty);
            financialAccount.setTaxExemption(listAccountTaxExemption);
            financialAccount.setBaseType("tipo de base");
            financialAccount.setSchemaLocation("localizxao de schema");
            financialAccount.setType("tiipo");

            customerBill = customerBillRepository.createCustomerBill(financialAccount);

            return new ResponseEntity<CustomerBill>(customerBill, HttpStatus.OK);
        }
        return new ResponseEntity<CustomerBill>(HttpStatus.NOT_IMPLEMENTED);
    }

}
