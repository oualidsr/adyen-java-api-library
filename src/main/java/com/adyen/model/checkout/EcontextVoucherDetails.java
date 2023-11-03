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
 * EcontextVoucherDetails
 */
@JsonPropertyOrder({
  EcontextVoucherDetails.JSON_PROPERTY_CHECKOUT_ATTEMPT_ID,
  EcontextVoucherDetails.JSON_PROPERTY_FIRST_NAME,
  EcontextVoucherDetails.JSON_PROPERTY_LAST_NAME,
  EcontextVoucherDetails.JSON_PROPERTY_SHOPPER_EMAIL,
  EcontextVoucherDetails.JSON_PROPERTY_TELEPHONE_NUMBER,
  EcontextVoucherDetails.JSON_PROPERTY_TYPE
})

public class EcontextVoucherDetails {
  public static final String JSON_PROPERTY_CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";
  private String checkoutAttemptId;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_SHOPPER_EMAIL = "shopperEmail";
  private String shopperEmail;

  public static final String JSON_PROPERTY_TELEPHONE_NUMBER = "telephoneNumber";
  private String telephoneNumber;

  /**
   * **econtextvoucher**
   */
  public enum TypeEnum {
    SEVENELEVEN("econtext_seveneleven"),
    
    STORES("econtext_stores");

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

  public EcontextVoucherDetails() { 
  }

  public EcontextVoucherDetails checkoutAttemptId(String checkoutAttemptId) {
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


  public EcontextVoucherDetails firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The shopper&#39;s first name.
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "The shopper's first name.")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public EcontextVoucherDetails lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The shopper&#39;s last name.
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "The shopper's last name.")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public EcontextVoucherDetails shopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
    return this;
  }

   /**
   * The shopper&#39;s email.
   * @return shopperEmail
  **/
  @ApiModelProperty(required = true, value = "The shopper's email.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShopperEmail() {
    return shopperEmail;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }


  public EcontextVoucherDetails telephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
    return this;
  }

   /**
   * The shopper&#39;s contact number. It must have an international number format, for example **+31 20 779 1846**. Formats like **+31 (0)20 779 1846** or **0031 20 779 1846** are not accepted.
   * @return telephoneNumber
  **/
  @ApiModelProperty(required = true, value = "The shopper's contact number. It must have an international number format, for example **+31 20 779 1846**. Formats like **+31 (0)20 779 1846** or **0031 20 779 1846** are not accepted.")
  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTelephoneNumber() {
    return telephoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_TELEPHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }


  public EcontextVoucherDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **econtextvoucher**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**econtextvoucher**")
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
   * Return true if this EcontextVoucherDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EcontextVoucherDetails econtextVoucherDetails = (EcontextVoucherDetails) o;
    return Objects.equals(this.checkoutAttemptId, econtextVoucherDetails.checkoutAttemptId) &&
        Objects.equals(this.firstName, econtextVoucherDetails.firstName) &&
        Objects.equals(this.lastName, econtextVoucherDetails.lastName) &&
        Objects.equals(this.shopperEmail, econtextVoucherDetails.shopperEmail) &&
        Objects.equals(this.telephoneNumber, econtextVoucherDetails.telephoneNumber) &&
        Objects.equals(this.type, econtextVoucherDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutAttemptId, firstName, lastName, shopperEmail, telephoneNumber, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcontextVoucherDetails {\n");
    sb.append("    checkoutAttemptId: ").append(toIndentedString(checkoutAttemptId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
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
   * Create an instance of EcontextVoucherDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EcontextVoucherDetails
   * @throws JsonProcessingException if the JSON string is invalid with respect to EcontextVoucherDetails
   */
  public static EcontextVoucherDetails fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, EcontextVoucherDetails.class);
  }
/**
  * Convert an instance of EcontextVoucherDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

