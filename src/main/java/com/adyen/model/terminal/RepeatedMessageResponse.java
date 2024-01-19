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
import com.adyen.model.terminal.MessageHeader;
import com.adyen.model.terminal.RepeatedResponseMessageBody;
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
 * RepeatedMessageResponse
 */
@JsonPropertyOrder({
  RepeatedMessageResponse.JSON_PROPERTY_MESSAGE_HEADER,
  RepeatedMessageResponse.JSON_PROPERTY_REPEATED_RESPONSE_MESSAGE_BODY
})

public class RepeatedMessageResponse {
  public static final String JSON_PROPERTY_MESSAGE_HEADER = "MessageHeader";
  private MessageHeader messageHeader;

  public static final String JSON_PROPERTY_REPEATED_RESPONSE_MESSAGE_BODY = "RepeatedResponseMessageBody";
  private RepeatedResponseMessageBody repeatedResponseMessageBody;

  public RepeatedMessageResponse() { 
  }

  public RepeatedMessageResponse messageHeader(MessageHeader messageHeader) {
    this.messageHeader = messageHeader;
    return this;
  }

   /**
   * Get messageHeader
   * @return messageHeader
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MessageHeader getMessageHeader() {
    return messageHeader;
  }


 /**
  * messageHeader
  *
  * @param messageHeader
  */ 
  @JsonProperty(JSON_PROPERTY_MESSAGE_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageHeader(MessageHeader messageHeader) {
    this.messageHeader = messageHeader;
  }


  public RepeatedMessageResponse repeatedResponseMessageBody(RepeatedResponseMessageBody repeatedResponseMessageBody) {
    this.repeatedResponseMessageBody = repeatedResponseMessageBody;
    return this;
  }

   /**
   * Get repeatedResponseMessageBody
   * @return repeatedResponseMessageBody
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REPEATED_RESPONSE_MESSAGE_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RepeatedResponseMessageBody getRepeatedResponseMessageBody() {
    return repeatedResponseMessageBody;
  }


 /**
  * repeatedResponseMessageBody
  *
  * @param repeatedResponseMessageBody
  */ 
  @JsonProperty(JSON_PROPERTY_REPEATED_RESPONSE_MESSAGE_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRepeatedResponseMessageBody(RepeatedResponseMessageBody repeatedResponseMessageBody) {
    this.repeatedResponseMessageBody = repeatedResponseMessageBody;
  }


  /**
   * Return true if this RepeatedMessageResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepeatedMessageResponse repeatedMessageResponse = (RepeatedMessageResponse) o;
    return Objects.equals(this.messageHeader, repeatedMessageResponse.messageHeader) &&
        Objects.equals(this.repeatedResponseMessageBody, repeatedMessageResponse.repeatedResponseMessageBody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageHeader, repeatedResponseMessageBody);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepeatedMessageResponse {\n");
    sb.append("    messageHeader: ").append(toIndentedString(messageHeader)).append("\n");
    sb.append("    repeatedResponseMessageBody: ").append(toIndentedString(repeatedResponseMessageBody)).append("\n");
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
   * Create an instance of RepeatedMessageResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RepeatedMessageResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to RepeatedMessageResponse
   */
  public static RepeatedMessageResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, RepeatedMessageResponse.class);
  }
/**
  * Convert an instance of RepeatedMessageResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

