/*
 * Transfer webhooks
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transferwebhooks;

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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * EstimationTrackingData
 */
@JsonPropertyOrder({
  EstimationTrackingData.JSON_PROPERTY_ESTIMATED_ARRIVAL_TIME,
  EstimationTrackingData.JSON_PROPERTY_TYPE
})

public class EstimationTrackingData {
  public static final String JSON_PROPERTY_ESTIMATED_ARRIVAL_TIME = "estimatedArrivalTime";
  private OffsetDateTime estimatedArrivalTime;

  /**
   * **estimation**
   */
  public enum TypeEnum {
    ESTIMATION("estimation");

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

  public EstimationTrackingData() { 
  }

  public EstimationTrackingData estimatedArrivalTime(OffsetDateTime estimatedArrivalTime) {
    this.estimatedArrivalTime = estimatedArrivalTime;
    return this;
  }

   /**
   * The estimated time the beneficiary should have access to the funds.
   * @return estimatedArrivalTime
  **/
  @ApiModelProperty(required = true, value = "The estimated time the beneficiary should have access to the funds.")
  @JsonProperty(JSON_PROPERTY_ESTIMATED_ARRIVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEstimatedArrivalTime() {
    return estimatedArrivalTime;
  }


 /**
  * The estimated time the beneficiary should have access to the funds.
  *
  * @param estimatedArrivalTime
  */ 
  @JsonProperty(JSON_PROPERTY_ESTIMATED_ARRIVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEstimatedArrivalTime(OffsetDateTime estimatedArrivalTime) {
    this.estimatedArrivalTime = estimatedArrivalTime;
  }


  public EstimationTrackingData type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **estimation**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**estimation**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


 /**
  * **estimation**
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this EstimationTrackingData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimationTrackingData estimationTrackingData = (EstimationTrackingData) o;
    return Objects.equals(this.estimatedArrivalTime, estimationTrackingData.estimatedArrivalTime) &&
        Objects.equals(this.type, estimationTrackingData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedArrivalTime, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimationTrackingData {\n");
    sb.append("    estimatedArrivalTime: ").append(toIndentedString(estimatedArrivalTime)).append("\n");
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
   * Create an instance of EstimationTrackingData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EstimationTrackingData
   * @throws JsonProcessingException if the JSON string is invalid with respect to EstimationTrackingData
   */
  public static EstimationTrackingData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, EstimationTrackingData.class);
  }
/**
  * Convert an instance of EstimationTrackingData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

