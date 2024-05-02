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
 * SGLocalAccountIdentification
 */
@JsonPropertyOrder({
  SGLocalAccountIdentification.JSON_PROPERTY_ACCOUNT_NUMBER,
  SGLocalAccountIdentification.JSON_PROPERTY_BIC,
  SGLocalAccountIdentification.JSON_PROPERTY_TYPE
})

public class SGLocalAccountIdentification {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "accountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_BIC = "bic";
  private String bic;

  /**
   * **sgLocal**
   */
  public enum TypeEnum {
    SGLOCAL("sgLocal");

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

  public SGLocalAccountIdentification() { 
  }

  public SGLocalAccountIdentification accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The 4- to 19-digit bank account number, without separators or whitespace.
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "The 4- to 19-digit bank account number, without separators or whitespace.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountNumber() {
    return accountNumber;
  }


 /**
  * The 4- to 19-digit bank account number, without separators or whitespace.
  *
  * @param accountNumber
  */ 
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public SGLocalAccountIdentification bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * The bank&#39;s 8- or 11-character BIC or SWIFT code.
   * @return bic
  **/
  @ApiModelProperty(required = true, value = "The bank's 8- or 11-character BIC or SWIFT code.")
  @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBic() {
    return bic;
  }


 /**
  * The bank&#39;s 8- or 11-character BIC or SWIFT code.
  *
  * @param bic
  */ 
  @JsonProperty(JSON_PROPERTY_BIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBic(String bic) {
    this.bic = bic;
  }


  public SGLocalAccountIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **sgLocal**
   * @return type
  **/
  @ApiModelProperty(value = "**sgLocal**")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


 /**
  * **sgLocal**
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this SGLocalAccountIdentification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SGLocalAccountIdentification sgLocalAccountIdentification = (SGLocalAccountIdentification) o;
    return Objects.equals(this.accountNumber, sgLocalAccountIdentification.accountNumber) &&
        Objects.equals(this.bic, sgLocalAccountIdentification.bic) &&
        Objects.equals(this.type, sgLocalAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, bic, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SGLocalAccountIdentification {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
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
   * Create an instance of SGLocalAccountIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SGLocalAccountIdentification
   * @throws JsonProcessingException if the JSON string is invalid with respect to SGLocalAccountIdentification
   */
  public static SGLocalAccountIdentification fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, SGLocalAccountIdentification.class);
  }
/**
  * Convert an instance of SGLocalAccountIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

