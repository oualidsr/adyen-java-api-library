/*
 * Classic Platforms - Notifications
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpaywebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.marketpaywebhooks.Amount;
import com.adyen.model.marketpaywebhooks.ErrorFieldType;
import com.adyen.model.marketpaywebhooks.OperationStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * RefundFundsTransferNotificationContent
 */
@JsonPropertyOrder({
  RefundFundsTransferNotificationContent.JSON_PROPERTY_AMOUNT,
  RefundFundsTransferNotificationContent.JSON_PROPERTY_INVALID_FIELDS,
  RefundFundsTransferNotificationContent.JSON_PROPERTY_MERCHANT_REFERENCE,
  RefundFundsTransferNotificationContent.JSON_PROPERTY_ORIGINAL_REFERENCE,
  RefundFundsTransferNotificationContent.JSON_PROPERTY_STATUS
})

public class RefundFundsTransferNotificationContent {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_INVALID_FIELDS = "invalidFields";
  private List<ErrorFieldType> invalidFields = null;

  public static final String JSON_PROPERTY_MERCHANT_REFERENCE = "merchantReference";
  private String merchantReference;

  public static final String JSON_PROPERTY_ORIGINAL_REFERENCE = "originalReference";
  private String originalReference;

  public static final String JSON_PROPERTY_STATUS = "status";
  private OperationStatus status;

  public RefundFundsTransferNotificationContent() { 
  }

  public RefundFundsTransferNotificationContent amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public RefundFundsTransferNotificationContent invalidFields(List<ErrorFieldType> invalidFields) {
    this.invalidFields = invalidFields;
    return this;
  }

  public RefundFundsTransferNotificationContent addInvalidFieldsItem(ErrorFieldType invalidFieldsItem) {
    if (this.invalidFields == null) {
      this.invalidFields = new ArrayList<>();
    }
    this.invalidFields.add(invalidFieldsItem);
    return this;
  }

   /**
   * Invalid fields list.
   * @return invalidFields
  **/
  @ApiModelProperty(value = "Invalid fields list.")
  @JsonProperty(JSON_PROPERTY_INVALID_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ErrorFieldType> getInvalidFields() {
    return invalidFields;
  }


  @JsonProperty(JSON_PROPERTY_INVALID_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvalidFields(List<ErrorFieldType> invalidFields) {
    this.invalidFields = invalidFields;
  }


  public RefundFundsTransferNotificationContent merchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
    return this;
  }

   /**
   * A value that can be supplied at the discretion of the executing user in order to link multiple transactions to one another.
   * @return merchantReference
  **/
  @ApiModelProperty(value = "A value that can be supplied at the discretion of the executing user in order to link multiple transactions to one another.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantReference() {
    return merchantReference;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }


  public RefundFundsTransferNotificationContent originalReference(String originalReference) {
    this.originalReference = originalReference;
    return this;
  }

   /**
   * A PSP reference of the original fund transfer.
   * @return originalReference
  **/
  @ApiModelProperty(required = true, value = "A PSP reference of the original fund transfer.")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalReference() {
    return originalReference;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalReference(String originalReference) {
    this.originalReference = originalReference;
  }


  public RefundFundsTransferNotificationContent status(OperationStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OperationStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(OperationStatus status) {
    this.status = status;
  }


  /**
   * Return true if this RefundFundsTransferNotificationContent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundFundsTransferNotificationContent refundFundsTransferNotificationContent = (RefundFundsTransferNotificationContent) o;
    return Objects.equals(this.amount, refundFundsTransferNotificationContent.amount) &&
        Objects.equals(this.invalidFields, refundFundsTransferNotificationContent.invalidFields) &&
        Objects.equals(this.merchantReference, refundFundsTransferNotificationContent.merchantReference) &&
        Objects.equals(this.originalReference, refundFundsTransferNotificationContent.originalReference) &&
        Objects.equals(this.status, refundFundsTransferNotificationContent.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, invalidFields, merchantReference, originalReference, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundFundsTransferNotificationContent {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    invalidFields: ").append(toIndentedString(invalidFields)).append("\n");
    sb.append("    merchantReference: ").append(toIndentedString(merchantReference)).append("\n");
    sb.append("    originalReference: ").append(toIndentedString(originalReference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
   * Create an instance of RefundFundsTransferNotificationContent given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RefundFundsTransferNotificationContent
   * @throws JsonProcessingException if the JSON string is invalid with respect to RefundFundsTransferNotificationContent
   */
  public static RefundFundsTransferNotificationContent fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, RefundFundsTransferNotificationContent.class);
  }
/**
  * Convert an instance of RefundFundsTransferNotificationContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
