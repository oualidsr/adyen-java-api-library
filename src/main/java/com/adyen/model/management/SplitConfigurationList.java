/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.management.SplitConfiguration;
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
 * SplitConfigurationList
 */
@JsonPropertyOrder({
  SplitConfigurationList.JSON_PROPERTY_DATA
})

public class SplitConfigurationList {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<SplitConfiguration> data = null;

  public SplitConfigurationList() { 
  }

  public SplitConfigurationList data(List<SplitConfiguration> data) {
    this.data = data;
    return this;
  }

  public SplitConfigurationList addDataItem(SplitConfiguration dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of split configurations applied to the stores under the merchant account.
   * @return data
  **/
  @ApiModelProperty(value = "List of split configurations applied to the stores under the merchant account.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SplitConfiguration> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(List<SplitConfiguration> data) {
    this.data = data;
  }


  /**
   * Return true if this SplitConfigurationList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitConfigurationList splitConfigurationList = (SplitConfigurationList) o;
    return Objects.equals(this.data, splitConfigurationList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitConfigurationList {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
   * Create an instance of SplitConfigurationList given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SplitConfigurationList
   * @throws JsonProcessingException if the JSON string is invalid with respect to SplitConfigurationList
   */
  public static SplitConfigurationList fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, SplitConfigurationList.class);
  }
/**
  * Convert an instance of SplitConfigurationList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

