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

package com.adyen.service.balanceplatform;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.balanceplatform.BankAccountIdentificationValidationRequest;
import com.adyen.model.balanceplatform.RestServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BankAccountValidationApi extends Service {
    protected String baseURL;

    public BankAccountValidationApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://balanceplatform-api-test.adyen.com/bcl/v2");
    }

    /**
    * Validate a bank account
    *
    * @param bankAccountIdentificationValidationRequest {@link BankAccountIdentificationValidationRequest }  (required)
    * @throws ApiException if fails to make API call
    */
    public void validateBankAccountIdentification(BankAccountIdentificationValidationRequest bankAccountIdentificationValidationRequest) throws ApiException, IOException {
        validateBankAccountIdentification(bankAccountIdentificationValidationRequest, null);
    }

    /**
    * Validate a bank account
    *
    * @param bankAccountIdentificationValidationRequest {@link BankAccountIdentificationValidationRequest }  (required)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @throws ApiException if fails to make API call
    */
    public void validateBankAccountIdentification(BankAccountIdentificationValidationRequest bankAccountIdentificationValidationRequest, RequestOptions requestOptions) throws ApiException, IOException {

        String requestBody = bankAccountIdentificationValidationRequest.toJson();
        Resource resource = new Resource(this, this.baseURL + "/validateBankAccountIdentification", null);
        resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.POST, null);
    }
}
