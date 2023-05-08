/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
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
 * AULocalAccountIdentification
 */

public class AULocalAccountIdentification {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_BSB_CODE = "bsbCode";
  @SerializedName(SERIALIZED_NAME_BSB_CODE)
  private String bsbCode;

  /**
   * **auLocal**
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    AULOCAL("auLocal");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.AULOCAL;

  public AULocalAccountIdentification() { 
  }

  public AULocalAccountIdentification accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The bank account number, without separators or whitespace.
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The bank account number, without separators or whitespace.")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public AULocalAccountIdentification bsbCode(String bsbCode) {
    
    this.bsbCode = bsbCode;
    return this;
  }

   /**
   * The 6-digit [Bank State Branch (BSB) code](https://en.wikipedia.org/wiki/Bank_state_branch), without separators or whitespace.
   * @return bsbCode
  **/
  @ApiModelProperty(required = true, value = "The 6-digit [Bank State Branch (BSB) code](https://en.wikipedia.org/wiki/Bank_state_branch), without separators or whitespace.")

  public String getBsbCode() {
    return bsbCode;
  }


  public void setBsbCode(String bsbCode) {
    this.bsbCode = bsbCode;
  }


  public AULocalAccountIdentification type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * **auLocal**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**auLocal**")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AULocalAccountIdentification auLocalAccountIdentification = (AULocalAccountIdentification) o;
    return Objects.equals(this.accountNumber, auLocalAccountIdentification.accountNumber) &&
        Objects.equals(this.bsbCode, auLocalAccountIdentification.bsbCode) &&
        Objects.equals(this.type, auLocalAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, bsbCode, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AULocalAccountIdentification {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bsbCode: ").append(toIndentedString(bsbCode)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("accountNumber");
    openapiFields.add("bsbCode");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("accountNumber");
    openapiRequiredFields.add("bsbCode");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AULocalAccountIdentification
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AULocalAccountIdentification.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AULocalAccountIdentification is not found in the empty JSON string", AULocalAccountIdentification.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AULocalAccountIdentification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AULocalAccountIdentification` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AULocalAccountIdentification.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field accountNumber
      if (jsonObj.get("accountNumber") != null && !jsonObj.get("accountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountNumber").toString()));
      }
      // validate the optional field bsbCode
      if (jsonObj.get("bsbCode") != null && !jsonObj.get("bsbCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bsbCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bsbCode").toString()));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AULocalAccountIdentification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AULocalAccountIdentification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AULocalAccountIdentification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AULocalAccountIdentification.class));

       return (TypeAdapter<T>) new TypeAdapter<AULocalAccountIdentification>() {
           @Override
           public void write(JsonWriter out, AULocalAccountIdentification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AULocalAccountIdentification read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AULocalAccountIdentification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AULocalAccountIdentification
  * @throws IOException if the JSON string is invalid with respect to AULocalAccountIdentification
  */
  public static AULocalAccountIdentification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AULocalAccountIdentification.class);
  }

 /**
  * Convert an instance of AULocalAccountIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
