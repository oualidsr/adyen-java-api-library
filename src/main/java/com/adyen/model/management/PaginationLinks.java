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
import com.adyen.model.management.LinksElement;
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
 * PaginationLinks
 */
@JsonPropertyOrder({
  PaginationLinks.JSON_PROPERTY_FIRST,
  PaginationLinks.JSON_PROPERTY_LAST,
  PaginationLinks.JSON_PROPERTY_NEXT,
  PaginationLinks.JSON_PROPERTY_PREV,
  PaginationLinks.JSON_PROPERTY_SELF
})

public class PaginationLinks {
  public static final String JSON_PROPERTY_FIRST = "first";
  private LinksElement first;

  public static final String JSON_PROPERTY_LAST = "last";
  private LinksElement last;

  public static final String JSON_PROPERTY_NEXT = "next";
  private LinksElement next;

  public static final String JSON_PROPERTY_PREV = "prev";
  private LinksElement prev;

  public static final String JSON_PROPERTY_SELF = "self";
  private LinksElement self;

  public PaginationLinks() { 
  }

  public PaginationLinks first(LinksElement first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LinksElement getFirst() {
    return first;
  }


 /**
  * first
  *
  * @param first
  */ 
  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirst(LinksElement first) {
    this.first = first;
  }


  public PaginationLinks last(LinksElement last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LinksElement getLast() {
    return last;
  }


 /**
  * last
  *
  * @param last
  */ 
  @JsonProperty(JSON_PROPERTY_LAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLast(LinksElement last) {
    this.last = last;
  }


  public PaginationLinks next(LinksElement next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LinksElement getNext() {
    return next;
  }


 /**
  * next
  *
  * @param next
  */ 
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNext(LinksElement next) {
    this.next = next;
  }


  public PaginationLinks prev(LinksElement prev) {
    this.prev = prev;
    return this;
  }

   /**
   * Get prev
   * @return prev
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LinksElement getPrev() {
    return prev;
  }


 /**
  * prev
  *
  * @param prev
  */ 
  @JsonProperty(JSON_PROPERTY_PREV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrev(LinksElement prev) {
    this.prev = prev;
  }


  public PaginationLinks self(LinksElement self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LinksElement getSelf() {
    return self;
  }


 /**
  * self
  *
  * @param self
  */ 
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelf(LinksElement self) {
    this.self = self;
  }


  /**
   * Return true if this PaginationLinks object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationLinks paginationLinks = (PaginationLinks) o;
    return Objects.equals(this.first, paginationLinks.first) &&
        Objects.equals(this.last, paginationLinks.last) &&
        Objects.equals(this.next, paginationLinks.next) &&
        Objects.equals(this.prev, paginationLinks.prev) &&
        Objects.equals(this.self, paginationLinks.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, last, next, prev, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationLinks {\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
   * Create an instance of PaginationLinks given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaginationLinks
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaginationLinks
   */
  public static PaginationLinks fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaginationLinks.class);
  }
/**
  * Convert an instance of PaginationLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

