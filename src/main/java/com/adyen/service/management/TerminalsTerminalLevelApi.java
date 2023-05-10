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

package com.adyen.service.management;

import com.adyen.Client;
import com.adyen.Service;
import com.adyen.constants.ApiConstants;
import com.adyen.model.management.ListTerminalsResponse;
import com.adyen.model.management.RestServiceError;
import com.adyen.model.RequestOptions;
import com.adyen.service.exception.ApiException;
import com.adyen.service.resource.Resource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TerminalsTerminalLevelApi extends Service {
    private final String baseURL;

    public TerminalsTerminalLevelApi(Client client) {
        super(client);
        this.baseURL = createBaseURL("https://management-test.adyen.com/v1");
    }

    /**
    * Get a list of terminals
    *
    * @return {@link ListTerminalsResponse }
    * @throws ApiException if fails to make API call
    */
    public ListTerminalsResponse listTerminals() throws ApiException, IOException {
        return listTerminals(null,  null,  null,  null,  null,  null,  null,  null);
    }

    /**
    * Get a list of terminals
    *
    * @param searchQuery {@link String } Query: Returns terminals with an ID that contains the specified string. If present, other query parameters are ignored. (optional)
    * @param countries {@link String } Query: Returns terminals located in the countries specified by their [two-letter country code](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). (optional)
    * @param merchantIds {@link String } Query: Returns terminals that belong to the merchant accounts specified by their unique merchant account ID. (optional)
    * @param storeIds {@link String } Query: Returns terminals that are assigned to the [stores](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/stores) specified by their unique store ID. (optional)
    * @param brandModels {@link String } Query: Returns terminals of the [models](https://docs.adyen.com/api-explorer/#/ManagementService/latest/get/companies/{companyId}/terminalModels) specified in the format *brand.model*. (optional)
    * @param pageNumber {@link Integer } Query: The number of the page to fetch. (optional)
    * @param pageSize {@link Integer } Query: The number of items to have on a page, maximum 100. The default is 20 items on a page. (optional)
    * @param requestOptions {@link RequestOptions } Object to store additional data such as idempotency-keys (optional)
    * @return {@link ListTerminalsResponse }
    * @throws ApiException if fails to make API call
    */
    public ListTerminalsResponse listTerminals(String searchQuery, String countries, String merchantIds, String storeIds, String brandModels, Integer pageNumber, Integer pageSize, RequestOptions requestOptions) throws ApiException, IOException {
        //Add query params
        Map<String, String> queryParams = new HashMap<>();
        if (searchQuery != null) {
        queryParams.put("searchQuery", searchQuery);
        }
        if (countries != null) {
        queryParams.put("countries", countries);
        }
        if (merchantIds != null) {
        queryParams.put("merchantIds", merchantIds);
        }
        if (storeIds != null) {
        queryParams.put("storeIds", storeIds);
        }
        if (brandModels != null) {
        queryParams.put("brandModels", brandModels);
        }
        if (pageNumber != null) {
        queryParams.put("pageNumber", pageNumber.toString());
        }
        if (pageSize != null) {
        queryParams.put("pageSize", pageSize.toString());
        }

        String requestBody = null;
        Resource resource = new Resource(this, this.baseURL + "/terminals", null);
        String jsonResult = resource.request(requestBody, requestOptions, ApiConstants.HttpMethod.GET, null, queryParams);
        return ListTerminalsResponse.fromJson(jsonResult);
    }
}