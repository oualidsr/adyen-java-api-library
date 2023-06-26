/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.checkout.DetailsRequestAuthenticationData;
import com.adyen.model.checkout.PaymentCompletionDetails;
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
 * DetailsRequest
 */
@JsonPropertyOrder({
  DetailsRequest.JSON_PROPERTY_AUTHENTICATION_DATA,
  DetailsRequest.JSON_PROPERTY_DETAILS,
  DetailsRequest.JSON_PROPERTY_PAYMENT_DATA,
  DetailsRequest.JSON_PROPERTY_THREE_D_S_AUTHENTICATION_ONLY
})

public class DetailsRequest {
  public static final String JSON_PROPERTY_AUTHENTICATION_DATA = "authenticationData";
  private DetailsRequestAuthenticationData authenticationData;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private PaymentCompletionDetails details;

  public static final String JSON_PROPERTY_PAYMENT_DATA = "paymentData";
  private String paymentData;

  public static final String JSON_PROPERTY_THREE_D_S_AUTHENTICATION_ONLY = "threeDSAuthenticationOnly";
  private Boolean threeDSAuthenticationOnly;

  public DetailsRequest() { 
  }

  public DetailsRequest authenticationData(DetailsRequestAuthenticationData authenticationData) {
    this.authenticationData = authenticationData;
    return this;
  }

   /**
   * Get authenticationData
   * @return authenticationData
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DetailsRequestAuthenticationData getAuthenticationData() {
    return authenticationData;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthenticationData(DetailsRequestAuthenticationData authenticationData) {
    this.authenticationData = authenticationData;
  }


  public DetailsRequest details(PaymentCompletionDetails details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentCompletionDetails getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(PaymentCompletionDetails details) {
    this.details = details;
  }


  public DetailsRequest paymentData(String paymentData) {
    this.paymentData = paymentData;
    return this;
  }

   /**
   * The &#x60;paymentData&#x60; value from the &#x60;/payments&#x60; response. Required if the &#x60;/payments&#x60; response returns this value. 
   * @return paymentData
  **/
  @ApiModelProperty(value = "The `paymentData` value from the `/payments` response. Required if the `/payments` response returns this value. ")
  @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentData() {
    return paymentData;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentData(String paymentData) {
    this.paymentData = paymentData;
  }


  public DetailsRequest threeDSAuthenticationOnly(Boolean threeDSAuthenticationOnly) {
    this.threeDSAuthenticationOnly = threeDSAuthenticationOnly;
    return this;
  }

   /**
   * Change the &#x60;authenticationOnly&#x60; indicator originally set in the &#x60;/payments&#x60; request. Only needs to be set if you want to modify the value set previously.
   * @return threeDSAuthenticationOnly
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "Change the `authenticationOnly` indicator originally set in the `/payments` request. Only needs to be set if you want to modify the value set previously.")
  @JsonProperty(JSON_PROPERTY_THREE_D_S_AUTHENTICATION_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getThreeDSAuthenticationOnly() {
    return threeDSAuthenticationOnly;
  }


  @JsonProperty(JSON_PROPERTY_THREE_D_S_AUTHENTICATION_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSAuthenticationOnly(Boolean threeDSAuthenticationOnly) {
    this.threeDSAuthenticationOnly = threeDSAuthenticationOnly;
  }


  /**
   * Return true if this DetailsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailsRequest detailsRequest = (DetailsRequest) o;
    return Objects.equals(this.authenticationData, detailsRequest.authenticationData) &&
        Objects.equals(this.details, detailsRequest.details) &&
        Objects.equals(this.paymentData, detailsRequest.paymentData) &&
        Objects.equals(this.threeDSAuthenticationOnly, detailsRequest.threeDSAuthenticationOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationData, details, paymentData, threeDSAuthenticationOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailsRequest {\n");
    sb.append("    authenticationData: ").append(toIndentedString(authenticationData)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    sb.append("    threeDSAuthenticationOnly: ").append(toIndentedString(threeDSAuthenticationOnly)).append("\n");
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
   * Create an instance of DetailsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DetailsRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to DetailsRequest
   */
  public static DetailsRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DetailsRequest.class);
  }
/**
  * Convert an instance of DetailsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

