/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 71
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * CheckoutNativeRedirectAction
 */
@JsonPropertyOrder({
  CheckoutNativeRedirectAction.JSON_PROPERTY_DATA,
  CheckoutNativeRedirectAction.JSON_PROPERTY_METHOD,
  CheckoutNativeRedirectAction.JSON_PROPERTY_NATIVE_REDIRECT_DATA,
  CheckoutNativeRedirectAction.JSON_PROPERTY_PAYMENT_METHOD_TYPE,
  CheckoutNativeRedirectAction.JSON_PROPERTY_TYPE,
  CheckoutNativeRedirectAction.JSON_PROPERTY_URL
})

public class CheckoutNativeRedirectAction {
  public static final String JSON_PROPERTY_DATA = "data";
  private Map<String, String> data = null;

  public static final String JSON_PROPERTY_METHOD = "method";
  private String method;

  public static final String JSON_PROPERTY_NATIVE_REDIRECT_DATA = "nativeRedirectData";
  private String nativeRedirectData;

  public static final String JSON_PROPERTY_PAYMENT_METHOD_TYPE = "paymentMethodType";
  private String paymentMethodType;

  /**
   * **nativeRedirect**
   */
  public enum TypeEnum {
    NATIVEREDIRECT("nativeRedirect");

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

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public CheckoutNativeRedirectAction() { 
  }

  public CheckoutNativeRedirectAction data(Map<String, String> data) {
    this.data = data;
    return this;
  }

  public CheckoutNativeRedirectAction putDataItem(String key, String dataItem) {
    if (this.data == null) {
      this.data = new HashMap<>();
    }
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * When the redirect URL must be accessed via POST, use this data to post to the redirect URL.
   * @return data
  **/
  @ApiModelProperty(value = "When the redirect URL must be accessed via POST, use this data to post to the redirect URL.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(Map<String, String> data) {
    this.data = data;
  }


  public CheckoutNativeRedirectAction method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Specifies the HTTP method, for example GET or POST.
   * @return method
  **/
  @ApiModelProperty(value = "Specifies the HTTP method, for example GET or POST.")
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMethod() {
    return method;
  }


  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMethod(String method) {
    this.method = method;
  }


  public CheckoutNativeRedirectAction nativeRedirectData(String nativeRedirectData) {
    this.nativeRedirectData = nativeRedirectData;
    return this;
  }

   /**
   * Native SDK&#39;s redirect data containing the direct issuer link and state data that must be submitted to the /v1/nativeRedirect/redirectResult.
   * @return nativeRedirectData
  **/
  @ApiModelProperty(value = "Native SDK's redirect data containing the direct issuer link and state data that must be submitted to the /v1/nativeRedirect/redirectResult.")
  @JsonProperty(JSON_PROPERTY_NATIVE_REDIRECT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNativeRedirectData() {
    return nativeRedirectData;
  }


  @JsonProperty(JSON_PROPERTY_NATIVE_REDIRECT_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNativeRedirectData(String nativeRedirectData) {
    this.nativeRedirectData = nativeRedirectData;
  }


  public CheckoutNativeRedirectAction paymentMethodType(String paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
    return this;
  }

   /**
   * Specifies the payment method.
   * @return paymentMethodType
  **/
  @ApiModelProperty(value = "Specifies the payment method.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentMethodType() {
    return paymentMethodType;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethodType(String paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }


  public CheckoutNativeRedirectAction type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **nativeRedirect**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**nativeRedirect**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CheckoutNativeRedirectAction url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Specifies the URL to redirect to.
   * @return url
  **/
  @ApiModelProperty(value = "Specifies the URL to redirect to.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Return true if this CheckoutNativeRedirectAction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutNativeRedirectAction checkoutNativeRedirectAction = (CheckoutNativeRedirectAction) o;
    return Objects.equals(this.data, checkoutNativeRedirectAction.data) &&
        Objects.equals(this.method, checkoutNativeRedirectAction.method) &&
        Objects.equals(this.nativeRedirectData, checkoutNativeRedirectAction.nativeRedirectData) &&
        Objects.equals(this.paymentMethodType, checkoutNativeRedirectAction.paymentMethodType) &&
        Objects.equals(this.type, checkoutNativeRedirectAction.type) &&
        Objects.equals(this.url, checkoutNativeRedirectAction.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, method, nativeRedirectData, paymentMethodType, type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutNativeRedirectAction {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    nativeRedirectData: ").append(toIndentedString(nativeRedirectData)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
   * Create an instance of CheckoutNativeRedirectAction given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CheckoutNativeRedirectAction
   * @throws JsonProcessingException if the JSON string is invalid with respect to CheckoutNativeRedirectAction
   */
  public static CheckoutNativeRedirectAction fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CheckoutNativeRedirectAction.class);
  }
/**
  * Convert an instance of CheckoutNativeRedirectAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

