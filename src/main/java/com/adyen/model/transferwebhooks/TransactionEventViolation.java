/*
 * Transfer webhooks
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transferwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.transferwebhooks.TransactionRuleReference;
import com.adyen.model.transferwebhooks.TransactionRuleSource;
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
 * TransactionEventViolation
 */
@JsonPropertyOrder({
  TransactionEventViolation.JSON_PROPERTY_REASON,
  TransactionEventViolation.JSON_PROPERTY_TRANSACTION_RULE,
  TransactionEventViolation.JSON_PROPERTY_TRANSACTION_RULE_SOURCE
})

public class TransactionEventViolation {
  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_TRANSACTION_RULE = "transactionRule";
  private TransactionRuleReference transactionRule;

  public static final String JSON_PROPERTY_TRANSACTION_RULE_SOURCE = "transactionRuleSource";
  private TransactionRuleSource transactionRuleSource;

  public TransactionEventViolation() { 
  }

  public TransactionEventViolation reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * An explanation about why the transaction rule failed.
   * @return reason
  **/
  @ApiModelProperty(value = "An explanation about why the transaction rule failed.")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(String reason) {
    this.reason = reason;
  }


  public TransactionEventViolation transactionRule(TransactionRuleReference transactionRule) {
    this.transactionRule = transactionRule;
    return this;
  }

   /**
   * Get transactionRule
   * @return transactionRule
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionRuleReference getTransactionRule() {
    return transactionRule;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionRule(TransactionRuleReference transactionRule) {
    this.transactionRule = transactionRule;
  }


  public TransactionEventViolation transactionRuleSource(TransactionRuleSource transactionRuleSource) {
    this.transactionRuleSource = transactionRuleSource;
    return this;
  }

   /**
   * Get transactionRuleSource
   * @return transactionRuleSource
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_RULE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionRuleSource getTransactionRuleSource() {
    return transactionRuleSource;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_RULE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionRuleSource(TransactionRuleSource transactionRuleSource) {
    this.transactionRuleSource = transactionRuleSource;
  }


  /**
   * Return true if this TransactionEventViolation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionEventViolation transactionEventViolation = (TransactionEventViolation) o;
    return Objects.equals(this.reason, transactionEventViolation.reason) &&
        Objects.equals(this.transactionRule, transactionEventViolation.transactionRule) &&
        Objects.equals(this.transactionRuleSource, transactionEventViolation.transactionRuleSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, transactionRule, transactionRuleSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionEventViolation {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    transactionRule: ").append(toIndentedString(transactionRule)).append("\n");
    sb.append("    transactionRuleSource: ").append(toIndentedString(transactionRuleSource)).append("\n");
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
   * Create an instance of TransactionEventViolation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransactionEventViolation
   * @throws JsonProcessingException if the JSON string is invalid with respect to TransactionEventViolation
   */
  public static TransactionEventViolation fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, TransactionEventViolation.class);
  }
/**
  * Convert an instance of TransactionEventViolation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

