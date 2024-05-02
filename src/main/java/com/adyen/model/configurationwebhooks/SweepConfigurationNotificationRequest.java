/*
 * Configuration webhooks
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.configurationwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.configurationwebhooks.SweepConfigurationNotificationData;
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
 * SweepConfigurationNotificationRequest
 */
@JsonPropertyOrder({
  SweepConfigurationNotificationRequest.JSON_PROPERTY_DATA,
  SweepConfigurationNotificationRequest.JSON_PROPERTY_ENVIRONMENT,
  SweepConfigurationNotificationRequest.JSON_PROPERTY_TYPE
})

public class SweepConfigurationNotificationRequest {
  public static final String JSON_PROPERTY_DATA = "data";
  private SweepConfigurationNotificationData data;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private String environment;

  /**
   * Type of webhook.
   */
  public enum TypeEnum {
    CREATED("balancePlatform.balanceAccountSweep.created"),
    
    UPDATED("balancePlatform.balanceAccountSweep.updated"),
    
    DELETED("balancePlatform.balanceAccountSweep.deleted");

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

  public SweepConfigurationNotificationRequest() { 
  }

  public SweepConfigurationNotificationRequest data(SweepConfigurationNotificationData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SweepConfigurationNotificationData getData() {
    return data;
  }


 /**
  * data
  *
  * @param data
  */ 
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(SweepConfigurationNotificationData data) {
    this.data = data;
  }


  public SweepConfigurationNotificationRequest environment(String environment) {
    this.environment = environment;
    return this;
  }

   /**
   * The environment from which the webhook originated.  Possible values: **test**, **live**.
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "The environment from which the webhook originated.  Possible values: **test**, **live**.")
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnvironment() {
    return environment;
  }


 /**
  * The environment from which the webhook originated.  Possible values: **test**, **live**.
  *
  * @param environment
  */ 
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public SweepConfigurationNotificationRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of webhook.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of webhook.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


 /**
  * Type of webhook.
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this SweepConfigurationNotificationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SweepConfigurationNotificationRequest sweepConfigurationNotificationRequest = (SweepConfigurationNotificationRequest) o;
    return Objects.equals(this.data, sweepConfigurationNotificationRequest.data) &&
        Objects.equals(this.environment, sweepConfigurationNotificationRequest.environment) &&
        Objects.equals(this.type, sweepConfigurationNotificationRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, environment, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SweepConfigurationNotificationRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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
   * Create an instance of SweepConfigurationNotificationRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SweepConfigurationNotificationRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to SweepConfigurationNotificationRequest
   */
  public static SweepConfigurationNotificationRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, SweepConfigurationNotificationRequest.class);
  }
/**
  * Convert an instance of SweepConfigurationNotificationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

