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
 * PhoneNumber
 */
@JsonPropertyOrder({
  PhoneNumber.JSON_PROPERTY_NUMBER,
  PhoneNumber.JSON_PROPERTY_TYPE
})

public class PhoneNumber {
  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public PhoneNumber() { 
  }

  public PhoneNumber number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The full phone number, including the country code. For example, **+3112345678**.
   * @return number
  **/
  @ApiModelProperty(required = true, value = "The full phone number, including the country code. For example, **+3112345678**.")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(String number) {
    this.number = number;
  }


  public PhoneNumber type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of phone number.  Possible values: **mobile**, **landline**, **sip**, **fax.** 
   * @return type
  **/
  @ApiModelProperty(value = "The type of phone number.  Possible values: **mobile**, **landline**, **sip**, **fax.** ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this PhoneNumber object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumber phoneNumber = (PhoneNumber) o;
    return Objects.equals(this.number, phoneNumber.number) &&
        Objects.equals(this.type, phoneNumber.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumber {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
   * Create an instance of PhoneNumber given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PhoneNumber
   * @throws JsonProcessingException if the JSON string is invalid with respect to PhoneNumber
   */
  public static PhoneNumber fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PhoneNumber.class);
  }
/**
  * Convert an instance of PhoneNumber to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

