/*
 * Transfers API
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

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
 * RepaymentTerm
 */
@JsonPropertyOrder({
  RepaymentTerm.JSON_PROPERTY_ESTIMATED_DAYS,
  RepaymentTerm.JSON_PROPERTY_MAXIMUM_DAYS
})

public class RepaymentTerm {
  public static final String JSON_PROPERTY_ESTIMATED_DAYS = "estimatedDays";
  private Integer estimatedDays;

  public static final String JSON_PROPERTY_MAXIMUM_DAYS = "maximumDays";
  private Integer maximumDays;

  public RepaymentTerm() { 
  }

  public RepaymentTerm estimatedDays(Integer estimatedDays) {
    this.estimatedDays = estimatedDays;
    return this;
  }

   /**
   * The estimated term for repaying the grant, in days.
   * @return estimatedDays
  **/
  @ApiModelProperty(required = true, value = "The estimated term for repaying the grant, in days.")
  @JsonProperty(JSON_PROPERTY_ESTIMATED_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEstimatedDays() {
    return estimatedDays;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATED_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEstimatedDays(Integer estimatedDays) {
    this.estimatedDays = estimatedDays;
  }


  public RepaymentTerm maximumDays(Integer maximumDays) {
    this.maximumDays = maximumDays;
    return this;
  }

   /**
   * The maximum term for repaying the grant, in days. Only applies when &#x60;contractType&#x60; is **loan**.
   * @return maximumDays
  **/
  @ApiModelProperty(value = "The maximum term for repaying the grant, in days. Only applies when `contractType` is **loan**.")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaximumDays() {
    return maximumDays;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximumDays(Integer maximumDays) {
    this.maximumDays = maximumDays;
  }


  /**
   * Return true if this RepaymentTerm object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepaymentTerm repaymentTerm = (RepaymentTerm) o;
    return Objects.equals(this.estimatedDays, repaymentTerm.estimatedDays) &&
        Objects.equals(this.maximumDays, repaymentTerm.maximumDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedDays, maximumDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepaymentTerm {\n");
    sb.append("    estimatedDays: ").append(toIndentedString(estimatedDays)).append("\n");
    sb.append("    maximumDays: ").append(toIndentedString(maximumDays)).append("\n");
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
   * Create an instance of RepaymentTerm given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RepaymentTerm
   * @throws JsonProcessingException if the JSON string is invalid with respect to RepaymentTerm
   */
  public static RepaymentTerm fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, RepaymentTerm.class);
  }
/**
  * Convert an instance of RepaymentTerm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

