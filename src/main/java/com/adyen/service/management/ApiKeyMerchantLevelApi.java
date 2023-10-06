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

package com.adyen.service.management;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.management.GenerateApiKeyResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ApiKeyMerchantLevelApi extends Service {

    public static final String API_VERSION = "1";

    protected String baseURL;

    /**
    * API key - merchant level constructor in {@link com.adyen.service.management package}.
    * @param client {@link Client } (required)
    */
    public ApiKeyMerchantLevelApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://management-test.adyen.com/v1");
    }

    /**
    * API key - merchant level constructor in {@link com.adyen.service.management package}.
    * Please use this constructor only if you would like to pass along your own url for routing or testing purposes. The latest API version is defined in this class as a constant.
    * @param client {@link Client } (required)
    * @param baseURL {@link String } (required)
    */
    public ApiKeyMerchantLevelApi(Client client, String baseURL) {
        super(client);
        this.baseURL = baseURL;
    }

    /**
    * Generate new API key
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @return {@link GenerateApiKeyResponse }
    * @throws ApiException if fails to make API call
    */
    public GenerateApiKeyResponse generateNewApiKey(String merchantId, String apiCredentialId) throws ApiException, IOException {
        return generateNewApiKey(merchantId, apiCredentialId, null);
    }

    /**
    * Generate new API key
    *
    * @param merchantId {@link String } The unique identifier of the merchant account. (required)
    * @param apiCredentialId {@link String } Unique identifier of the API credential. (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link GenerateApiKeyResponse }
    * @throws ApiException if fails to make API call
    */
    public GenerateApiKeyResponse generateNewApiKey(String merchantId, String apiCredentialId, RequestOptions requestOptions) throws ApiException, IOException {
        //Add path params
        Map<String, String> pathParams = new HashMap<>();
        if (merchantId == null) {
            throw new IllegalArgumentException("Please provide the merchantId path parameter");
        }
        pathParams.put("merchantId", merchantId);
        if (apiCredentialId == null) {
            throw new IllegalArgumentException("Please provide the apiCredentialId path parameter");
        }
        pathParams.put("apiCredentialId", apiCredentialId);

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/merchants/{merchantId}/apiCredentials/{apiCredentialId}/generateApiKey", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, pathParams);
        return GenerateApiKeyResponse.fromJson(jsonResult);
    }
}
