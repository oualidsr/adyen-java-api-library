/*
 * Adyen Recurring API
 * The Recurring APIs allow you to manage and remove your tokens or saved payment details. Tokens should be created with validation during a payment request.  For more information, refer to our [Tokenization documentation](https://docs.adyen.com/online-payments/tokenization). ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Recurring API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Recurring/v68/disable ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Recurring/v68/disable ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.recurring;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.recurring.PermitRestriction;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * Permit
 */
@JsonPropertyOrder({
  Permit.JSON_PROPERTY_PARTNER_ID,
  Permit.JSON_PROPERTY_PROFILE_REFERENCE,
  Permit.JSON_PROPERTY_RESTRICTION,
  Permit.JSON_PROPERTY_RESULT_KEY,
  Permit.JSON_PROPERTY_VALID_TILL_DATE
})

public class Permit {
  public static final String JSON_PROPERTY_PARTNER_ID = "partnerId";
  private String partnerId;

  public static final String JSON_PROPERTY_PROFILE_REFERENCE = "profileReference";
  private String profileReference;

  public static final String JSON_PROPERTY_RESTRICTION = "restriction";
  private PermitRestriction restriction;

  public static final String JSON_PROPERTY_RESULT_KEY = "resultKey";
  private String resultKey;

  public static final String JSON_PROPERTY_VALID_TILL_DATE = "validTillDate";
  private OffsetDateTime validTillDate;

  public Permit() { 
  }

  public Permit partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Partner ID (when using the permit-per-partner token sharing model).
   * @return partnerId
  **/
  @ApiModelProperty(value = "Partner ID (when using the permit-per-partner token sharing model).")
  @JsonProperty(JSON_PROPERTY_PARTNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPartnerId() {
    return partnerId;
  }


  @JsonProperty(JSON_PROPERTY_PARTNER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  public Permit profileReference(String profileReference) {
    this.profileReference = profileReference;
    return this;
  }

   /**
   * The profile to apply to this permit (when using the shared permits model).
   * @return profileReference
  **/
  @ApiModelProperty(value = "The profile to apply to this permit (when using the shared permits model).")
  @JsonProperty(JSON_PROPERTY_PROFILE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProfileReference() {
    return profileReference;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileReference(String profileReference) {
    this.profileReference = profileReference;
  }


  public Permit restriction(PermitRestriction restriction) {
    this.restriction = restriction;
    return this;
  }

   /**
   * Get restriction
   * @return restriction
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESTRICTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PermitRestriction getRestriction() {
    return restriction;
  }


  @JsonProperty(JSON_PROPERTY_RESTRICTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestriction(PermitRestriction restriction) {
    this.restriction = restriction;
  }


  public Permit resultKey(String resultKey) {
    this.resultKey = resultKey;
    return this;
  }

   /**
   * The key to link permit requests to permit results.
   * @return resultKey
  **/
  @ApiModelProperty(value = "The key to link permit requests to permit results.")
  @JsonProperty(JSON_PROPERTY_RESULT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResultKey() {
    return resultKey;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultKey(String resultKey) {
    this.resultKey = resultKey;
  }


  public Permit validTillDate(OffsetDateTime validTillDate) {
    this.validTillDate = validTillDate;
    return this;
  }

   /**
   * The expiry date for this permit.
   * @return validTillDate
  **/
  @ApiModelProperty(value = "The expiry date for this permit.")
  @JsonProperty(JSON_PROPERTY_VALID_TILL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getValidTillDate() {
    return validTillDate;
  }


  @JsonProperty(JSON_PROPERTY_VALID_TILL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidTillDate(OffsetDateTime validTillDate) {
    this.validTillDate = validTillDate;
  }


  /**
   * Return true if this Permit object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permit permit = (Permit) o;
    return Objects.equals(this.partnerId, permit.partnerId) &&
        Objects.equals(this.profileReference, permit.profileReference) &&
        Objects.equals(this.restriction, permit.restriction) &&
        Objects.equals(this.resultKey, permit.resultKey) &&
        Objects.equals(this.validTillDate, permit.validTillDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerId, profileReference, restriction, resultKey, validTillDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permit {\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    profileReference: ").append(toIndentedString(profileReference)).append("\n");
    sb.append("    restriction: ").append(toIndentedString(restriction)).append("\n");
    sb.append("    resultKey: ").append(toIndentedString(resultKey)).append("\n");
    sb.append("    validTillDate: ").append(toIndentedString(validTillDate)).append("\n");
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
   * Create an instance of Permit given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Permit
   * @throws JsonProcessingException if the JSON string is invalid with respect to Permit
   */
  public static Permit fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Permit.class);
  }
/**
  * Convert an instance of Permit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

