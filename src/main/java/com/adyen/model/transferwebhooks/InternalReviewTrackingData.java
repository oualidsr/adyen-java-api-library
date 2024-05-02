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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * InternalReviewTrackingData
 */
@JsonPropertyOrder({
  InternalReviewTrackingData.JSON_PROPERTY_REASON,
  InternalReviewTrackingData.JSON_PROPERTY_STATUS,
  InternalReviewTrackingData.JSON_PROPERTY_TYPE
})

public class InternalReviewTrackingData {
  /**
   * Possible values:   - **refusedForRegulatoryReasons**.
   */
  public enum ReasonEnum {
    REFUSEDFORREGULATORYREASONS("refusedForRegulatoryReasons");

    private String value;

    ReasonEnum(String value) {
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
    public static ReasonEnum fromValue(String value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REASON = "reason";
  private ReasonEnum reason;

  /**
   * Possible values:   - **pending**: Transfer is under internal review.  - **failed**: Transfer failed to pass internal review. See field **reason** for details.  
   */
  public enum StatusEnum {
    PENDING("pending"),
    
    FAILED("failed");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  /**
   * **internalReview**
   */
  public enum TypeEnum {
    INTERNALREVIEW("internalReview");

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

  public InternalReviewTrackingData() { 
  }

  public InternalReviewTrackingData reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Possible values:   - **refusedForRegulatoryReasons**.
   * @return reason
  **/
  @ApiModelProperty(value = "Possible values:   - **refusedForRegulatoryReasons**.")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReasonEnum getReason() {
    return reason;
  }


 /**
  * Possible values:   - **refusedForRegulatoryReasons**.
  *
  * @param reason
  */ 
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  public InternalReviewTrackingData status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Possible values:   - **pending**: Transfer is under internal review.  - **failed**: Transfer failed to pass internal review. See field **reason** for details.  
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Possible values:   - **pending**: Transfer is under internal review.  - **failed**: Transfer failed to pass internal review. See field **reason** for details.  ")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


 /**
  * Possible values:   - **pending**: Transfer is under internal review.  - **failed**: Transfer failed to pass internal review. See field **reason** for details.  
  *
  * @param status
  */ 
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public InternalReviewTrackingData type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **internalReview**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**internalReview**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


 /**
  * **internalReview**
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this InternalReviewTrackingData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalReviewTrackingData internalReviewTrackingData = (InternalReviewTrackingData) o;
    return Objects.equals(this.reason, internalReviewTrackingData.reason) &&
        Objects.equals(this.status, internalReviewTrackingData.status) &&
        Objects.equals(this.type, internalReviewTrackingData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalReviewTrackingData {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
   * Create an instance of InternalReviewTrackingData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InternalReviewTrackingData
   * @throws JsonProcessingException if the JSON string is invalid with respect to InternalReviewTrackingData
   */
  public static InternalReviewTrackingData fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, InternalReviewTrackingData.class);
  }
/**
  * Convert an instance of InternalReviewTrackingData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

