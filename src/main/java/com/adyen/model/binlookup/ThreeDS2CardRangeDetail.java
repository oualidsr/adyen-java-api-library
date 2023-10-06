/*
 * Adyen BinLookup API
 * The BIN Lookup API provides endpoints for retrieving information, such as cost estimates, and 3D Secure supported version based on a given BIN.  ## Authentication You need an [API credential](https://docs.adyen.com/development-resources/api-credentials) to authenticate to the API.  If using an API key, add an `X-API-Key` header with the API key as the value, for example:   ``` curl -H \"Content-Type: application/json\" \\ -H \"X-API-Key: YOUR_API_KEY\" \\ ... ```  Alternatively, you can use the username and password to connect to the API using basic authentication, for example:  ``` curl -U \"ws@Company.YOUR_COMPANY_ACCOUNT\":\"YOUR_BASIC_AUTHENTICATION_PASSWORD\" \\ -H \"Content-Type: application/json\" \\ ... ```  ## Versioning The BinLookup API supports [versioning](https://docs.adyen.com/development-resources/versioning) using a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://pal-test.adyen.com/pal/servlet/BinLookup/v54/get3dsAvailability ```## Going live  To authneticate to the live endpoints, you need an [API credential](https://docs.adyen.com/development-resources/api-credentials) from your live Customer Area.  The live endpoint URLs contain a prefix which is unique to your company account: ```  https://{PREFIX}-pal-live.adyenpayments.com/pal/servlet/BinLookup/v54/get3dsAvailability ```  Get your `{PREFIX}` from your live Customer Area under **Developers** > **API URLs** > **Prefix**.
 *
 * The version of the OpenAPI document: 54
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.binlookup;

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
 * ThreeDS2CardRangeDetail
 */
@JsonPropertyOrder({
  ThreeDS2CardRangeDetail.JSON_PROPERTY_ACS_INFO_IND,
  ThreeDS2CardRangeDetail.JSON_PROPERTY_BRAND_CODE,
  ThreeDS2CardRangeDetail.JSON_PROPERTY_END_RANGE,
  ThreeDS2CardRangeDetail.JSON_PROPERTY_START_RANGE,
  ThreeDS2CardRangeDetail.JSON_PROPERTY_THREE_D_S2_VERSIONS,
  ThreeDS2CardRangeDetail.JSON_PROPERTY_THREE_D_S_METHOD_U_R_L
})

public class ThreeDS2CardRangeDetail {
  public static final String JSON_PROPERTY_ACS_INFO_IND = "acsInfoInd";
  private List<String> acsInfoInd = null;

  public static final String JSON_PROPERTY_BRAND_CODE = "brandCode";
  private String brandCode;

  public static final String JSON_PROPERTY_END_RANGE = "endRange";
  private String endRange;

  public static final String JSON_PROPERTY_START_RANGE = "startRange";
  private String startRange;

  public static final String JSON_PROPERTY_THREE_D_S2_VERSIONS = "threeDS2Versions";
  private List<String> threeDS2Versions = null;

  public static final String JSON_PROPERTY_THREE_D_S_METHOD_U_R_L = "threeDSMethodURL";
  private String threeDSMethodURL;

  public ThreeDS2CardRangeDetail() { 
  }

  public ThreeDS2CardRangeDetail acsInfoInd(List<String> acsInfoInd) {
    this.acsInfoInd = acsInfoInd;
    return this;
  }

  public ThreeDS2CardRangeDetail addAcsInfoIndItem(String acsInfoIndItem) {
    if (this.acsInfoInd == null) {
      this.acsInfoInd = new ArrayList<>();
    }
    this.acsInfoInd.add(acsInfoIndItem);
    return this;
  }

   /**
   * Provides additional information to the 3DS Server. Possible values: - 01 (Authentication is available at ACS) - 02 (Attempts supported by ACS or DS) - 03 (Decoupled authentication supported) - 04 (Whitelisting supported)
   * @return acsInfoInd
  **/
  @ApiModelProperty(value = "Provides additional information to the 3DS Server. Possible values: - 01 (Authentication is available at ACS) - 02 (Attempts supported by ACS or DS) - 03 (Decoupled authentication supported) - 04 (Whitelisting supported)")
  @JsonProperty(JSON_PROPERTY_ACS_INFO_IND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAcsInfoInd() {
    return acsInfoInd;
  }


  @JsonProperty(JSON_PROPERTY_ACS_INFO_IND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcsInfoInd(List<String> acsInfoInd) {
    this.acsInfoInd = acsInfoInd;
  }


  public ThreeDS2CardRangeDetail brandCode(String brandCode) {
    this.brandCode = brandCode;
    return this;
  }

   /**
   * Card brand.
   * @return brandCode
  **/
  @ApiModelProperty(value = "Card brand.")
  @JsonProperty(JSON_PROPERTY_BRAND_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBrandCode() {
    return brandCode;
  }


  @JsonProperty(JSON_PROPERTY_BRAND_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBrandCode(String brandCode) {
    this.brandCode = brandCode;
  }


  public ThreeDS2CardRangeDetail endRange(String endRange) {
    this.endRange = endRange;
    return this;
  }

   /**
   * BIN end range.
   * @return endRange
  **/
  @ApiModelProperty(value = "BIN end range.")
  @JsonProperty(JSON_PROPERTY_END_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndRange() {
    return endRange;
  }


  @JsonProperty(JSON_PROPERTY_END_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndRange(String endRange) {
    this.endRange = endRange;
  }


  public ThreeDS2CardRangeDetail startRange(String startRange) {
    this.startRange = startRange;
    return this;
  }

   /**
   * BIN start range.
   * @return startRange
  **/
  @ApiModelProperty(value = "BIN start range.")
  @JsonProperty(JSON_PROPERTY_START_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartRange() {
    return startRange;
  }


  @JsonProperty(JSON_PROPERTY_START_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartRange(String startRange) {
    this.startRange = startRange;
  }


  public ThreeDS2CardRangeDetail threeDS2Versions(List<String> threeDS2Versions) {
    this.threeDS2Versions = threeDS2Versions;
    return this;
  }

  public ThreeDS2CardRangeDetail addThreeDS2VersionsItem(String threeDS2VersionsItem) {
    if (this.threeDS2Versions == null) {
      this.threeDS2Versions = new ArrayList<>();
    }
    this.threeDS2Versions.add(threeDS2VersionsItem);
    return this;
  }

   /**
   * Supported 3D Secure protocol versions
   * @return threeDS2Versions
  **/
  @ApiModelProperty(value = "Supported 3D Secure protocol versions")
  @JsonProperty(JSON_PROPERTY_THREE_D_S2_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getThreeDS2Versions() {
    return threeDS2Versions;
  }


  @JsonProperty(JSON_PROPERTY_THREE_D_S2_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDS2Versions(List<String> threeDS2Versions) {
    this.threeDS2Versions = threeDS2Versions;
  }


  public ThreeDS2CardRangeDetail threeDSMethodURL(String threeDSMethodURL) {
    this.threeDSMethodURL = threeDSMethodURL;
    return this;
  }

   /**
   * In a 3D Secure 2 browser-based flow, this is the URL where you should send the device fingerprint to.
   * @return threeDSMethodURL
  **/
  @ApiModelProperty(value = "In a 3D Secure 2 browser-based flow, this is the URL where you should send the device fingerprint to.")
  @JsonProperty(JSON_PROPERTY_THREE_D_S_METHOD_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreeDSMethodURL() {
    return threeDSMethodURL;
  }


  @JsonProperty(JSON_PROPERTY_THREE_D_S_METHOD_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSMethodURL(String threeDSMethodURL) {
    this.threeDSMethodURL = threeDSMethodURL;
  }


  /**
   * Return true if this ThreeDS2CardRangeDetail object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDS2CardRangeDetail threeDS2CardRangeDetail = (ThreeDS2CardRangeDetail) o;
    return Objects.equals(this.acsInfoInd, threeDS2CardRangeDetail.acsInfoInd) &&
        Objects.equals(this.brandCode, threeDS2CardRangeDetail.brandCode) &&
        Objects.equals(this.endRange, threeDS2CardRangeDetail.endRange) &&
        Objects.equals(this.startRange, threeDS2CardRangeDetail.startRange) &&
        Objects.equals(this.threeDS2Versions, threeDS2CardRangeDetail.threeDS2Versions) &&
        Objects.equals(this.threeDSMethodURL, threeDS2CardRangeDetail.threeDSMethodURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acsInfoInd, brandCode, endRange, startRange, threeDS2Versions, threeDSMethodURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDS2CardRangeDetail {\n");
    sb.append("    acsInfoInd: ").append(toIndentedString(acsInfoInd)).append("\n");
    sb.append("    brandCode: ").append(toIndentedString(brandCode)).append("\n");
    sb.append("    endRange: ").append(toIndentedString(endRange)).append("\n");
    sb.append("    startRange: ").append(toIndentedString(startRange)).append("\n");
    sb.append("    threeDS2Versions: ").append(toIndentedString(threeDS2Versions)).append("\n");
    sb.append("    threeDSMethodURL: ").append(toIndentedString(threeDSMethodURL)).append("\n");
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
   * Create an instance of ThreeDS2CardRangeDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ThreeDS2CardRangeDetail
   * @throws JsonProcessingException if the JSON string is invalid with respect to ThreeDS2CardRangeDetail
   */
  public static ThreeDS2CardRangeDetail fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, ThreeDS2CardRangeDetail.class);
  }
/**
  * Convert an instance of ThreeDS2CardRangeDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

