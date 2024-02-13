/*
 * Configuration API
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.balanceplatform;

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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;


/**
 * CapabilityProblemEntityRecursive
 */
@JsonPropertyOrder({
  CapabilityProblemEntityRecursive.JSON_PROPERTY_DOCUMENTS,
  CapabilityProblemEntityRecursive.JSON_PROPERTY_ID,
  CapabilityProblemEntityRecursive.JSON_PROPERTY_TYPE
})
@JsonTypeName("CapabilityProblemEntity-recursive")

public class CapabilityProblemEntityRecursive {
  public static final String JSON_PROPERTY_DOCUMENTS = "documents";
  private List<String> documents = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * Type of entity.   Possible values: **LegalEntity**, **BankAccount**, **Document**.
   */
  public enum TypeEnum {
    BANKACCOUNT("BankAccount"),
    
    DOCUMENT("Document"),
    
    LEGALENTITY("LegalEntity");

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

  public CapabilityProblemEntityRecursive() { 
  }

  public CapabilityProblemEntityRecursive documents(List<String> documents) {
    this.documents = documents;
    return this;
  }

  public CapabilityProblemEntityRecursive addDocumentsItem(String documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * List of document IDs to which the verification errors related to the capabilities correspond to.
   * @return documents
  **/
  @ApiModelProperty(value = "List of document IDs to which the verification errors related to the capabilities correspond to.")
  @JsonProperty(JSON_PROPERTY_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDocuments() {
    return documents;
  }


 /**
  * List of document IDs to which the verification errors related to the capabilities correspond to.
  *
  * @param documents
  */ 
  @JsonProperty(JSON_PROPERTY_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocuments(List<String> documents) {
    this.documents = documents;
  }


  public CapabilityProblemEntityRecursive id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the entity.
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the entity.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


 /**
  * The ID of the entity.
  *
  * @param id
  */ 
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public CapabilityProblemEntityRecursive type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of entity.   Possible values: **LegalEntity**, **BankAccount**, **Document**.
   * @return type
  **/
  @ApiModelProperty(value = "Type of entity.   Possible values: **LegalEntity**, **BankAccount**, **Document**.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


 /**
  * Type of entity.   Possible values: **LegalEntity**, **BankAccount**, **Document**.
  *
  * @param type
  */ 
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this CapabilityProblemEntity-recursive object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapabilityProblemEntityRecursive capabilityProblemEntityRecursive = (CapabilityProblemEntityRecursive) o;
    return Objects.equals(this.documents, capabilityProblemEntityRecursive.documents) &&
        Objects.equals(this.id, capabilityProblemEntityRecursive.id) &&
        Objects.equals(this.type, capabilityProblemEntityRecursive.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapabilityProblemEntityRecursive {\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
   * Create an instance of CapabilityProblemEntityRecursive given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CapabilityProblemEntityRecursive
   * @throws JsonProcessingException if the JSON string is invalid with respect to CapabilityProblemEntityRecursive
   */
  public static CapabilityProblemEntityRecursive fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CapabilityProblemEntityRecursive.class);
  }
/**
  * Convert an instance of CapabilityProblemEntityRecursive to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

