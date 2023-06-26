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
import com.adyen.model.balanceplatform.CapitalBalance;
import com.adyen.model.balanceplatform.GrantLimit;
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
 * CapitalGrantAccount
 */
@JsonPropertyOrder({
  CapitalGrantAccount.JSON_PROPERTY_BALANCES,
  CapitalGrantAccount.JSON_PROPERTY_FUNDING_BALANCE_ACCOUNT_ID,
  CapitalGrantAccount.JSON_PROPERTY_ID,
  CapitalGrantAccount.JSON_PROPERTY_LIMITS
})

public class CapitalGrantAccount {
  public static final String JSON_PROPERTY_BALANCES = "balances";
  private List<CapitalBalance> balances = null;

  public static final String JSON_PROPERTY_FUNDING_BALANCE_ACCOUNT_ID = "fundingBalanceAccountId";
  private String fundingBalanceAccountId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LIMITS = "limits";
  private List<GrantLimit> limits = null;

  public CapitalGrantAccount() { 
  }

  public CapitalGrantAccount balances(List<CapitalBalance> balances) {
    this.balances = balances;
    return this;
  }

  public CapitalGrantAccount addBalancesItem(CapitalBalance balancesItem) {
    if (this.balances == null) {
      this.balances = new ArrayList<>();
    }
    this.balances.add(balancesItem);
    return this;
  }

   /**
   * The balances of the grant account.
   * @return balances
  **/
  @ApiModelProperty(value = "The balances of the grant account.")
  @JsonProperty(JSON_PROPERTY_BALANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CapitalBalance> getBalances() {
    return balances;
  }


  @JsonProperty(JSON_PROPERTY_BALANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalances(List<CapitalBalance> balances) {
    this.balances = balances;
  }


  public CapitalGrantAccount fundingBalanceAccountId(String fundingBalanceAccountId) {
    this.fundingBalanceAccountId = fundingBalanceAccountId;
    return this;
  }

   /**
   * The unique identifier of the balance account used to fund the grant.
   * @return fundingBalanceAccountId
  **/
  @ApiModelProperty(value = "The unique identifier of the balance account used to fund the grant.")
  @JsonProperty(JSON_PROPERTY_FUNDING_BALANCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFundingBalanceAccountId() {
    return fundingBalanceAccountId;
  }


  @JsonProperty(JSON_PROPERTY_FUNDING_BALANCE_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundingBalanceAccountId(String fundingBalanceAccountId) {
    this.fundingBalanceAccountId = fundingBalanceAccountId;
  }


  public CapitalGrantAccount id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier of the grant account.
   * @return id
  **/
  @ApiModelProperty(value = "The identifier of the grant account.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public CapitalGrantAccount limits(List<GrantLimit> limits) {
    this.limits = limits;
    return this;
  }

  public CapitalGrantAccount addLimitsItem(GrantLimit limitsItem) {
    if (this.limits == null) {
      this.limits = new ArrayList<>();
    }
    this.limits.add(limitsItem);
    return this;
  }

   /**
   * The limits of the grant account.
   * @return limits
  **/
  @ApiModelProperty(value = "The limits of the grant account.")
  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GrantLimit> getLimits() {
    return limits;
  }


  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimits(List<GrantLimit> limits) {
    this.limits = limits;
  }


  /**
   * Return true if this CapitalGrantAccount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapitalGrantAccount capitalGrantAccount = (CapitalGrantAccount) o;
    return Objects.equals(this.balances, capitalGrantAccount.balances) &&
        Objects.equals(this.fundingBalanceAccountId, capitalGrantAccount.fundingBalanceAccountId) &&
        Objects.equals(this.id, capitalGrantAccount.id) &&
        Objects.equals(this.limits, capitalGrantAccount.limits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balances, fundingBalanceAccountId, id, limits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapitalGrantAccount {\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    fundingBalanceAccountId: ").append(toIndentedString(fundingBalanceAccountId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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
   * Create an instance of CapitalGrantAccount given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CapitalGrantAccount
   * @throws JsonProcessingException if the JSON string is invalid with respect to CapitalGrantAccount
   */
  public static CapitalGrantAccount fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CapitalGrantAccount.class);
  }
/**
  * Convert an instance of CapitalGrantAccount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

