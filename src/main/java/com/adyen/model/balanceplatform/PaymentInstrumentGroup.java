/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * PaymentInstrumentGroup
 */
@JsonPropertyOrder({
  PaymentInstrumentGroup.JSON_PROPERTY_BALANCE_PLATFORM,
  PaymentInstrumentGroup.JSON_PROPERTY_DESCRIPTION,
  PaymentInstrumentGroup.JSON_PROPERTY_ID,
  PaymentInstrumentGroup.JSON_PROPERTY_PROPERTIES,
  PaymentInstrumentGroup.JSON_PROPERTY_REFERENCE,
  PaymentInstrumentGroup.JSON_PROPERTY_TX_VARIANT
})

public class PaymentInstrumentGroup {
  public static final String JSON_PROPERTY_BALANCE_PLATFORM = "balancePlatform";
  private String balancePlatform;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private Map<String, String> properties = null;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_TX_VARIANT = "txVariant";
  private String txVariant;

  public PaymentInstrumentGroup() { 
  }

  public PaymentInstrumentGroup balancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
    return this;
  }

   /**
   * The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balancePlatforms/{id}__queryParam_id) to which the payment instrument group belongs.
   * @return balancePlatform
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the [balance platform](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balancePlatforms/{id}__queryParam_id) to which the payment instrument group belongs.")
  @JsonProperty(JSON_PROPERTY_BALANCE_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBalancePlatform() {
    return balancePlatform;
  }


  @JsonProperty(JSON_PROPERTY_BALANCE_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalancePlatform(String balancePlatform) {
    this.balancePlatform = balancePlatform;
  }


  public PaymentInstrumentGroup description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Your description for the payment instrument group, maximum 300 characters.
   * @return description
  **/
  @ApiModelProperty(value = "Your description for the payment instrument group, maximum 300 characters.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public PaymentInstrumentGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the payment instrument group.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the payment instrument group.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public PaymentInstrumentGroup properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public PaymentInstrumentGroup putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Properties of the payment instrument group.
   * @return properties
  **/
  @ApiModelProperty(value = "Properties of the payment instrument group.")
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  public PaymentInstrumentGroup reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the payment instrument group, maximum 150 characters.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the payment instrument group, maximum 150 characters.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public PaymentInstrumentGroup txVariant(String txVariant) {
    this.txVariant = txVariant;
    return this;
  }

   /**
   * The tx variant of the payment instrument group.
   * @return txVariant
  **/
  @ApiModelProperty(required = true, value = "The tx variant of the payment instrument group.")
  @JsonProperty(JSON_PROPERTY_TX_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTxVariant() {
    return txVariant;
  }


  @JsonProperty(JSON_PROPERTY_TX_VARIANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTxVariant(String txVariant) {
    this.txVariant = txVariant;
  }


  /**
   * Return true if this PaymentInstrumentGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstrumentGroup paymentInstrumentGroup = (PaymentInstrumentGroup) o;
    return Objects.equals(this.balancePlatform, paymentInstrumentGroup.balancePlatform) &&
        Objects.equals(this.description, paymentInstrumentGroup.description) &&
        Objects.equals(this.id, paymentInstrumentGroup.id) &&
        Objects.equals(this.properties, paymentInstrumentGroup.properties) &&
        Objects.equals(this.reference, paymentInstrumentGroup.reference) &&
        Objects.equals(this.txVariant, paymentInstrumentGroup.txVariant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balancePlatform, description, id, properties, reference, txVariant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstrumentGroup {\n");
    sb.append("    balancePlatform: ").append(toIndentedString(balancePlatform)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    txVariant: ").append(toIndentedString(txVariant)).append("\n");
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
   * Create an instance of PaymentInstrumentGroup given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentInstrumentGroup
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentInstrumentGroup
   */
  public static PaymentInstrumentGroup fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentInstrumentGroup.class);
  }
/**
  * Convert an instance of PaymentInstrumentGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

