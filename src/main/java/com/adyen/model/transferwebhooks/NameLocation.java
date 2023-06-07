/*
 * Transfer webhooks
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transferwebhooks;

import java.util.Objects;
import java.util.Arrays;
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
import java.util.logging.Level;
import java.util.logging.Logger;

import com.adyen.model.transferwebhooks.JSON;

/**
 * NameLocation
 */

public class NameLocation {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_COUNTRY_OF_ORIGIN = "countryOfOrigin";
  @SerializedName(SERIALIZED_NAME_COUNTRY_OF_ORIGIN)
  private String countryOfOrigin;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RAW_DATA = "rawData";
  @SerializedName(SERIALIZED_NAME_RAW_DATA)
  private String rawData;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public NameLocation() { 
  }

  public NameLocation city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city where the merchant is located.
   * @return city
  **/
  @ApiModelProperty(value = "The city where the merchant is located.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public NameLocation country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country where the merchant is located in [three-letter country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) format.
   * @return country
  **/
  @ApiModelProperty(value = "The country where the merchant is located in [three-letter country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) format.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public NameLocation countryOfOrigin(String countryOfOrigin) {
    
    this.countryOfOrigin = countryOfOrigin;
    return this;
  }

   /**
   * The home country in [three-digit country code](https://en.wikipedia.org/wiki/ISO_3166-1_numeric) format, used for government-controlled merchants such as embassies.
   * @return countryOfOrigin
  **/
  @ApiModelProperty(value = "The home country in [three-digit country code](https://en.wikipedia.org/wiki/ISO_3166-1_numeric) format, used for government-controlled merchants such as embassies.")

  public String getCountryOfOrigin() {
    return countryOfOrigin;
  }


  public void setCountryOfOrigin(String countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }


  public NameLocation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the merchant&#39;s shop or service.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the merchant's shop or service.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NameLocation rawData(String rawData) {
    
    this.rawData = rawData;
    return this;
  }

   /**
   * The raw data.
   * @return rawData
  **/
  @ApiModelProperty(value = "The raw data.")

  public String getRawData() {
    return rawData;
  }


  public void setRawData(String rawData) {
    this.rawData = rawData;
  }


  public NameLocation state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state where the merchant is located.
   * @return state
  **/
  @ApiModelProperty(value = "The state where the merchant is located.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameLocation nameLocation = (NameLocation) o;
    return Objects.equals(this.city, nameLocation.city) &&
        Objects.equals(this.country, nameLocation.country) &&
        Objects.equals(this.countryOfOrigin, nameLocation.countryOfOrigin) &&
        Objects.equals(this.name, nameLocation.name) &&
        Objects.equals(this.rawData, nameLocation.rawData) &&
        Objects.equals(this.state, nameLocation.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, countryOfOrigin, name, rawData, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameLocation {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryOfOrigin: ").append(toIndentedString(countryOfOrigin)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rawData: ").append(toIndentedString(rawData)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("countryOfOrigin");
    openapiFields.add("name");
    openapiFields.add("rawData");
    openapiFields.add("state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(NameLocation.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NameLocation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NameLocation.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NameLocation is not found in the empty JSON string", NameLocation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NameLocation.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `NameLocation` properties.", entry.getKey()));
        }
      }
      // validate the optional field city
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      // validate the optional field country
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      // validate the optional field countryOfOrigin
      if (jsonObj.get("countryOfOrigin") != null && !jsonObj.get("countryOfOrigin").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `countryOfOrigin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryOfOrigin").toString()));
      }
      // validate the optional field name
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field rawData
      if (jsonObj.get("rawData") != null && !jsonObj.get("rawData").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `rawData` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rawData").toString()));
      }
      // validate the optional field state
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NameLocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NameLocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NameLocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NameLocation.class));

       return (TypeAdapter<T>) new TypeAdapter<NameLocation>() {
           @Override
           public void write(JsonWriter out, NameLocation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NameLocation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NameLocation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NameLocation
  * @throws IOException if the JSON string is invalid with respect to NameLocation
  */
  public static NameLocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NameLocation.class);
  }

 /**
  * Convert an instance of NameLocation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
