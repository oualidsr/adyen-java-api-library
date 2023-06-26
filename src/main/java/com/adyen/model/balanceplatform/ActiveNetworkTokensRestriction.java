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
 * ActiveNetworkTokensRestriction
 */
@JsonPropertyOrder({
  ActiveNetworkTokensRestriction.JSON_PROPERTY_OPERATION,
  ActiveNetworkTokensRestriction.JSON_PROPERTY_VALUE
})

public class ActiveNetworkTokensRestriction {
  public static final String JSON_PROPERTY_OPERATION = "operation";
  private String operation;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Integer value;

  public ActiveNetworkTokensRestriction() { 
  }

  public ActiveNetworkTokensRestriction operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Defines how the condition must be evaluated.
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "Defines how the condition must be evaluated.")
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOperation() {
    return operation;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperation(String operation) {
    this.operation = operation;
  }


  public ActiveNetworkTokensRestriction value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * The number of tokens.
   * @return value
  **/
  @ApiModelProperty(value = "The number of tokens.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Integer value) {
    this.value = value;
  }


  /**
   * Return true if this ActiveNetworkTokensRestriction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveNetworkTokensRestriction activeNetworkTokensRestriction = (ActiveNetworkTokensRestriction) o;
    return Objects.equals(this.operation, activeNetworkTokensRestriction.operation) &&
        Objects.equals(this.value, activeNetworkTokensRestriction.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveNetworkTokensRestriction {\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
   * Create an instance of ActiveNetworkTokensRestriction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ActiveNetworkTokensRestriction
   * @throws JsonProcessingException if the JSON string is invalid with respect to ActiveNetworkTokensRestriction
   */
  public static ActiveNetworkTokensRestriction fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ActiveNetworkTokensRestriction.class);
  }
/**
  * Convert an instance of ActiveNetworkTokensRestriction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

