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
 * VisaCheckoutDetails
 */
@JsonPropertyOrder({
  VisaCheckoutDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  VisaCheckoutDetails.JSON_PROPERTY_FUNDING_SOURCE,
  VisaCheckoutDetails.JSON_PROPERTY_TYPE,
  VisaCheckoutDetails.JSON_PROPERTY_VISA_CHECKOUT_CALL_ID
})

public class VisaCheckoutDetails {
  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  /**
   * The funding source that should be used when multiple sources are available. For Brazilian combo cards, by default the funding source is credit. To use debit, set this value to **debit**.
   */
  public enum FundingSourceEnum {
    CREDIT("credit"),
    
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

  /**
   * **visacheckout**
   */
  public enum TypeEnum {
    VISACHECKOUT("visacheckout");

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
  private TypeEnum type = TypeEnum.VISACHECKOUT;

  public static final String JSON_PROPERTY_VISA_CHECKOUT_CALL_ID = "visaCheckoutCallId";
  private String visaCheckoutCallId;

  public VisaCheckoutDetails() { 
  }

  public VisaCheckoutDetails checkoutAttemptId(String checkoutAttemptId) {
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


  public VisaCheckoutDetails fundingSource(FundingSourceEnum fundingSource) {
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


  public VisaCheckoutDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **visacheckout**
   * @return type
  **/
  @ApiModelProperty(value = "**visacheckout**")
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


  public VisaCheckoutDetails visaCheckoutCallId(String visaCheckoutCallId) {
    this.visaCheckoutCallId = visaCheckoutCallId;
    return this;
  }

   /**
   * The Visa Click to Pay Call ID value. When your shopper selects a payment and/or a shipping address from Visa Click to Pay, you will receive a Visa Click to Pay Call ID.
   * @return visaCheckoutCallId
  **/
  @ApiModelProperty(required = true, value = "The Visa Click to Pay Call ID value. When your shopper selects a payment and/or a shipping address from Visa Click to Pay, you will receive a Visa Click to Pay Call ID.")
  @JsonProperty(JSON_PROPERTY_VISA_CHECKOUT_CALL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVisaCheckoutCallId() {
    return visaCheckoutCallId;
  }


  @JsonProperty(JSON_PROPERTY_VISA_CHECKOUT_CALL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVisaCheckoutCallId(String visaCheckoutCallId) {
    this.visaCheckoutCallId = visaCheckoutCallId;
  }


  /**
   * Return true if this VisaCheckoutDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisaCheckoutDetails visaCheckoutDetails = (VisaCheckoutDetails) o;
    return Objects.equals(this.checkoutAttemptId, visaCheckoutDetails.checkoutAttemptId) &&
        Objects.equals(this.fundingSource, visaCheckoutDetails.fundingSource) &&
        Objects.equals(this.type, visaCheckoutDetails.type) &&
        Objects.equals(this.visaCheckoutCallId, visaCheckoutDetails.visaCheckoutCallId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutAttemptId, fundingSource, type, visaCheckoutCallId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisaCheckoutDetails {\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    fundingSource: ").append(toIndentedString(fundingSource)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    visaCheckoutCallId: ").append(toIndentedString(visaCheckoutCallId)).append("\n");
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
   * Create an instance of VisaCheckoutDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VisaCheckoutDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to VisaCheckoutDetails
   */
  public static VisaCheckoutDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, VisaCheckoutDetails.class);
  }
/**
  * Convert an instance of VisaCheckoutDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

