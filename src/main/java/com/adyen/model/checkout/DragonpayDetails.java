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
 * DragonpayDetails
 */
@JsonPropertyOrder({
  DragonpayDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  DragonpayDetails.JSON_PROPERTY_ISSUER,
  DragonpayDetails.JSON_PROPERTY_SHOPPER_EMAIL,
  DragonpayDetails.JSON_PROPERTY_TYPE
})

public class DragonpayDetails {
  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private String issuer;

  public static final String JSON_PROPERTY_SHOPPER_EMAIL = "shopperEmail";
  private String shopperEmail;

  /**
   * **dragonpay**
   */
  public enum TypeEnum {
    EBANKING("dragonpay_ebanking"),
    
    OTC_BANKING("dragonpay_otc_banking"),
    
    OTC_NON_BANKING("dragonpay_otc_non_banking"),
    
    OTC_PHILIPPINES("dragonpay_otc_philippines");

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
  private TypeEnum type;

  public DragonpayDetails() { 
  }

  public DragonpayDetails checkoutAttemptId(String checkoutAttemptId) {
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


  public DragonpayDetails issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * The Dragonpay issuer value of the shopper&#39;s selected bank. Set this to an **id** of a Dragonpay issuer to preselect it.
   * @return issuer
  **/
  @ApiModelProperty(required = true, value = "The Dragonpay issuer value of the shopper's selected bank. Set this to an **id** of a Dragonpay issuer to preselect it.")
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuer() {
    return issuer;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public DragonpayDetails shopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
    return this;
  }

   /**
   * The shopper’s email address.
   * @return shopperEmail
  **/
  @ApiModelProperty(value = "The shopper’s email address.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShopperEmail() {
    return shopperEmail;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }


  public DragonpayDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **dragonpay**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**dragonpay**")
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
   * Return true if this DragonpayDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DragonpayDetails dragonpayDetails = (DragonpayDetails) o;
    return Objects.equals(this.checkoutAttemptId, dragonpayDetails.checkoutAttemptId) &&
        Objects.equals(this.issuer, dragonpayDetails.issuer) &&
        Objects.equals(this.shopperEmail, dragonpayDetails.shopperEmail) &&
        Objects.equals(this.type, dragonpayDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutAttemptId, issuer, shopperEmail, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DragonpayDetails {\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
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
   * Create an instance of DragonpayDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DragonpayDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to DragonpayDetails
   */
  public static DragonpayDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, DragonpayDetails.class);
  }
/**
  * Convert an instance of DragonpayDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

