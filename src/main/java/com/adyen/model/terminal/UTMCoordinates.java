/*
 * Adyen Terminal API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.terminal;

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
 * UTMCoordinates
 */
@JsonPropertyOrder({
  UTMCoordinates.JSON_PROPERTY_UT_M_ZONE,
  UTMCoordinates.JSON_PROPERTY_UT_M_EASTWARD,
  UTMCoordinates.JSON_PROPERTY_UT_M_NORTHWARD
})

public class UTMCoordinates {
  public static final String JSON_PROPERTY_UT_M_ZONE = "UTMZone";
  private String utMZone;

  public static final String JSON_PROPERTY_UT_M_EASTWARD = "UTMEastward";
  private String utMEastward;

  public static final String JSON_PROPERTY_UT_M_NORTHWARD = "UTMNorthward";
  private String utMNorthward;

  public UTMCoordinates() { 
  }

  public UTMCoordinates utMZone(String utMZone) {
    this.utMZone = utMZone;
    return this;
  }

   /**
   * Get utMZone
   * @return utMZone
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UT_M_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUtMZone() {
    return utMZone;
  }


 /**
  * utMZone
  *
  * @param utMZone
  */ 
  @JsonProperty(JSON_PROPERTY_UT_M_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUtMZone(String utMZone) {
    this.utMZone = utMZone;
  }


  public UTMCoordinates utMEastward(String utMEastward) {
    this.utMEastward = utMEastward;
    return this;
  }

   /**
   * Get utMEastward
   * @return utMEastward
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UT_M_EASTWARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUtMEastward() {
    return utMEastward;
  }


 /**
  * utMEastward
  *
  * @param utMEastward
  */ 
  @JsonProperty(JSON_PROPERTY_UT_M_EASTWARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUtMEastward(String utMEastward) {
    this.utMEastward = utMEastward;
  }


  public UTMCoordinates utMNorthward(String utMNorthward) {
    this.utMNorthward = utMNorthward;
    return this;
  }

   /**
   * Get utMNorthward
   * @return utMNorthward
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UT_M_NORTHWARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUtMNorthward() {
    return utMNorthward;
  }


 /**
  * utMNorthward
  *
  * @param utMNorthward
  */ 
  @JsonProperty(JSON_PROPERTY_UT_M_NORTHWARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUtMNorthward(String utMNorthward) {
    this.utMNorthward = utMNorthward;
  }


  /**
   * Return true if this UTMCoordinates object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UTMCoordinates utMCoordinates = (UTMCoordinates) o;
    return Objects.equals(this.utMZone, utMCoordinates.utMZone) &&
        Objects.equals(this.utMEastward, utMCoordinates.utMEastward) &&
        Objects.equals(this.utMNorthward, utMCoordinates.utMNorthward);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utMZone, utMEastward, utMNorthward);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UTMCoordinates {\n");
    sb.append("    utMZone: ").append(toIndentedString(utMZone)).append("\n");
    sb.append("    utMEastward: ").append(toIndentedString(utMEastward)).append("\n");
    sb.append("    utMNorthward: ").append(toIndentedString(utMNorthward)).append("\n");
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
   * Create an instance of UTMCoordinates given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UTMCoordinates
   * @throws JsonProcessingException if the JSON string is invalid with respect to UTMCoordinates
   */
  public static UTMCoordinates fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, UTMCoordinates.class);
  }
/**
  * Convert an instance of UTMCoordinates to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

