/*
 * Classic Platforms - Notifications
 *
 * The version of the OpenAPI document: 6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.marketpaywebhooks;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.marketpaywebhooks.AccountEvent;
import com.adyen.model.marketpaywebhooks.AccountPayoutState;
import com.adyen.model.marketpaywebhooks.AccountProcessingState;
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
 * AccountHolderStatus
 */
@JsonPropertyOrder({
  AccountHolderStatus.JSON_PROPERTY_EVENTS,
  AccountHolderStatus.JSON_PROPERTY_PAYOUT_STATE,
  AccountHolderStatus.JSON_PROPERTY_PROCESSING_STATE,
  AccountHolderStatus.JSON_PROPERTY_STATUS,
  AccountHolderStatus.JSON_PROPERTY_STATUS_REASON
})

public class AccountHolderStatus {
  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<AccountEvent> events = null;

  public static final String JSON_PROPERTY_PAYOUT_STATE = "payoutState";
  private AccountPayoutState payoutState;

  public static final String JSON_PROPERTY_PROCESSING_STATE = "processingState";
  private AccountProcessingState processingState;

  /**
   * The status of the account holder. &gt;Permitted values: &#x60;Active&#x60;, &#x60;Inactive&#x60;, &#x60;Suspended&#x60;, &#x60;Closed&#x60;.
   */
  public enum StatusEnum {
    ACTIVE("Active"),
    
    CLOSED("Closed"),
    
    INACTIVE("Inactive"),
    
    SUSPENDED("Suspended");

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

  public static final String JSON_PROPERTY_STATUS_REASON = "statusReason";
  private String statusReason;

  public AccountHolderStatus() { 
  }

  public AccountHolderStatus events(List<AccountEvent> events) {
    this.events = events;
    return this;
  }

  public AccountHolderStatus addEventsItem(AccountEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * A list of events scheduled for the account holder.
   * @return events
  **/
  @ApiModelProperty(value = "A list of events scheduled for the account holder.")
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccountEvent> getEvents() {
    return events;
  }


  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvents(List<AccountEvent> events) {
    this.events = events;
  }


  public AccountHolderStatus payoutState(AccountPayoutState payoutState) {
    this.payoutState = payoutState;
    return this;
  }

   /**
   * Get payoutState
   * @return payoutState
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYOUT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountPayoutState getPayoutState() {
    return payoutState;
  }


  @JsonProperty(JSON_PROPERTY_PAYOUT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayoutState(AccountPayoutState payoutState) {
    this.payoutState = payoutState;
  }


  public AccountHolderStatus processingState(AccountProcessingState processingState) {
    this.processingState = processingState;
    return this;
  }

   /**
   * Get processingState
   * @return processingState
  **/
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROCESSING_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountProcessingState getProcessingState() {
    return processingState;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSING_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessingState(AccountProcessingState processingState) {
    this.processingState = processingState;
  }


  public AccountHolderStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the account holder. &gt;Permitted values: &#x60;Active&#x60;, &#x60;Inactive&#x60;, &#x60;Suspended&#x60;, &#x60;Closed&#x60;.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the account holder. >Permitted values: `Active`, `Inactive`, `Suspended`, `Closed`.")
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


  public AccountHolderStatus statusReason(String statusReason) {
    this.statusReason = statusReason;
    return this;
  }

   /**
   * The reason why the status was assigned to the account holder.
   * @return statusReason
  **/
  @ApiModelProperty(value = "The reason why the status was assigned to the account holder.")
  @JsonProperty(JSON_PROPERTY_STATUS_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatusReason() {
    return statusReason;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }


  /**
   * Return true if this AccountHolderStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountHolderStatus accountHolderStatus = (AccountHolderStatus) o;
    return Objects.equals(this.events, accountHolderStatus.events) &&
        Objects.equals(this.payoutState, accountHolderStatus.payoutState) &&
        Objects.equals(this.processingState, accountHolderStatus.processingState) &&
        Objects.equals(this.status, accountHolderStatus.status) &&
        Objects.equals(this.statusReason, accountHolderStatus.statusReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, payoutState, processingState, status, statusReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountHolderStatus {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    payoutState: ").append(toIndentedString(payoutState)).append("\n");
    sb.append("    processingState: ").append(toIndentedString(processingState)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
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
   * Create an instance of AccountHolderStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountHolderStatus
   * @throws JsonProcessingException if the JSON string is invalid with respect to AccountHolderStatus
   */
  public static AccountHolderStatus fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AccountHolderStatus.class);
  }
/**
  * Convert an instance of AccountHolderStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
