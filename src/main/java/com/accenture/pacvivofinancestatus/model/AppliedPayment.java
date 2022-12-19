package com.accenture.pacvivofinancestatus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * The applied payment is the result of lettering process. It enables to assign automatically or manually part of incoming payment amount to a bill.
 */
@ApiModel(description = "The applied payment is the result of lettering process. It enables to assign automatically or manually part of incoming payment amount to a bill.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-12-17T13:51:37.299Z")


public class AppliedPayment {
  @JsonProperty("appliedAmount")
  private Money appliedAmount = null;

  @JsonProperty("payment")
  private PaymentRef payment = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public AppliedPayment appliedAmount(Money appliedAmount) {
    this.appliedAmount = appliedAmount;
    return this;
  }

  /**
   * Get appliedAmount
   * @return appliedAmount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Money getAppliedAmount() {
    return appliedAmount;
  }

  public void setAppliedAmount(Money appliedAmount) {
    this.appliedAmount = appliedAmount;
  }

  public AppliedPayment payment(PaymentRef payment) {
    this.payment = payment;
    return this;
  }

  /**
   * Get payment
   * @return payment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PaymentRef getPayment() {
    return payment;
  }

  public void setPayment(PaymentRef payment) {
    this.payment = payment;
  }

  public AppliedPayment baseType(String baseType) {
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

  public AppliedPayment schemaLocation(String schemaLocation) {
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

  public AppliedPayment type(String type) {
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
    AppliedPayment appliedPayment = (AppliedPayment) o;
    return Objects.equals(this.appliedAmount, appliedPayment.appliedAmount) &&
        Objects.equals(this.payment, appliedPayment.payment) &&
        Objects.equals(this.baseType, appliedPayment.baseType) &&
        Objects.equals(this.schemaLocation, appliedPayment.schemaLocation) &&
        Objects.equals(this.type, appliedPayment.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedAmount, payment, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppliedPayment {\n");
    
    sb.append("    appliedAmount: ").append(toIndentedString(appliedAmount)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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

