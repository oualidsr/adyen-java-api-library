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
import com.adyen.model.transfers.Counterparty;
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
 * CapitalGrantInfo
 */
@JsonPropertyOrder({
  CapitalGrantInfo.JSON_PROPERTY_COUNTERPARTY,
  CapitalGrantInfo.JSON_PROPERTY_GRANT_ACCOUNT_ID,
  CapitalGrantInfo.JSON_PROPERTY_GRANT_OFFER_ID
})

public class CapitalGrantInfo {
  public static final String JSON_PROPERTY_COUNTERPARTY = "counterparty";
  private Counterparty counterparty;

  public static final String JSON_PROPERTY_GRANT_ACCOUNT_ID = "grantAccountId";
  private String grantAccountId;

  public static final String JSON_PROPERTY_GRANT_OFFER_ID = "grantOfferId";
  private String grantOfferId;

  public CapitalGrantInfo() { 
  }

  public CapitalGrantInfo counterparty(Counterparty counterparty) {
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Counterparty getCounterparty() {
    return counterparty;
  }


  @JsonProperty(JSON_PROPERTY_COUNTERPARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterparty(Counterparty counterparty) {
    this.counterparty = counterparty;
  }


  public CapitalGrantInfo grantAccountId(String grantAccountId) {
    this.grantAccountId = grantAccountId;
    return this;
  }

   /**
   * The identifier of the grant account used for the grant.
   * @return grantAccountId
  **/
  @ApiModelProperty(required = true, value = "The identifier of the grant account used for the grant.")
  @JsonProperty(JSON_PROPERTY_GRANT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGrantAccountId() {
    return grantAccountId;
  }


  @JsonProperty(JSON_PROPERTY_GRANT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrantAccountId(String grantAccountId) {
    this.grantAccountId = grantAccountId;
  }


  public CapitalGrantInfo grantOfferId(String grantOfferId) {
    this.grantOfferId = grantOfferId;
    return this;
  }

   /**
   * The identifier of the grant offer that has been selected and from which the grant details will be used.
   * @return grantOfferId
  **/
  @ApiModelProperty(required = true, value = "The identifier of the grant offer that has been selected and from which the grant details will be used.")
  @JsonProperty(JSON_PROPERTY_GRANT_OFFER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGrantOfferId() {
    return grantOfferId;
  }


  @JsonProperty(JSON_PROPERTY_GRANT_OFFER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrantOfferId(String grantOfferId) {
    this.grantOfferId = grantOfferId;
  }


  /**
   * Return true if this CapitalGrantInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapitalGrantInfo capitalGrantInfo = (CapitalGrantInfo) o;
    return Objects.equals(this.counterparty, capitalGrantInfo.counterparty) &&
        Objects.equals(this.grantAccountId, capitalGrantInfo.grantAccountId) &&
        Objects.equals(this.grantOfferId, capitalGrantInfo.grantOfferId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counterparty, grantAccountId, grantOfferId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapitalGrantInfo {\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    grantAccountId: ").append(toIndentedString(grantAccountId)).append("\n");
    sb.append("    grantOfferId: ").append(toIndentedString(grantOfferId)).append("\n");
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
   * Create an instance of CapitalGrantInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CapitalGrantInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to CapitalGrantInfo
   */
  public static CapitalGrantInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CapitalGrantInfo.class);
  }
/**
  * Convert an instance of CapitalGrantInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

