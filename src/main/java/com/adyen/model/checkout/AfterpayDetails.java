/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * Contact: developer-experience@adyen.com
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
 * AfterpayDetails
 */
@JsonPropertyOrder({
  AfterpayDetails.JSON_PROPERTY_BILLING_ADDRESS,
  AfterpayDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  AfterpayDetails.JSON_PROPERTY_DELIVERY_ADDRESS,
  AfterpayDetails.JSON_PROPERTY_PERSONAL_DETAILS,
  AfterpayDetails.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  AfterpayDetails.JSON_PROPERTY_STORED_PAYMENT_METHOD_ID,
  AfterpayDetails.JSON_PROPERTY_TYPE
})

public class AfterpayDetails {
  public static final String JSON_PROPERTY_BILLING_ADDRESS = "billingAddress";
  private String billingAddress;

  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  public static final String JSON_PROPERTY_DELIVERY_ADDRESS = "deliveryAddress";
  private String deliveryAddress;

  public static final String JSON_PROPERTY_PERSONAL_DETAILS = "personalDetails";
  private String personalDetails;

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  private String storedPaymentMethodId;

  /**
   * **afterpay_default**
   */
  public enum TypeEnum {
    AFTERPAY_DEFAULT("afterpay_default"),
    
    AFTERPAYTOUCH("afterpaytouch"),
    
    AFTERPAY_B2B("afterpay_b2b");

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
  private TypeEnum type = TypeEnum.AFTERPAY_DEFAULT;

  public AfterpayDetails() { 
  }

  public AfterpayDetails billingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * The address where to send the invoice.
   * @return billingAddress
  **/
  @ApiModelProperty(value = "The address where to send the invoice.")
  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBillingAddress() {
    return billingAddress;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
  }


  public AfterpayDetails checkoutAttemptId(String checkoutAttemptId) {
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


  public AfterpayDetails deliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * The address where the goods should be delivered.
   * @return deliveryAddress
  **/
  @ApiModelProperty(value = "The address where the goods should be delivered.")
  @JsonProperty(JSON_PROPERTY_DELIVERY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeliveryAddress() {
    return deliveryAddress;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }


  public AfterpayDetails personalDetails(String personalDetails) {
    this.personalDetails = personalDetails;
    return this;
  }

   /**
   * Shopper name, date of birth, phone number, and email address.
   * @return personalDetails
  **/
  @ApiModelProperty(value = "Shopper name, date of birth, phone number, and email address.")
  @JsonProperty(JSON_PROPERTY_PERSONAL_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPersonalDetails() {
    return personalDetails;
  }


  @JsonProperty(JSON_PROPERTY_PERSONAL_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersonalDetails(String personalDetails) {
    this.personalDetails = personalDetails;
  }


  public AfterpayDetails recurringDetailReference(String recurringDetailReference) {
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


  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }


  public AfterpayDetails storedPaymentMethodId(String storedPaymentMethodId) {
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


  public AfterpayDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **afterpay_default**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**afterpay_default**")
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
   * Return true if this AfterpayDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AfterpayDetails afterpayDetails = (AfterpayDetails) o;
    return Objects.equals(this.billingAddress, afterpayDetails.billingAddress) &&
        Objects.equals(this.checkoutAttemptId, afterpayDetails.checkoutAttemptId) &&
        Objects.equals(this.deliveryAddress, afterpayDetails.deliveryAddress) &&
        Objects.equals(this.personalDetails, afterpayDetails.personalDetails) &&
        Objects.equals(this.recurringDetailReference, afterpayDetails.recurringDetailReference) &&
        Objects.equals(this.storedPaymentMethodId, afterpayDetails.storedPaymentMethodId) &&
        Objects.equals(this.type, afterpayDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, checkoutAttemptId, deliveryAddress, personalDetails, recurringDetailReference, storedPaymentMethodId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AfterpayDetails {\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    personalDetails: ").append(toIndentedString(personalDetails)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
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
   * Create an instance of AfterpayDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AfterpayDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to AfterpayDetails
   */
  public static AfterpayDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AfterpayDetails.class);
  }
/**
  * Convert an instance of AfterpayDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

