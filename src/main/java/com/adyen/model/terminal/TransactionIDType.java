/*
 * Adyen Terminal API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.terminal;

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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * Identification of a transaction for the Sale System or the POI System.
 */
@ApiModel(description = "Identification of a transaction for the Sale System or the POI System.")
@JsonPropertyOrder({
  TransactionIDType.JSON_PROPERTY_TRANSACTION_I_D,
  TransactionIDType.JSON_PROPERTY_TIME_STAMP
})

public class TransactionIDType {
  public static final String JSON_PROPERTY_TRANSACTION_I_D = "TransactionID";
  private String transactionID;

  public static final String JSON_PROPERTY_TIME_STAMP = "TimeStamp";
  private OffsetDateTime timeStamp;

  public TransactionIDType() { 
  }

  public TransactionIDType transactionID(String transactionID) {
    this.transactionID = transactionID;
    return this;
  }

   /**
   * Get transactionID
   * @return transactionID
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransactionID() {
    return transactionID;
  }


 /**
  * transactionID
  *
  * @param transactionID
  */ 
  @JsonProperty(JSON_PROPERTY_TRANSACTION_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionID(String transactionID) {
    this.transactionID = transactionID;
  }


  public TransactionIDType timeStamp(OffsetDateTime timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * Get timeStamp
   * @return timeStamp
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimeStamp() {
    return timeStamp;
  }


 /**
  * timeStamp
  *
  * @param timeStamp
  */ 
  @JsonProperty(JSON_PROPERTY_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeStamp(OffsetDateTime timeStamp) {
    this.timeStamp = timeStamp;
  }


  /**
   * Return true if this TransactionIDType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionIDType transactionIDType = (TransactionIDType) o;
    return Objects.equals(this.transactionID, transactionIDType.transactionID) &&
        Objects.equals(this.timeStamp, transactionIDType.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionID, timeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionIDType {\n");
    sb.append("    transactionID: ").append(toIndentedString(transactionID)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
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
   * Create an instance of TransactionIDType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionIDType
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransactionIDType
   */
  public static TransactionIDType fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransactionIDType.class);
  }
/**
  * Convert an instance of TransactionIDType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

