/*
 * Adyen Terminal API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.terminal;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.terminal.InstalmentType;
import com.adyen.model.terminal.PeriodUnit;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * Instalment
 */
@JsonPropertyOrder({
  Instalment.JSON_PROPERTY_INSTALMENT_TYPE,
  Instalment.JSON_PROPERTY_SEQUENCE_NUMBER,
  Instalment.JSON_PROPERTY_PLAN_I_D,
  Instalment.JSON_PROPERTY_PERIOD,
  Instalment.JSON_PROPERTY_PERIOD_UNIT,
  Instalment.JSON_PROPERTY_FIRST_PAYMENT_DATE,
  Instalment.JSON_PROPERTY_TOTAL_NB_OF_PAYMENTS,
  Instalment.JSON_PROPERTY_CUMULATIVE_AMOUNT,
  Instalment.JSON_PROPERTY_FIRST_AMOUNT,
  Instalment.JSON_PROPERTY_CHARGES
})

public class Instalment {
  public static final String JSON_PROPERTY_INSTALMENT_TYPE = "InstalmentType";
  private InstalmentType instalmentType;

  public static final String JSON_PROPERTY_SEQUENCE_NUMBER = "SequenceNumber";
  private Integer sequenceNumber;

  public static final String JSON_PROPERTY_PLAN_I_D = "PlanID";
  private String planID;

  public static final String JSON_PROPERTY_PERIOD = "Period";
  private Integer period;

  public static final String JSON_PROPERTY_PERIOD_UNIT = "PeriodUnit";
  private PeriodUnit periodUnit;

  public static final String JSON_PROPERTY_FIRST_PAYMENT_DATE = "FirstPaymentDate";
  private LocalDate firstPaymentDate;

  public static final String JSON_PROPERTY_TOTAL_NB_OF_PAYMENTS = "TotalNbOfPayments";
  private Integer totalNbOfPayments;

  public static final String JSON_PROPERTY_CUMULATIVE_AMOUNT = "CumulativeAmount";
  private BigDecimal cumulativeAmount;

  public static final String JSON_PROPERTY_FIRST_AMOUNT = "FirstAmount";
  private BigDecimal firstAmount;

  public static final String JSON_PROPERTY_CHARGES = "Charges";
  private BigDecimal charges;

  public Instalment() { 
  }

  public Instalment instalmentType(InstalmentType instalmentType) {
    this.instalmentType = instalmentType;
    return this;
  }

   /**
   * Get instalmentType
   * @return instalmentType
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTALMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InstalmentType getInstalmentType() {
    return instalmentType;
  }


 /**
  * instalmentType
  *
  * @param instalmentType
  */ 
  @JsonProperty(JSON_PROPERTY_INSTALMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstalmentType(InstalmentType instalmentType) {
    this.instalmentType = instalmentType;
  }


  public Instalment sequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * Get sequenceNumber
   * @return sequenceNumber
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEQUENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSequenceNumber() {
    return sequenceNumber;
  }


 /**
  * sequenceNumber
  *
  * @param sequenceNumber
  */ 
  @JsonProperty(JSON_PROPERTY_SEQUENCE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  public Instalment planID(String planID) {
    this.planID = planID;
    return this;
  }

   /**
   * Get planID
   * @return planID
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAN_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlanID() {
    return planID;
  }


 /**
  * planID
  *
  * @param planID
  */ 
  @JsonProperty(JSON_PROPERTY_PLAN_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanID(String planID) {
    this.planID = planID;
  }


  public Instalment period(Integer period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPeriod() {
    return period;
  }


 /**
  * period
  *
  * @param period
  */ 
  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriod(Integer period) {
    this.period = period;
  }


  public Instalment periodUnit(PeriodUnit periodUnit) {
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * Get periodUnit
   * @return periodUnit
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERIOD_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PeriodUnit getPeriodUnit() {
    return periodUnit;
  }


 /**
  * periodUnit
  *
  * @param periodUnit
  */ 
  @JsonProperty(JSON_PROPERTY_PERIOD_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodUnit(PeriodUnit periodUnit) {
    this.periodUnit = periodUnit;
  }


  public Instalment firstPaymentDate(LocalDate firstPaymentDate) {
    this.firstPaymentDate = firstPaymentDate;
    return this;
  }

   /**
   * Get firstPaymentDate
   * @return firstPaymentDate
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_PAYMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getFirstPaymentDate() {
    return firstPaymentDate;
  }


 /**
  * firstPaymentDate
  *
  * @param firstPaymentDate
  */ 
  @JsonProperty(JSON_PROPERTY_FIRST_PAYMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstPaymentDate(LocalDate firstPaymentDate) {
    this.firstPaymentDate = firstPaymentDate;
  }


  public Instalment totalNbOfPayments(Integer totalNbOfPayments) {
    this.totalNbOfPayments = totalNbOfPayments;
    return this;
  }

   /**
   * Get totalNbOfPayments
   * @return totalNbOfPayments
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_NB_OF_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalNbOfPayments() {
    return totalNbOfPayments;
  }


 /**
  * totalNbOfPayments
  *
  * @param totalNbOfPayments
  */ 
  @JsonProperty(JSON_PROPERTY_TOTAL_NB_OF_PAYMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalNbOfPayments(Integer totalNbOfPayments) {
    this.totalNbOfPayments = totalNbOfPayments;
  }


  public Instalment cumulativeAmount(BigDecimal cumulativeAmount) {
    this.cumulativeAmount = cumulativeAmount;
    return this;
  }

   /**
   * Get cumulativeAmount
   * minimum: 0.0
   * maximum: 99999999.999999
   * @return cumulativeAmount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUMULATIVE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCumulativeAmount() {
    return cumulativeAmount;
  }


 /**
  * cumulativeAmount
  *
  * @param cumulativeAmount
  */ 
  @JsonProperty(JSON_PROPERTY_CUMULATIVE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCumulativeAmount(BigDecimal cumulativeAmount) {
    this.cumulativeAmount = cumulativeAmount;
  }


  public Instalment firstAmount(BigDecimal firstAmount) {
    this.firstAmount = firstAmount;
    return this;
  }

   /**
   * Get firstAmount
   * minimum: 0.0
   * maximum: 99999999.999999
   * @return firstAmount
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFirstAmount() {
    return firstAmount;
  }


 /**
  * firstAmount
  *
  * @param firstAmount
  */ 
  @JsonProperty(JSON_PROPERTY_FIRST_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstAmount(BigDecimal firstAmount) {
    this.firstAmount = firstAmount;
  }


  public Instalment charges(BigDecimal charges) {
    this.charges = charges;
    return this;
  }

   /**
   * Get charges
   * minimum: 0.0
   * maximum: 99999999.999999
   * @return charges
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCharges() {
    return charges;
  }


 /**
  * charges
  *
  * @param charges
  */ 
  @JsonProperty(JSON_PROPERTY_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCharges(BigDecimal charges) {
    this.charges = charges;
  }


  /**
   * Return true if this Instalment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instalment instalment = (Instalment) o;
    return Objects.equals(this.instalmentType, instalment.instalmentType) &&
        Objects.equals(this.sequenceNumber, instalment.sequenceNumber) &&
        Objects.equals(this.planID, instalment.planID) &&
        Objects.equals(this.period, instalment.period) &&
        Objects.equals(this.periodUnit, instalment.periodUnit) &&
        Objects.equals(this.firstPaymentDate, instalment.firstPaymentDate) &&
        Objects.equals(this.totalNbOfPayments, instalment.totalNbOfPayments) &&
        Objects.equals(this.cumulativeAmount, instalment.cumulativeAmount) &&
        Objects.equals(this.firstAmount, instalment.firstAmount) &&
        Objects.equals(this.charges, instalment.charges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instalmentType, sequenceNumber, planID, period, periodUnit, firstPaymentDate, totalNbOfPayments, cumulativeAmount, firstAmount, charges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instalment {\n");
    sb.append("    instalmentType: ").append(toIndentedString(instalmentType)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    planID: ").append(toIndentedString(planID)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    firstPaymentDate: ").append(toIndentedString(firstPaymentDate)).append("\n");
    sb.append("    totalNbOfPayments: ").append(toIndentedString(totalNbOfPayments)).append("\n");
    sb.append("    cumulativeAmount: ").append(toIndentedString(cumulativeAmount)).append("\n");
    sb.append("    firstAmount: ").append(toIndentedString(firstAmount)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
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
   * Create an instance of Instalment given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Instalment
   * @throws JsonProcessingException if the JSON string is invalid with respect to Instalment
   */
  public static Instalment fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, Instalment.class);
  }
/**
  * Convert an instance of Instalment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

