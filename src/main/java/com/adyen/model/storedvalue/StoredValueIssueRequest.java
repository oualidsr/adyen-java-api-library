/*
 * Adyen Stored Value API
 * A set of API endpoints to manage stored value products.
 *
 * The version of the OpenAPI document: 46
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.storedvalue;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.storedvalue.Amount;
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
 * StoredValueIssueRequest
 */
@JsonPropertyOrder({
  StoredValueIssueRequest.JSON_PROPERTY_AMOUNT,
  StoredValueIssueRequest.JSON_PROPERTY_MERCHANT_ACCOUNT,
  StoredValueIssueRequest.JSON_PROPERTY_PAYMENT_METHOD,
  StoredValueIssueRequest.JSON_PROPERTY_RECURRING_DETAIL_REFERENCE,
  StoredValueIssueRequest.JSON_PROPERTY_REFERENCE,
  StoredValueIssueRequest.JSON_PROPERTY_SHOPPER_INTERACTION,
  StoredValueIssueRequest.JSON_PROPERTY_SHOPPER_REFERENCE,
  StoredValueIssueRequest.JSON_PROPERTY_STORE
})

public class StoredValueIssueRequest {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_MERCHANT_ACCOUNT = "merchantAccount";
  private String merchantAccount;

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  private Map<String, String> paymentMethod = new HashMap<>();

  public static final String JSON_PROPERTY_RECURRING_DETAIL_REFERENCE = "recurringDetailReference";
  private String recurringDetailReference;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  /**
   * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
   */
  public enum ShopperInteractionEnum {
    ECOMMERCE("Ecommerce"),
    
    CONTAUTH("ContAuth"),
    
    MOTO("Moto"),
    
    POS("POS");

    private String value;

    ShopperInteractionEnum(String value) {
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
    public static ShopperInteractionEnum fromValue(String value) {
      for (ShopperInteractionEnum b : ShopperInteractionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SHOPPER_INTERACTION = "shopperInteraction";
  private ShopperInteractionEnum shopperInteraction;

  public static final String JSON_PROPERTY_SHOPPER_REFERENCE = "shopperReference";
  private String shopperReference;

  public static final String JSON_PROPERTY_STORE = "store";
  private String store;

  public StoredValueIssueRequest() { 
  }

  public StoredValueIssueRequest amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Amount getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public StoredValueIssueRequest merchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account identifier, with which you want to process the transaction.
   * @return merchantAccount
  **/
  @ApiModelProperty(required = true, value = "The merchant account identifier, with which you want to process the transaction.")
  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMerchantAccount() {
    return merchantAccount;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public StoredValueIssueRequest paymentMethod(Map<String, String> paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  public StoredValueIssueRequest putPaymentMethodItem(String key, String paymentMethodItem) {
    this.paymentMethod.put(key, paymentMethodItem);
    return this;
  }

   /**
   * The collection that contains the type of the payment method and its specific information if available
   * @return paymentMethod
  **/
  @ApiModelProperty(required = true, value = "The collection that contains the type of the payment method and its specific information if available")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getPaymentMethod() {
    return paymentMethod;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethod(Map<String, String> paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public StoredValueIssueRequest recurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
    return this;
  }

   /**
   * Get recurringDetailReference
   * @return recurringDetailReference
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecurringDetailReference() {
    return recurringDetailReference;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_DETAIL_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDetailReference(String recurringDetailReference) {
    this.recurringDetailReference = recurringDetailReference;
  }


  public StoredValueIssueRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\&quot;-\&quot;). Maximum length: 80 characters.
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "The reference to uniquely identify a payment. This reference is used in all communication with you about the payment status. We recommend using a unique value per payment; however, it is not a requirement. If you need to provide multiple references for a transaction, separate them with hyphens (\"-\"). Maximum length: 80 characters.")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public StoredValueIssueRequest shopperInteraction(ShopperInteractionEnum shopperInteraction) {
    this.shopperInteraction = shopperInteraction;
    return this;
  }

   /**
   * Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * &#x60;Ecommerce&#x60; - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * &#x60;ContAuth&#x60; - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * &#x60;Moto&#x60; - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * &#x60;POS&#x60; - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.
   * @return shopperInteraction
  **/
  @ApiModelProperty(value = "Specifies the sales channel, through which the shopper gives their card details, and whether the shopper is a returning customer. For the web service API, Adyen assumes Ecommerce shopper interaction by default.  This field has the following possible values: * `Ecommerce` - Online transactions where the cardholder is present (online). For better authorisation rates, we recommend sending the card security code (CSC) along with the request. * `ContAuth` - Card on file and/or subscription transactions, where the cardholder is known to the merchant (returning customer). If the shopper is present (online), you can supply also the CSC to improve authorisation (one-click payment). * `Moto` - Mail-order and telephone-order transactions where the shopper is in contact with the merchant via email or telephone. * `POS` - Point-of-sale transactions where the shopper is physically present to make a payment using a secure payment terminal.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShopperInteractionEnum getShopperInteraction() {
    return shopperInteraction;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_INTERACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperInteraction(ShopperInteractionEnum shopperInteraction) {
    this.shopperInteraction = shopperInteraction;
  }


  public StoredValueIssueRequest shopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
    return this;
  }

   /**
   * Get shopperReference
   * @return shopperReference
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShopperReference() {
    return shopperReference;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }


  public StoredValueIssueRequest store(String store) {
    this.store = store;
    return this;
  }

   /**
   * The physical store, for which this payment is processed.
   * @return store
  **/
  @ApiModelProperty(value = "The physical store, for which this payment is processed.")
  @JsonProperty(JSON_PROPERTY_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStore() {
    return store;
  }


  @JsonProperty(JSON_PROPERTY_STORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStore(String store) {
    this.store = store;
  }


  /**
   * Return true if this StoredValueIssueRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoredValueIssueRequest storedValueIssueRequest = (StoredValueIssueRequest) o;
    return Objects.equals(this.amount, storedValueIssueRequest.amount) &&
        Objects.equals(this.merchantAccount, storedValueIssueRequest.merchantAccount) &&
        Objects.equals(this.paymentMethod, storedValueIssueRequest.paymentMethod) &&
        Objects.equals(this.recurringDetailReference, storedValueIssueRequest.recurringDetailReference) &&
        Objects.equals(this.reference, storedValueIssueRequest.reference) &&
        Objects.equals(this.shopperInteraction, storedValueIssueRequest.shopperInteraction) &&
        Objects.equals(this.shopperReference, storedValueIssueRequest.shopperReference) &&
        Objects.equals(this.store, storedValueIssueRequest.store);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, merchantAccount, paymentMethod, recurringDetailReference, reference, shopperInteraction, shopperReference, store);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredValueIssueRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    recurringDetailReference: ").append(toIndentedString(recurringDetailReference)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    shopperInteraction: ").append(toIndentedString(shopperInteraction)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
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
   * Create an instance of StoredValueIssueRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StoredValueIssueRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to StoredValueIssueRequest
   */
  public static StoredValueIssueRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, StoredValueIssueRequest.class);
  }
/**
  * Convert an instance of StoredValueIssueRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

