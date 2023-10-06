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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * ApplePayInfo
 */
@JsonPropertyOrder({
  ApplePayInfo.JSON_PROPERTY_DOMAINS
})

public class ApplePayInfo {
  public static final String JSON_PROPERTY_DOMAINS = "domains";
  private List<String> domains = null;

  public ApplePayInfo() { 
  }

  public ApplePayInfo domains(List<String> domains) {
    this.domains = domains;
    return this;
  }

  public ApplePayInfo addDomainsItem(String domainsItem) {
    if (this.domains == null) {
      this.domains = new ArrayList<>();
    }
    this.domains.add(domainsItem);
    return this;
  }

   /**
   * The list of merchant domains. Maximum: 99 domains per request.  For more information, see [Apple Pay documentation](https://docs.adyen.com/payment-methods/apple-pay/web-drop-in?tab&#x3D;adyen-certificate-live_1#going-live).
   * @return domains
  **/
  @ApiModelProperty(value = "The list of merchant domains. Maximum: 99 domains per request.  For more information, see [Apple Pay documentation](https://docs.adyen.com/payment-methods/apple-pay/web-drop-in?tab=adyen-certificate-live_1#going-live).")
  @JsonProperty(JSON_PROPERTY_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDomains() {
    return domains;
  }


  @JsonProperty(JSON_PROPERTY_DOMAINS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomains(List<String> domains) {
    this.domains = domains;
  }


  /**
   * Return true if this ApplePayInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplePayInfo applePayInfo = (ApplePayInfo) o;
    return Objects.equals(this.domains, applePayInfo.domains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplePayInfo {\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
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
   * Create an instance of ApplePayInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ApplePayInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to ApplePayInfo
   */
  public static ApplePayInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ApplePayInfo.class);
  }
/**
  * Convert an instance of ApplePayInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

