/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

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
 * IbanAccountIdentification
 */
@JsonPropertyOrder({
  IbanAccountIdentification.JSON_PROPERTY_IBAN,
  IbanAccountIdentification.JSON_PROPERTY_TYPE
})

public class IbanAccountIdentification {
  public static final String JSON_PROPERTY_IBAN = "iban";
  private String iban;

  /**
   * **iban**
   */
  public enum TypeEnum {
    IBAN("iban");

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
  private TypeEnum type = TypeEnum.IBAN;

  public IbanAccountIdentification() { 
  }

  public IbanAccountIdentification iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * The international bank account number as defined in the [ISO-13616](https://www.iso.org/standard/81090.html) standard.
   * @return iban
  **/
  @ApiModelProperty(required = true, value = "The international bank account number as defined in the [ISO-13616](https://www.iso.org/standard/81090.html) standard.")
  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIban() {
    return iban;
  }


  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIban(String iban) {
    this.iban = iban;
  }


  public IbanAccountIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **iban**
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**iban**")
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
   * Return true if this IbanAccountIdentification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IbanAccountIdentification ibanAccountIdentification = (IbanAccountIdentification) o;
    return Objects.equals(this.iban, ibanAccountIdentification.iban) &&
        Objects.equals(this.type, ibanAccountIdentification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IbanAccountIdentification {\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
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
   * Create an instance of IbanAccountIdentification given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IbanAccountIdentification
   * @throws JsonProcessingException if the JSON string is invalid with respect to IbanAccountIdentification
   */
  public static IbanAccountIdentification fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, IbanAccountIdentification.class);
  }
/**
  * Convert an instance of IbanAccountIdentification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

