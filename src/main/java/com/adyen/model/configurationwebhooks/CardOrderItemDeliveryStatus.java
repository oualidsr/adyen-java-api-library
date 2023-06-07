/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.configurationwebhooks;

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

import com.adyen.model.configurationwebhooks.JSON;

/**
 * CardOrderItemDeliveryStatus
 */

public class CardOrderItemDeliveryStatus {
  /**
   * Status of the delivery.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("created"),
    
    DELIVERED("delivered"),
    
    PROCESSING("processing"),
    
    PRODUCED("produced"),
    
    REJECTED("rejected"),
    
    SHIPPED("shipped"),
    
    UNKNOWN("unknown");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_STATUS_ERROR = "statusError";
  @SerializedName(SERIALIZED_NAME_STATUS_ERROR)
  private String statusError;

  public static final String SERIALIZED_NAME_STATUS_ERROR_MESSAGE = "statusErrorMessage";
  @SerializedName(SERIALIZED_NAME_STATUS_ERROR_MESSAGE)
  private String statusErrorMessage;

  public static final String SERIALIZED_NAME_TRACKING_NUMBER = "trackingNumber";
  @SerializedName(SERIALIZED_NAME_TRACKING_NUMBER)
  private String trackingNumber;

  public CardOrderItemDeliveryStatus() { 
  }

  public CardOrderItemDeliveryStatus status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the delivery.
   * @return status
  **/
  @ApiModelProperty(value = "Status of the delivery.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public CardOrderItemDeliveryStatus statusError(String statusError) {
    
    this.statusError = statusError;
    return this;
  }

   /**
   * Error status, if any.
   * @return statusError
  **/
  @ApiModelProperty(value = "Error status, if any.")

  public String getStatusError() {
    return statusError;
  }


  public void setStatusError(String statusError) {
    this.statusError = statusError;
  }


  public CardOrderItemDeliveryStatus statusErrorMessage(String statusErrorMessage) {
    
    this.statusErrorMessage = statusErrorMessage;
    return this;
  }

   /**
   * Error message, if any.
   * @return statusErrorMessage
  **/
  @ApiModelProperty(value = "Error message, if any.")

  public String getStatusErrorMessage() {
    return statusErrorMessage;
  }


  public void setStatusErrorMessage(String statusErrorMessage) {
    this.statusErrorMessage = statusErrorMessage;
  }


  public CardOrderItemDeliveryStatus trackingNumber(String trackingNumber) {
    
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * Tracking number of the delivery.
   * @return trackingNumber
  **/
  @ApiModelProperty(value = "Tracking number of the delivery.")

  public String getTrackingNumber() {
    return trackingNumber;
  }


  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardOrderItemDeliveryStatus cardOrderItemDeliveryStatus = (CardOrderItemDeliveryStatus) o;
    return Objects.equals(this.status, cardOrderItemDeliveryStatus.status) &&
        Objects.equals(this.statusError, cardOrderItemDeliveryStatus.statusError) &&
        Objects.equals(this.statusErrorMessage, cardOrderItemDeliveryStatus.statusErrorMessage) &&
        Objects.equals(this.trackingNumber, cardOrderItemDeliveryStatus.trackingNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, statusError, statusErrorMessage, trackingNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardOrderItemDeliveryStatus {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusError: ").append(toIndentedString(statusError)).append("\n");
    sb.append("    statusErrorMessage: ").append(toIndentedString(statusErrorMessage)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("statusError");
    openapiFields.add("statusErrorMessage");
    openapiFields.add("trackingNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }
  /**
  * logger for Deserialization Errors
  */
  private static final Logger log = Logger.getLogger(CardOrderItemDeliveryStatus.class.getName());

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CardOrderItemDeliveryStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CardOrderItemDeliveryStatus.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardOrderItemDeliveryStatus is not found in the empty JSON string", CardOrderItemDeliveryStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CardOrderItemDeliveryStatus.openapiFields.contains(entry.getKey())) {
          log.log(Level.WARNING, String.format("The field `%s` in the JSON string is not defined in the `CardOrderItemDeliveryStatus` properties.", entry.getKey()));
        }
      }
      // ensure the field status can be parsed to an enum value
      if (jsonObj.get("status") != null) {
        if(!jsonObj.get("status").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
        }
        StatusEnum.fromValue(jsonObj.get("status").getAsString());
      }
      // validate the optional field statusError
      if (jsonObj.get("statusError") != null && !jsonObj.get("statusError").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `statusError` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusError").toString()));
      }
      // validate the optional field statusErrorMessage
      if (jsonObj.get("statusErrorMessage") != null && !jsonObj.get("statusErrorMessage").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `statusErrorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusErrorMessage").toString()));
      }
      // validate the optional field trackingNumber
      if (jsonObj.get("trackingNumber") != null && !jsonObj.get("trackingNumber").isJsonPrimitive()) {
        log.log(Level.WARNING, String.format("Expected the field `trackingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trackingNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardOrderItemDeliveryStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardOrderItemDeliveryStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardOrderItemDeliveryStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardOrderItemDeliveryStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<CardOrderItemDeliveryStatus>() {
           @Override
           public void write(JsonWriter out, CardOrderItemDeliveryStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CardOrderItemDeliveryStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CardOrderItemDeliveryStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardOrderItemDeliveryStatus
  * @throws IOException if the JSON string is invalid with respect to CardOrderItemDeliveryStatus
  */
  public static CardOrderItemDeliveryStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardOrderItemDeliveryStatus.class);
  }

 /**
  * Convert an instance of CardOrderItemDeliveryStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
