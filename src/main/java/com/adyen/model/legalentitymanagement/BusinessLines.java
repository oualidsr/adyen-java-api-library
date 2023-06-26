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
import com.adyen.model.legalentitymanagement.BusinessLine;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * BusinessLines
 */
@JsonPropertyOrder({
  BusinessLines.JSON_PROPERTY_BUSINESS_LINES
})

public class BusinessLines {
  public static final String JSON_PROPERTY_BUSINESS_LINES = "businessLines";
  private List<BusinessLine> businessLines = new ArrayList<>();

  public BusinessLines() { 
  }

  public BusinessLines businessLines(List<BusinessLine> businessLines) {
    this.businessLines = businessLines;
    return this;
  }

  public BusinessLines addBusinessLinesItem(BusinessLine businessLinesItem) {
    this.businessLines.add(businessLinesItem);
    return this;
  }

   /**
   * List of business lines.
   * @return businessLines
  **/
  @ApiModelProperty(required = true, value = "List of business lines.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BusinessLine> getBusinessLines() {
    return businessLines;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessLines(List<BusinessLine> businessLines) {
    this.businessLines = businessLines;
  }


  /**
   * Return true if this BusinessLines object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessLines businessLines = (BusinessLines) o;
    return Objects.equals(this.businessLines, businessLines.businessLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessLines {\n");
    sb.append("    businessLines: ").append(toIndentedString(businessLines)).append("\n");
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
   * Create an instance of BusinessLines given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BusinessLines
   * @throws JsonProcessingException if the JSON string is invalid with respect to BusinessLines
   */
  public static BusinessLines fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BusinessLines.class);
  }
/**
  * Convert an instance of BusinessLines to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

