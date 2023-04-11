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
import com.adyen.model.balanceplatform.Authentication;
import com.adyen.model.balanceplatform.CardConfiguration;
import com.adyen.model.balanceplatform.DeliveryContact;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.adyen.model.balanceplatform.JSON;

/**
 * CardInfo
 */

public class CardInfo {
  public static final String SERIALIZED_NAME_AUTHENTICATION = "authentication";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION)
  private Authentication authentication;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_BRAND_VARIANT = "brandVariant";
  @SerializedName(SERIALIZED_NAME_BRAND_VARIANT)
  private String brandVariant;

  public static final String SERIALIZED_NAME_CARDHOLDER_NAME = "cardholderName";
  @SerializedName(SERIALIZED_NAME_CARDHOLDER_NAME)
  private String cardholderName;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private CardConfiguration configuration;

  public static final String SERIALIZED_NAME_DELIVERY_CONTACT = "deliveryContact";
  @SerializedName(SERIALIZED_NAME_DELIVERY_CONTACT)
  private DeliveryContact deliveryContact;

  /**
   * The form factor of the card. Possible values: **virtual**, **physical**.
   */
  @JsonAdapter(FormFactorEnum.Adapter.class)
  public enum FormFactorEnum {
    PHYSICAL("physical"),
    
    UNKNOWN("unknown"),
    
    VIRTUAL("virtual");

    private String value;

    FormFactorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FormFactorEnum fromValue(String value) {
      for (FormFactorEnum b : FormFactorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FormFactorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FormFactorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FormFactorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FormFactorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FORM_FACTOR = "formFactor";
  @SerializedName(SERIALIZED_NAME_FORM_FACTOR)
  private FormFactorEnum formFactor;

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

  public Authentication getAuthentication() {
    return authentication;
  }


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

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public CardInfo brandVariant(String brandVariant) {
    
    this.brandVariant = brandVariant;
    return this;
  }

   /**
   * The brand variant of the physical or the virtual card. &gt;Contact your Adyen Implementation Manager to get the values that are relevant to your integration. Examples: **visadebit**, **mcprepaid**.
   * @return brandVariant
  **/
  @ApiModelProperty(required = true, value = "The brand variant of the physical or the virtual card. >Contact your Adyen Implementation Manager to get the values that are relevant to your integration. Examples: **visadebit**, **mcprepaid**.")

  public String getBrandVariant() {
    return brandVariant;
  }


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

  public String getCardholderName() {
    return cardholderName;
  }


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

  public CardConfiguration getConfiguration() {
    return configuration;
  }


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

  public DeliveryContact getDeliveryContact() {
    return deliveryContact;
  }


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

  public FormFactorEnum getFormFactor() {
    return formFactor;
  }


  public void setFormFactor(FormFactorEnum formFactor) {
    this.formFactor = formFactor;
  }



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
        Objects.equals(this.formFactor, cardInfo.formFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authentication, brand, brandVariant, cardholderName, configuration, deliveryContact, formFactor);
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("authentication");
    openapiFields.add("brand");
    openapiFields.add("brandVariant");
    openapiFields.add("cardholderName");
    openapiFields.add("configuration");
    openapiFields.add("deliveryContact");
    openapiFields.add("formFactor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("brand");
    openapiRequiredFields.add("brandVariant");
    openapiRequiredFields.add("cardholderName");
    openapiRequiredFields.add("formFactor");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CardInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CardInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardInfo is not found in the empty JSON string", CardInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CardInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CardInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CardInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `authentication`
      if (jsonObj.getAsJsonObject("authentication") != null) {
        Authentication.validateJsonObject(jsonObj.getAsJsonObject("authentication"));
      }
      // validate the optional field brand
      if (jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      // validate the optional field brandVariant
      if (jsonObj.get("brandVariant") != null && !jsonObj.get("brandVariant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandVariant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandVariant").toString()));
      }
      // validate the optional field cardholderName
      if (jsonObj.get("cardholderName") != null && !jsonObj.get("cardholderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardholderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardholderName").toString()));
      }
      // validate the optional field `configuration`
      if (jsonObj.getAsJsonObject("configuration") != null) {
        CardConfiguration.validateJsonObject(jsonObj.getAsJsonObject("configuration"));
      }
      // validate the optional field `deliveryContact`
      if (jsonObj.getAsJsonObject("deliveryContact") != null) {
        DeliveryContact.validateJsonObject(jsonObj.getAsJsonObject("deliveryContact"));
      }
      // ensure the field formFactor can be parsed to an enum value
      if (jsonObj.get("formFactor") != null) {
        if(!jsonObj.get("formFactor").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `formFactor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("formFactor").toString()));
        }
        FormFactorEnum.fromValue(jsonObj.get("formFactor").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CardInfo>() {
           @Override
           public void write(JsonWriter out, CardInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CardInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CardInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardInfo
  * @throws IOException if the JSON string is invalid with respect to CardInfo
  */
  public static CardInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardInfo.class);
  }

 /**
  * Convert an instance of CardInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

