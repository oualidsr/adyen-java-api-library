/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

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
import java.util.ArrayList;
import java.util.List;

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

import com.adyen.model.legalentitymanagement.JSON;

/**
 * CalculateTermsOfServiceStatusResponse
 */

public class CalculateTermsOfServiceStatusResponse {
  /**
   * Gets or Sets termsOfServiceTypes
   */
  @JsonAdapter(TermsOfServiceTypesEnum.Adapter.class)
  public enum TermsOfServiceTypesEnum {
    ADYENACCOUNT("adyenAccount"),
    
    ADYENCAPITAL("adyenCapital"),
    
    ADYENCARD("adyenCard"),
    
    ADYENFORPLATFORMSADVANCED("adyenForPlatformsAdvanced"),
    
    ADYENFORPLATFORMSMANAGE("adyenForPlatformsManage"),
    
    ADYENFRANCHISEE("adyenFranchisee"),
    
    ADYENISSUING("adyenIssuing");

    private String value;

    TermsOfServiceTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TermsOfServiceTypesEnum fromValue(String value) {
      for (TermsOfServiceTypesEnum b : TermsOfServiceTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TermsOfServiceTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TermsOfServiceTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TermsOfServiceTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TermsOfServiceTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TERMS_OF_SERVICE_TYPES = "termsOfServiceTypes";
  @SerializedName(SERIALIZED_NAME_TERMS_OF_SERVICE_TYPES)
  private List<TermsOfServiceTypesEnum> termsOfServiceTypes = null;

  public CalculateTermsOfServiceStatusResponse() { 
  }

  public CalculateTermsOfServiceStatusResponse termsOfServiceTypes(List<TermsOfServiceTypesEnum> termsOfServiceTypes) {
    
    this.termsOfServiceTypes = termsOfServiceTypes;
    return this;
  }

  public CalculateTermsOfServiceStatusResponse addTermsOfServiceTypesItem(TermsOfServiceTypesEnum termsOfServiceTypesItem) {
    if (this.termsOfServiceTypes == null) {
      this.termsOfServiceTypes = new ArrayList<>();
    }
    this.termsOfServiceTypes.add(termsOfServiceTypesItem);
    return this;
  }

   /**
   * The type of Terms of Service that the legal entity needs to accept. If empty, no Terms of Service needs to be accepted.
   * @return termsOfServiceTypes
  **/
  @ApiModelProperty(value = "The type of Terms of Service that the legal entity needs to accept. If empty, no Terms of Service needs to be accepted.")

  public List<TermsOfServiceTypesEnum> getTermsOfServiceTypes() {
    return termsOfServiceTypes;
  }


  public void setTermsOfServiceTypes(List<TermsOfServiceTypesEnum> termsOfServiceTypes) {
    this.termsOfServiceTypes = termsOfServiceTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalculateTermsOfServiceStatusResponse calculateTermsOfServiceStatusResponse = (CalculateTermsOfServiceStatusResponse) o;
    return Objects.equals(this.termsOfServiceTypes, calculateTermsOfServiceStatusResponse.termsOfServiceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(termsOfServiceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalculateTermsOfServiceStatusResponse {\n");
    sb.append("    termsOfServiceTypes: ").append(toIndentedString(termsOfServiceTypes)).append("\n");
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
    openapiFields.add("termsOfServiceTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CalculateTermsOfServiceStatusResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CalculateTermsOfServiceStatusResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CalculateTermsOfServiceStatusResponse is not found in the empty JSON string", CalculateTermsOfServiceStatusResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CalculateTermsOfServiceStatusResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CalculateTermsOfServiceStatusResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("termsOfServiceTypes") != null && !jsonObj.get("termsOfServiceTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `termsOfServiceTypes` to be an array in the JSON string but got `%s`", jsonObj.get("termsOfServiceTypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CalculateTermsOfServiceStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CalculateTermsOfServiceStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CalculateTermsOfServiceStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CalculateTermsOfServiceStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CalculateTermsOfServiceStatusResponse>() {
           @Override
           public void write(JsonWriter out, CalculateTermsOfServiceStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CalculateTermsOfServiceStatusResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CalculateTermsOfServiceStatusResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CalculateTermsOfServiceStatusResponse
  * @throws IOException if the JSON string is invalid with respect to CalculateTermsOfServiceStatusResponse
  */
  public static CalculateTermsOfServiceStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CalculateTermsOfServiceStatusResponse.class);
  }

 /**
  * Convert an instance of CalculateTermsOfServiceStatusResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

