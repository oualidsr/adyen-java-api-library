/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * 
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
 * AmazonPayDetails
 */
@JsonPropertyOrder({
  AmazonPayDetails.JSON_PROPERTY_AMAZON_PAY_TOKEN,
  AmazonPayDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  AmazonPayDetails.JSON_PROPERTY_TYPE
})

public class AmazonPayDetails {
  public static final String JSON_PROPERTY_AMAZON_PAY_TOKEN = "amazonPayToken";
  private String amazonPayToken;

  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  /**
   * **amazonpay**
   */
  public enum TypeEnum {
    AMAZONPAY("amazonpay");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type = TypeEnum.AMAZONPAY;

  public AmazonPayDetails() { 
  }

  public AmazonPayDetails amazonPayToken(String amazonPayToken) {
    this.amazonPayToken = amazonPayToken;
    return this;
  }

   /**
   * This is the &#x60;amazonPayToken&#x60; that you obtained from the [Get Checkout Session](https://amazon-pay-acquirer-guide.s3-eu-west-1.amazonaws.com/v1/amazon-pay-api-v2/checkout-session.html#get-checkout-session) response.
   * @return amazonPayToken
  **/
  @ApiModelProperty(value = "This is the `amazonPayToken` that you obtained from the [Get Checkout Session](https://amazon-pay-acquirer-guide.s3-eu-west-1.amazonaws.com/v1/amazon-pay-api-v2/checkout-session.html#get-checkout-session) response.")
  @JsonProperty(JSON_PROPERTY_AMAZON_PAY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmazonPayToken() {
    return amazonPayToken;
  }


  @JsonProperty(JSON_PROPERTY_AMAZON_PAY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmazonPayToken(String amazonPayToken) {
    this.amazonPayToken = amazonPayToken;
  }


  public AmazonPayDetails checkoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

   /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
  **/
  @ApiModelProperty(value = "The checkout attempt identifier.")
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }


  public AmazonPayDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **amazonpay**
   * @return type
  **/
  @ApiModelProperty(value = "**amazonpay**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this AmazonPayDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AmazonPayDetails amazonPayDetails = (AmazonPayDetails) o;
    return Objects.equals(this.amazonPayToken, amazonPayDetails.amazonPayToken) &&
        Objects.equals(this.checkoutAttemptId, amazonPayDetails.checkoutAttemptId) &&
        Objects.equals(this.type, amazonPayDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amazonPayToken, checkoutAttemptId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmazonPayDetails {\n");
    sb.append("    amazonPayToken: ").append(toIndentedString(amazonPayToken)).append("\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
   * Create an instance of AmazonPayDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AmazonPayDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to AmazonPayDetails
   */
  public static AmazonPayDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AmazonPayDetails.class);
  }
/**
  * Convert an instance of AmazonPayDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

