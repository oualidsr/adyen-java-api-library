/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

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
 * Currency
 */
@JsonPropertyOrder({
  Currency.JSON_PROPERTY_AMOUNT,
  Currency.JSON_PROPERTY_CURRENCY_CODE,
  Currency.JSON_PROPERTY_PERCENTAGE
})

public class Currency {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private String currencyCode;

  public static final String JSON_PROPERTY_PERCENTAGE = "percentage";
  private Double percentage;

  public Currency() { 
  }

  public Currency amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Surcharge amount per transaction, in [minor units](https://docs.adyen.com/development-resources/currency-codes).
   * @return amount
  **/
  @ApiModelProperty(value = "Surcharge amount per transaction, in [minor units](https://docs.adyen.com/development-resources/currency-codes).")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public Currency currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes). For example, **AUD**.
   * @return currencyCode
  **/
  @ApiModelProperty(required = true, value = "Three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes). For example, **AUD**.")
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public Currency percentage(Double percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Surcharge percentage per transaction. The maximum number of decimal places is two. For example, **1%** or **2.27%**.
   * @return percentage
  **/
  @ApiModelProperty(value = "Surcharge percentage per transaction. The maximum number of decimal places is two. For example, **1%** or **2.27%**.")
  @JsonProperty(JSON_PROPERTY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPercentage() {
    return percentage;
  }


  @JsonProperty(JSON_PROPERTY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentage(Double percentage) {
    this.percentage = percentage;
  }


  /**
   * Return true if this Currency object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Currency currency = (Currency) o;
    return Objects.equals(this.amount, currency.amount) &&
        Objects.equals(this.currencyCode, currency.currencyCode) &&
        Objects.equals(this.percentage, currency.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currencyCode, percentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currency {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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
   * Create an instance of Currency given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Currency
   * @throws JsonProcessingException if the JSON string is invalid with respect to Currency
   */
  public static Currency fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Currency.class);
  }
/**
  * Convert an instance of Currency to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

