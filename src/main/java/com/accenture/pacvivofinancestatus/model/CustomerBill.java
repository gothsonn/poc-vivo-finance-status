package com.accenture.pacvivofinancestatus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.time.OffsetDateTime;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The billing account receives all charges (recurring, one time and usage) of the offers and products assigned to it during order process. Periodically according to billing cycle specifications attached to the billing account or as a result of an event, a customer bill (aka invoice) is produced. This customer bill concerns different related parties which play a role on it : for example, a customer bill is produced by an operator, is sent to a bill receiver and has to be paid by a payer. A payment method could be assigned to the customer bill to build the call of payment. Lettering process enables to assign automatically or manually incoming amount from payments to customer bills (payment items). A tax item is created for each tax rate used in the customer bill. The financial account represents a financial entity which records all customer’s accounting events : payment amount are recorded as credit and invoices amount are recorded as debit. It gives the customer overall balance (account balance). The customer bill is linked to one or more documents that can be downloaded via a provided url.
 */
@ApiModel(description = "The billing account receives all charges (recurring, one time and usage) of the offers and products assigned to it during order process. Periodically according to billing cycle specifications attached to the billing account or as a result of an event, a customer bill (aka invoice) is produced. This customer bill concerns different related parties which play a role on it : for example, a customer bill is produced by an operator, is sent to a bill receiver and has to be paid by a payer. A payment method could be assigned to the customer bill to build the call of payment. Lettering process enables to assign automatically or manually incoming amount from payments to customer bills (payment items). A tax item is created for each tax rate used in the customer bill. The financial account represents a financial entity which records all customer’s accounting events : payment amount are recorded as credit and invoices amount are recorded as debit. It gives the customer overall balance (account balance). The customer bill is linked to one or more documents that can be downloaded via a provided url.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-12-17T13:51:37.299Z")


public class CustomerBill {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("billDate")
  private OffsetDateTime billDate = null;

  @JsonProperty("billNo")
  private String billNo = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("lastUpdate")
  private OffsetDateTime lastUpdate = null;

  @JsonProperty("nextBillDate")
  private OffsetDateTime nextBillDate = null;

  @JsonProperty("paymentDueDate")
  private OffsetDateTime paymentDueDate = null;

  @JsonProperty("runType")
  private String runType = null;

  @JsonProperty("amountDue")
  private Money amountDue = null;

  @JsonProperty("appliedPayment")
  @Valid
  private List<AppliedPayment> appliedPayment = null;

  @JsonProperty("billDocument")
  @Valid
  private List<AttachmentRefOrValue> billDocument = null;

  @JsonProperty("billingAccount")
  private BillingAccountRef billingAccount = null;

  @JsonProperty("billingPeriod")
  private TimePeriod billingPeriod = null;

  @JsonProperty("financialAccount")
  private FinancialAccountRef financialAccount = null;

  @JsonProperty("paymentMethod")
  private PaymentMethodRef paymentMethod = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedPartyRef> relatedParty = null;

  @JsonProperty("remainingAmount")
  private Money remainingAmount = null;

  @JsonProperty("state")
  private StateValue state = null;

  @JsonProperty("taxExcludedAmount")
  private Money taxExcludedAmount = null;

  @JsonProperty("taxIncludedAmount")
  private Money taxIncludedAmount = null;

  @JsonProperty("taxItem")
  @Valid
  private List<TaxItem> taxItem = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public CustomerBill id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of he bill
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of he bill")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerBill href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Bill unique reference
   * @return href
  **/
  @ApiModelProperty(value = "Bill unique reference")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public CustomerBill billDate(OffsetDateTime billDate) {
    this.billDate = billDate;
    return this;
  }

  /**
   * Bill date
   * @return billDate
  **/
  @ApiModelProperty(value = "Bill date")

  @Valid

  public OffsetDateTime getBillDate() {
    return billDate;
  }

  public void setBillDate(OffsetDateTime billDate) {
    this.billDate = billDate;
  }

  public CustomerBill billNo(String billNo) {
    this.billNo = billNo;
    return this;
  }

  /**
   * Bill reference known by the customer or the party and displayed on the bill. Could be different from the id
   * @return billNo
  **/
  @ApiModelProperty(value = "Bill reference known by the customer or the party and displayed on the bill. Could be different from the id")


  public String getBillNo() {
    return billNo;
  }

  public void setBillNo(String billNo) {
    this.billNo = billNo;
  }

  public CustomerBill category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Category of the bill produced : normal, duplicate, interim, last, trial customer or credit note for example
   * @return category
  **/
  @ApiModelProperty(value = "Category of the bill produced : normal, duplicate, interim, last, trial customer or credit note for example")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public CustomerBill lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Date of bill last update
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "Date of bill last update")

  @Valid

  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public CustomerBill nextBillDate(OffsetDateTime nextBillDate) {
    this.nextBillDate = nextBillDate;
    return this;
  }

  /**
   * ). Approximate date of  the next bill production given for information (only used for onCycle bill)
   * @return nextBillDate
  **/
  @ApiModelProperty(value = "). Approximate date of  the next bill production given for information (only used for onCycle bill)")

  @Valid

  public OffsetDateTime getNextBillDate() {
    return nextBillDate;
  }

  public void setNextBillDate(OffsetDateTime nextBillDate) {
    this.nextBillDate = nextBillDate;
  }

  public CustomerBill paymentDueDate(OffsetDateTime paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
    return this;
  }

  /**
   * Date at which the amount due should have been paid
   * @return paymentDueDate
  **/
  @ApiModelProperty(value = "Date at which the amount due should have been paid")

  @Valid

  public OffsetDateTime getPaymentDueDate() {
    return paymentDueDate;
  }

  public void setPaymentDueDate(OffsetDateTime paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
  }

  public CustomerBill runType(String runType) {
    this.runType = runType;
    return this;
  }

  /**
   * onCycle (a bill can be created as a result of a cycle run) or offCycle (a bill can be created as a result of other events such as customer request or account close)
   * @return runType
  **/
  @ApiModelProperty(value = "onCycle (a bill can be created as a result of a cycle run) or offCycle (a bill can be created as a result of other events such as customer request or account close)")


  public String getRunType() {
    return runType;
  }

  public void setRunType(String runType) {
    this.runType = runType;
  }

  public CustomerBill amountDue(Money amountDue) {
    this.amountDue = amountDue;
    return this;
  }

  /**
   * Get amountDue
   * @return amountDue
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Money getAmountDue() {
    return amountDue;
  }

  public void setAmountDue(Money amountDue) {
    this.amountDue = amountDue;
  }

  public CustomerBill appliedPayment(List<AppliedPayment> appliedPayment) {
    this.appliedPayment = appliedPayment;
    return this;
  }

  public CustomerBill addAppliedPaymentItem(AppliedPayment appliedPaymentItem) {
    if (this.appliedPayment == null) {
      this.appliedPayment = new ArrayList<AppliedPayment>();
    }
    this.appliedPayment.add(appliedPaymentItem);
    return this;
  }

  /**
   * Get appliedPayment
   * @return appliedPayment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AppliedPayment> getAppliedPayment() {
    return appliedPayment;
  }

  public void setAppliedPayment(List<AppliedPayment> appliedPayment) {
    this.appliedPayment = appliedPayment;
  }

  public CustomerBill billDocument(List<AttachmentRefOrValue> billDocument) {
    this.billDocument = billDocument;
    return this;
  }

  public CustomerBill addBillDocumentItem(AttachmentRefOrValue billDocumentItem) {
    if (this.billDocument == null) {
      this.billDocument = new ArrayList<AttachmentRefOrValue>();
    }
    this.billDocument.add(billDocumentItem);
    return this;
  }

  /**
   * Get billDocument
   * @return billDocument
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AttachmentRefOrValue> getBillDocument() {
    return billDocument;
  }

  public void setBillDocument(List<AttachmentRefOrValue> billDocument) {
    this.billDocument = billDocument;
  }

  public CustomerBill billingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  /**
   * Get billingAccount
   * @return billingAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BillingAccountRef getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
  }

  public CustomerBill billingPeriod(TimePeriod billingPeriod) {
    this.billingPeriod = billingPeriod;
    return this;
  }

  /**
   * Get billingPeriod
   * @return billingPeriod
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TimePeriod getBillingPeriod() {
    return billingPeriod;
  }

  public void setBillingPeriod(TimePeriod billingPeriod) {
    this.billingPeriod = billingPeriod;
  }

  public CustomerBill financialAccount(FinancialAccountRef financialAccount) {
    this.financialAccount = financialAccount;
    return this;
  }

  /**
   * Get financialAccount
   * @return financialAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public FinancialAccountRef getFinancialAccount() {
    return financialAccount;
  }

  public void setFinancialAccount(FinancialAccountRef financialAccount) {
    this.financialAccount = financialAccount;
  }

  public CustomerBill paymentMethod(PaymentMethodRef paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentMethodRef getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethodRef paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public CustomerBill relatedParty(List<RelatedPartyRef> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public CustomerBill addRelatedPartyItem(RelatedPartyRef relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedPartyRef>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RelatedPartyRef> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedPartyRef> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public CustomerBill remainingAmount(Money remainingAmount) {
    this.remainingAmount = remainingAmount;
    return this;
  }

  /**
   * Get remainingAmount
   * @return remainingAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Money getRemainingAmount() {
    return remainingAmount;
  }

  public void setRemainingAmount(Money remainingAmount) {
    this.remainingAmount = remainingAmount;
  }

  public CustomerBill state(StateValue state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")

  @Valid

  public StateValue getState() {
    return state;
  }

  public void setState(StateValue state) {
    this.state = state;
  }

  public CustomerBill taxExcludedAmount(Money taxExcludedAmount) {
    this.taxExcludedAmount = taxExcludedAmount;
    return this;
  }

  /**
   * Get taxExcludedAmount
   * @return taxExcludedAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Money getTaxExcludedAmount() {
    return taxExcludedAmount;
  }

  public void setTaxExcludedAmount(Money taxExcludedAmount) {
    this.taxExcludedAmount = taxExcludedAmount;
  }

  public CustomerBill taxIncludedAmount(Money taxIncludedAmount) {
    this.taxIncludedAmount = taxIncludedAmount;
    return this;
  }

  /**
   * Get taxIncludedAmount
   * @return taxIncludedAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Money getTaxIncludedAmount() {
    return taxIncludedAmount;
  }

  public void setTaxIncludedAmount(Money taxIncludedAmount) {
    this.taxIncludedAmount = taxIncludedAmount;
  }

  public CustomerBill taxItem(List<TaxItem> taxItem) {
    this.taxItem = taxItem;
    return this;
  }

  public CustomerBill addTaxItemItem(TaxItem taxItemItem) {
    if (this.taxItem == null) {
      this.taxItem = new ArrayList<TaxItem>();
    }
    this.taxItem.add(taxItemItem);
    return this;
  }

  /**
   * Get taxItem
   * @return taxItem
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<TaxItem> getTaxItem() {
    return taxItem;
  }

  public void setTaxItem(List<TaxItem> taxItem) {
    this.taxItem = taxItem;
  }

  public CustomerBill baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public CustomerBill schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public CustomerBill type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerBill customerBill = (CustomerBill) o;
    return Objects.equals(this.id, customerBill.id) &&
        Objects.equals(this.href, customerBill.href) &&
        Objects.equals(this.billDate, customerBill.billDate) &&
        Objects.equals(this.billNo, customerBill.billNo) &&
        Objects.equals(this.category, customerBill.category) &&
        Objects.equals(this.lastUpdate, customerBill.lastUpdate) &&
        Objects.equals(this.nextBillDate, customerBill.nextBillDate) &&
        Objects.equals(this.paymentDueDate, customerBill.paymentDueDate) &&
        Objects.equals(this.runType, customerBill.runType) &&
        Objects.equals(this.amountDue, customerBill.amountDue) &&
        Objects.equals(this.appliedPayment, customerBill.appliedPayment) &&
        Objects.equals(this.billDocument, customerBill.billDocument) &&
        Objects.equals(this.billingAccount, customerBill.billingAccount) &&
        Objects.equals(this.billingPeriod, customerBill.billingPeriod) &&
        Objects.equals(this.financialAccount, customerBill.financialAccount) &&
        Objects.equals(this.paymentMethod, customerBill.paymentMethod) &&
        Objects.equals(this.relatedParty, customerBill.relatedParty) &&
        Objects.equals(this.remainingAmount, customerBill.remainingAmount) &&
        Objects.equals(this.state, customerBill.state) &&
        Objects.equals(this.taxExcludedAmount, customerBill.taxExcludedAmount) &&
        Objects.equals(this.taxIncludedAmount, customerBill.taxIncludedAmount) &&
        Objects.equals(this.taxItem, customerBill.taxItem) &&
        Objects.equals(this.baseType, customerBill.baseType) &&
        Objects.equals(this.schemaLocation, customerBill.schemaLocation) &&
        Objects.equals(this.type, customerBill.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, billDate, billNo, category, lastUpdate, nextBillDate, paymentDueDate, runType, amountDue, appliedPayment, billDocument, billingAccount, billingPeriod, financialAccount, paymentMethod, relatedParty, remainingAmount, state, taxExcludedAmount, taxIncludedAmount, taxItem, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerBill {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    billDate: ").append(toIndentedString(billDate)).append("\n");
    sb.append("    billNo: ").append(toIndentedString(billNo)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    nextBillDate: ").append(toIndentedString(nextBillDate)).append("\n");
    sb.append("    paymentDueDate: ").append(toIndentedString(paymentDueDate)).append("\n");
    sb.append("    runType: ").append(toIndentedString(runType)).append("\n");
    sb.append("    amountDue: ").append(toIndentedString(amountDue)).append("\n");
    sb.append("    appliedPayment: ").append(toIndentedString(appliedPayment)).append("\n");
    sb.append("    billDocument: ").append(toIndentedString(billDocument)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
    sb.append("    financialAccount: ").append(toIndentedString(financialAccount)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    remainingAmount: ").append(toIndentedString(remainingAmount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    taxExcludedAmount: ").append(toIndentedString(taxExcludedAmount)).append("\n");
    sb.append("    taxIncludedAmount: ").append(toIndentedString(taxIncludedAmount)).append("\n");
    sb.append("    taxItem: ").append(toIndentedString(taxItem)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

