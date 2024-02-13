/*
 * Management API
 *
 * The version of the OpenAPI document: 3
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
import com.adyen.model.management.Url;
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
 * EventUrl
 */
@JsonPropertyOrder({
  EventUrl.JSON_PROPERTY_EVENT_LOCAL_URLS,
  EventUrl.JSON_PROPERTY_EVENT_PUBLIC_URLS
})

public class EventUrl {
  public static final String JSON_PROPERTY_EVENT_LOCAL_URLS = "eventLocalUrls";
  private List<Url> eventLocalUrls = null;

  public static final String JSON_PROPERTY_EVENT_PUBLIC_URLS = "eventPublicUrls";
  private List<Url> eventPublicUrls = null;

  public EventUrl() { 
  }

  public EventUrl eventLocalUrls(List<Url> eventLocalUrls) {
    this.eventLocalUrls = eventLocalUrls;
    return this;
  }

  public EventUrl addEventLocalUrlsItem(Url eventLocalUrlsItem) {
    if (this.eventLocalUrls == null) {
      this.eventLocalUrls = new ArrayList<>();
    }
    this.eventLocalUrls.add(eventLocalUrlsItem);
    return this;
  }

   /**
   * One or more local URLs to send event notifications to when using Terminal API.
   * @return eventLocalUrls
  **/
  @ApiModelProperty(value = "One or more local URLs to send event notifications to when using Terminal API.")
  @JsonProperty(JSON_PROPERTY_EVENT_LOCAL_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Url> getEventLocalUrls() {
    return eventLocalUrls;
  }


 /**
  * One or more local URLs to send event notifications to when using Terminal API.
  *
  * @param eventLocalUrls
  */ 
  @JsonProperty(JSON_PROPERTY_EVENT_LOCAL_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventLocalUrls(List<Url> eventLocalUrls) {
    this.eventLocalUrls = eventLocalUrls;
  }


  public EventUrl eventPublicUrls(List<Url> eventPublicUrls) {
    this.eventPublicUrls = eventPublicUrls;
    return this;
  }

  public EventUrl addEventPublicUrlsItem(Url eventPublicUrlsItem) {
    if (this.eventPublicUrls == null) {
      this.eventPublicUrls = new ArrayList<>();
    }
    this.eventPublicUrls.add(eventPublicUrlsItem);
    return this;
  }

   /**
   * One or more public URLs to send event notifications to when using Terminal API.
   * @return eventPublicUrls
  **/
  @ApiModelProperty(value = "One or more public URLs to send event notifications to when using Terminal API.")
  @JsonProperty(JSON_PROPERTY_EVENT_PUBLIC_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Url> getEventPublicUrls() {
    return eventPublicUrls;
  }


 /**
  * One or more public URLs to send event notifications to when using Terminal API.
  *
  * @param eventPublicUrls
  */ 
  @JsonProperty(JSON_PROPERTY_EVENT_PUBLIC_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventPublicUrls(List<Url> eventPublicUrls) {
    this.eventPublicUrls = eventPublicUrls;
  }


  /**
   * Return true if this EventUrl object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventUrl eventUrl = (EventUrl) o;
    return Objects.equals(this.eventLocalUrls, eventUrl.eventLocalUrls) &&
        Objects.equals(this.eventPublicUrls, eventUrl.eventPublicUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventLocalUrls, eventPublicUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventUrl {\n");
    sb.append("    eventLocalUrls: ").append(toIndentedString(eventLocalUrls)).append("\n");
    sb.append("    eventPublicUrls: ").append(toIndentedString(eventPublicUrls)).append("\n");
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
   * Create an instance of EventUrl given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EventUrl
   * @throws JsonProcessingException if the JSON string is invalid with respect to EventUrl
   */
  public static EventUrl fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, EventUrl.class);
  }
/**
  * Convert an instance of EventUrl to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

