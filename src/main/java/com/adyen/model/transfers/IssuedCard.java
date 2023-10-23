/*
 * Transfers API
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transfers;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.transfers.RelayedAuthorisationData;
import com.adyen.model.transfers.TransferNotificationValidationFact;
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
 * IssuedCard
 */
@JsonPropertyOrder({
  IssuedCard.JSON_PROPERTY_PAN_ENTRY_MODE,
  IssuedCard.JSON_PROPERTY_PROCESSING_TYPE,
  IssuedCard.JSON_PROPERTY_RELAYED_AUTHORISATION_DATA,
  IssuedCard.JSON_PROPERTY_TYPE,
  IssuedCard.JSON_PROPERTY_VALIDATION_FACTS
})

public class IssuedCard {
  /**
   * Indicates the method used for entering the PAN to initiate a transaction.  Possible values: **manual**, **chip**, **magstripe**, **contactless**, **cof**, **ecommerce**, **token**.
   */
  public enum PanEntryModeEnum {
    CHIP("chip"),
    
    COF("cof"),
    
    CONTACTLESS("contactless"),
    
    ECOMMERCE("ecommerce"),
    
    MAGSTRIPE("magstripe"),
    
    MANUAL("manual"),
    
    TOKEN("token");

    private String value;

    PanEntryModeEnum(String value) {
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
    public static PanEntryModeEnum fromValue(String value) {
      for (PanEntryModeEnum b : PanEntryModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PAN_ENTRY_MODE = "panEntryMode";
  private PanEntryModeEnum panEntryMode;

  /**
   * Contains information about how the payment was processed. For example, **ecommerce** for online or **pos** for in-person payments.
   */
  public enum ProcessingTypeEnum {
    ATMWITHDRAW("atmWithdraw"),
    
    BALANCEINQUIRY("balanceInquiry"),
    
    ECOMMERCE("ecommerce"),
    
    MOTO("moto"),
    
    POS("pos"),
    
    PURCHASEWITHCASHBACK("purchaseWithCashback"),
    
    RECURRING("recurring"),
    
    TOKEN("token");

    private String value;

    ProcessingTypeEnum(String value) {
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
    public static ProcessingTypeEnum fromValue(String value) {
      for (ProcessingTypeEnum b : ProcessingTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PROCESSING_TYPE = "processingType";
  private ProcessingTypeEnum processingType;

  public static final String JSON_PROPERTY_RELAYED_AUTHORISATION_DATA = "relayedAuthorisationData";
  private RelayedAuthorisationData relayedAuthorisationData;

  /**
   * **issuedCard**
   */
  public enum TypeEnum {
    ISSUEDCARD("issuedCard");

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
  private TypeEnum type = TypeEnum.ISSUEDCARD;

  public static final String JSON_PROPERTY_VALIDATION_FACTS = "validationFacts";
  private List<TransferNotificationValidationFact> validationFacts = null;

  public IssuedCard() { 
  }

  public IssuedCard panEntryMode(PanEntryModeEnum panEntryMode) {
    this.panEntryMode = panEntryMode;
    return this;
  }

   /**
   * Indicates the method used for entering the PAN to initiate a transaction.  Possible values: **manual**, **chip**, **magstripe**, **contactless**, **cof**, **ecommerce**, **token**.
   * @return panEntryMode
  **/
  @ApiModelProperty(value = "Indicates the method used for entering the PAN to initiate a transaction.  Possible values: **manual**, **chip**, **magstripe**, **contactless**, **cof**, **ecommerce**, **token**.")
  @JsonProperty(JSON_PROPERTY_PAN_ENTRY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PanEntryModeEnum getPanEntryMode() {
    return panEntryMode;
  }


  @JsonProperty(JSON_PROPERTY_PAN_ENTRY_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPanEntryMode(PanEntryModeEnum panEntryMode) {
    this.panEntryMode = panEntryMode;
  }


  public IssuedCard processingType(ProcessingTypeEnum processingType) {
    this.processingType = processingType;
    return this;
  }

   /**
   * Contains information about how the payment was processed. For example, **ecommerce** for online or **pos** for in-person payments.
   * @return processingType
  **/
  @ApiModelProperty(value = "Contains information about how the payment was processed. For example, **ecommerce** for online or **pos** for in-person payments.")
  @JsonProperty(JSON_PROPERTY_PROCESSING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProcessingTypeEnum getProcessingType() {
    return processingType;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessingType(ProcessingTypeEnum processingType) {
    this.processingType = processingType;
  }


  public IssuedCard relayedAuthorisationData(RelayedAuthorisationData relayedAuthorisationData) {
    this.relayedAuthorisationData = relayedAuthorisationData;
    return this;
  }

   /**
   * Get relayedAuthorisationData
   * @return relayedAuthorisationData
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELAYED_AUTHORISATION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RelayedAuthorisationData getRelayedAuthorisationData() {
    return relayedAuthorisationData;
  }


  @JsonProperty(JSON_PROPERTY_RELAYED_AUTHORISATION_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelayedAuthorisationData(RelayedAuthorisationData relayedAuthorisationData) {
    this.relayedAuthorisationData = relayedAuthorisationData;
  }


  public IssuedCard type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **issuedCard**
   * @return type
  **/
  @ApiModelProperty(value = "**issuedCard**")
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


  public IssuedCard validationFacts(List<TransferNotificationValidationFact> validationFacts) {
    this.validationFacts = validationFacts;
    return this;
  }

  public IssuedCard addValidationFactsItem(TransferNotificationValidationFact validationFactsItem) {
    if (this.validationFacts == null) {
      this.validationFacts = new ArrayList<>();
    }
    this.validationFacts.add(validationFactsItem);
    return this;
  }

   /**
   * The evaluation of the validation facts. See [validation checks](https://docs.adyen.com/issuing/validation-checks) for more information.
   * @return validationFacts
  **/
  @ApiModelProperty(value = "The evaluation of the validation facts. See [validation checks](https://docs.adyen.com/issuing/validation-checks) for more information.")
  @JsonProperty(JSON_PROPERTY_VALIDATION_FACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TransferNotificationValidationFact> getValidationFacts() {
    return validationFacts;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION_FACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidationFacts(List<TransferNotificationValidationFact> validationFacts) {
    this.validationFacts = validationFacts;
  }


  /**
   * Return true if this IssuedCard object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuedCard issuedCard = (IssuedCard) o;
    return Objects.equals(this.panEntryMode, issuedCard.panEntryMode) &&
        Objects.equals(this.processingType, issuedCard.processingType) &&
        Objects.equals(this.relayedAuthorisationData, issuedCard.relayedAuthorisationData) &&
        Objects.equals(this.type, issuedCard.type) &&
        Objects.equals(this.validationFacts, issuedCard.validationFacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(panEntryMode, processingType, relayedAuthorisationData, type, validationFacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuedCard {\n");
    sb.append("    panEntryMode: ").append(toIndentedString(panEntryMode)).append("\n");
    sb.append("    processingType: ").append(toIndentedString(processingType)).append("\n");
    sb.append("    relayedAuthorisationData: ").append(toIndentedString(relayedAuthorisationData)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validationFacts: ").append(toIndentedString(validationFacts)).append("\n");
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
   * Create an instance of IssuedCard given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IssuedCard
   * @throws JsonProcessingException if the JSON string is invalid with respect to IssuedCard
   */
  public static IssuedCard fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, IssuedCard.class);
  }
/**
  * Convert an instance of IssuedCard to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

