/*
 * Hosted onboarding API
 * This API is used for the classic integration. If you are just starting your implementation, refer to our [new integration guide](https://docs.adyen.com/marketplaces-and-platforms) instead.  The Hosted onboarding API provides endpoints that you can use to generate links to Adyen-hosted pages, such as an [onboarding page](https://docs.adyen.com/marketplaces-and-platforms/classic/hosted-onboarding-page) or a [PCI compliance questionnaire](https://docs.adyen.com/marketplaces-and-platforms/classic/platforms-for-partners). You can provide these links to your account holders so that they can complete their onboarding.  ## Authentication Your Adyen contact will provide your API credential and an API key. To connect to the API, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication. For example:  ``` curl -U \"ws@MarketPlace.YOUR_PLATFORM_ACCOUNT\":\"YOUR_WS_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ``` When going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Hosted onboarding API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://cal-test.adyen.com/cal/services/Hop/v6/getOnboardingUrl ```
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpayhop;

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
 * GetPciUrlRequest
 */
@JsonPropertyOrder({
  GetPciUrlRequest.JSON_PROPERTY_ACCOUNT_HOLDER_CODE,
  GetPciUrlRequest.JSON_PROPERTY_RETURN_URL
})

public class GetPciUrlRequest {
  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_CODE = "accountHolderCode";
  private String accountHolderCode;

  public static final String JSON_PROPERTY_RETURN_URL = "returnUrl";
  private String returnUrl;

  public GetPciUrlRequest() { 
  }

  public GetPciUrlRequest accountHolderCode(String accountHolderCode) {
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


  public GetPciUrlRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * The URL where the account holder will be redirected back to after they fill out the questionnaire, or if their session times out. Maximum length of 500 characters.
   * @return returnUrl
  **/
  @ApiModelProperty(value = "The URL where the account holder will be redirected back to after they fill out the questionnaire, or if their session times out. Maximum length of 500 characters.")
  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReturnUrl() {
    return returnUrl;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }


  /**
   * Return true if this GetPciUrlRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPciUrlRequest getPciUrlRequest = (GetPciUrlRequest) o;
    return Objects.equals(this.accountHolderCode, getPciUrlRequest.accountHolderCode) &&
        Objects.equals(this.returnUrl, getPciUrlRequest.returnUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderCode, returnUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPciUrlRequest {\n");
    sb.append("    accountHolderCode: ").append(toIndentedString(accountHolderCode)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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
   * Create an instance of GetPciUrlRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetPciUrlRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to GetPciUrlRequest
   */
  public static GetPciUrlRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, GetPciUrlRequest.class);
  }
/**
  * Convert an instance of GetPciUrlRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

