/*
 * Adyen Payment API
 * A set of API endpoints that allow you to initiate, settle, and modify payments on the Adyen payments platform. You can use the API to accept card payments (including One-Click and 3D Secure), bank transfers, ewallets, and many other payment methods.  To learn more about the API, visit [Classic integration](https://docs.adyen.com/classic-integration).  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning Payments API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/Payment/v68/authorise ```  ## Going live  To authenticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/Payment/v68/authorise ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
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
 * ExternalPlatform
 */
@JsonPropertyOrder({
  ExternalPlatform.JSON_PROPERTY_INTEGRATOR,
  ExternalPlatform.JSON_PROPERTY_NAME,
  ExternalPlatform.JSON_PROPERTY_VERSION
})

public class ExternalPlatform {
  public static final String JSON_PROPERTY_INTEGRATOR = "integrator";
  private String integrator;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public ExternalPlatform() { 
  }

  public ExternalPlatform integrator(String integrator) {
    this.integrator = integrator;
    return this;
  }

   /**
   * External platform integrator.
   * @return integrator
  **/
  @ApiModelProperty(value = "External platform integrator.")
  @JsonProperty(JSON_PROPERTY_INTEGRATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrator() {
    return integrator;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrator(String integrator) {
    this.integrator = integrator;
  }


  public ExternalPlatform name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the field. For example, Name of External Platform.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the field. For example, Name of External Platform.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ExternalPlatform version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version of the field. For example, Version of External Platform.
   * @return version
  **/
  @ApiModelProperty(value = "Version of the field. For example, Version of External Platform.")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Return true if this ExternalPlatform object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalPlatform externalPlatform = (ExternalPlatform) o;
    return Objects.equals(this.integrator, externalPlatform.integrator) &&
        Objects.equals(this.name, externalPlatform.name) &&
        Objects.equals(this.version, externalPlatform.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrator, name, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalPlatform {\n");
    sb.append("    integrator: ").append(toIndentedString(integrator)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
   * Create an instance of ExternalPlatform given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ExternalPlatform
   * @throws JsonProcessingException if the JSON string is invalid with respect to ExternalPlatform
   */
  public static ExternalPlatform fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ExternalPlatform.class);
  }
/**
  * Convert an instance of ExternalPlatform to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

