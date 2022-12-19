package com.accenture.pacvivofinancestatus.repository;

import com.accenture.pacvivofinancestatus.model.*;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class CustomerBillRepositoryImp implements CustomerBillRepository {

    @Override
    public CustomerBill createCustomerBill(FinancialAccount response){

        CustomerBill customerBill = new CustomerBill();
        AppliedPayment appliedPayment = new AppliedPayment();
        AttachmentRefOrValue attachmentRefOrValue = new AttachmentRefOrValue();
        RelatedPartyRef relatedPartyRef = new RelatedPartyRef();
        TaxItem taxItem = new TaxItem();
        PaymentRef paymentRef = new PaymentRef();
        Quantity quantity = new Quantity();
        TimePeriod timePeriod = new TimePeriod();
        BillingAccountRef billingAccountRef = new BillingAccountRef();
        FinancialAccountRef financialAccountRef = new FinancialAccountRef();
        AccountBalance accountBalance = new AccountBalance();
        PaymentMethodRef paymentMethodRef = new PaymentMethodRef();
        StateValue stateValue = StateValue.VALIDATED;

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        List<AppliedPayment> listAppliedPayment = new ArrayList<>();
        List<AttachmentRefOrValue> listAttachmentRefOrValue = new ArrayList<>();
        List<RelatedPartyRef> listRelatedParty = new ArrayList<>();
        List<TaxItem> listTaxItem = new ArrayList<>();

        paymentRef.setId(UUID.randomUUID().toString());
        paymentRef.setHref("href");
        paymentRef.setName("name");
        paymentRef.setBaseType("base");
        paymentRef.setSchemaLocation("schema");
        paymentRef.setType("type");
        paymentRef.setReferredType("referredType");

        appliedPayment.setAppliedAmount(response.getCreditLimit());
        appliedPayment.setAppliedAmount(response.getCreditLimit());
        appliedPayment.setPayment(paymentRef);
        appliedPayment.setBaseType("base");
        appliedPayment.setSchemaLocation("schema");
        appliedPayment.setType("type");

        listAppliedPayment.add(appliedPayment);
        listAppliedPayment.add(appliedPayment);
        listAppliedPayment.add(appliedPayment);

        quantity.setAmount(2000F);
        quantity.setUnits("UN");

        timePeriod.setStartDateTime(offsetDateTime);
        timePeriod.endDateTime(offsetDateTime);

        attachmentRefOrValue.setId(UUID.randomUUID().toString());
        attachmentRefOrValue.setHref("href");
        attachmentRefOrValue.setAttachmentType("attachmentRefOrValue");
        attachmentRefOrValue.setContent("contet");
        attachmentRefOrValue.setDescription("Description");
        attachmentRefOrValue.setMimeType("mimeType");
        attachmentRefOrValue.setName("name");
        attachmentRefOrValue.setUrl("url");
        attachmentRefOrValue.setSize(quantity);
        attachmentRefOrValue.setValidFor(timePeriod);
        attachmentRefOrValue.setBaseType("base");
        attachmentRefOrValue.setSchemaLocation("schema");
        attachmentRefOrValue.setType("type");
        attachmentRefOrValue.setReferredType("referredType");

        listAttachmentRefOrValue.add(attachmentRefOrValue);
        listAttachmentRefOrValue.add(attachmentRefOrValue);

        billingAccountRef.setId(UUID.randomUUID().toString());
        billingAccountRef.setHref("href");
        billingAccountRef.setName("name");
        billingAccountRef.setBaseType("base");
        billingAccountRef.setSchemaLocation("schema");
        billingAccountRef.setType("type");
        billingAccountRef.setReferredType("referredType");

        accountBalance.setBalanceType("balanceType");
        accountBalance.setAmount(response.getCreditLimit());
        accountBalance.setValidFor(timePeriod);
        accountBalance.setBaseType("base");
        accountBalance.setSchemaLocation("schema");
        accountBalance.setType("type");

        financialAccountRef.setId(UUID.randomUUID().toString());
        financialAccountRef.setHref("href");
        financialAccountRef.setName("name");
        financialAccountRef.setAccountBalance(accountBalance);
        financialAccountRef.setBaseType("base");
        financialAccountRef.setSchemaLocation("schema");
        financialAccountRef.setType("type");
        financialAccountRef.setReferredType("referredType");

        paymentMethodRef.setId(UUID.randomUUID().toString());
        paymentMethodRef.setHref("href");
        paymentMethodRef.setName("name");
        paymentMethodRef.setBaseType("base");
        paymentMethodRef.setSchemaLocation("schema");
        paymentMethodRef.setType("type");
        paymentMethodRef.setReferredType("referredType");

        relatedPartyRef.setId(UUID.randomUUID().toString());
        relatedPartyRef.setHref("href");
        relatedPartyRef.setName("name");
        relatedPartyRef.setRole("ROLE");
        relatedPartyRef.setBaseType("base");
        relatedPartyRef.setSchemaLocation("schema");
        relatedPartyRef.setType("type");
        relatedPartyRef.setReferredType("referredType");

        listRelatedParty.add(relatedPartyRef);
        listRelatedParty.add(relatedPartyRef);
        listRelatedParty.add(relatedPartyRef);
        listRelatedParty.add(relatedPartyRef);

        taxItem.setTaxCategory("category");
        taxItem.setTaxRate(200F);
        taxItem.setTaxAmount(response.getCreditLimit());
        taxItem.setBaseType("base");
        taxItem.setSchemaLocation("schema");
        taxItem.setType("type");
        listTaxItem.add(taxItem);
        listTaxItem.add(taxItem);
        listTaxItem.add(taxItem);

        customerBill.setId(response.getId());
        customerBill.setHref(response.getHref());
        customerBill.setBillDate(offsetDateTime);
        customerBill.setBillNo("BillNo");
        customerBill.setCategory("category");
        customerBill.setLastUpdate(response.getLastModified());
        customerBill.setNextBillDate(offsetDateTime);
        customerBill.setPaymentDueDate(offsetDateTime);
        customerBill.setRunType("runTyoe");
        customerBill.setAmountDue(response.getCreditLimit());
        customerBill.setAppliedPayment(listAppliedPayment);
        customerBill.setBillDocument(listAttachmentRefOrValue);
        customerBill.setBillingAccount(billingAccountRef);
        customerBill.setBillingPeriod(timePeriod);
        customerBill.setFinancialAccount(financialAccountRef);
        customerBill.setPaymentMethod(paymentMethodRef);
        customerBill.setRelatedParty(listRelatedParty);
        customerBill.setRemainingAmount(response.getCreditLimit());
        customerBill.setState(stateValue);
        customerBill.setTaxExcludedAmount(response.getCreditLimit());
        customerBill.setTaxIncludedAmount(response.getCreditLimit());
        customerBill.setTaxItem(listTaxItem);
        customerBill.setBaseType("base");
        customerBill.setSchemaLocation("schema");
        customerBill.setType("type");

        return customerBill;
    }
}
