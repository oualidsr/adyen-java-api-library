/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * 
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
 * AcceptTermsOfServiceResponse
 */
@JsonPropertyOrder({
  AcceptTermsOfServiceResponse.JSON_PROPERTY_ACCEPTED_BY,
  AcceptTermsOfServiceResponse.JSON_PROPERTY_ID,
  AcceptTermsOfServiceResponse.JSON_PROPERTY_IP_ADDRESS,
  AcceptTermsOfServiceResponse.JSON_PROPERTY_LANGUAGE,
  AcceptTermsOfServiceResponse.JSON_PROPERTY_TERMS_OF_SERVICE_DOCUMENT_ID,
  AcceptTermsOfServiceResponse.JSON_PROPERTY_TYPE
})

public class AcceptTermsOfServiceResponse {
  public static final String JSON_PROPERTY_ACCEPTED_BY = "acceptedBy";
  private String acceptedBy;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IP_ADDRESS = "ipAddress";
  private String ipAddress;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_TERMS_OF_SERVICE_DOCUMENT_ID = "termsOfServiceDocumentId";
  private String termsOfServiceDocumentId;

  /**
   * The type of Terms of Service.  Possible values: *  **adyenForPlatformsManage** *  **adyenIssuing** *  **adyenForPlatformsAdvanced** *  **adyenCapital** *  **adyenAccount** *  **adyenCard** *  **adyenFranchisee**  
   */
  public enum TypeEnum {
    ADYENACCOUNT("adyenAccount"),
    
    ADYENCAPITAL("adyenCapital"),
    
    ADYENCARD("adyenCard"),
    
    ADYENFORPLATFORMSADVANCED("adyenForPlatformsAdvanced"),
    
    ADYENFORPLATFORMSMANAGE("adyenForPlatformsManage"),
    
    ADYENFRANCHISEE("adyenFranchisee"),
    
    ADYENISSUING("adyenIssuing");

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

  public AcceptTermsOfServiceResponse() { 
  }

  public AcceptTermsOfServiceResponse acceptedBy(String acceptedBy) {
    this.acceptedBy = acceptedBy;
    return this;
  }

   /**
   * The unique identifier of the user that accepted the Terms of Service.
   * @return acceptedBy
  **/
  @ApiModelProperty(value = "The unique identifier of the user that accepted the Terms of Service.")
  @JsonProperty(JSON_PROPERTY_ACCEPTED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcceptedBy() {
    return acceptedBy;
  }


 /**
  * The unique identifier of the user that accepted the Terms of Service.
  *
  * @param acceptedBy
  */ 
  @JsonProperty(JSON_PROPERTY_ACCEPTED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcceptedBy(String acceptedBy) {
    this.acceptedBy = acceptedBy;
  }


  public AcceptTermsOfServiceResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the Terms of Service acceptance.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the Terms of Service acceptance.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


 /**
  * The unique identifier of the Terms of Service acceptance.
  *
  * @param id
  */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public AcceptTermsOfServiceResponse ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * The IP address of the user that accepted the Terms of Service.
   * @return ipAddress
  **/
  @ApiModelProperty(value = "The IP address of the user that accepted the Terms of Service.")
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIpAddress() {
    return ipAddress;
  }


 /**
  * The IP address of the user that accepted the Terms of Service.
  *
  * @param ipAddress
  */ 
  @JsonProperty(JSON_PROPERTY_IP_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public AcceptTermsOfServiceResponse language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The language used for the Terms of Service document, specified by the two-letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code. Possible value: **en** for English.
   * @return language
  **/
  @ApiModelProperty(value = "The language used for the Terms of Service document, specified by the two-letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code. Possible value: **en** for English.")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


 /**
  * The language used for the Terms of Service document, specified by the two-letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code. Possible value: **en** for English.
  *
  * @param language
  */ 
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public AcceptTermsOfServiceResponse termsOfServiceDocumentId(String termsOfServiceDocumentId) {
    this.termsOfServiceDocumentId = termsOfServiceDocumentId;
    return this;
  }

   /**
   * The unique identifier of the Terms of Service document.
   * @return termsOfServiceDocumentId
  **/
  @ApiModelProperty(value = "The unique identifier of the Terms of Service document.")
  @JsonProperty(JSON_PROPERTY_TERMS_OF_SERVICE_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTermsOfServiceDocumentId() {
    return termsOfServiceDocumentId;
  }


 /**
  * The unique identifier of the Terms of Service document.
  *
  * @param termsOfServiceDocumentId
  */ 
  @JsonProperty(JSON_PROPERTY_TERMS_OF_SERVICE_DOCUMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTermsOfServiceDocumentId(String termsOfServiceDocumentId) {
    this.termsOfServiceDocumentId = termsOfServiceDocumentId;
  }


  public AcceptTermsOfServiceResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of Terms of Service.  Possible values: *  **adyenForPlatformsManage** *  **adyenIssuing** *  **adyenForPlatformsAdvanced** *  **adyenCapital** *  **adyenAccount** *  **adyenCard** *  **adyenFranchisee**  
   * @return type
  **/
  @ApiModelProperty(value = "The type of Terms of Service.  Possible values: *  **adyenForPlatformsManage** *  **adyenIssuing** *  **adyenForPlatformsAdvanced** *  **adyenCapital** *  **adyenAccount** *  **adyenCard** *  **adyenFranchisee**  ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


 /**
  * The type of Terms of Service.  Possible values: *  **adyenForPlatformsManage** *  **adyenIssuing** *  **adyenForPlatformsAdvanced** *  **adyenCapital** *  **adyenAccount** *  **adyenCard** *  **adyenFranchisee**  
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this AcceptTermsOfServiceResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcceptTermsOfServiceResponse acceptTermsOfServiceResponse = (AcceptTermsOfServiceResponse) o;
    return Objects.equals(this.acceptedBy, acceptTermsOfServiceResponse.acceptedBy) &&
        Objects.equals(this.id, acceptTermsOfServiceResponse.id) &&
        Objects.equals(this.ipAddress, acceptTermsOfServiceResponse.ipAddress) &&
        Objects.equals(this.language, acceptTermsOfServiceResponse.language) &&
        Objects.equals(this.termsOfServiceDocumentId, acceptTermsOfServiceResponse.termsOfServiceDocumentId) &&
        Objects.equals(this.type, acceptTermsOfServiceResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedBy, id, ipAddress, language, termsOfServiceDocumentId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptTermsOfServiceResponse {\n");
    sb.append("    acceptedBy: ").append(toIndentedString(acceptedBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    termsOfServiceDocumentId: ").append(toIndentedString(termsOfServiceDocumentId)).append("\n");
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
   * Create an instance of AcceptTermsOfServiceResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AcceptTermsOfServiceResponse
   * @throws JsonProcessingException if the JSON string is invalid with respect to AcceptTermsOfServiceResponse
   */
  public static AcceptTermsOfServiceResponse fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AcceptTermsOfServiceResponse.class);
  }
/**
  * Convert an instance of AcceptTermsOfServiceResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

