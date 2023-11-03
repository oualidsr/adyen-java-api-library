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

package com.adyen.service.checkout;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.checkout.CardDetailsRequest;
import com.adyen.model.checkout.CardDetailsResponse;
import com.adyen.model.checkout.CreateCheckoutSessionRequest;
import com.adyen.model.checkout.CreateCheckoutSessionResponse;
import com.adyen.model.checkout.DonationPaymentRequest;
import com.adyen.model.checkout.DonationPaymentResponse;
import com.adyen.model.checkout.PaymentDetailsRequest;
import com.adyen.model.checkout.PaymentDetailsResponse;
import com.adyen.model.checkout.PaymentMethodsRequest;
import com.adyen.model.checkout.PaymentMethodsResponse;
import com.adyen.model.checkout.PaymentRequest;
import com.adyen.model.checkout.PaymentResponse;
import com.adyen.model.checkout.ServiceError;
import com.adyen.model.checkout.SessionResultResponse;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PaymentsApi extends Service {

    public static final String API_VERSION = "71";

    protected String baseURL;

    /**
    * Payments constructor in {@link com.adyen.service.checkout package}.
    * @param client {@link Client } (required)
    */
    public PaymentsApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://checkout-test.adyen.com/v71");
    }

    /**
    * Payments constructor in {@link com.adyen.service.checkout package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public PaymentsApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Get the result of a payment session
    *
    * @param sessionId {@link String } A unique identifier of the session. (required)
    * @param sessionResult {@link String } The &#x60;sessionResult&#x60; value from the Drop-in or Component. (required)
    * @return {@link SessionResultResponse }
    * @throws ApiException if fails to make API call
    */
    public SessionResultResponse getResultOfPaymentSession(String sessionId, String sessionResult) throws ApiException, IOException {
        return getResultOfPaymentSession(sessionId, sessionResult,  null);
    }

    /**
    * Get the result of a payment session
    *
    * @param sessionId {@link String } A unique identifier of the session. (required)
    * @param sessionResult {@link String } Query: The &#x60;sessionResult&#x60; value from the Drop-in or Component. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link SessionResultResponse }
    * @throws ApiException if fails to make API call
    */
    public SessionResultResponse getResultOfPaymentSession(String sessionId, String sessionResult, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (sessionId == null) {
            throw new IllegalArgumentException("Please provide the sessionId path parameter");
        }
        pathParams.put("sessionId", sessionId);
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (sessionResult != null) {
        queryParams.put("sessionResult", sessionResult);
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/sessions/{sessionId}", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, pathParams, queryParams);
        return SessionResultResponse.fromJson(jsonResult);
    }

    /**
    * Get the list of brands on the card
    *
    * @param cardDetailsRequest {@link CardDetailsRequest }  (required)
    * @return {@link CardDetailsResponse }
    * @throws ApiException if fails to make API call
    */
    public CardDetailsResponse cardDetails(CardDetailsRequest cardDetailsRequest) throws ApiException, IOException {
        return cardDetails(cardDetailsRequest, null);
    }

    /**
    * Get the list of brands on the card
    *
    * @param cardDetailsRequest {@link CardDetailsRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link CardDetailsResponse }
    * @throws ApiException if fails to make API call
    */
    public CardDetailsResponse cardDetails(CardDetailsRequest cardDetailsRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = cardDetailsRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/cardDetails", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return CardDetailsResponse.fromJson(jsonResult);
    }

    /**
    * Start a transaction for donations
    *
    * @param donationPaymentRequest {@link DonationPaymentRequest }  (required)
    * @return {@link DonationPaymentResponse }
    * @throws ApiException if fails to make API call
    */
    public DonationPaymentResponse donations(DonationPaymentRequest donationPaymentRequest) throws ApiException, IOException {
        return donations(donationPaymentRequest, null);
    }

    /**
    * Start a transaction for donations
    *
    * @param donationPaymentRequest {@link DonationPaymentRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link DonationPaymentResponse }
    * @throws ApiException if fails to make API call
    */
    public DonationPaymentResponse donations(DonationPaymentRequest donationPaymentRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = donationPaymentRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/donations", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return DonationPaymentResponse.fromJson(jsonResult);
    }

    /**
    * Get a list of available payment methods
    *
    * @param paymentMethodsRequest {@link PaymentMethodsRequest }  (required)
    * @return {@link PaymentMethodsResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentMethodsResponse paymentMethods(PaymentMethodsRequest paymentMethodsRequest) throws ApiException, IOException {
        return paymentMethods(paymentMethodsRequest, null);
    }

    /**
    * Get a list of available payment methods
    *
    * @param paymentMethodsRequest {@link PaymentMethodsRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaymentMethodsResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentMethodsResponse paymentMethods(PaymentMethodsRequest paymentMethodsRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = paymentMethodsRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/paymentMethods", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return PaymentMethodsResponse.fromJson(jsonResult);
    }

    /**
    * Start a transaction
    *
    * @param paymentRequest {@link PaymentRequest }  (required)
    * @return {@link PaymentResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentResponse payments(PaymentRequest paymentRequest) throws ApiException, IOException {
        return payments(paymentRequest, null);
    }

    /**
    * Start a transaction
    *
    * @param paymentRequest {@link PaymentRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaymentResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentResponse payments(PaymentRequest paymentRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = paymentRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/payments", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return PaymentResponse.fromJson(jsonResult);
    }

    /**
    * Submit details for a payment
    *
    * @param paymentDetailsRequest {@link PaymentDetailsRequest }  (required)
    * @return {@link PaymentDetailsResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentDetailsResponse paymentsDetails(PaymentDetailsRequest paymentDetailsRequest) throws ApiException, IOException {
        return paymentsDetails(paymentDetailsRequest, null);
    }

    /**
    * Submit details for a payment
    *
    * @param paymentDetailsRequest {@link PaymentDetailsRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link PaymentDetailsResponse }
    * @throws ApiException if fails to make API call
    */
    public PaymentDetailsResponse paymentsDetails(PaymentDetailsRequest paymentDetailsRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = paymentDetailsRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/payments/details", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return PaymentDetailsResponse.fromJson(jsonResult);
    }

    /**
    * Create a payment session
    *
    * @param createCheckoutSessionRequest {@link CreateCheckoutSessionRequest }  (required)
    * @return {@link CreateCheckoutSessionResponse }
    * @throws ApiException if fails to make API call
    */
    public CreateCheckoutSessionResponse sessions(CreateCheckoutSessionRequest createCheckoutSessionRequest) throws ApiException, IOException {
        return sessions(createCheckoutSessionRequest, null);
    }

    /**
    * Create a payment session
    *
    * @param createCheckoutSessionRequest {@link CreateCheckoutSessionRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link CreateCheckoutSessionResponse }
    * @throws ApiException if fails to make API call
    */
    public CreateCheckoutSessionResponse sessions(CreateCheckoutSessionRequest createCheckoutSessionRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = createCheckoutSessionRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/sessions", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
        return CreateCheckoutSessionResponse.fromJson(jsonResult);
    }
}
