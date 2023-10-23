/*
 * Transfer webhooks
 *
 * The version of the OpenAPI document: 4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.transferwebhooks;

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
 * Modification
 */
@JsonPropertyOrder({
  Modification.JSON_PROPERTY_DIRECTION,
  Modification.JSON_PROPERTY_ID,
  Modification.JSON_PROPERTY_REFERENCE,
  Modification.JSON_PROPERTY_STATUS,
  Modification.JSON_PROPERTY_TYPE
})

public class Modification {
  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private String direction;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  /**
   * The status of the transfer event.
   */
  public enum StatusEnum {
    APPROVALPENDING("approvalPending"),
    
    ATMWITHDRAWAL("atmWithdrawal"),
    
    ATMWITHDRAWALREVERSALPENDING("atmWithdrawalReversalPending"),
    
    ATMWITHDRAWALREVERSED("atmWithdrawalReversed"),
    
    AUTHADJUSTMENTAUTHORISED("authAdjustmentAuthorised"),
    
    AUTHADJUSTMENTERROR("authAdjustmentError"),
    
    AUTHADJUSTMENTREFUSED("authAdjustmentRefused"),
    
    AUTHORISED("authorised"),
    
    BANKTRANSFER("bankTransfer"),
    
    BANKTRANSFERPENDING("bankTransferPending"),
    
    BOOKED("booked"),
    
    BOOKINGPENDING("bookingPending"),
    
    CANCELLED("cancelled"),
    
    CAPTUREPENDING("capturePending"),
    
    CAPTUREREVERSALPENDING("captureReversalPending"),
    
    CAPTUREREVERSED("captureReversed"),
    
    CAPTURED("captured"),
    
    CAPTUREDEXTERNALLY("capturedExternally"),
    
    CHARGEBACK("chargeback"),
    
    CHARGEBACKEXTERNALLY("chargebackExternally"),
    
    CHARGEBACKPENDING("chargebackPending"),
    
    CHARGEBACKREVERSALPENDING("chargebackReversalPending"),
    
    CHARGEBACKREVERSED("chargebackReversed"),
    
    CREDITED("credited"),
    
    DEPOSITCORRECTION("depositCorrection"),
    
    DEPOSITCORRECTIONPENDING("depositCorrectionPending"),
    
    DISPUTE("dispute"),
    
    DISPUTECLOSED("disputeClosed"),
    
    DISPUTEEXPIRED("disputeExpired"),
    
    DISPUTENEEDSREVIEW("disputeNeedsReview"),
    
    ERROR("error"),
    
    EXPIRED("expired"),
    
    FAILED("failed"),
    
    FEE("fee"),
    
    FEEPENDING("feePending"),
    
    INTERNALTRANSFER("internalTransfer"),
    
    INTERNALTRANSFERPENDING("internalTransferPending"),
    
    INVOICEDEDUCTION("invoiceDeduction"),
    
    INVOICEDEDUCTIONPENDING("invoiceDeductionPending"),
    
    MANUALCORRECTIONPENDING("manualCorrectionPending"),
    
    MANUALLYCORRECTED("manuallyCorrected"),
    
    MATCHEDSTATEMENT("matchedStatement"),
    
    MATCHEDSTATEMENTPENDING("matchedStatementPending"),
    
    MERCHANTPAYIN("merchantPayin"),
    
    MERCHANTPAYINPENDING("merchantPayinPending"),
    
    MERCHANTPAYINREVERSED("merchantPayinReversed"),
    
    MERCHANTPAYINREVERSEDPENDING("merchantPayinReversedPending"),
    
    MISCCOST("miscCost"),
    
    MISCCOSTPENDING("miscCostPending"),
    
    PAYMENTCOST("paymentCost"),
    
    PAYMENTCOSTPENDING("paymentCostPending"),
    
    RECEIVED("received"),
    
    REFUNDPENDING("refundPending"),
    
    REFUNDREVERSALPENDING("refundReversalPending"),
    
    REFUNDREVERSED("refundReversed"),
    
    REFUNDED("refunded"),
    
    REFUNDEDEXTERNALLY("refundedExternally"),
    
    REFUSED("refused"),
    
    RESERVEADJUSTMENT("reserveAdjustment"),
    
    RESERVEADJUSTMENTPENDING("reserveAdjustmentPending"),
    
    RETURNED("returned"),
    
    SECONDCHARGEBACK("secondChargeback"),
    
    SECONDCHARGEBACKPENDING("secondChargebackPending"),
    
    UNDEFINED("undefined");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public Modification() { 
  }

  public Modification direction(String direction) {
    this.direction = direction;
    return this;
  }

   /**
   * The direction of the money movement.
   * @return direction
  **/
  @ApiModelProperty(value = "The direction of the money movement.")
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(String direction) {
    this.direction = direction;
  }


  public Modification id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Our reference for the modification.
   * @return id
  **/
  @ApiModelProperty(value = "Our reference for the modification.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Modification reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the modification, used internally within your platform.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the modification, used internally within your platform.")
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


  public Modification status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the transfer event.
   * @return status
  **/
  @ApiModelProperty(value = "The status of the transfer event.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Modification type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of transfer modification.
   * @return type
  **/
  @ApiModelProperty(value = "The type of transfer modification.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this Modification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Modification modification = (Modification) o;
    return Objects.equals(this.direction, modification.direction) &&
        Objects.equals(this.id, modification.id) &&
        Objects.equals(this.reference, modification.reference) &&
        Objects.equals(this.status, modification.status) &&
        Objects.equals(this.type, modification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, id, reference, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Modification {\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
   * Create an instance of Modification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Modification
   * @throws JsonProcessingException if the JSON string is invalid with respect to Modification
   */
  public static Modification fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Modification.class);
  }
/**
  * Convert an instance of Modification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

