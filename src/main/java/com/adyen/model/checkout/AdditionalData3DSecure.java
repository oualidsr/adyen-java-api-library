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
 * AdditionalData3DSecure
 */
@JsonPropertyOrder({
  AdditionalData3DSecure.JSON_PROPERTY_ALLOW3_D_S2,
  AdditionalData3DSecure.JSON_PROPERTY_CHALLENGE_WINDOW_SIZE,
  AdditionalData3DSecure.JSON_PROPERTY_EXECUTE_THREE_D,
  AdditionalData3DSecure.JSON_PROPERTY_MPI_IMPLEMENTATION_TYPE,
  AdditionalData3DSecure.JSON_PROPERTY_SCA_EXEMPTION,
  AdditionalData3DSecure.JSON_PROPERTY_THREE_D_S_VERSION
})

public class AdditionalData3DSecure {
  public static final String JSON_PROPERTY_ALLOW3_D_S2 = "allow3DS2";
  private String allow3DS2;

  /**
   * Dimensions of the 3DS2 challenge window to be displayed to the cardholder.  Possible values:  * **01** - size of 250x400  * **02** - size of 390x400 * **03** - size of 500x600 * **04** - size of 600x400 * **05** - Fullscreen
   */
  public enum ChallengeWindowSizeEnum {
    _01("01"),
    
    _02("02"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05");

    private String value;

    ChallengeWindowSizeEnum(String value) {
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
    public static ChallengeWindowSizeEnum fromValue(String value) {
      for (ChallengeWindowSizeEnum b : ChallengeWindowSizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CHALLENGE_WINDOW_SIZE = "challengeWindowSize";
  private ChallengeWindowSizeEnum challengeWindowSize;

  public static final String JSON_PROPERTY_EXECUTE_THREE_D = "executeThreeD";
  private String executeThreeD;

  public static final String JSON_PROPERTY_MPI_IMPLEMENTATION_TYPE = "mpiImplementationType";
  private String mpiImplementationType;

  public static final String JSON_PROPERTY_SCA_EXEMPTION = "scaExemption";
  private String scaExemption;

  public static final String JSON_PROPERTY_THREE_D_S_VERSION = "threeDSVersion";
  private String threeDSVersion;

  public AdditionalData3DSecure() { 
  }

  public AdditionalData3DSecure allow3DS2(String allow3DS2) {
    this.allow3DS2 = allow3DS2;
    return this;
  }

   /**
   * Indicates if you are able to process 3D Secure 2 transactions natively on your payment page. Send this parameter when you are using &#x60;/payments&#x60; endpoint with any of our [native 3D Secure 2 solutions](https://docs.adyen.com/online-payments/3d-secure/native-3ds2).   &gt; This parameter only indicates readiness to support native 3D Secure 2 authentication. To specify if you _want_ to perform 3D Secure, use [Dynamic 3D Secure](/risk-management/dynamic-3d-secure) or send the &#x60;executeThreeD&#x60; parameter.  Possible values: * **true** - Ready to support native 3D Secure 2 authentication. Setting this to true does not mean always applying 3D Secure 2. Adyen still selects the version of 3D Secure based on configuration to optimize authorisation rates and improve the shopper&#39;s experience. * **false** – Not ready to support native 3D Secure 2 authentication. Adyen will not offer 3D Secure 2 to your shopper regardless of your configuration. 
   * @return allow3DS2
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "Indicates if you are able to process 3D Secure 2 transactions natively on your payment page. Send this parameter when you are using `/payments` endpoint with any of our [native 3D Secure 2 solutions](https://docs.adyen.com/online-payments/3d-secure/native-3ds2).   > This parameter only indicates readiness to support native 3D Secure 2 authentication. To specify if you _want_ to perform 3D Secure, use [Dynamic 3D Secure](/risk-management/dynamic-3d-secure) or send the `executeThreeD` parameter.  Possible values: * **true** - Ready to support native 3D Secure 2 authentication. Setting this to true does not mean always applying 3D Secure 2. Adyen still selects the version of 3D Secure based on configuration to optimize authorisation rates and improve the shopper's experience. * **false** – Not ready to support native 3D Secure 2 authentication. Adyen will not offer 3D Secure 2 to your shopper regardless of your configuration. ")
  @JsonProperty(JSON_PROPERTY_ALLOW3_D_S2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAllow3DS2() {
    return allow3DS2;
  }


 /**
  * Indicates if you are able to process 3D Secure 2 transactions natively on your payment page. Send this parameter when you are using &#x60;/payments&#x60; endpoint with any of our [native 3D Secure 2 solutions](https://docs.adyen.com/online-payments/3d-secure/native-3ds2).   &gt; This parameter only indicates readiness to support native 3D Secure 2 authentication. To specify if you _want_ to perform 3D Secure, use [Dynamic 3D Secure](/risk-management/dynamic-3d-secure) or send the &#x60;executeThreeD&#x60; parameter.  Possible values: * **true** - Ready to support native 3D Secure 2 authentication. Setting this to true does not mean always applying 3D Secure 2. Adyen still selects the version of 3D Secure based on configuration to optimize authorisation rates and improve the shopper&#39;s experience. * **false** – Not ready to support native 3D Secure 2 authentication. Adyen will not offer 3D Secure 2 to your shopper regardless of your configuration. 
  *
  * @param allow3DS2
  */ 
  @Deprecated
  @JsonProperty(JSON_PROPERTY_ALLOW3_D_S2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllow3DS2(String allow3DS2) {
    this.allow3DS2 = allow3DS2;
  }


  public AdditionalData3DSecure challengeWindowSize(ChallengeWindowSizeEnum challengeWindowSize) {
    this.challengeWindowSize = challengeWindowSize;
    return this;
  }

   /**
   * Dimensions of the 3DS2 challenge window to be displayed to the cardholder.  Possible values:  * **01** - size of 250x400  * **02** - size of 390x400 * **03** - size of 500x600 * **04** - size of 600x400 * **05** - Fullscreen
   * @return challengeWindowSize
  **/
  @ApiModelProperty(value = "Dimensions of the 3DS2 challenge window to be displayed to the cardholder.  Possible values:  * **01** - size of 250x400  * **02** - size of 390x400 * **03** - size of 500x600 * **04** - size of 600x400 * **05** - Fullscreen")
  @JsonProperty(JSON_PROPERTY_CHALLENGE_WINDOW_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChallengeWindowSizeEnum getChallengeWindowSize() {
    return challengeWindowSize;
  }


 /**
  * Dimensions of the 3DS2 challenge window to be displayed to the cardholder.  Possible values:  * **01** - size of 250x400  * **02** - size of 390x400 * **03** - size of 500x600 * **04** - size of 600x400 * **05** - Fullscreen
  *
  * @param challengeWindowSize
  */ 
  @JsonProperty(JSON_PROPERTY_CHALLENGE_WINDOW_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChallengeWindowSize(ChallengeWindowSizeEnum challengeWindowSize) {
    this.challengeWindowSize = challengeWindowSize;
  }


  public AdditionalData3DSecure executeThreeD(String executeThreeD) {
    this.executeThreeD = executeThreeD;
    return this;
  }

   /**
   * Indicates if you want to perform 3D Secure authentication on a transaction.   &gt; Alternatively, you can use [Dynamic 3D Secure](/risk-management/dynamic-3d-secure) to configure rules for applying 3D Secure.  Possible values: * **true** – Perform 3D Secure authentication. * **false** – Don&#39;t perform 3D Secure authentication. Note that this setting results in refusals if the issuer mandates 3D Secure because of the PSD2 directive  or other, national regulations.  
   * @return executeThreeD
   * @deprecated
  **/
  @Deprecated
  @ApiModelProperty(value = "Indicates if you want to perform 3D Secure authentication on a transaction.   > Alternatively, you can use [Dynamic 3D Secure](/risk-management/dynamic-3d-secure) to configure rules for applying 3D Secure.  Possible values: * **true** – Perform 3D Secure authentication. * **false** – Don't perform 3D Secure authentication. Note that this setting results in refusals if the issuer mandates 3D Secure because of the PSD2 directive  or other, national regulations.  ")
  @JsonProperty(JSON_PROPERTY_EXECUTE_THREE_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExecuteThreeD() {
    return executeThreeD;
  }


 /**
  * Indicates if you want to perform 3D Secure authentication on a transaction.   &gt; Alternatively, you can use [Dynamic 3D Secure](/risk-management/dynamic-3d-secure) to configure rules for applying 3D Secure.  Possible values: * **true** – Perform 3D Secure authentication. * **false** – Don&#39;t perform 3D Secure authentication. Note that this setting results in refusals if the issuer mandates 3D Secure because of the PSD2 directive  or other, national regulations.  
  *
  * @param executeThreeD
  */ 
  @Deprecated
  @JsonProperty(JSON_PROPERTY_EXECUTE_THREE_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecuteThreeD(String executeThreeD) {
    this.executeThreeD = executeThreeD;
  }


  public AdditionalData3DSecure mpiImplementationType(String mpiImplementationType) {
    this.mpiImplementationType = mpiImplementationType;
    return this;
  }

   /**
   * In case of Secure+, this field must be set to **CUPSecurePlus**.
   * @return mpiImplementationType
  **/
  @ApiModelProperty(value = "In case of Secure+, this field must be set to **CUPSecurePlus**.")
  @JsonProperty(JSON_PROPERTY_MPI_IMPLEMENTATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMpiImplementationType() {
    return mpiImplementationType;
  }


 /**
  * In case of Secure+, this field must be set to **CUPSecurePlus**.
  *
  * @param mpiImplementationType
  */ 
  @JsonProperty(JSON_PROPERTY_MPI_IMPLEMENTATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMpiImplementationType(String mpiImplementationType) {
    this.mpiImplementationType = mpiImplementationType;
  }


  public AdditionalData3DSecure scaExemption(String scaExemption) {
    this.scaExemption = scaExemption;
    return this;
  }

   /**
   * Indicates the [exemption type](https://docs.adyen.com/payments-fundamentals/psd2-sca-compliance-and-implementation-guide#specifypreferenceinyourapirequest) that you want to request for the transaction.   Possible values: * **lowValue**  * **secureCorporate**  * **trustedBeneficiary**  * **transactionRiskAnalysis** 
   * @return scaExemption
  **/
  @ApiModelProperty(value = "Indicates the [exemption type](https://docs.adyen.com/payments-fundamentals/psd2-sca-compliance-and-implementation-guide#specifypreferenceinyourapirequest) that you want to request for the transaction.   Possible values: * **lowValue**  * **secureCorporate**  * **trustedBeneficiary**  * **transactionRiskAnalysis** ")
  @JsonProperty(JSON_PROPERTY_SCA_EXEMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScaExemption() {
    return scaExemption;
  }


 /**
  * Indicates the [exemption type](https://docs.adyen.com/payments-fundamentals/psd2-sca-compliance-and-implementation-guide#specifypreferenceinyourapirequest) that you want to request for the transaction.   Possible values: * **lowValue**  * **secureCorporate**  * **trustedBeneficiary**  * **transactionRiskAnalysis** 
  *
  * @param scaExemption
  */ 
  @JsonProperty(JSON_PROPERTY_SCA_EXEMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScaExemption(String scaExemption) {
    this.scaExemption = scaExemption;
  }


  public AdditionalData3DSecure threeDSVersion(String threeDSVersion) {
    this.threeDSVersion = threeDSVersion;
    return this;
  }

   /**
   * Indicates your preference for the 3D Secure version.  &gt; If you use this parameter, you override the checks from Adyen&#39;s Authentication Engine. We recommend to use this field only if you have an extensive knowledge of 3D Secure.  Possible values: * **1.0.2**: Apply 3D Secure version 1.0.2.  * **2.1.0**: Apply 3D Secure version 2.1.0.  * **2.2.0**: Apply 3D Secure version 2.2.0. If the issuer does not support version 2.2.0, we will fall back to 2.1.0.  The following rules apply: * If you prefer 2.1.0 or 2.2.0 but we receive a negative &#x60;transStatus&#x60; in the &#x60;ARes&#x60;, we will apply the fallback policy configured in your account. For example, if the configuration is to fall back to 3D Secure 1, we will apply version 1.0.2. * If you prefer 2.1.0 or 2.2.0 but the BIN is not enrolled, you will receive an error.  
   * @return threeDSVersion
  **/
  @ApiModelProperty(value = "Indicates your preference for the 3D Secure version.  > If you use this parameter, you override the checks from Adyen's Authentication Engine. We recommend to use this field only if you have an extensive knowledge of 3D Secure.  Possible values: * **1.0.2**: Apply 3D Secure version 1.0.2.  * **2.1.0**: Apply 3D Secure version 2.1.0.  * **2.2.0**: Apply 3D Secure version 2.2.0. If the issuer does not support version 2.2.0, we will fall back to 2.1.0.  The following rules apply: * If you prefer 2.1.0 or 2.2.0 but we receive a negative `transStatus` in the `ARes`, we will apply the fallback policy configured in your account. For example, if the configuration is to fall back to 3D Secure 1, we will apply version 1.0.2. * If you prefer 2.1.0 or 2.2.0 but the BIN is not enrolled, you will receive an error.  ")
  @JsonProperty(JSON_PROPERTY_THREE_D_S_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreeDSVersion() {
    return threeDSVersion;
  }


 /**
  * Indicates your preference for the 3D Secure version.  &gt; If you use this parameter, you override the checks from Adyen&#39;s Authentication Engine. We recommend to use this field only if you have an extensive knowledge of 3D Secure.  Possible values: * **1.0.2**: Apply 3D Secure version 1.0.2.  * **2.1.0**: Apply 3D Secure version 2.1.0.  * **2.2.0**: Apply 3D Secure version 2.2.0. If the issuer does not support version 2.2.0, we will fall back to 2.1.0.  The following rules apply: * If you prefer 2.1.0 or 2.2.0 but we receive a negative &#x60;transStatus&#x60; in the &#x60;ARes&#x60;, we will apply the fallback policy configured in your account. For example, if the configuration is to fall back to 3D Secure 1, we will apply version 1.0.2. * If you prefer 2.1.0 or 2.2.0 but the BIN is not enrolled, you will receive an error.  
  *
  * @param threeDSVersion
  */ 
  @JsonProperty(JSON_PROPERTY_THREE_D_S_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeDSVersion(String threeDSVersion) {
    this.threeDSVersion = threeDSVersion;
  }


  /**
   * Return true if this AdditionalData3DSecure object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalData3DSecure additionalData3DSecure = (AdditionalData3DSecure) o;
    return Objects.equals(this.allow3DS2, additionalData3DSecure.allow3DS2) &&
        Objects.equals(this.challengeWindowSize, additionalData3DSecure.challengeWindowSize) &&
        Objects.equals(this.executeThreeD, additionalData3DSecure.executeThreeD) &&
        Objects.equals(this.mpiImplementationType, additionalData3DSecure.mpiImplementationType) &&
        Objects.equals(this.scaExemption, additionalData3DSecure.scaExemption) &&
        Objects.equals(this.threeDSVersion, additionalData3DSecure.threeDSVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allow3DS2, challengeWindowSize, executeThreeD, mpiImplementationType, scaExemption, threeDSVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalData3DSecure {\n");
    sb.append("    allow3DS2: ").append(toIndentedString(allow3DS2)).append("\n");
    sb.append("    challengeWindowSize: ").append(toIndentedString(challengeWindowSize)).append("\n");
    sb.append("    executeThreeD: ").append(toIndentedString(executeThreeD)).append("\n");
    sb.append("    mpiImplementationType: ").append(toIndentedString(mpiImplementationType)).append("\n");
    sb.append("    scaExemption: ").append(toIndentedString(scaExemption)).append("\n");
    sb.append("    threeDSVersion: ").append(toIndentedString(threeDSVersion)).append("\n");
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
   * Create an instance of AdditionalData3DSecure given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdditionalData3DSecure
   * @throws JsonProcessingException if the JSON string is invalid with respect to AdditionalData3DSecure
   */
  public static AdditionalData3DSecure fromJson(String jsonString) throws JsonProcessingException {
    return JSON.getMapper().readValue(jsonString, AdditionalData3DSecure.class);
  }
/**
  * Convert an instance of AdditionalData3DSecure to an JSON string
  *
  * @return JSON string
  */
  public String toJson() throws JsonProcessingException {
    return JSON.getMapper().writeValueAsString(this);
  }
}

