/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * PayPalDetails
 */
@JsonPropertyOrder({
  PayPalDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  PayPalDetails.JSON_PROPERTY_ORDER_I_D,
  PayPalDetails.JSON_PROPERTY_PAYEE_PREFERRED,
  PayPalDetails.JSON_PROPERTY_PAYER_I_D,
  PayPalDetails.JSON_PROPERTY_PAYER_SELECTED,
  PayPalDetails.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  PayPalDetails.JSON_PROPERTY_STORED_PAYMENT_METHOD_ID,
  PayPalDetails.JSON_PROPERTY_SUBTYPE,
  PayPalDetails.JSON_PROPERTY_TYPE
})

public class PayPalDetails {
  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  public static final String JSON_PROPERTY_ORDER_I_D = "orderID";
  private String orderID;

  public static final String JSON_PROPERTY_PAYEE_PREFERRED = "payeePreferred";
  private String payeePreferred;

  public static final String JSON_PROPERTY_PAYER_I_D = "payerID";
  private String payerID;

  public static final String JSON_PROPERTY_PAYER_SELECTED = "payerSelected";
  private String payerSelected;

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  private String storedPaymentMethodId;

  /**
   * The type of flow to initiate.
   */
  public enum SubtypeEnum {
    REDIRECT("redirect"),
    
    SDK("sdk");

    private String value;

    SubtypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SubtypeEnum fromValue(String value) {
      for (SubtypeEnum b : SubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SUBTYPE = "subtype";
  private SubtypeEnum subtype;

  /**
   * **paypal**
   */
  public enum TypeEnum {
    PAYPAL("paypal");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type = TypeEnum.PAYPAL;

  public PayPalDetails() { 
  }

  public PayPalDetails checkoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

   /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
  **/
  @ApiModelProperty(value = "The checkout attempt identifier.")
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }


  public PayPalDetails orderID(String orderID) {
    this.orderID = orderID;
    return this;
  }

   /**
   * The unique ID associated with the order.
   * @return orderID
  **/
  @ApiModelProperty(value = "The unique ID associated with the order.")
  @JsonProperty(JSON_PROPERTY_ORDER_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderID() {
    return orderID;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }


  public PayPalDetails payeePreferred(String payeePreferred) {
    this.payeePreferred = payeePreferred;
    return this;
  }

   /**
   * IMMEDIATE_PAYMENT_REQUIRED or UNRESTRICTED
   * @return payeePreferred
  **/
  @ApiModelProperty(value = "IMMEDIATE_PAYMENT_REQUIRED or UNRESTRICTED")
  @JsonProperty(JSON_PROPERTY_PAYEE_PREFERRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayeePreferred() {
    return payeePreferred;
  }


  @JsonProperty(JSON_PROPERTY_PAYEE_PREFERRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayeePreferred(String payeePreferred) {
    this.payeePreferred = payeePreferred;
  }


  public PayPalDetails payerID(String payerID) {
    this.payerID = payerID;
    return this;
  }

   /**
   * The unique ID associated with the payer.
   * @return payerID
  **/
  @ApiModelProperty(value = "The unique ID associated with the payer.")
  @JsonProperty(JSON_PROPERTY_PAYER_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayerID() {
    return payerID;
  }


  @JsonProperty(JSON_PROPERTY_PAYER_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayerID(String payerID) {
    this.payerID = payerID;
  }


  public PayPalDetails payerSelected(String payerSelected) {
    this.payerSelected = payerSelected;
    return this;
  }

   /**
   * PAYPAL or PAYPAL_CREDIT
   * @return payerSelected
  **/
  @ApiModelProperty(value = "PAYPAL or PAYPAL_CREDIT")
  @JsonProperty(JSON_PROPERTY_PAYER_SELECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayerSelected() {
    return payerSelected;
  }


  @JsonProperty(JSON_PROPERTY_PAYER_SELECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayerSelected(String payerSelected) {
    this.payerSelected = payerSelected;
  }


  public PayPalDetails recurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return recurringDetailReference
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }


  public PayPalDetails storedPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return storedPaymentMethodId
  **/
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoredPaymentMethodId() {
    return storedPaymentMethodId;
  }


  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
  }


  public PayPalDetails subtype(SubtypeEnum subtype) {
    this.subtype = subtype;
    return this;
  }

   /**
   * The type of flow to initiate.
   * @return subtype
  **/
  @ApiModelProperty(value = "The type of flow to initiate.")
  @JsonProperty(JSON_PROPERTY_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubtypeEnum getSubtype() {
    return subtype;
  }


  @JsonProperty(JSON_PROPERTY_SUBTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubtype(SubtypeEnum subtype) {
    this.subtype = subtype;
  }


  public PayPalDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **paypal**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**paypal**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this PayPalDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayPalDetails payPalDetails = (PayPalDetails) o;
    return Objects.equals(this.checkoutAttemptId, payPalDetails.checkoutAttemptId) &&
        Objects.equals(this.orderID, payPalDetails.orderID) &&
        Objects.equals(this.payeePreferred, payPalDetails.payeePreferred) &&
        Objects.equals(this.payerID, payPalDetails.payerID) &&
        Objects.equals(this.payerSelected, payPalDetails.payerSelected) &&
        Objects.equals(this.recurringDetailReference, payPalDetails.recurringDetailReference) &&
        Objects.equals(this.storedPaymentMethodId, payPalDetails.storedPaymentMethodId) &&
        Objects.equals(this.subtype, payPalDetails.subtype) &&
        Objects.equals(this.type, payPalDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutAttemptId, orderID, payeePreferred, payerID, payerSelected, recurringDetailReference, storedPaymentMethodId, subtype, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayPalDetails {\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
    sb.append("    payeePreferred: ").append(toIndentedString(payeePreferred)).append("\n");
    sb.append("    payerID: ").append(toIndentedString(payerID)).append("\n");
    sb.append("    payerSelected: ").append(toIndentedString(payerSelected)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
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

/**
   * Create an instance of PayPalDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PayPalDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to PayPalDetails
   */
  public static PayPalDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PayPalDetails.class);
  }
/**
  * Convert an instance of PayPalDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

