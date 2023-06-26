/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

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
 * CapitalBalance
 */
@JsonPropertyOrder({
  CapitalBalance.JSON_PROPERTY_CURRENCY,
  CapitalBalance.JSON_PROPERTY_FEE,
  CapitalBalance.JSON_PROPERTY_PRINCIPAL,
  CapitalBalance.JSON_PROPERTY_TOTAL
})

public class CapitalBalance {
  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_FEE = "fee";
  private Long fee;

  public static final String JSON_PROPERTY_PRINCIPAL = "principal";
  private Long principal;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public CapitalBalance() { 
  }

  public CapitalBalance currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes).
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "The three-character [ISO currency code](https://docs.adyen.com/development-resources/currency-codes).")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public CapitalBalance fee(Long fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Fee amount.
   * @return fee
  **/
  @ApiModelProperty(required = true, value = "Fee amount.")
  @JsonProperty(JSON_PROPERTY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFee() {
    return fee;
  }


  @JsonProperty(JSON_PROPERTY_FEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFee(Long fee) {
    this.fee = fee;
  }


  public CapitalBalance principal(Long principal) {
    this.principal = principal;
    return this;
  }

   /**
   * Principal amount.
   * @return principal
  **/
  @ApiModelProperty(required = true, value = "Principal amount.")
  @JsonProperty(JSON_PROPERTY_PRINCIPAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPrincipal() {
    return principal;
  }


  @JsonProperty(JSON_PROPERTY_PRINCIPAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrincipal(Long principal) {
    this.principal = principal;
  }


  public CapitalBalance total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Total amount. A sum of principal amount and fee amount.
   * @return total
  **/
  @ApiModelProperty(required = true, value = "Total amount. A sum of principal amount and fee amount.")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(Long total) {
    this.total = total;
  }


  /**
   * Return true if this CapitalBalance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapitalBalance capitalBalance = (CapitalBalance) o;
    return Objects.equals(this.currency, capitalBalance.currency) &&
        Objects.equals(this.fee, capitalBalance.fee) &&
        Objects.equals(this.principal, capitalBalance.principal) &&
        Objects.equals(this.total, capitalBalance.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, fee, principal, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapitalBalance {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
   * Create an instance of CapitalBalance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CapitalBalance
   * @throws JsonProcessingException if the JSON string is invalid with respect to CapitalBalance
   */
  public static CapitalBalance fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CapitalBalance.class);
  }
/**
  * Convert an instance of CapitalBalance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

