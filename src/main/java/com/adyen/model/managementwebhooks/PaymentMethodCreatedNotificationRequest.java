/*
 * Management Webhooks
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.managementwebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.managementwebhooks.MidServiceNotificationData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * PaymentMethodCreatedNotificationRequest
 */
@JsonPropertyOrder({
  PaymentMethodCreatedNotificationRequest.JSON_PROPERTY_CREATED_AT,
  PaymentMethodCreatedNotificationRequest.JSON_PROPERTY_DATA,
  PaymentMethodCreatedNotificationRequest.JSON_PROPERTY_ENVIRONMENT,
  PaymentMethodCreatedNotificationRequest.JSON_PROPERTY_TYPE
})

public class PaymentMethodCreatedNotificationRequest {
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DATA = "data";
  private MidServiceNotificationData data;

  public static final String JSON_PROPERTY_ENVIRONMENT = "environment";
  private String environment;

  /**
   * Type of notification.
   */
  public enum TypeEnum {
    PAYMENTMETHOD_CREATED("paymentMethod.created");

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

  public PaymentMethodCreatedNotificationRequest() { 
  }

  public PaymentMethodCreatedNotificationRequest createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp for when the webhook was created.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "Timestamp for when the webhook was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PaymentMethodCreatedNotificationRequest data(MidServiceNotificationData data) {
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

  public MidServiceNotificationData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(MidServiceNotificationData data) {
    this.data = data;
  }


  public PaymentMethodCreatedNotificationRequest environment(String environment) {
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


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironment(String environment) {
    this.environment = environment;
  }


  public PaymentMethodCreatedNotificationRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of notification.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of notification.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this PaymentMethodCreatedNotificationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodCreatedNotificationRequest paymentMethodCreatedNotificationRequest = (PaymentMethodCreatedNotificationRequest) o;
    return Objects.equals(this.createdAt, paymentMethodCreatedNotificationRequest.createdAt) &&
        Objects.equals(this.data, paymentMethodCreatedNotificationRequest.data) &&
        Objects.equals(this.environment, paymentMethodCreatedNotificationRequest.environment) &&
        Objects.equals(this.type, paymentMethodCreatedNotificationRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, data, environment, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodCreatedNotificationRequest {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
   * Create an instance of PaymentMethodCreatedNotificationRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentMethodCreatedNotificationRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentMethodCreatedNotificationRequest
   */
  public static PaymentMethodCreatedNotificationRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentMethodCreatedNotificationRequest.class);
  }
/**
  * Convert an instance of PaymentMethodCreatedNotificationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

