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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * CardDetails
 */
@JsonPropertyOrder({
  CardDetails.JSON_PROPERTY_BRAND,
  CardDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  CardDetails.JSON_PROPERTY_CUPSECUREPLUS_SMSCODE,
  CardDetails.JSON_PROPERTY_CVC,
  CardDetails.JSON_PROPERTY_ENCRYPTED_CARD_NUMBER,
  CardDetails.JSON_PROPERTY_ENCRYPTED_EXPIRY_MONTH,
  CardDetails.JSON_PROPERTY_ENCRYPTED_EXPIRY_YEAR,
  CardDetails.JSON_PROPERTY_ENCRYPTED_SECURITY_CODE,
  CardDetails.JSON_PROPERTY_EXPIRY_MONTH,
  CardDetails.JSON_PROPERTY_EXPIRY_YEAR,
  CardDetails.JSON_PROPERTY_FUNDING_SOURCE,
  CardDetails.JSON_PROPERTY_HOLDER_NAME,
  CardDetails.JSON_PROPERTY_NETWORK_PAYMENT_REFERENCE,
  CardDetails.JSON_PROPERTY_NUMBER,
  CardDetails.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  CardDetails.JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE,
  CardDetails.JSON_PROPERTY_STORED_PAYMENT_METHOD_ID,
  CardDetails.JSON_PROPERTY_THREE_D_S2_SDK_VERSION,
  CardDetails.JSON_PROPERTY_TYPE
})

public class CardDetails {
  public static final String JSON_PROPERTY_BRAND = "brand";
  private String brand;

  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  public static final String JSON_PROPERTY_CUPSECUREPLUS_SMSCODE = "cupsecureplus.smscode";
  private String cupsecureplusSmscode;

  public static final String JSON_PROPERTY_CVC = "cvc";
  private String cvc;

  public static final String JSON_PROPERTY_ENCRYPTED_CARD_NUMBER = "encryptedCardNumber";
  private String encryptedCardNumber;

  public static final String JSON_PROPERTY_ENCRYPTED_EXPIRY_MONTH = "encryptedExpiryMonth";
  private String encryptedExpiryMonth;

  public static final String JSON_PROPERTY_ENCRYPTED_EXPIRY_YEAR = "encryptedExpiryYear";
  private String encryptedExpiryYear;

  public static final String JSON_PROPERTY_ENCRYPTED_SECURITY_CODE = "encryptedSecurityCode";
  private String encryptedSecurityCode;

  public static final String JSON_PROPERTY_EXPIRY_MONTH = "expiryMonth";
  private String expiryMonth;

  public static final String JSON_PROPERTY_EXPIRY_YEAR = "expiryYear";
  private String expiryYear;

  /**
   * The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
   */
  public enum FundingSourceEnum {
    DEBIT("debit");

    private String value;

    FundingSourceEnum(String value) {
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
    public static FundingSourceEnum fromValue(String value) {
      for (FundingSourceEnum b : FundingSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FUNDING_SOURCE = "fundingSource";
  private FundingSourceEnum fundingSource;

  public static final String JSON_PROPERTY_HOLDER_NAME = "holderName";
  private String holderName;

  public static final String JSON_PROPERTY_NETWORK_PAYMENT_REFERENCE = "networkPaymentReference";
  private String networkPaymentReference;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE = "shopperNotificationReference";
  private String shopperNotificationReference;

  public static final String JSON_PROPERTY_STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
  private String storedPaymentMethodId;

  public static final String JSON_PROPERTY_THREE_D_S2_SDK_VERSION = "threeDS2SdkVersion";
  private String threeDS2SdkVersion;

  /**
   * Default payment method details. Common for scheme payment methods, and for simple payment method details.
   */
  public enum TypeEnum {
    SCHEME("scheme"),
    
    NETWORKTOKEN("networkToken"),
    
    CARD("card");

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
  private TypeEnum type = TypeEnum.SCHEME;

  public CardDetails() { 
  }

  public CardDetails brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Secondary brand of the card. For example: **plastix**, **hmclub**.
   * @return brand
  **/
  @ApiModelProperty(value = "Secondary brand of the card. For example: **plastix**, **hmclub**.")
  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrand() {
    return brand;
  }


  @JsonProperty(JSON_PROPERTY_BRAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrand(String brand) {
    this.brand = brand;
  }


  public CardDetails checkoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
    return this;
  }

   /**
   * The checkout attempt identifier.
   * @return checkoutAttemptId
  **/
  @ApiModelProperty(value = "The checkout attempt identifier.")
  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCheckoutAttemptId() {
    return checkoutAttemptId;
  }


  @JsonProperty(JSON_PROPERTY_CHECKOUT_ATTEMPT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCheckoutAttemptId(String checkoutAttemptId) {
    this.checkoutAttemptId = checkoutAttemptId;
  }


  public CardDetails cupsecureplusSmscode(String cupsecureplusSmscode) {
    this.cupsecureplusSmscode = cupsecureplusSmscode;
    return this;
  }

   /**
   * Get cupsecureplusSmscode
   * @return cupsecureplusSmscode
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUPSECUREPLUS_SMSCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCupsecureplusSmscode() {
    return cupsecureplusSmscode;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_CUPSECUREPLUS_SMSCODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCupsecureplusSmscode(String cupsecureplusSmscode) {
    this.cupsecureplusSmscode = cupsecureplusSmscode;
  }


  public CardDetails cvc(String cvc) {
    this.cvc = cvc;
    return this;
  }

   /**
   * The card verification code. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
   * @return cvc
  **/
  @ApiModelProperty(value = "The card verification code. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).")
  @JsonProperty(JSON_PROPERTY_CVC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCvc() {
    return cvc;
  }


  @JsonProperty(JSON_PROPERTY_CVC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCvc(String cvc) {
    this.cvc = cvc;
  }


  public CardDetails encryptedCardNumber(String encryptedCardNumber) {
    this.encryptedCardNumber = encryptedCardNumber;
    return this;
  }

   /**
   * The encrypted card number.
   * @return encryptedCardNumber
  **/
  @ApiModelProperty(value = "The encrypted card number.")
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncryptedCardNumber() {
    return encryptedCardNumber;
  }


  @JsonProperty(JSON_PROPERTY_ENCRYPTED_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptedCardNumber(String encryptedCardNumber) {
    this.encryptedCardNumber = encryptedCardNumber;
  }


  public CardDetails encryptedExpiryMonth(String encryptedExpiryMonth) {
    this.encryptedExpiryMonth = encryptedExpiryMonth;
    return this;
  }

   /**
   * The encrypted card expiry month.
   * @return encryptedExpiryMonth
  **/
  @ApiModelProperty(value = "The encrypted card expiry month.")
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_EXPIRY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncryptedExpiryMonth() {
    return encryptedExpiryMonth;
  }


  @JsonProperty(JSON_PROPERTY_ENCRYPTED_EXPIRY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptedExpiryMonth(String encryptedExpiryMonth) {
    this.encryptedExpiryMonth = encryptedExpiryMonth;
  }


  public CardDetails encryptedExpiryYear(String encryptedExpiryYear) {
    this.encryptedExpiryYear = encryptedExpiryYear;
    return this;
  }

   /**
   * The encrypted card expiry year.
   * @return encryptedExpiryYear
  **/
  @ApiModelProperty(value = "The encrypted card expiry year.")
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_EXPIRY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncryptedExpiryYear() {
    return encryptedExpiryYear;
  }


  @JsonProperty(JSON_PROPERTY_ENCRYPTED_EXPIRY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptedExpiryYear(String encryptedExpiryYear) {
    this.encryptedExpiryYear = encryptedExpiryYear;
  }


  public CardDetails encryptedSecurityCode(String encryptedSecurityCode) {
    this.encryptedSecurityCode = encryptedSecurityCode;
    return this;
  }

   /**
   * The encrypted card verification code.
   * @return encryptedSecurityCode
  **/
  @ApiModelProperty(value = "The encrypted card verification code.")
  @JsonProperty(JSON_PROPERTY_ENCRYPTED_SECURITY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncryptedSecurityCode() {
    return encryptedSecurityCode;
  }


  @JsonProperty(JSON_PROPERTY_ENCRYPTED_SECURITY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptedSecurityCode(String encryptedSecurityCode) {
    this.encryptedSecurityCode = encryptedSecurityCode;
  }


  public CardDetails expiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
    return this;
  }

   /**
   * The card expiry month. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
   * @return expiryMonth
  **/
  @ApiModelProperty(value = "The card expiry month. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).")
  @JsonProperty(JSON_PROPERTY_EXPIRY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpiryMonth() {
    return expiryMonth;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryMonth(String expiryMonth) {
    this.expiryMonth = expiryMonth;
  }


  public CardDetails expiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
    return this;
  }

   /**
   * The card expiry year. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
   * @return expiryYear
  **/
  @ApiModelProperty(value = "The card expiry year. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).")
  @JsonProperty(JSON_PROPERTY_EXPIRY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpiryYear() {
    return expiryYear;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryYear(String expiryYear) {
    this.expiryYear = expiryYear;
  }


  public CardDetails fundingSource(FundingSourceEnum fundingSource) {
    this.fundingSource = fundingSource;
    return this;
  }

   /**
   * The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
   * @return fundingSource
  **/
  @ApiModelProperty(value = "The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.")
  @JsonProperty(JSON_PROPERTY_FUNDING_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundingSourceEnum getFundingSource() {
    return fundingSource;
  }


  @JsonProperty(JSON_PROPERTY_FUNDING_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundingSource(FundingSourceEnum fundingSource) {
    this.fundingSource = fundingSource;
  }


  public CardDetails holderName(String holderName) {
    this.holderName = holderName;
    return this;
  }

   /**
   * The name of the card holder.
   * @return holderName
  **/
  @ApiModelProperty(value = "The name of the card holder.")
  @JsonProperty(JSON_PROPERTY_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHolderName() {
    return holderName;
  }


  @JsonProperty(JSON_PROPERTY_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }


  public CardDetails networkPaymentReference(String networkPaymentReference) {
    this.networkPaymentReference = networkPaymentReference;
    return this;
  }

   /**
   * The network token reference. This is the [&#x60;networkTxReference&#x60;](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_additionalData-ResponseAdditionalDataCommon-networkTxReference) from the response to the first payment.
   * @return networkPaymentReference
  **/
  @ApiModelProperty(value = "The network token reference. This is the [`networkTxReference`](https://docs.adyen.com/api-explorer/#/CheckoutService/latest/post/payments__resParam_additionalData-ResponseAdditionalDataCommon-networkTxReference) from the response to the first payment.")
  @JsonProperty(JSON_PROPERTY_NETWORK_PAYMENT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNetworkPaymentReference() {
    return networkPaymentReference;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_PAYMENT_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkPaymentReference(String networkPaymentReference) {
    this.networkPaymentReference = networkPaymentReference;
  }


  public CardDetails number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The card number. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).
   * @return number
  **/
  @ApiModelProperty(value = "The card number. Only collect raw card data if you are [fully PCI compliant](https://docs.adyen.com/development-resources/pci-dss-compliance-guide).")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(String number) {
    this.number = number;
  }


  public CardDetails recurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return recurringDetailReference
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }


  @Deprecated
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }


  public CardDetails shopperNotificationReference(String shopperNotificationReference) {
    this.shopperNotificationReference = shopperNotificationReference;
    return this;
  }

   /**
   * The &#x60;shopperNotificationReference&#x60; returned in the response when you requested to notify the shopper. Used only for recurring payments in India.
   * @return shopperNotificationReference
  **/
  @ApiModelProperty(value = "The `shopperNotificationReference` returned in the response when you requested to notify the shopper. Used only for recurring payments in India.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShopperNotificationReference() {
    return shopperNotificationReference;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_NOTIFICATION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperNotificationReference(String shopperNotificationReference) {
    this.shopperNotificationReference = shopperNotificationReference;
  }


  public CardDetails storedPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
    return this;
  }

   /**
   * This is the &#x60;recurringDetailReference&#x60; returned in the response when you created the token.
   * @return storedPaymentMethodId
  **/
  @ApiModelProperty(value = "This is the `recurringDetailReference` returned in the response when you created the token.")
  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoredPaymentMethodId() {
    return storedPaymentMethodId;
  }


  @JsonProperty(JSON_PROPERTY_STORED_PAYMENT_METHOD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoredPaymentMethodId(String storedPaymentMethodId) {
    this.storedPaymentMethodId = storedPaymentMethodId;
  }


  public CardDetails threeDS2SdkVersion(String threeDS2SdkVersion) {
    this.threeDS2SdkVersion = threeDS2SdkVersion;
    return this;
  }

   /**
   * Required for mobile integrations. Version of the 3D Secure 2 mobile SDK.
   * @return threeDS2SdkVersion
  **/
  @ApiModelProperty(value = "Required for mobile integrations. Version of the 3D Secure 2 mobile SDK.")
  @JsonProperty(JSON_PROPERTY_THREE_D_S2_SDK_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreeDS2SdkVersion() {
    return threeDS2SdkVersion;
  }


  @JsonProperty(JSON_PROPERTY_THREE_D_S2_SDK_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDS2SdkVersion(String threeDS2SdkVersion) {
    this.threeDS2SdkVersion = threeDS2SdkVersion;
  }


  public CardDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Default payment method details. Common for scheme payment methods, and for simple payment method details.
   * @return type
  **/
  @ApiModelProperty(value = "Default payment method details. Common for scheme payment methods, and for simple payment method details.")
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


  /**
   * Return true if this CardDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardDetails cardDetails = (CardDetails) o;
    return Objects.equals(this.brand, cardDetails.brand) &&
        Objects.equals(this.checkoutAttemptId, cardDetails.checkoutAttemptId) &&
        Objects.equals(this.cupsecureplusSmscode, cardDetails.cupsecureplusSmscode) &&
        Objects.equals(this.cvc, cardDetails.cvc) &&
        Objects.equals(this.encryptedCardNumber, cardDetails.encryptedCardNumber) &&
        Objects.equals(this.encryptedExpiryMonth, cardDetails.encryptedExpiryMonth) &&
        Objects.equals(this.encryptedExpiryYear, cardDetails.encryptedExpiryYear) &&
        Objects.equals(this.encryptedSecurityCode, cardDetails.encryptedSecurityCode) &&
        Objects.equals(this.expiryMonth, cardDetails.expiryMonth) &&
        Objects.equals(this.expiryYear, cardDetails.expiryYear) &&
        Objects.equals(this.fundingSource, cardDetails.fundingSource) &&
        Objects.equals(this.holderName, cardDetails.holderName) &&
        Objects.equals(this.networkPaymentReference, cardDetails.networkPaymentReference) &&
        Objects.equals(this.number, cardDetails.number) &&
        Objects.equals(this.recurringDetailReference, cardDetails.recurringDetailReference) &&
        Objects.equals(this.shopperNotificationReference, cardDetails.shopperNotificationReference) &&
        Objects.equals(this.storedPaymentMethodId, cardDetails.storedPaymentMethodId) &&
        Objects.equals(this.threeDS2SdkVersion, cardDetails.threeDS2SdkVersion) &&
        Objects.equals(this.type, cardDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, checkoutAttemptId, cupsecureplusSmscode, cvc, encryptedCardNumber, encryptedExpiryMonth, encryptedExpiryYear, encryptedSecurityCode, expiryMonth, expiryYear, fundingSource, holderName, networkPaymentReference, number, recurringDetailReference, shopperNotificationReference, storedPaymentMethodId, threeDS2SdkVersion, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardDetails {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    cupsecureplusSmscode: ").append(toIndentedString(cupsecureplusSmscode)).append("\n");
    sb.append("    cvc: ").append(toIndentedString(cvc)).append("\n");
    sb.append("    encryptedCardNumber: ").append(toIndentedString(encryptedCardNumber)).append("\n");
    sb.append("    encryptedExpiryMonth: ").append(toIndentedString(encryptedExpiryMonth)).append("\n");
    sb.append("    encryptedExpiryYear: ").append(toIndentedString(encryptedExpiryYear)).append("\n");
    sb.append("    encryptedSecurityCode: ").append(toIndentedString(encryptedSecurityCode)).append("\n");
    sb.append("    expiryMonth: ").append(toIndentedString(expiryMonth)).append("\n");
    sb.append("    expiryYear: ").append(toIndentedString(expiryYear)).append("\n");
    sb.append("    fundingSource: ").append(toIndentedString(fundingSource)).append("\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
    sb.append("    networkPaymentReference: ").append(toIndentedString(networkPaymentReference)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    shopperNotificationReference: ").append(toIndentedString(shopperNotificationReference)).append("\n");
    sb.append("    storedPaymentMethodId: ").append(toIndentedString(storedPaymentMethodId)).append("\n");
    sb.append("    threeDS2SdkVersion: ").append(toIndentedString(threeDS2SdkVersion)).append("\n");
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
   * Create an instance of CardDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CardDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to CardDetails
   */
  public static CardDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CardDetails.class);
  }
/**
  * Convert an instance of CardDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

