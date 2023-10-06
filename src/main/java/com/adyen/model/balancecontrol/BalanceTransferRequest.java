/*
 * Adyen Balance Control API
 * The Balance Control API lets you transfer funds between merchant accounts that belong to the same legal entity and are under the same company account.  ## Authentication To connect to the Balance Control API, you must authenticate your requests with an [API key or basic auth username and password](https://docs.adyen.com/development-resources/api-authentication). To learn how you can generate these, see [API credentials](https://docs.adyen.com/development-resources/api-credentials).Here is an example of authenticating a request with an API key:  ``` curl -H \"X-API-Key: Your_API_key\" \\ -H \"Content-Type: application/json\" \\ ... ``` Note that when going live, you need to generate API credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Balance Control API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example:  ``` https://pal-test.adyen.com/pal/servlet/BalanceControl/v1/balanceTransfer ``` 
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balancecontrol;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.balancecontrol.Amount;
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
 * BalanceTransferRequest
 */
@JsonPropertyOrder({
  BalanceTransferRequest.JSON_PROPERTY_AMOUNT,
  BalanceTransferRequest.JSON_PROPERTY_DESCRIPTION,
  BalanceTransferRequest.JSON_PROPERTY_FROM_MERCHANT,
  BalanceTransferRequest.JSON_PROPERTY_REFERENCE,
  BalanceTransferRequest.JSON_PROPERTY_TO_MERCHANT,
  BalanceTransferRequest.JSON_PROPERTY_TYPE
})

public class BalanceTransferRequest {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Amount amount;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_FROM_MERCHANT = "fromMerchant";
  private String fromMerchant;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_TO_MERCHANT = "toMerchant";
  private String toMerchant;

  /**
   * The type of balance transfer. Possible values: **tax**, **fee**, **terminalSale**, **credit**, **debit**, and **adjustment**.
   */
  public enum TypeEnum {
    TAX("tax"),
    
    FEE("fee"),
    
    TERMINALSALE("terminalSale"),
    
    CREDIT("credit"),
    
    DEBIT("debit"),
    
    ADJUSTMENT("adjustment");

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

  public BalanceTransferRequest() { 
  }

  public BalanceTransferRequest amount(Amount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")
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


  public BalanceTransferRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human-readable description for the transfer. You can use alphanumeric characters and hyphens. We recommend sending a maximum of 140 characters, otherwise the description may be truncated.
   * @return description
  **/
  @ApiModelProperty(value = "A human-readable description for the transfer. You can use alphanumeric characters and hyphens. We recommend sending a maximum of 140 characters, otherwise the description may be truncated.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public BalanceTransferRequest fromMerchant(String fromMerchant) {
    this.fromMerchant = fromMerchant;
    return this;
  }

   /**
   * The unique identifier of the source merchant account from which funds are deducted.
   * @return fromMerchant
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the source merchant account from which funds are deducted.")
  @JsonProperty(JSON_PROPERTY_FROM_MERCHANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromMerchant() {
    return fromMerchant;
  }


  @JsonProperty(JSON_PROPERTY_FROM_MERCHANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromMerchant(String fromMerchant) {
    this.fromMerchant = fromMerchant;
  }


  public BalanceTransferRequest reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * A reference for the balance transfer. If you don&#39;t provide this in the request, Adyen generates a unique reference. Maximum length: 80 characters.
   * @return reference
  **/
  @ApiModelProperty(value = "A reference for the balance transfer. If you don't provide this in the request, Adyen generates a unique reference. Maximum length: 80 characters.")
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


  public BalanceTransferRequest toMerchant(String toMerchant) {
    this.toMerchant = toMerchant;
    return this;
  }

   /**
   * The unique identifier of the destination merchant account from which funds are transferred.
   * @return toMerchant
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the destination merchant account from which funds are transferred.")
  @JsonProperty(JSON_PROPERTY_TO_MERCHANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getToMerchant() {
    return toMerchant;
  }


  @JsonProperty(JSON_PROPERTY_TO_MERCHANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToMerchant(String toMerchant) {
    this.toMerchant = toMerchant;
  }


  public BalanceTransferRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of balance transfer. Possible values: **tax**, **fee**, **terminalSale**, **credit**, **debit**, and **adjustment**.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of balance transfer. Possible values: **tax**, **fee**, **terminalSale**, **credit**, **debit**, and **adjustment**.")
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
   * Return true if this BalanceTransferRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceTransferRequest balanceTransferRequest = (BalanceTransferRequest) o;
    return Objects.equals(this.amount, balanceTransferRequest.amount) &&
        Objects.equals(this.description, balanceTransferRequest.description) &&
        Objects.equals(this.fromMerchant, balanceTransferRequest.fromMerchant) &&
        Objects.equals(this.reference, balanceTransferRequest.reference) &&
        Objects.equals(this.toMerchant, balanceTransferRequest.toMerchant) &&
        Objects.equals(this.type, balanceTransferRequest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, fromMerchant, reference, toMerchant, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceTransferRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fromMerchant: ").append(toIndentedString(fromMerchant)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    toMerchant: ").append(toIndentedString(toMerchant)).append("\n");
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
   * Create an instance of BalanceTransferRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BalanceTransferRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to BalanceTransferRequest
   */
  public static BalanceTransferRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, BalanceTransferRequest.class);
  }
/**
  * Convert an instance of BalanceTransferRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

