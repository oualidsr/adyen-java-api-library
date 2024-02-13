/*
 * Transfers API
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.transfers.Amount;
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
 * ReturnTransferRequest
 */
@JsonPropertyOrder({
  ReturnTransferRequest.JSON_PROPERTY_AMOUNT,
  ReturnTransferRequest.JSON_PROPERTY_REFERENCE
})

public class ReturnTransferRequest {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public ReturnTransferRequest() { 
  }

  public ReturnTransferRequest amount(Amount amount) {
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


 /**
  * amount
  *
  * @param amount
  */ 
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public ReturnTransferRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your internal reference for the return. If you don&#39;t provide this in the request, Adyen generates a unique reference. This reference is used in all communication with you about the instruction status.  We recommend using a unique value per instruction. If you need to provide multiple references for a transaction, separate them with hyphens (\&quot;-\&quot;). 
   * @return reference
  **/
  @ApiModelProperty(value = "Your internal reference for the return. If you don't provide this in the request, Adyen generates a unique reference. This reference is used in all communication with you about the instruction status.  We recommend using a unique value per instruction. If you need to provide multiple references for a transaction, separate them with hyphens (\"-\"). ")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


 /**
  * Your internal reference for the return. If you don&#39;t provide this in the request, Adyen generates a unique reference. This reference is used in all communication with you about the instruction status.  We recommend using a unique value per instruction. If you need to provide multiple references for a transaction, separate them with hyphens (\&quot;-\&quot;). 
  *
  * @param reference
  */ 
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  /**
   * Return true if this ReturnTransferRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnTransferRequest returnTransferRequest = (ReturnTransferRequest) o;
    return Objects.equals(this.amount, returnTransferRequest.amount) &&
        Objects.equals(this.reference, returnTransferRequest.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnTransferRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
   * Create an instance of ReturnTransferRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReturnTransferRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to ReturnTransferRequest
   */
  public static ReturnTransferRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ReturnTransferRequest.class);
  }
/**
  * Convert an instance of ReturnTransferRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

