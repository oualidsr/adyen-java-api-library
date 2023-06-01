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

import com.adyen.model.checkout.JSON;

/**
 * MerchantDevice
 */

public class MerchantDevice {
  public static final String SERIALIZED_NAME_OS = "os";
  @SerializedName(SERIALIZED_NAME_OS)
  private String os;

  public static final String SERIALIZED_NAME_OS_VERSION = "osVersion";
  @SerializedName(SERIALIZED_NAME_OS_VERSION)
  private String osVersion;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public MerchantDevice() { 
  }

  public MerchantDevice os(String os) {
    
    this.os = os;
    return this;
  }

   /**
   * Operating system running on the merchant device.
   * @return os
  **/
  @ApiModelProperty(value = "Operating system running on the merchant device.")

  public String getOs() {
    return os;
  }


  public void setOs(String os) {
    this.os = os;
  }


  public MerchantDevice osVersion(String osVersion) {
    
    this.osVersion = osVersion;
    return this;
  }

   /**
   * Version of the operating system on the merchant device.
   * @return osVersion
  **/
  @ApiModelProperty(value = "Version of the operating system on the merchant device.")

  public String getOsVersion() {
    return osVersion;
  }


  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  public MerchantDevice reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Merchant device reference.
   * @return reference
  **/
  @ApiModelProperty(value = "Merchant device reference.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantDevice merchantDevice = (MerchantDevice) o;
    return Objects.equals(this.os, merchantDevice.os) &&
        Objects.equals(this.osVersion, merchantDevice.osVersion) &&
        Objects.equals(this.reference, merchantDevice.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(os, osVersion, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantDevice {\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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
    openapiFields.add("os");
    openapiFields.add("osVersion");
    openapiFields.add("reference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantDevice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MerchantDevice.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantDevice is not found in the empty JSON string", MerchantDevice.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MerchantDevice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MerchantDevice` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field os
      if (jsonObj.get("os") != null && !jsonObj.get("os").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `os` to be a primitive type in the JSON string but got `%s`", jsonObj.get("os").toString()));
      }
      // validate the optional field osVersion
      if (jsonObj.get("osVersion") != null && !jsonObj.get("osVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `osVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("osVersion").toString()));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantDevice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantDevice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantDevice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantDevice.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantDevice>() {
           @Override
           public void write(JsonWriter out, MerchantDevice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MerchantDevice read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MerchantDevice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantDevice
  * @throws IOException if the JSON string is invalid with respect to MerchantDevice
  */
  public static MerchantDevice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantDevice.class);
  }

 /**
  * Convert an instance of MerchantDevice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

