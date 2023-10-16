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
import com.adyen.model.marketpaywebhooks.ErrorFieldType;
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
 * AccountHolderStoreStatusChangeNotificationContent
 */
@JsonPropertyOrder({
  AccountHolderStoreStatusChangeNotificationContent.JSON_PROPERTY_ACCOUNT_HOLDER_CODE,
  AccountHolderStoreStatusChangeNotificationContent.JSON_PROPERTY_INVALID_FIELDS,
  AccountHolderStoreStatusChangeNotificationContent.JSON_PROPERTY_NEW_STATUS,
  AccountHolderStoreStatusChangeNotificationContent.JSON_PROPERTY_OLD_STATUS,
  AccountHolderStoreStatusChangeNotificationContent.JSON_PROPERTY_REASON,
  AccountHolderStoreStatusChangeNotificationContent.JSON_PROPERTY_STORE,
  AccountHolderStoreStatusChangeNotificationContent.JSON_PROPERTY_STORE_REFERENCE
})

public class AccountHolderStoreStatusChangeNotificationContent {
  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_CODE = "accountHolderCode";
  private String accountHolderCode;

  public static final String JSON_PROPERTY_INVALID_FIELDS = "invalidFields";
  private List<ErrorFieldType> invalidFields = null;

  /**
   * The new status of the account holder.
   */
  public enum NewStatusEnum {
    ACTIVE("Active"),
    
    CLOSED("Closed"),
    
    INACTIVE("Inactive"),
    
    INACTIVEWITHMODIFICATIONS("InactiveWithModifications"),
    
    PENDING("Pending");

    private String value;

    NewStatusEnum(String value) {
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
    public static NewStatusEnum fromValue(String value) {
      for (NewStatusEnum b : NewStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NEW_STATUS = "newStatus";
  private NewStatusEnum newStatus;

  /**
   * The former status of the account holder.
   */
  public enum OldStatusEnum {
    ACTIVE("Active"),
    
    CLOSED("Closed"),
    
    INACTIVE("Inactive"),
    
    INACTIVEWITHMODIFICATIONS("InactiveWithModifications"),
    
    PENDING("Pending");

    private String value;

    OldStatusEnum(String value) {
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
    public static OldStatusEnum fromValue(String value) {
      for (OldStatusEnum b : OldStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OLD_STATUS = "oldStatus";
  private OldStatusEnum oldStatus;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_STORE = "store";
  private String store;

  public static final String JSON_PROPERTY_STORE_REFERENCE = "storeReference";
  private String storeReference;

  public AccountHolderStoreStatusChangeNotificationContent() { 
  }

  public AccountHolderStoreStatusChangeNotificationContent accountHolderCode(String accountHolderCode) {
    this.accountHolderCode = accountHolderCode;
    return this;
  }

   /**
   * The code of the account holder.
   * @return accountHolderCode
  **/
  @ApiModelProperty(required = true, value = "The code of the account holder.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountHolderCode() {
    return accountHolderCode;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountHolderCode(String accountHolderCode) {
    this.accountHolderCode = accountHolderCode;
  }


  public AccountHolderStoreStatusChangeNotificationContent invalidFields(List<ErrorFieldType> invalidFields) {
    this.invalidFields = invalidFields;
    return this;
  }

  public AccountHolderStoreStatusChangeNotificationContent addInvalidFieldsItem(ErrorFieldType invalidFieldsItem) {
    if (this.invalidFields == null) {
      this.invalidFields = new ArrayList<>();
    }
    this.invalidFields.add(invalidFieldsItem);
    return this;
  }

   /**
   * In case the store status has not been updated, contains fields that did not pass the validation.
   * @return invalidFields
  **/
  @ApiModelProperty(value = "In case the store status has not been updated, contains fields that did not pass the validation.")
  @JsonProperty(JSON_PROPERTY_INVALID_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ErrorFieldType> getInvalidFields() {
    return invalidFields;
  }


  @JsonProperty(JSON_PROPERTY_INVALID_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvalidFields(List<ErrorFieldType> invalidFields) {
    this.invalidFields = invalidFields;
  }


  public AccountHolderStoreStatusChangeNotificationContent newStatus(NewStatusEnum newStatus) {
    this.newStatus = newStatus;
    return this;
  }

   /**
   * The new status of the account holder.
   * @return newStatus
  **/
  @ApiModelProperty(required = true, value = "The new status of the account holder.")
  @JsonProperty(JSON_PROPERTY_NEW_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NewStatusEnum getNewStatus() {
    return newStatus;
  }


  @JsonProperty(JSON_PROPERTY_NEW_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewStatus(NewStatusEnum newStatus) {
    this.newStatus = newStatus;
  }


  public AccountHolderStoreStatusChangeNotificationContent oldStatus(OldStatusEnum oldStatus) {
    this.oldStatus = oldStatus;
    return this;
  }

   /**
   * The former status of the account holder.
   * @return oldStatus
  **/
  @ApiModelProperty(required = true, value = "The former status of the account holder.")
  @JsonProperty(JSON_PROPERTY_OLD_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OldStatusEnum getOldStatus() {
    return oldStatus;
  }


  @JsonProperty(JSON_PROPERTY_OLD_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOldStatus(OldStatusEnum oldStatus) {
    this.oldStatus = oldStatus;
  }


  public AccountHolderStoreStatusChangeNotificationContent reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason for the status change.
   * @return reason
  **/
  @ApiModelProperty(value = "The reason for the status change.")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(String reason) {
    this.reason = reason;
  }


  public AccountHolderStoreStatusChangeNotificationContent store(String store) {
    this.store = store;
    return this;
  }

   /**
   * Alphanumeric identifier of the store.
   * @return store
  **/
  @ApiModelProperty(required = true, value = "Alphanumeric identifier of the store.")
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


  public AccountHolderStoreStatusChangeNotificationContent storeReference(String storeReference) {
    this.storeReference = storeReference;
    return this;
  }

   /**
   * Store store reference.
   * @return storeReference
  **/
  @ApiModelProperty(required = true, value = "Store store reference.")
  @JsonProperty(JSON_PROPERTY_STORE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoreReference() {
    return storeReference;
  }


  @JsonProperty(JSON_PROPERTY_STORE_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoreReference(String storeReference) {
    this.storeReference = storeReference;
  }


  /**
   * Return true if this AccountHolderStoreStatusChangeNotificationContent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountHolderStoreStatusChangeNotificationContent accountHolderStoreStatusChangeNotificationContent = (AccountHolderStoreStatusChangeNotificationContent) o;
    return Objects.equals(this.accountHolderCode, accountHolderStoreStatusChangeNotificationContent.accountHolderCode) &&
        Objects.equals(this.invalidFields, accountHolderStoreStatusChangeNotificationContent.invalidFields) &&
        Objects.equals(this.newStatus, accountHolderStoreStatusChangeNotificationContent.newStatus) &&
        Objects.equals(this.oldStatus, accountHolderStoreStatusChangeNotificationContent.oldStatus) &&
        Objects.equals(this.reason, accountHolderStoreStatusChangeNotificationContent.reason) &&
        Objects.equals(this.store, accountHolderStoreStatusChangeNotificationContent.store) &&
        Objects.equals(this.storeReference, accountHolderStoreStatusChangeNotificationContent.storeReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountHolderCode, invalidFields, newStatus, oldStatus, reason, store, storeReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountHolderStoreStatusChangeNotificationContent {\n");
    sb.append("    accountHolderCode: ").append(toIndentedString(accountHolderCode)).append("\n");
    sb.append("    invalidFields: ").append(toIndentedString(invalidFields)).append("\n");
    sb.append("    newStatus: ").append(toIndentedString(newStatus)).append("\n");
    sb.append("    oldStatus: ").append(toIndentedString(oldStatus)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    storeReference: ").append(toIndentedString(storeReference)).append("\n");
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
   * Create an instance of AccountHolderStoreStatusChangeNotificationContent given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AccountHolderStoreStatusChangeNotificationContent
   * @throws JsonProcessingException if the JSON string is invalid with respect to AccountHolderStoreStatusChangeNotificationContent
   */
  public static AccountHolderStoreStatusChangeNotificationContent fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AccountHolderStoreStatusChangeNotificationContent.class);
  }
/**
  * Convert an instance of AccountHolderStoreStatusChangeNotificationContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}
