/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.adyen.model.management.Name;
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
 * CreateMerchantUserRequest
 */
@JsonPropertyOrder({
  CreateMerchantUserRequest.JSON_PROPERTY_ACCOUNT_GROUPS,
  CreateMerchantUserRequest.JSON_PROPERTY_EMAIL,
  CreateMerchantUserRequest.JSON_PROPERTY_NAME,
  CreateMerchantUserRequest.JSON_PROPERTY_ROLES,
  CreateMerchantUserRequest.JSON_PROPERTY_TIME_ZONE_CODE,
  CreateMerchantUserRequest.JSON_PROPERTY_USERNAME
})

public class CreateMerchantUserRequest {
  public static final String JSON_PROPERTY_ACCOUNT_GROUPS = "accountGroups";
  private List<String> accountGroups = null;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private Name name;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private List<String> roles = null;

  public static final String JSON_PROPERTY_TIME_ZONE_CODE = "timeZoneCode";
  private String timeZoneCode;

  public static final String JSON_PROPERTY_USERNAME = "username";
  private String username;

  public CreateMerchantUserRequest() { 
  }

  public CreateMerchantUserRequest accountGroups(List<String> accountGroups) {
    this.accountGroups = accountGroups;
    return this;
  }

  public CreateMerchantUserRequest addAccountGroupsItem(String accountGroupsItem) {
    if (this.accountGroups == null) {
      this.accountGroups = new ArrayList<>();
    }
    this.accountGroups.add(accountGroupsItem);
    return this;
  }

   /**
   * The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user.
   * @return accountGroups
  **/
  @ApiModelProperty(value = "The list of [account groups](https://docs.adyen.com/account/account-structure#account-groups) associated with this user.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAccountGroups() {
    return accountGroups;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountGroups(List<String> accountGroups) {
    this.accountGroups = accountGroups;
  }


  public CreateMerchantUserRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the user.
   * @return email
  **/
  @ApiModelProperty(required = true, value = "The email address of the user.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public CreateMerchantUserRequest name(Name name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Name getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(Name name) {
    this.name = name;
  }


  public CreateMerchantUserRequest roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public CreateMerchantUserRequest addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * The list of [roles](https://docs.adyen.com/account/user-roles) for this user.
   * @return roles
  **/
  @ApiModelProperty(value = "The list of [roles](https://docs.adyen.com/account/user-roles) for this user.")
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRoles() {
    return roles;
  }


  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(List<String> roles) {
    this.roles = roles;
  }


  public CreateMerchantUserRequest timeZoneCode(String timeZoneCode) {
    this.timeZoneCode = timeZoneCode;
    return this;
  }

   /**
   * The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.
   * @return timeZoneCode
  **/
  @ApiModelProperty(value = "The [tz database name](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones) of the time zone of the user. For example, **Europe/Amsterdam**.")
  @JsonProperty(JSON_PROPERTY_TIME_ZONE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZoneCode() {
    return timeZoneCode;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ZONE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZoneCode(String timeZoneCode) {
    this.timeZoneCode = timeZoneCode;
  }


  public CreateMerchantUserRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The user&#39;s email address that will be their username. Must be the same as the one in the &#x60;email&#x60; field.
   * @return username
  **/
  @ApiModelProperty(required = true, value = "The user's email address that will be their username. Must be the same as the one in the `email` field.")
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * Return true if this CreateMerchantUserRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMerchantUserRequest createMerchantUserRequest = (CreateMerchantUserRequest) o;
    return Objects.equals(this.accountGroups, createMerchantUserRequest.accountGroups) &&
        Objects.equals(this.email, createMerchantUserRequest.email) &&
        Objects.equals(this.name, createMerchantUserRequest.name) &&
        Objects.equals(this.roles, createMerchantUserRequest.roles) &&
        Objects.equals(this.timeZoneCode, createMerchantUserRequest.timeZoneCode) &&
        Objects.equals(this.username, createMerchantUserRequest.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountGroups, email, name, roles, timeZoneCode, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMerchantUserRequest {\n");
    sb.append("    accountGroups: ").append(toIndentedString(accountGroups)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    timeZoneCode: ").append(toIndentedString(timeZoneCode)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
   * Create an instance of CreateMerchantUserRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateMerchantUserRequest
   * @throws JsonProcessingException if the JSON string is invalid with respect to CreateMerchantUserRequest
   */
  public static CreateMerchantUserRequest fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, CreateMerchantUserRequest.class);
  }
/**
  * Convert an instance of CreateMerchantUserRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

