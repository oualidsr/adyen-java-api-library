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
import com.adyen.model.payment.Amount;
import com.adyen.model.payment.FraudResult;
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
 * PaymentResult
 */
@JsonPropertyOrder({
  PaymentResult.JSON_PROPERTY_ADDITIONAL_DATA,
  PaymentResult.JSON_PROPERTY_AUTH_CODE,
  PaymentResult.JSON_PROPERTY_DCC_AMOUNT,
  PaymentResult.JSON_PROPERTY_DCC_SIGNATURE,
  PaymentResult.JSON_PROPERTY_FRAUD_RESULT,
  PaymentResult.JSON_PROPERTY_ISSUER_URL,
  PaymentResult.JSON_PROPERTY_MD,
  PaymentResult.JSON_PROPERTY_PA_REQUEST,
  PaymentResult.JSON_PROPERTY_PSP_REFERENCE,
  PaymentResult.JSON_PROPERTY_REFUSAL_REASON,
  PaymentResult.JSON_PROPERTY_RESULT_CODE
})

public class PaymentResult {
  public static final String JSON_PROPERTY_ADDITIONAL_DATA = "additionalData";
  private Map<String, String> additionalData = null;

  public static final String JSON_PROPERTY_AUTH_CODE = "authCode";
  private String authCode;

  public static final String JSON_PROPERTY_DCC_AMOUNT = "dccAmount";
  private Amount dccAmount;

  public static final String JSON_PROPERTY_DCC_SIGNATURE = "dccSignature";
  private String dccSignature;

  public static final String JSON_PROPERTY_FRAUD_RESULT = "fraudResult";
  private FraudResult fraudResult;

  public static final String JSON_PROPERTY_ISSUER_URL = "issuerUrl";
  private String issuerUrl;

  public static final String JSON_PROPERTY_MD = "md";
  private String md;

  public static final String JSON_PROPERTY_PA_REQUEST = "paRequest";
  private String paRequest;

  public static final String JSON_PROPERTY_PSP_REFERENCE = "pspReference";
  private String pspReference;

  public static final String JSON_PROPERTY_REFUSAL_REASON = "refusalReason";
  private String refusalReason;

  /**
   * The result of the payment. For more information, see [Result codes](https://docs.adyen.com/online-payments/payment-result-codes).  Possible values:  * **AuthenticationFinished** – The payment has been successfully authenticated with 3D Secure 2. Returned for 3D Secure 2 authentication-only transactions. * **AuthenticationNotRequired** – The transaction does not require 3D Secure authentication. Returned for [standalone authentication-only integrations](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). * **Authorised** – The payment was successfully authorised. This state serves as an indicator to proceed with the delivery of goods and services. This is a final state. * **Cancelled** – Indicates the payment has been cancelled (either by the shopper or the merchant) before processing was completed. This is a final state. * **ChallengeShopper** – The issuer requires further shopper interaction before the payment can be authenticated. Returned for 3D Secure 2 transactions. * **Error** – There was an error when the payment was being processed. The reason is given in the &#x60;refusalReason&#x60; field. This is a final state. * **IdentifyShopper** – The issuer requires the shopper&#39;s device fingerprint before the payment can be authenticated. Returned for 3D Secure 2 transactions. * **Pending** – Indicates that it is not possible to obtain the final status of the payment. This can happen if the systems providing final status information for the payment are unavailable, or if the shopper needs to take further action to complete the payment. * **PresentToShopper** – Indicates that the response contains additional information that you need to present to a shopper, so that they can use it to complete a payment. * **Received** – Indicates the payment has successfully been received by Adyen, and will be processed. This is the initial state for all payments. * **RedirectShopper** – Indicates the shopper should be redirected to an external web page or app to complete the authorisation. * **Refused** – Indicates the payment was refused. The reason is given in the &#x60;refusalReason&#x60; field. This is a final state.
   */
  public enum ResultCodeEnum {
    AUTHENTICATIONFINISHED("AuthenticationFinished"),
    
    AUTHENTICATIONNOTREQUIRED("AuthenticationNotRequired"),
    
    AUTHORISED("Authorised"),
    
    CANCELLED("Cancelled"),
    
    CHALLENGESHOPPER("ChallengeShopper"),
    
    ERROR("Error"),
    
    IDENTIFYSHOPPER("IdentifyShopper"),
    
    PENDING("Pending"),
    
    PRESENTTOSHOPPER("PresentToShopper"),
    
    RECEIVED("Received"),
    
    REDIRECTSHOPPER("RedirectShopper"),
    
    REFUSED("Refused"),
    
    SUCCESS("Success");

    private String value;

    ResultCodeEnum(String value) {
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
    public static ResultCodeEnum fromValue(String value) {
      for (ResultCodeEnum b : ResultCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RESULT_CODE = "resultCode";
  private ResultCodeEnum resultCode;

  public PaymentResult() { 
  }

  public PaymentResult additionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
    return this;
  }

  public PaymentResult putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

   /**
   * Contains additional information about the payment. Some data fields are included only if you select them first: Go to **Customer Area** &gt; **Developers** &gt; **Additional data**.
   * @return additionalData
  **/
  @ApiModelProperty(value = "Contains additional information about the payment. Some data fields are included only if you select them first: Go to **Customer Area** > **Developers** > **Additional data**.")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getAdditionalData() {
    return additionalData;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }


  public PaymentResult authCode(String authCode) {
    this.authCode = authCode;
    return this;
  }

   /**
   * Authorisation code: * When the payment is authorised successfully, this field holds the authorisation code for the payment. * When the payment is not authorised, this field is empty.
   * @return authCode
  **/
  @ApiModelProperty(value = "Authorisation code: * When the payment is authorised successfully, this field holds the authorisation code for the payment. * When the payment is not authorised, this field is empty.")
  @JsonProperty(JSON_PROPERTY_AUTH_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthCode() {
    return authCode;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthCode(String authCode) {
    this.authCode = authCode;
  }


  public PaymentResult dccAmount(Amount dccAmount) {
    this.dccAmount = dccAmount;
    return this;
  }

   /**
   * Get dccAmount
   * @return dccAmount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DCC_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getDccAmount() {
    return dccAmount;
  }


  @JsonProperty(JSON_PROPERTY_DCC_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDccAmount(Amount dccAmount) {
    this.dccAmount = dccAmount;
  }


  public PaymentResult dccSignature(String dccSignature) {
    this.dccSignature = dccSignature;
    return this;
  }

   /**
   * Cryptographic signature used to verify &#x60;dccQuote&#x60;. &gt; This value only applies if you have implemented Dynamic Currency Conversion. For more information, [contact Support](https://www.adyen.help/hc/en-us/requests/new).
   * @return dccSignature
  **/
  @ApiModelProperty(value = "Cryptographic signature used to verify `dccQuote`. > This value only applies if you have implemented Dynamic Currency Conversion. For more information, [contact Support](https://www.adyen.help/hc/en-us/requests/new).")
  @JsonProperty(JSON_PROPERTY_DCC_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDccSignature() {
    return dccSignature;
  }


  @JsonProperty(JSON_PROPERTY_DCC_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDccSignature(String dccSignature) {
    this.dccSignature = dccSignature;
  }


  public PaymentResult fraudResult(FraudResult fraudResult) {
    this.fraudResult = fraudResult;
    return this;
  }

   /**
   * Get fraudResult
   * @return fraudResult
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FRAUD_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FraudResult getFraudResult() {
    return fraudResult;
  }


  @JsonProperty(JSON_PROPERTY_FRAUD_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFraudResult(FraudResult fraudResult) {
    this.fraudResult = fraudResult;
  }


  public PaymentResult issuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
    return this;
  }

   /**
   * The URL to direct the shopper to. &gt; In case of SecurePlus, do not redirect a shopper to this URL.
   * @return issuerUrl
  **/
  @ApiModelProperty(value = "The URL to direct the shopper to. > In case of SecurePlus, do not redirect a shopper to this URL.")
  @JsonProperty(JSON_PROPERTY_ISSUER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuerUrl() {
    return issuerUrl;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuerUrl(String issuerUrl) {
    this.issuerUrl = issuerUrl;
  }


  public PaymentResult md(String md) {
    this.md = md;
    return this;
  }

   /**
   * The payment session.
   * @return md
  **/
  @ApiModelProperty(value = "The payment session.")
  @JsonProperty(JSON_PROPERTY_MD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMd() {
    return md;
  }


  @JsonProperty(JSON_PROPERTY_MD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMd(String md) {
    this.md = md;
  }


  public PaymentResult paRequest(String paRequest) {
    this.paRequest = paRequest;
    return this;
  }

   /**
   * The 3D request data for the issuer.  If the value is **CUPSecurePlus-CollectSMSVerificationCode**, collect an SMS code from the shopper and pass it in the &#x60;/authorise3D&#x60; request. For more information, see [3D Secure](https://docs.adyen.com/classic-integration/3d-secure).
   * @return paRequest
  **/
  @ApiModelProperty(value = "The 3D request data for the issuer.  If the value is **CUPSecurePlus-CollectSMSVerificationCode**, collect an SMS code from the shopper and pass it in the `/authorise3D` request. For more information, see [3D Secure](https://docs.adyen.com/classic-integration/3d-secure).")
  @JsonProperty(JSON_PROPERTY_PA_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaRequest() {
    return paRequest;
  }


  @JsonProperty(JSON_PROPERTY_PA_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaRequest(String paRequest) {
    this.paRequest = paRequest;
  }


  public PaymentResult pspReference(String pspReference) {
    this.pspReference = pspReference;
    return this;
  }

   /**
   * Adyen&#39;s 16-character reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request.
   * @return pspReference
  **/
  @ApiModelProperty(value = "Adyen's 16-character reference associated with the transaction/request. This value is globally unique; quote it when communicating with us about this request.")
  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPspReference() {
    return pspReference;
  }


  @JsonProperty(JSON_PROPERTY_PSP_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public PaymentResult refusalReason(String refusalReason) {
    this.refusalReason = refusalReason;
    return this;
  }

   /**
   * If the payment&#39;s authorisation is refused or an error occurs during authorisation, this field holds Adyen&#39;s mapped reason for the refusal or a description of the error. When a transaction fails, the authorisation response includes &#x60;resultCode&#x60; and &#x60;refusalReason&#x60; values.  For more information, see [Refusal reasons](https://docs.adyen.com/development-resources/refusal-reasons).
   * @return refusalReason
  **/
  @ApiModelProperty(value = "If the payment's authorisation is refused or an error occurs during authorisation, this field holds Adyen's mapped reason for the refusal or a description of the error. When a transaction fails, the authorisation response includes `resultCode` and `refusalReason` values.  For more information, see [Refusal reasons](https://docs.adyen.com/development-resources/refusal-reasons).")
  @JsonProperty(JSON_PROPERTY_REFUSAL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRefusalReason() {
    return refusalReason;
  }


  @JsonProperty(JSON_PROPERTY_REFUSAL_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefusalReason(String refusalReason) {
    this.refusalReason = refusalReason;
  }


  public PaymentResult resultCode(ResultCodeEnum resultCode) {
    this.resultCode = resultCode;
    return this;
  }

   /**
   * The result of the payment. For more information, see [Result codes](https://docs.adyen.com/online-payments/payment-result-codes).  Possible values:  * **AuthenticationFinished** – The payment has been successfully authenticated with 3D Secure 2. Returned for 3D Secure 2 authentication-only transactions. * **AuthenticationNotRequired** – The transaction does not require 3D Secure authentication. Returned for [standalone authentication-only integrations](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). * **Authorised** – The payment was successfully authorised. This state serves as an indicator to proceed with the delivery of goods and services. This is a final state. * **Cancelled** – Indicates the payment has been cancelled (either by the shopper or the merchant) before processing was completed. This is a final state. * **ChallengeShopper** – The issuer requires further shopper interaction before the payment can be authenticated. Returned for 3D Secure 2 transactions. * **Error** – There was an error when the payment was being processed. The reason is given in the &#x60;refusalReason&#x60; field. This is a final state. * **IdentifyShopper** – The issuer requires the shopper&#39;s device fingerprint before the payment can be authenticated. Returned for 3D Secure 2 transactions. * **Pending** – Indicates that it is not possible to obtain the final status of the payment. This can happen if the systems providing final status information for the payment are unavailable, or if the shopper needs to take further action to complete the payment. * **PresentToShopper** – Indicates that the response contains additional information that you need to present to a shopper, so that they can use it to complete a payment. * **Received** – Indicates the payment has successfully been received by Adyen, and will be processed. This is the initial state for all payments. * **RedirectShopper** – Indicates the shopper should be redirected to an external web page or app to complete the authorisation. * **Refused** – Indicates the payment was refused. The reason is given in the &#x60;refusalReason&#x60; field. This is a final state.
   * @return resultCode
  **/
  @ApiModelProperty(value = "The result of the payment. For more information, see [Result codes](https://docs.adyen.com/online-payments/payment-result-codes).  Possible values:  * **AuthenticationFinished** – The payment has been successfully authenticated with 3D Secure 2. Returned for 3D Secure 2 authentication-only transactions. * **AuthenticationNotRequired** – The transaction does not require 3D Secure authentication. Returned for [standalone authentication-only integrations](https://docs.adyen.com/online-payments/3d-secure/other-3ds-flows/authentication-only). * **Authorised** – The payment was successfully authorised. This state serves as an indicator to proceed with the delivery of goods and services. This is a final state. * **Cancelled** – Indicates the payment has been cancelled (either by the shopper or the merchant) before processing was completed. This is a final state. * **ChallengeShopper** – The issuer requires further shopper interaction before the payment can be authenticated. Returned for 3D Secure 2 transactions. * **Error** – There was an error when the payment was being processed. The reason is given in the `refusalReason` field. This is a final state. * **IdentifyShopper** – The issuer requires the shopper's device fingerprint before the payment can be authenticated. Returned for 3D Secure 2 transactions. * **Pending** – Indicates that it is not possible to obtain the final status of the payment. This can happen if the systems providing final status information for the payment are unavailable, or if the shopper needs to take further action to complete the payment. * **PresentToShopper** – Indicates that the response contains additional information that you need to present to a shopper, so that they can use it to complete a payment. * **Received** – Indicates the payment has successfully been received by Adyen, and will be processed. This is the initial state for all payments. * **RedirectShopper** – Indicates the shopper should be redirected to an external web page or app to complete the authorisation. * **Refused** – Indicates the payment was refused. The reason is given in the `refusalReason` field. This is a final state.")
  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResultCodeEnum getResultCode() {
    return resultCode;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultCode(ResultCodeEnum resultCode) {
    this.resultCode = resultCode;
  }


  /**
   * Return true if this PaymentResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentResult paymentResult = (PaymentResult) o;
    return Objects.equals(this.additionalData, paymentResult.additionalData) &&
        Objects.equals(this.authCode, paymentResult.authCode) &&
        Objects.equals(this.dccAmount, paymentResult.dccAmount) &&
        Objects.equals(this.dccSignature, paymentResult.dccSignature) &&
        Objects.equals(this.fraudResult, paymentResult.fraudResult) &&
        Objects.equals(this.issuerUrl, paymentResult.issuerUrl) &&
        Objects.equals(this.md, paymentResult.md) &&
        Objects.equals(this.paRequest, paymentResult.paRequest) &&
        Objects.equals(this.pspReference, paymentResult.pspReference) &&
        Objects.equals(this.refusalReason, paymentResult.refusalReason) &&
        Objects.equals(this.resultCode, paymentResult.resultCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, authCode, dccAmount, dccSignature, fraudResult, issuerUrl, md, paRequest, pspReference, refusalReason, resultCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentResult {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    dccAmount: ").append(toIndentedString(dccAmount)).append("\n");
    sb.append("    dccSignature: ").append(toIndentedString(dccSignature)).append("\n");
    sb.append("    fraudResult: ").append(toIndentedString(fraudResult)).append("\n");
    sb.append("    issuerUrl: ").append(toIndentedString(issuerUrl)).append("\n");
    sb.append("    md: ").append(toIndentedString(md)).append("\n");
    sb.append("    paRequest: ").append(toIndentedString(paRequest)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    refusalReason: ").append(toIndentedString(refusalReason)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
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
   * Create an instance of PaymentResult given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentResult
   * @throws JsonProcessingException if the JSON string is invalid with respect to PaymentResult
   */
  public static PaymentResult fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, PaymentResult.class);
  }
/**
  * Convert an instance of PaymentResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

