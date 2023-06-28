/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 70
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * MobilePayDetails
 */
@JsonPropertyOrder({
  MobilePayDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  MobilePayDetails.JSON_PROPERTY_TYPE
})

public class MobilePayDetails {
  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  /**
   * **mobilepay**
   */
  public enum TypeEnum {
    MOBILEPAY("mobilepay");

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
  private TypeEnum type = TypeEnum.MOBILEPAY;

  public MobilePayDetails() { 
  }

  public MobilePayDetails checkoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

   /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
  **/
  @ApiModelProperty(value = "The checkout attempt identifier.")
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }


  public MobilePayDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **mobilepay**
   * @return type
  **/
  @ApiModelProperty(value = "**mobilepay**")
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
   * Return true if this MobilePayDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobilePayDetails mobilePayDetails = (MobilePayDetails) o;
    return Objects.equals(this.checkoutAttemptId, mobilePayDetails.checkoutAttemptId) &&
        Objects.equals(this.type, mobilePayDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutAttemptId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobilePayDetails {\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
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
   * Create an instance of MobilePayDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MobilePayDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to MobilePayDetails
   */
  public static MobilePayDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, MobilePayDetails.class);
  }
/**
  * Convert an instance of MobilePayDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

