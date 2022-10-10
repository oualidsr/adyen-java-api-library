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
import com.adyen.model.balanceplatform.CapabilityProblem;
import com.adyen.model.balanceplatform.JSONObject;
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

import com.adyen.model.balanceplatform.JSON;

/**
 * AccountHolderCapability
 */

public class AccountHolderCapability {
  public static final String SERIALIZED_NAME_ALLOWED = "allowed";
  @SerializedName(SERIALIZED_NAME_ALLOWED)
  private Boolean allowed;

  /**
   * The capability level that is allowed for the account holder.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   */
  @JsonAdapter(AllowedLevelEnum.Adapter.class)
  public enum AllowedLevelEnum {
    HIGH("high"),
    
    LOW("low"),
    
    MEDIUM("medium"),
    
    NOTAPPLICABLE("notApplicable");

    private String value;

    AllowedLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AllowedLevelEnum fromValue(String value) {
      for (AllowedLevelEnum b : AllowedLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AllowedLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AllowedLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AllowedLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AllowedLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALLOWED_LEVEL = "allowedLevel";
  @SerializedName(SERIALIZED_NAME_ALLOWED_LEVEL)
  private AllowedLevelEnum allowedLevel;

  public static final String SERIALIZED_NAME_ALLOWED_SETTINGS = "allowedSettings";
  @SerializedName(SERIALIZED_NAME_ALLOWED_SETTINGS)
  private JSONObject allowedSettings;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_PROBLEMS = "problems";
  @SerializedName(SERIALIZED_NAME_PROBLEMS)
  private List<CapabilityProblem> problems = null;

  public static final String SERIALIZED_NAME_REQUESTED = "requested";
  @SerializedName(SERIALIZED_NAME_REQUESTED)
  private Boolean requested;

  /**
   * The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   */
  @JsonAdapter(RequestedLevelEnum.Adapter.class)
  public enum RequestedLevelEnum {
    HIGH("high"),
    
    LOW("low"),
    
    MEDIUM("medium"),
    
    NOTAPPLICABLE("notApplicable");

    private String value;

    RequestedLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RequestedLevelEnum fromValue(String value) {
      for (RequestedLevelEnum b : RequestedLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RequestedLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RequestedLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RequestedLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RequestedLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REQUESTED_LEVEL = "requestedLevel";
  @SerializedName(SERIALIZED_NAME_REQUESTED_LEVEL)
  private RequestedLevelEnum requestedLevel;

  public static final String SERIALIZED_NAME_REQUESTED_SETTINGS = "requestedSettings";
  @SerializedName(SERIALIZED_NAME_REQUESTED_SETTINGS)
  private JSONObject requestedSettings;

  /**
   * The status of the verification checks for the capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the &#x60;errors&#x60; array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. 
   */
  @JsonAdapter(VerificationStatusEnum.Adapter.class)
  public enum VerificationStatusEnum {
    INVALID("invalid"),
    
    PENDING("pending"),
    
    REJECTED("rejected"),
    
    VALID("valid");

    private String value;

    VerificationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerificationStatusEnum fromValue(String value) {
      for (VerificationStatusEnum b : VerificationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VerificationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerificationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerificationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VerificationStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "verificationStatus";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private VerificationStatusEnum verificationStatus;

  public AccountHolderCapability() { 
  }

  
  public AccountHolderCapability(
     Boolean allowed, 
     AllowedLevelEnum allowedLevel, 
     List<CapabilityProblem> problems, 
     VerificationStatusEnum verificationStatus
  ) {
    this();
    this.allowed = allowed;
    this.allowedLevel = allowedLevel;
    this.problems = problems;
    this.verificationStatus = verificationStatus;
  }

   /**
   * Indicates whether the capability is allowed. Adyen sets this to **true** if the verification is successful and the account holder is permitted to use the capability.
   * @return allowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the capability is allowed. Adyen sets this to **true** if the verification is successful and the account holder is permitted to use the capability.")

  public Boolean getAllowed() {
    return allowed;
  }




   /**
   * The capability level that is allowed for the account holder.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   * @return allowedLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The capability level that is allowed for the account holder.  Possible values: **notApplicable**, **low**, **medium**, **high**.")

  public AllowedLevelEnum getAllowedLevel() {
    return allowedLevel;
  }




  public AccountHolderCapability allowedSettings(JSONObject allowedSettings) {
    
    this.allowedSettings = allowedSettings;
    return this;
  }

   /**
   * Get allowedSettings
   * @return allowedSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JSONObject getAllowedSettings() {
    return allowedSettings;
  }


  public void setAllowedSettings(JSONObject allowedSettings) {
    this.allowedSettings = allowedSettings;
  }


  public AccountHolderCapability enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the capability is enabled. If **false**, the capability is temporarily disabled for the account holder.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the capability is enabled. If **false**, the capability is temporarily disabled for the account holder.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


   /**
   * Contains verification errors and the actions that you can take to resolve them.
   * @return problems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains verification errors and the actions that you can take to resolve them.")

  public List<CapabilityProblem> getProblems() {
    return problems;
  }




  public AccountHolderCapability requested(Boolean requested) {
    
    this.requested = requested;
    return this;
  }

   /**
   * Indicates whether the capability is requested. To check whether the account holder is permitted to use the capability, refer to the &#x60;allowed&#x60; field.
   * @return requested
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the capability is requested. To check whether the account holder is permitted to use the capability, refer to the `allowed` field.")

  public Boolean getRequested() {
    return requested;
  }


  public void setRequested(Boolean requested) {
    this.requested = requested;
  }


  public AccountHolderCapability requestedLevel(RequestedLevelEnum requestedLevel) {
    
    this.requestedLevel = requestedLevel;
    return this;
  }

   /**
   * The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**.
   * @return requestedLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The requested level of the capability. Some capabilities, such as those used in [card issuing](https://docs.adyen.com/issuing/add-capabilities#capability-levels), have different levels. Levels increase the capability, but also require additional checks and increased monitoring.  Possible values: **notApplicable**, **low**, **medium**, **high**.")

  public RequestedLevelEnum getRequestedLevel() {
    return requestedLevel;
  }


  public void setRequestedLevel(RequestedLevelEnum requestedLevel) {
    this.requestedLevel = requestedLevel;
  }


  public AccountHolderCapability requestedSettings(JSONObject requestedSettings) {
    
    this.requestedSettings = requestedSettings;
    return this;
  }

   /**
   * Get requestedSettings
   * @return requestedSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JSONObject getRequestedSettings() {
    return requestedSettings;
  }


  public void setRequestedSettings(JSONObject requestedSettings) {
    this.requestedSettings = requestedSettings;
  }


   /**
   * The status of the verification checks for the capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the &#x60;errors&#x60; array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. 
   * @return verificationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the verification checks for the capability.  Possible values:  * **pending**: Adyen is running the verification.  * **invalid**: The verification failed. Check if the `errors` array contains more information.  * **valid**: The verification has been successfully completed.  * **rejected**: Adyen has verified the information, but found reasons to not allow the capability. ")

  public VerificationStatusEnum getVerificationStatus() {
    return verificationStatus;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountHolderCapability accountHolderCapability = (AccountHolderCapability) o;
    return Objects.equals(this.allowed, accountHolderCapability.allowed) &&
        Objects.equals(this.allowedLevel, accountHolderCapability.allowedLevel) &&
        Objects.equals(this.allowedSettings, accountHolderCapability.allowedSettings) &&
        Objects.equals(this.enabled, accountHolderCapability.enabled) &&
        Objects.equals(this.problems, accountHolderCapability.problems) &&
        Objects.equals(this.requested, accountHolderCapability.requested) &&
        Objects.equals(this.requestedLevel, accountHolderCapability.requestedLevel) &&
        Objects.equals(this.requestedSettings, accountHolderCapability.requestedSettings) &&
        Objects.equals(this.verificationStatus, accountHolderCapability.verificationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, allowedLevel, allowedSettings, enabled, problems, requested, requestedLevel, requestedSettings, verificationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountHolderCapability {\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    allowedLevel: ").append(toIndentedString(allowedLevel)).append("\n");
    sb.append("    allowedSettings: ").append(toIndentedString(allowedSettings)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    problems: ").append(toIndentedString(problems)).append("\n");
    sb.append("    requested: ").append(toIndentedString(requested)).append("\n");
    sb.append("    requestedLevel: ").append(toIndentedString(requestedLevel)).append("\n");
    sb.append("    requestedSettings: ").append(toIndentedString(requestedSettings)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
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
    openapiFields.add("allowed");
    openapiFields.add("allowedLevel");
    openapiFields.add("allowedSettings");
    openapiFields.add("enabled");
    openapiFields.add("problems");
    openapiFields.add("requested");
    openapiFields.add("requestedLevel");
    openapiFields.add("requestedSettings");
    openapiFields.add("verificationStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountHolderCapability
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AccountHolderCapability.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountHolderCapability is not found in the empty JSON string", AccountHolderCapability.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AccountHolderCapability.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountHolderCapability` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the field allowedLevel can be parsed to an enum value
      if (jsonObj.get("allowedLevel") != null) {
        if(!jsonObj.get("allowedLevel").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `allowedLevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("allowedLevel").toString()));
        }
        AllowedLevelEnum.fromValue(jsonObj.get("allowedLevel").getAsString());
      }
      // validate the optional field `allowedSettings`
      if (jsonObj.getAsJsonObject("allowedSettings") != null) {
        JSONObject.validateJsonObject(jsonObj.getAsJsonObject("allowedSettings"));
      }
      JsonArray jsonArrayproblems = jsonObj.getAsJsonArray("problems");
      if (jsonArrayproblems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("problems").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `problems` to be an array in the JSON string but got `%s`", jsonObj.get("problems").toString()));
        }

        // validate the optional field `problems` (array)
        for (int i = 0; i < jsonArrayproblems.size(); i++) {
          CapabilityProblem.validateJsonObject(jsonArrayproblems.get(i).getAsJsonObject());
        };
      }
      // ensure the field requestedLevel can be parsed to an enum value
      if (jsonObj.get("requestedLevel") != null) {
        if(!jsonObj.get("requestedLevel").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `requestedLevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestedLevel").toString()));
        }
        RequestedLevelEnum.fromValue(jsonObj.get("requestedLevel").getAsString());
      }
      // validate the optional field `requestedSettings`
      if (jsonObj.getAsJsonObject("requestedSettings") != null) {
        JSONObject.validateJsonObject(jsonObj.getAsJsonObject("requestedSettings"));
      }
      // ensure the field verificationStatus can be parsed to an enum value
      if (jsonObj.get("verificationStatus") != null) {
        if(!jsonObj.get("verificationStatus").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `verificationStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verificationStatus").toString()));
        }
        VerificationStatusEnum.fromValue(jsonObj.get("verificationStatus").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountHolderCapability.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountHolderCapability' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountHolderCapability> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountHolderCapability.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountHolderCapability>() {
           @Override
           public void write(JsonWriter out, AccountHolderCapability value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountHolderCapability read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountHolderCapability given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountHolderCapability
  * @throws IOException if the JSON string is invalid with respect to AccountHolderCapability
  */
  public static AccountHolderCapability fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountHolderCapability.class);
  }

 /**
  * Convert an instance of AccountHolderCapability to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

