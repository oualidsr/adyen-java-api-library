/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
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
import com.adyen.model.balanceplatform.AccountHolder;
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
 * PaginatedAccountHoldersResponse
 */
@JsonPropertyOrder({
  PaginatedAccountHoldersResponse.JSON_PROPERTY_ACCOUNT_HOLDERS,
  PaginatedAccountHoldersResponse.JSON_PROPERTY_HAS_NEXT,
  PaginatedAccountHoldersResponse.JSON_PROPERTY_HAS_PREVIOUS
})

public class PaginatedAccountHoldersResponse {
  public static final String JSON_PROPERTY_ACCOUNT_HOLDERS = "accountHolders";
  private List<AccountHolder> accountHolders = new ArrayList<>();

  public static final String JSON_PROPERTY_HAS_NEXT = "hasNext";
  private Boolean hasNext;

  public static final String JSON_PROPERTY_HAS_PREVIOUS = "hasPrevious";
  private Boolean hasPrevious;

  public PaginatedAccountHoldersResponse() { 
  }

  public PaginatedAccountHoldersResponse accountHolders(List<AccountHolder> accountHolders) {
    this.accountHolders = accountHolders;
    return this;
  }

  public PaginatedAccountHoldersResponse addAccountHoldersItem(AccountHolder accountHoldersItem) {
    this.accountHolders.add(accountHoldersItem);
    return this;
  }

   /**
   * List of account holders.
   * @return accountHolders
  **/
  @ApiModelProperty(required = true, value = "List of account holders.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccountHolder> getAccountHolders() {
    return accountHolders;
  }


 /**
  * List of account holders.
  *
  * @param accountHolders
  */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolders(List<AccountHolder> accountHolders) {
    this.accountHolders = accountHolders;
  }


  public PaginatedAccountHoldersResponse hasNext(Boolean hasNext) {
    this.hasNext = hasNext;
    return this;
  }

   /**
   * Indicates whether there are more items on the next page.
   * @return hasNext
  **/
  @ApiModelProperty(required = true, value = "Indicates whether there are more items on the next page.")
  @JsonProperty(JSON_PROPERTY_HAS_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasNext() {
    return hasNext;
  }


 /**
  * Indicates whether there are more items on the next page.
  *
  * @param hasNext
  */ 
  @JsonProperty(JSON_PROPERTY_HAS_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }


  public PaginatedAccountHoldersResponse hasPrevious(Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
    return this;
  }

   /**
   * Indicates whether there are more items on the previous page.
   * @return hasPrevious
  **/
  @ApiModelProperty(required = true, value = "Indicates whether there are more items on the previous page.")
  @JsonProperty(JSON_PROPERTY_HAS_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasPrevious() {
    return hasPrevious;
  }


 /**
  * Indicates whether there are more items on the previous page.
  *
  * @param hasPrevious
  */ 
  @JsonProperty(JSON_PROPERTY_HAS_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasPrevious(Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
  }


  /**
   * Return true if this PaginatedAccountHoldersResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedAccountHoldersResponse paginatedAccountHoldersResponse = (PaginatedAccountHoldersResponse) o;
    return Objects.equals(this.accountHolders, paginatedAccountHoldersResponse.accountHolders) &&
        Objects.equals(this.hasNext, paginatedAccountHoldersResponse.hasNext) &&
        Objects.equals(this.hasPrevious, paginatedAccountHoldersResponse.hasPrevious);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolders, hasNext, hasPrevious);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedAccountHoldersResponse {\n");
    sb.append("    accountHolders: ").append(toIndentedString(accountHolders)).append("\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
    sb.append("    hasPrevious: ").append(toIndentedString(hasPrevious)).append("\n");
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
   * Create an instance of PaginatedAccountHoldersResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaginatedAccountHoldersResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaginatedAccountHoldersResponse
   */
  public static PaginatedAccountHoldersResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaginatedAccountHoldersResponse.class);
  }
/**
  * Convert an instance of PaginatedAccountHoldersResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

