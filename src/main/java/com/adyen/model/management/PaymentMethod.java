/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.management.ApplePayInfo;
import com.adyen.model.management.BcmcInfo;
import com.adyen.model.management.CartesBancairesInfo;
import com.adyen.model.management.GiroPayInfo;
import com.adyen.model.management.GooglePayInfo;
import com.adyen.model.management.KlarnaInfo;
import com.adyen.model.management.MealVoucherFRInfo;
import com.adyen.model.management.PayPalInfo;
import com.adyen.model.management.SofortInfo;
import com.adyen.model.management.SwishInfo;
import com.adyen.model.management.VippsInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.adyen.model.management.JSON;

/**
 * PaymentMethod
 */

public class PaymentMethod {
  public static final String SERIALIZED_NAME_ALLOWED = "allowed";
  @SerializedName(SERIALIZED_NAME_ALLOWED)
  private Boolean allowed;

  public static final String SERIALIZED_NAME_APPLE_PAY = "applePay";
  @SerializedName(SERIALIZED_NAME_APPLE_PAY)
  private ApplePayInfo applePay;

  public static final String SERIALIZED_NAME_BCMC = "bcmc";
  @SerializedName(SERIALIZED_NAME_BCMC)
  private BcmcInfo bcmc;

  public static final String SERIALIZED_NAME_BUSINESS_LINE_ID = "businessLineId";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LINE_ID)
  private String businessLineId;

  public static final String SERIALIZED_NAME_CARTES_BANCAIRES = "cartesBancaires";
  @SerializedName(SERIALIZED_NAME_CARTES_BANCAIRES)
  private CartesBancairesInfo cartesBancaires;

  public static final String SERIALIZED_NAME_COUNTRIES = "countries";
  @SerializedName(SERIALIZED_NAME_COUNTRIES)
  private List<String> countries = null;

  public static final String SERIALIZED_NAME_CURRENCIES = "currencies";
  @SerializedName(SERIALIZED_NAME_CURRENCIES)
  private List<String> currencies = null;

  public static final String SERIALIZED_NAME_CUSTOM_ROUTING_FLAGS = "customRoutingFlags";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ROUTING_FLAGS)
  private List<String> customRoutingFlags = null;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_GIRO_PAY = "giroPay";
  @SerializedName(SERIALIZED_NAME_GIRO_PAY)
  private GiroPayInfo giroPay;

  public static final String SERIALIZED_NAME_GOOGLE_PAY = "googlePay";
  @SerializedName(SERIALIZED_NAME_GOOGLE_PAY)
  private GooglePayInfo googlePay;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KLARNA = "klarna";
  @SerializedName(SERIALIZED_NAME_KLARNA)
  private KlarnaInfo klarna;

  public static final String SERIALIZED_NAME_MEAL_VOUCHER_F_R = "mealVoucher_FR";
  @SerializedName(SERIALIZED_NAME_MEAL_VOUCHER_F_R)
  private MealVoucherFRInfo mealVoucherFR;

  public static final String SERIALIZED_NAME_PAYPAL = "paypal";
  @SerializedName(SERIALIZED_NAME_PAYPAL)
  private PayPalInfo paypal;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_SHOPPER_INTERACTION = "shopperInteraction";
  @SerializedName(SERIALIZED_NAME_SHOPPER_INTERACTION)
  private String shopperInteraction;

  public static final String SERIALIZED_NAME_SOFORT = "sofort";
  @SerializedName(SERIALIZED_NAME_SOFORT)
  private SofortInfo sofort;

  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_SWISH = "swish";
  @SerializedName(SERIALIZED_NAME_SWISH)
  private SwishInfo swish;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  /**
   * Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected**
   */
  @JsonAdapter(VerificationStatusEnum.Adapter.class)
  public enum VerificationStatusEnum {
    VALID("valid"),
    
    PENDING("pending"),
    
    INVALID("invalid"),
    
    REJECTED("rejected");

    private String value;

    VerificationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerificationStatusEnum fromValue(String value) {
      for (VerificationStatusEnum b : VerificationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VerificationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerificationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerificationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VerificationStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "verificationStatus";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private VerificationStatusEnum verificationStatus;

  public static final String SERIALIZED_NAME_VIPPS = "vipps";
  @SerializedName(SERIALIZED_NAME_VIPPS)
  private VippsInfo vipps;

  public PaymentMethod() { 
  }

  public PaymentMethod allowed(Boolean allowed) {
    
    this.allowed = allowed;
    return this;
  }

   /**
   * Indicates whether receiving payments is allowed. This value is set to **true** by Adyen after screening your merchant account.
   * @return allowed
  **/
  @ApiModelProperty(value = "Indicates whether receiving payments is allowed. This value is set to **true** by Adyen after screening your merchant account.")

  public Boolean getAllowed() {
    return allowed;
  }


  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }


  public PaymentMethod applePay(ApplePayInfo applePay) {
    
    this.applePay = applePay;
    return this;
  }

   /**
   * Get applePay
   * @return applePay
  **/
  @ApiModelProperty(value = "")

  public ApplePayInfo getApplePay() {
    return applePay;
  }


  public void setApplePay(ApplePayInfo applePay) {
    this.applePay = applePay;
  }


  public PaymentMethod bcmc(BcmcInfo bcmc) {
    
    this.bcmc = bcmc;
    return this;
  }

   /**
   * Get bcmc
   * @return bcmc
  **/
  @ApiModelProperty(value = "")

  public BcmcInfo getBcmc() {
    return bcmc;
  }


  public void setBcmc(BcmcInfo bcmc) {
    this.bcmc = bcmc;
  }


  public PaymentMethod businessLineId(String businessLineId) {
    
    this.businessLineId = businessLineId;
    return this;
  }

   /**
   * The unique identifier of the business line.
   * @return businessLineId
  **/
  @ApiModelProperty(value = "The unique identifier of the business line.")

  public String getBusinessLineId() {
    return businessLineId;
  }


  public void setBusinessLineId(String businessLineId) {
    this.businessLineId = businessLineId;
  }


  public PaymentMethod cartesBancaires(CartesBancairesInfo cartesBancaires) {
    
    this.cartesBancaires = cartesBancaires;
    return this;
  }

   /**
   * Get cartesBancaires
   * @return cartesBancaires
  **/
  @ApiModelProperty(value = "")

  public CartesBancairesInfo getCartesBancaires() {
    return cartesBancaires;
  }


  public void setCartesBancaires(CartesBancairesInfo cartesBancaires) {
    this.cartesBancaires = cartesBancaires;
  }


  public PaymentMethod countries(List<String> countries) {
    
    this.countries = countries;
    return this;
  }

  public PaymentMethod addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * The list of countries where a payment method is available. By default, all countries supported by the payment method.
   * @return countries
  **/
  @ApiModelProperty(value = "The list of countries where a payment method is available. By default, all countries supported by the payment method.")

  public List<String> getCountries() {
    return countries;
  }


  public void setCountries(List<String> countries) {
    this.countries = countries;
  }


  public PaymentMethod currencies(List<String> currencies) {
    
    this.currencies = currencies;
    return this;
  }

  public PaymentMethod addCurrenciesItem(String currenciesItem) {
    if (this.currencies == null) {
      this.currencies = new ArrayList<>();
    }
    this.currencies.add(currenciesItem);
    return this;
  }

   /**
   * The list of currencies that a payment method supports. By default, all currencies supported by the payment method.
   * @return currencies
  **/
  @ApiModelProperty(value = "The list of currencies that a payment method supports. By default, all currencies supported by the payment method.")

  public List<String> getCurrencies() {
    return currencies;
  }


  public void setCurrencies(List<String> currencies) {
    this.currencies = currencies;
  }


  public PaymentMethod customRoutingFlags(List<String> customRoutingFlags) {
    
    this.customRoutingFlags = customRoutingFlags;
    return this;
  }

  public PaymentMethod addCustomRoutingFlagsItem(String customRoutingFlagsItem) {
    if (this.customRoutingFlags == null) {
      this.customRoutingFlags = new ArrayList<>();
    }
    this.customRoutingFlags.add(customRoutingFlagsItem);
    return this;
  }

   /**
   * The list of custom routing flags to route payment to the intended acquirer.
   * @return customRoutingFlags
  **/
  @ApiModelProperty(value = "The list of custom routing flags to route payment to the intended acquirer.")

  public List<String> getCustomRoutingFlags() {
    return customRoutingFlags;
  }


  public void setCustomRoutingFlags(List<String> customRoutingFlags) {
    this.customRoutingFlags = customRoutingFlags;
  }


  public PaymentMethod enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicates whether the payment method is enabled (**true**) or disabled (**false**).
   * @return enabled
  **/
  @ApiModelProperty(value = "Indicates whether the payment method is enabled (**true**) or disabled (**false**).")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public PaymentMethod giroPay(GiroPayInfo giroPay) {
    
    this.giroPay = giroPay;
    return this;
  }

   /**
   * Get giroPay
   * @return giroPay
  **/
  @ApiModelProperty(value = "")

  public GiroPayInfo getGiroPay() {
    return giroPay;
  }


  public void setGiroPay(GiroPayInfo giroPay) {
    this.giroPay = giroPay;
  }


  public PaymentMethod googlePay(GooglePayInfo googlePay) {
    
    this.googlePay = googlePay;
    return this;
  }

   /**
   * Get googlePay
   * @return googlePay
  **/
  @ApiModelProperty(value = "")

  public GooglePayInfo getGooglePay() {
    return googlePay;
  }


  public void setGooglePay(GooglePayInfo googlePay) {
    this.googlePay = googlePay;
  }


  public PaymentMethod id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The identifier of the resource.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier of the resource.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PaymentMethod klarna(KlarnaInfo klarna) {
    
    this.klarna = klarna;
    return this;
  }

   /**
   * Get klarna
   * @return klarna
  **/
  @ApiModelProperty(value = "")

  public KlarnaInfo getKlarna() {
    return klarna;
  }


  public void setKlarna(KlarnaInfo klarna) {
    this.klarna = klarna;
  }


  public PaymentMethod mealVoucherFR(MealVoucherFRInfo mealVoucherFR) {
    
    this.mealVoucherFR = mealVoucherFR;
    return this;
  }

   /**
   * Get mealVoucherFR
   * @return mealVoucherFR
  **/
  @ApiModelProperty(value = "")

  public MealVoucherFRInfo getMealVoucherFR() {
    return mealVoucherFR;
  }


  public void setMealVoucherFR(MealVoucherFRInfo mealVoucherFR) {
    this.mealVoucherFR = mealVoucherFR;
  }


  public PaymentMethod paypal(PayPalInfo paypal) {
    
    this.paypal = paypal;
    return this;
  }

   /**
   * Get paypal
   * @return paypal
  **/
  @ApiModelProperty(value = "")

  public PayPalInfo getPaypal() {
    return paypal;
  }


  public void setPaypal(PayPalInfo paypal) {
    this.paypal = paypal;
  }


  public PaymentMethod reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Your reference for the payment method. Supported characters a-z, A-Z, 0-9.
   * @return reference
  **/
  @ApiModelProperty(value = "Your reference for the payment method. Supported characters a-z, A-Z, 0-9.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public PaymentMethod shopperInteraction(String shopperInteraction) {
    
    this.shopperInteraction = shopperInteraction;
    return this;
  }

   /**
   * The sales channel.
   * @return shopperInteraction
  **/
  @ApiModelProperty(value = "The sales channel.")

  public String getShopperInteraction() {
    return shopperInteraction;
  }


  public void setShopperInteraction(String shopperInteraction) {
    this.shopperInteraction = shopperInteraction;
  }


  public PaymentMethod sofort(SofortInfo sofort) {
    
    this.sofort = sofort;
    return this;
  }

   /**
   * Get sofort
   * @return sofort
  **/
  @ApiModelProperty(value = "")

  public SofortInfo getSofort() {
    return sofort;
  }


  public void setSofort(SofortInfo sofort) {
    this.sofort = sofort;
  }


  public PaymentMethod storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * The ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/post/stores__resParam_id), if any.
   * @return storeId
  **/
  @ApiModelProperty(value = "The ID of the [store](https://docs.adyen.com/api-explorer/#/ManagementService/latest/post/stores__resParam_id), if any.")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public PaymentMethod swish(SwishInfo swish) {
    
    this.swish = swish;
    return this;
  }

   /**
   * Get swish
   * @return swish
  **/
  @ApiModelProperty(value = "")

  public SwishInfo getSwish() {
    return swish;
  }


  public void setSwish(SwishInfo swish) {
    this.swish = swish;
  }


  public PaymentMethod type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api).
   * @return type
  **/
  @ApiModelProperty(value = "Payment method [variant](https://docs.adyen.com/development-resources/paymentmethodvariant#management-api).")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public PaymentMethod verificationStatus(VerificationStatusEnum verificationStatus) {
    
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected**
   * @return verificationStatus
  **/
  @ApiModelProperty(value = "Payment method status. Possible values: * **valid** * **pending** * **invalid** * **rejected**")

  public VerificationStatusEnum getVerificationStatus() {
    return verificationStatus;
  }


  public void setVerificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  public PaymentMethod vipps(VippsInfo vipps) {
    
    this.vipps = vipps;
    return this;
  }

   /**
   * Get vipps
   * @return vipps
  **/
  @ApiModelProperty(value = "")

  public VippsInfo getVipps() {
    return vipps;
  }


  public void setVipps(VippsInfo vipps) {
    this.vipps = vipps;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethod paymentMethod = (PaymentMethod) o;
    return Objects.equals(this.allowed, paymentMethod.allowed) &&
        Objects.equals(this.applePay, paymentMethod.applePay) &&
        Objects.equals(this.bcmc, paymentMethod.bcmc) &&
        Objects.equals(this.businessLineId, paymentMethod.businessLineId) &&
        Objects.equals(this.cartesBancaires, paymentMethod.cartesBancaires) &&
        Objects.equals(this.countries, paymentMethod.countries) &&
        Objects.equals(this.currencies, paymentMethod.currencies) &&
        Objects.equals(this.customRoutingFlags, paymentMethod.customRoutingFlags) &&
        Objects.equals(this.enabled, paymentMethod.enabled) &&
        Objects.equals(this.giroPay, paymentMethod.giroPay) &&
        Objects.equals(this.googlePay, paymentMethod.googlePay) &&
        Objects.equals(this.id, paymentMethod.id) &&
        Objects.equals(this.klarna, paymentMethod.klarna) &&
        Objects.equals(this.mealVoucherFR, paymentMethod.mealVoucherFR) &&
        Objects.equals(this.paypal, paymentMethod.paypal) &&
        Objects.equals(this.reference, paymentMethod.reference) &&
        Objects.equals(this.shopperInteraction, paymentMethod.shopperInteraction) &&
        Objects.equals(this.sofort, paymentMethod.sofort) &&
        Objects.equals(this.storeId, paymentMethod.storeId) &&
        Objects.equals(this.swish, paymentMethod.swish) &&
        Objects.equals(this.type, paymentMethod.type) &&
        Objects.equals(this.verificationStatus, paymentMethod.verificationStatus) &&
        Objects.equals(this.vipps, paymentMethod.vipps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed, applePay, bcmc, businessLineId, cartesBancaires, countries, currencies, customRoutingFlags, enabled, giroPay, googlePay, id, klarna, mealVoucherFR, paypal, reference, shopperInteraction, sofort, storeId, swish, type, verificationStatus, vipps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethod {\n");
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("    applePay: ").append(toIndentedString(applePay)).append("\n");
    sb.append("    bcmc: ").append(toIndentedString(bcmc)).append("\n");
    sb.append("    businessLineId: ").append(toIndentedString(businessLineId)).append("\n");
    sb.append("    cartesBancaires: ").append(toIndentedString(cartesBancaires)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("    customRoutingFlags: ").append(toIndentedString(customRoutingFlags)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    giroPay: ").append(toIndentedString(giroPay)).append("\n");
    sb.append("    googlePay: ").append(toIndentedString(googlePay)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    klarna: ").append(toIndentedString(klarna)).append("\n");
    sb.append("    mealVoucherFR: ").append(toIndentedString(mealVoucherFR)).append("\n");
    sb.append("    paypal: ").append(toIndentedString(paypal)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    shopperInteraction: ").append(toIndentedString(shopperInteraction)).append("\n");
    sb.append("    sofort: ").append(toIndentedString(sofort)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    swish: ").append(toIndentedString(swish)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    vipps: ").append(toIndentedString(vipps)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("allowed");
    openapiFields.add("applePay");
    openapiFields.add("bcmc");
    openapiFields.add("businessLineId");
    openapiFields.add("cartesBancaires");
    openapiFields.add("countries");
    openapiFields.add("currencies");
    openapiFields.add("customRoutingFlags");
    openapiFields.add("enabled");
    openapiFields.add("giroPay");
    openapiFields.add("googlePay");
    openapiFields.add("id");
    openapiFields.add("klarna");
    openapiFields.add("mealVoucher_FR");
    openapiFields.add("paypal");
    openapiFields.add("reference");
    openapiFields.add("shopperInteraction");
    openapiFields.add("sofort");
    openapiFields.add("storeId");
    openapiFields.add("swish");
    openapiFields.add("type");
    openapiFields.add("verificationStatus");
    openapiFields.add("vipps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentMethod
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PaymentMethod.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentMethod is not found in the empty JSON string", PaymentMethod.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PaymentMethod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentMethod` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PaymentMethod.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `applePay`
      if (jsonObj.getAsJsonObject("applePay") != null) {
        ApplePayInfo.validateJsonObject(jsonObj.getAsJsonObject("applePay"));
      }
      // validate the optional field `bcmc`
      if (jsonObj.getAsJsonObject("bcmc") != null) {
        BcmcInfo.validateJsonObject(jsonObj.getAsJsonObject("bcmc"));
      }
      // validate the optional field businessLineId
      if (jsonObj.get("businessLineId") != null && !jsonObj.get("businessLineId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `businessLineId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("businessLineId").toString()));
      }
      // validate the optional field `cartesBancaires`
      if (jsonObj.getAsJsonObject("cartesBancaires") != null) {
        CartesBancairesInfo.validateJsonObject(jsonObj.getAsJsonObject("cartesBancaires"));
      }
      // ensure the json data is an array
      if (jsonObj.get("countries") != null && !jsonObj.get("countries").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `countries` to be an array in the JSON string but got `%s`", jsonObj.get("countries").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("currencies") != null && !jsonObj.get("currencies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencies` to be an array in the JSON string but got `%s`", jsonObj.get("currencies").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("customRoutingFlags") != null && !jsonObj.get("customRoutingFlags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `customRoutingFlags` to be an array in the JSON string but got `%s`", jsonObj.get("customRoutingFlags").toString()));
      }
      // validate the optional field `giroPay`
      if (jsonObj.getAsJsonObject("giroPay") != null) {
        GiroPayInfo.validateJsonObject(jsonObj.getAsJsonObject("giroPay"));
      }
      // validate the optional field `googlePay`
      if (jsonObj.getAsJsonObject("googlePay") != null) {
        GooglePayInfo.validateJsonObject(jsonObj.getAsJsonObject("googlePay"));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `klarna`
      if (jsonObj.getAsJsonObject("klarna") != null) {
        KlarnaInfo.validateJsonObject(jsonObj.getAsJsonObject("klarna"));
      }
      // validate the optional field `mealVoucher_FR`
      if (jsonObj.getAsJsonObject("mealVoucher_FR") != null) {
        MealVoucherFRInfo.validateJsonObject(jsonObj.getAsJsonObject("mealVoucher_FR"));
      }
      // validate the optional field `paypal`
      if (jsonObj.getAsJsonObject("paypal") != null) {
        PayPalInfo.validateJsonObject(jsonObj.getAsJsonObject("paypal"));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // validate the optional field shopperInteraction
      if (jsonObj.get("shopperInteraction") != null && !jsonObj.get("shopperInteraction").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperInteraction` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperInteraction").toString()));
      }
      // validate the optional field `sofort`
      if (jsonObj.getAsJsonObject("sofort") != null) {
        SofortInfo.validateJsonObject(jsonObj.getAsJsonObject("sofort"));
      }
      // validate the optional field storeId
      if (jsonObj.get("storeId") != null && !jsonObj.get("storeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storeId").toString()));
      }
      // validate the optional field `swish`
      if (jsonObj.getAsJsonObject("swish") != null) {
        SwishInfo.validateJsonObject(jsonObj.getAsJsonObject("swish"));
      }
      // validate the optional field type
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the field verificationStatus can be parsed to an enum value
      if (jsonObj.get("verificationStatus") != null) {
        if(!jsonObj.get("verificationStatus").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `verificationStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verificationStatus").toString()));
        }
        VerificationStatusEnum.fromValue(jsonObj.get("verificationStatus").getAsString());
      }
      // validate the optional field `vipps`
      if (jsonObj.getAsJsonObject("vipps") != null) {
        VippsInfo.validateJsonObject(jsonObj.getAsJsonObject("vipps"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentMethod>() {
           @Override
           public void write(JsonWriter out, PaymentMethod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentMethod read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PaymentMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentMethod
  * @throws IOException if the JSON string is invalid with respect to PaymentMethod
  */
  public static PaymentMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentMethod.class);
  }

 /**
  * Convert an instance of PaymentMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

