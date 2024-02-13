/*
 * Adyen Payment API
 *
 * The version of the OpenAPI document: 68
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payment;

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
 * ShopperInteractionDevice
 */
@JsonPropertyOrder({
  ShopperInteractionDevice.JSON_PROPERTY_LOCALE,
  ShopperInteractionDevice.JSON_PROPERTY_OS,
  ShopperInteractionDevice.JSON_PROPERTY_OS_VERSION
})

public class ShopperInteractionDevice {
  public static final String JSON_PROPERTY_LOCALE = "locale";
  private String locale;

  public static final String JSON_PROPERTY_OS = "os";
  private String os;

  public static final String JSON_PROPERTY_OS_VERSION = "osVersion";
  private String osVersion;

  public ShopperInteractionDevice() { 
  }

  public ShopperInteractionDevice locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Locale on the shopper interaction device.
   * @return locale
  **/
  @ApiModelProperty(value = "Locale on the shopper interaction device.")
  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocale() {
    return locale;
  }


 /**
  * Locale on the shopper interaction device.
  *
  * @param locale
  */ 
  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocale(String locale) {
    this.locale = locale;
  }


  public ShopperInteractionDevice os(String os) {
    this.os = os;
    return this;
  }

   /**
   * Operating system running on the shopper interaction device.
   * @return os
  **/
  @ApiModelProperty(value = "Operating system running on the shopper interaction device.")
  @JsonProperty(JSON_PROPERTY_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOs() {
    return os;
  }


 /**
  * Operating system running on the shopper interaction device.
  *
  * @param os
  */ 
  @JsonProperty(JSON_PROPERTY_OS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOs(String os) {
    this.os = os;
  }


  public ShopperInteractionDevice osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

   /**
   * Version of the operating system on the shopper interaction device.
   * @return osVersion
  **/
  @ApiModelProperty(value = "Version of the operating system on the shopper interaction device.")
  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOsVersion() {
    return osVersion;
  }


 /**
  * Version of the operating system on the shopper interaction device.
  *
  * @param osVersion
  */ 
  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  /**
   * Return true if this ShopperInteractionDevice object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShopperInteractionDevice shopperInteractionDevice = (ShopperInteractionDevice) o;
    return Objects.equals(this.locale, shopperInteractionDevice.locale) &&
        Objects.equals(this.os, shopperInteractionDevice.os) &&
        Objects.equals(this.osVersion, shopperInteractionDevice.osVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, os, osVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShopperInteractionDevice {\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
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
   * Create an instance of ShopperInteractionDevice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ShopperInteractionDevice
   * @throws JsonProcessingException if the JSON string is invalid with respect to ShopperInteractionDevice
   */
  public static ShopperInteractionDevice fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ShopperInteractionDevice.class);
  }
/**
  * Convert an instance of ShopperInteractionDevice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

