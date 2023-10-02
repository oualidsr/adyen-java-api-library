/*
 * Account API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Account API provides endpoints for managing account-related entities on your platform. These related entities include account holders, accounts, bank accounts, shareholders, and verification-related documents. The management operations include actions such as creation, retrieval, updating, and deletion of them.  For more information, refer to our [documentation](https://docs.adyen.com/marketplaces-and-platforms/classic). ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Account API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Account/v6/createAccountHolder ```
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpayaccount;

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
 * GetTaxFormRequest
 */
@JsonPropertyOrder({
  GetTaxFormRequest.JSON_PROPERTY_ACCOUNT_HOLDER_CODE,
  GetTaxFormRequest.JSON_PROPERTY_FORM_TYPE,
  GetTaxFormRequest.JSON_PROPERTY_YEAR
})

public class GetTaxFormRequest {
  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_CODE = "accountHolderCode";
  private String accountHolderCode;

  public static final String JSON_PROPERTY_FORM_TYPE = "formType";
  private String formType;

  public static final String JSON_PROPERTY_YEAR = "year";
  private Integer year;

  public GetTaxFormRequest() { 
  }

  public GetTaxFormRequest accountHolderCode(String accountHolderCode) {
    this.accountHolderCode = accountHolderCode;
    return this;
  }

   /**
   * The account holder code you provided when you created the account holder.
   * @return accountHolderCode
  **/
  @ApiModelProperty(required = true, value = "The account holder code you provided when you created the account holder.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountHolderCode() {
    return accountHolderCode;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolderCode(String accountHolderCode) {
    this.accountHolderCode = accountHolderCode;
  }


  public GetTaxFormRequest formType(String formType) {
    this.formType = formType;
    return this;
  }

   /**
   * Type of the requested tax form. For example, 1099-K.
   * @return formType
  **/
  @ApiModelProperty(required = true, value = "Type of the requested tax form. For example, 1099-K.")
  @JsonProperty(JSON_PROPERTY_FORM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormType() {
    return formType;
  }


  @JsonProperty(JSON_PROPERTY_FORM_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormType(String formType) {
    this.formType = formType;
  }


  public GetTaxFormRequest year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * Applicable tax year in the YYYY format.
   * @return year
  **/
  @ApiModelProperty(required = true, value = "Applicable tax year in the YYYY format.")
  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getYear() {
    return year;
  }


  @JsonProperty(JSON_PROPERTY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear(Integer year) {
    this.year = year;
  }


  /**
   * Return true if this GetTaxFormRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTaxFormRequest getTaxFormRequest = (GetTaxFormRequest) o;
    return Objects.equals(this.accountHolderCode, getTaxFormRequest.accountHolderCode) &&
        Objects.equals(this.formType, getTaxFormRequest.formType) &&
        Objects.equals(this.year, getTaxFormRequest.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderCode, formType, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTaxFormRequest {\n");
    sb.append("    accountHolderCode: ").append(toIndentedString(accountHolderCode)).append("\n");
    sb.append("    formType: ").append(toIndentedString(formType)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
   * Create an instance of GetTaxFormRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetTaxFormRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to GetTaxFormRequest
   */
  public static GetTaxFormRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, GetTaxFormRequest.class);
  }
/**
  * Convert an instance of GetTaxFormRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
