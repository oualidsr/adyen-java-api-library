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
import com.adyen.model.balanceplatform.Authentication;
import com.adyen.model.balanceplatform.CardConfiguration;
import com.adyen.model.balanceplatform.DeliveryContact;
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
 * CardInfo
 */
@JsonPropertyOrder({
  CardInfo.JSON_PROPERTY_AUTHENTICATION,
  CardInfo.JSON_PROPERTY_BRAND,
  CardInfo.JSON_PROPERTY_BRAND_VARIANT,
  CardInfo.JSON_PROPERTY_CARDHOLDER_NAME,
  CardInfo.JSON_PROPERTY_CONFIGURATION,
  CardInfo.JSON_PROPERTY_DELIVERY_CONTACT,
  CardInfo.JSON_PROPERTY_FORM_FACTOR,
  CardInfo.JSON_PROPERTY_THREE_D_SECURE
})

public class CardInfo {
  public static final String JSON_PROPERTY_AUTHENTICATION = "authentication";
  private Authentication authentication;

  public static final String JSON_PROPERTY_BRAND = "brand";
  private String brand;

  public static final String JSON_PROPERTY_BRAND_VARIANT = "brandVariant";
  private String brandVariant;

  public static final String JSON_PROPERTY_CARDHOLDER_NAME = "cardholderName";
  private String cardholderName;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  private CardConfiguration configuration;

  public static final String JSON_PROPERTY_DELIVERY_CONTACT = "deliveryContact";
  private DeliveryContact deliveryContact;

  /**
   * The form factor of the card. Possible values: **virtual**, **physical**.
   */
  public enum FormFactorEnum {
    PHYSICAL("physical"),
    
    UNKNOWN("unknown"),
    
    VIRTUAL("virtual");

    private String value;

    FormFactorEnum(String value) {
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
    public static FormFactorEnum fromValue(String value) {
      for (FormFactorEnum b : FormFactorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FORM_FACTOR = "formFactor";
  private FormFactorEnum formFactor;

  public static final String JSON_PROPERTY_THREE_D_SECURE = "threeDSecure";
  private String threeDSecure;

  public CardInfo() { 
  }

  public CardInfo authentication(Authentication authentication) {
    this.authentication = authentication;
    return this;
  }

   /**
   * Get authentication
   * @return authentication
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Authentication getAuthentication() {
    return authentication;
  }


  @JsonProperty(JSON_PROPERTY_AUTHENTICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthentication(Authentication authentication) {
    this.authentication = authentication;
  }


  public CardInfo brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * The brand of the physical or the virtual card. Possible values: **visa**, **mc**.
   * @return brand
  **/
  @ApiModelProperty(required = true, value = "The brand of the physical or the virtual card. Possible values: **visa**, **mc**.")
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrand() {
    return brand;
  }


  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrand(String brand) {
    this.brand = brand;
  }


  public CardInfo brandVariant(String brandVariant) {
    this.brandVariant = brandVariant;
    return this;
  }

   /**
   * The brand variant of the physical or the virtual card. For example, **visadebit** or **mcprepaid**. &gt;Reach out to your Adyen contact to get the values relevant for your integration.
   * @return brandVariant
  **/
  @ApiModelProperty(required = true, value = "The brand variant of the physical or the virtual card. For example, **visadebit** or **mcprepaid**. >Reach out to your Adyen contact to get the values relevant for your integration.")
  @JsonProperty(JSON_PROPERTY_BRAND_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandVariant() {
    return brandVariant;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandVariant(String brandVariant) {
    this.brandVariant = brandVariant;
  }


  public CardInfo cardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
    return this;
  }

   /**
   * The name of the cardholder.  Maximum length: 26 characters.
   * @return cardholderName
  **/
  @ApiModelProperty(required = true, value = "The name of the cardholder.  Maximum length: 26 characters.")
  @JsonProperty(JSON_PROPERTY_CARDHOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardholderName() {
    return cardholderName;
  }


  @JsonProperty(JSON_PROPERTY_CARDHOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCardholderName(String cardholderName) {
    this.cardholderName = cardholderName;
  }


  public CardInfo configuration(CardConfiguration configuration) {
    this.configuration = configuration;
    return this;
  }

   /**
   * Get configuration
   * @return configuration
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardConfiguration getConfiguration() {
    return configuration;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguration(CardConfiguration configuration) {
    this.configuration = configuration;
  }


  public CardInfo deliveryContact(DeliveryContact deliveryContact) {
    this.deliveryContact = deliveryContact;
    return this;
  }

   /**
   * Get deliveryContact
   * @return deliveryContact
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELIVERY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeliveryContact getDeliveryContact() {
    return deliveryContact;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryContact(DeliveryContact deliveryContact) {
    this.deliveryContact = deliveryContact;
  }


  public CardInfo formFactor(FormFactorEnum formFactor) {
    this.formFactor = formFactor;
    return this;
  }

   /**
   * The form factor of the card. Possible values: **virtual**, **physical**.
   * @return formFactor
  **/
  @ApiModelProperty(required = true, value = "The form factor of the card. Possible values: **virtual**, **physical**.")
  @JsonProperty(JSON_PROPERTY_FORM_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FormFactorEnum getFormFactor() {
    return formFactor;
  }


  @JsonProperty(JSON_PROPERTY_FORM_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormFactor(FormFactorEnum formFactor) {
    this.formFactor = formFactor;
  }


  public CardInfo threeDSecure(String threeDSecure) {
    this.threeDSecure = threeDSecure;
    return this;
  }

   /**
   * Allocates a specific product range for either a physical or a virtual card. Possible values: **fullySupported**, **secureCorporate**. &gt;Reach out to your Adyen contact to get the values relevant for your integration.
   * @return threeDSecure
  **/
  @ApiModelProperty(value = "Allocates a specific product range for either a physical or a virtual card. Possible values: **fullySupported**, **secureCorporate**. >Reach out to your Adyen contact to get the values relevant for your integration.")
  @JsonProperty(JSON_PROPERTY_THREE_D_SECURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreeDSecure() {
    return threeDSecure;
  }


  @JsonProperty(JSON_PROPERTY_THREE_D_SECURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSecure(String threeDSecure) {
    this.threeDSecure = threeDSecure;
  }


  /**
   * Return true if this CardInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardInfo cardInfo = (CardInfo) o;
    return Objects.equals(this.authentication, cardInfo.authentication) &&
        Objects.equals(this.brand, cardInfo.brand) &&
        Objects.equals(this.brandVariant, cardInfo.brandVariant) &&
        Objects.equals(this.cardholderName, cardInfo.cardholderName) &&
        Objects.equals(this.configuration, cardInfo.configuration) &&
        Objects.equals(this.deliveryContact, cardInfo.deliveryContact) &&
        Objects.equals(this.formFactor, cardInfo.formFactor) &&
        Objects.equals(this.threeDSecure, cardInfo.threeDSecure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, brand, brandVariant, cardholderName, configuration, deliveryContact, formFactor, threeDSecure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardInfo {\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    brandVariant: ").append(toIndentedString(brandVariant)).append("\n");
    sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
    sb.append("    configuration: ").append(toIndentedString(configuration)).append("\n");
    sb.append("    deliveryContact: ").append(toIndentedString(deliveryContact)).append("\n");
    sb.append("    formFactor: ").append(toIndentedString(formFactor)).append("\n");
    sb.append("    threeDSecure: ").append(toIndentedString(threeDSecure)).append("\n");
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
   * Create an instance of CardInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CardInfo
   * @throws JsonProcessingException if the JSON string is invalid with respect to CardInfo
   */
  public static CardInfo fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CardInfo.class);
  }
/**
  * Convert an instance of CardInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

