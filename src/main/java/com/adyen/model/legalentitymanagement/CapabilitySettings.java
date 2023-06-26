/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.legalentitymanagement.Amount;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * CapabilitySettings
 */
@JsonPropertyOrder({
  CapabilitySettings.JSON_PROPERTY_AMOUNT_PER_INDUSTRY,
  CapabilitySettings.JSON_PROPERTY_AUTHORIZED_CARD_USERS,
  CapabilitySettings.JSON_PROPERTY_FUNDING_SOURCE,
  CapabilitySettings.JSON_PROPERTY_INTERVAL,
  CapabilitySettings.JSON_PROPERTY_MAX_AMOUNT
})

public class CapabilitySettings {
  public static final String JSON_PROPERTY_AMOUNT_PER_INDUSTRY = "amountPerIndustry";
  private Map<String, Amount> amountPerIndustry = null;

  public static final String JSON_PROPERTY_AUTHORIZED_CARD_USERS = "authorizedCardUsers";
  private Boolean authorizedCardUsers;

  /**
   * Gets or Sets fundingSource
   */
  public enum FundingSourceEnum {
    CREDIT("credit"),
    
    DEBIT("debit"),
    
    PREPAID("prepaid");

    private String value;

    FundingSourceEnum(String value) {
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
    public static FundingSourceEnum fromValue(String value) {
      for (FundingSourceEnum b : FundingSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FUNDING_SOURCE = "fundingSource";
  private List<FundingSourceEnum> fundingSource = null;

  /**
   * The period when the rule conditions apply.
   */
  public enum IntervalEnum {
    DAILY("daily"),
    
    MONTHLY("monthly"),
    
    WEEKLY("weekly");

    private String value;

    IntervalEnum(String value) {
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
    public static IntervalEnum fromValue(String value) {
      for (IntervalEnum b : IntervalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private IntervalEnum interval;

  public static final String JSON_PROPERTY_MAX_AMOUNT = "maxAmount";
  private Amount maxAmount;

  public CapabilitySettings() { 
  }

  public CapabilitySettings amountPerIndustry(Map<String, Amount> amountPerIndustry) {
    this.amountPerIndustry = amountPerIndustry;
    return this;
  }

  public CapabilitySettings putAmountPerIndustryItem(String key, Amount amountPerIndustryItem) {
    if (this.amountPerIndustry == null) {
      this.amountPerIndustry = new HashMap<>();
    }
    this.amountPerIndustry.put(key, amountPerIndustryItem);
    return this;
  }

   /**
   * The maximum amount a card holder can spend per industry.
   * @return amountPerIndustry
  **/
  @ApiModelProperty(value = "The maximum amount a card holder can spend per industry.")
  @JsonProperty(JSON_PROPERTY_AMOUNT_PER_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Amount> getAmountPerIndustry() {
    return amountPerIndustry;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_PER_INDUSTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmountPerIndustry(Map<String, Amount> amountPerIndustry) {
    this.amountPerIndustry = amountPerIndustry;
  }


  public CapabilitySettings authorizedCardUsers(Boolean authorizedCardUsers) {
    this.authorizedCardUsers = authorizedCardUsers;
    return this;
  }

   /**
   * The number of card holders who can use the card.
   * @return authorizedCardUsers
  **/
  @ApiModelProperty(value = "The number of card holders who can use the card.")
  @JsonProperty(JSON_PROPERTY_AUTHORIZED_CARD_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAuthorizedCardUsers() {
    return authorizedCardUsers;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZED_CARD_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizedCardUsers(Boolean authorizedCardUsers) {
    this.authorizedCardUsers = authorizedCardUsers;
  }


  public CapabilitySettings fundingSource(List<FundingSourceEnum> fundingSource) {
    this.fundingSource = fundingSource;
    return this;
  }

  public CapabilitySettings addFundingSourceItem(FundingSourceEnum fundingSourceItem) {
    if (this.fundingSource == null) {
      this.fundingSource = new ArrayList<>();
    }
    this.fundingSource.add(fundingSourceItem);
    return this;
  }

   /**
   * The funding source of the card, for example **debit**.
   * @return fundingSource
  **/
  @ApiModelProperty(value = "The funding source of the card, for example **debit**.")
  @JsonProperty(JSON_PROPERTY_FUNDING_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FundingSourceEnum> getFundingSource() {
    return fundingSource;
  }


  @JsonProperty(JSON_PROPERTY_FUNDING_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundingSource(List<FundingSourceEnum> fundingSource) {
    this.fundingSource = fundingSource;
  }


  public CapabilitySettings interval(IntervalEnum interval) {
    this.interval = interval;
    return this;
  }

   /**
   * The period when the rule conditions apply.
   * @return interval
  **/
  @ApiModelProperty(value = "The period when the rule conditions apply.")
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IntervalEnum getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInterval(IntervalEnum interval) {
    this.interval = interval;
  }


  public CapabilitySettings maxAmount(Amount maxAmount) {
    this.maxAmount = maxAmount;
    return this;
  }

   /**
   * Get maxAmount
   * @return maxAmount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getMaxAmount() {
    return maxAmount;
  }


  @JsonProperty(JSON_PROPERTY_MAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxAmount(Amount maxAmount) {
    this.maxAmount = maxAmount;
  }


  /**
   * Return true if this CapabilitySettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapabilitySettings capabilitySettings = (CapabilitySettings) o;
    return Objects.equals(this.amountPerIndustry, capabilitySettings.amountPerIndustry) &&
        Objects.equals(this.authorizedCardUsers, capabilitySettings.authorizedCardUsers) &&
        Objects.equals(this.fundingSource, capabilitySettings.fundingSource) &&
        Objects.equals(this.interval, capabilitySettings.interval) &&
        Objects.equals(this.maxAmount, capabilitySettings.maxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountPerIndustry, authorizedCardUsers, fundingSource, interval, maxAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapabilitySettings {\n");
    sb.append("    amountPerIndustry: ").append(toIndentedString(amountPerIndustry)).append("\n");
    sb.append("    authorizedCardUsers: ").append(toIndentedString(authorizedCardUsers)).append("\n");
    sb.append("    fundingSource: ").append(toIndentedString(fundingSource)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
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
   * Create an instance of CapabilitySettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CapabilitySettings
   * @throws JsonProcessingException if the JSON string is invalid with respect to CapabilitySettings
   */
  public static CapabilitySettings fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CapabilitySettings.class);
  }
/**
  * Convert an instance of CapabilitySettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

