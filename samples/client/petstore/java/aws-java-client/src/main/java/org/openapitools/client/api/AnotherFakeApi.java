/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.model.Response;


import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Client;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnotherFakeApi {
    private ApiClient localVarApiClient;

    List<Pair> collection;
    List<Pair> query;

    public AnotherFakeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AnotherFakeApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public void setQuery(String key, String value) {
        Pair pair = new Pair(key, value);
        List<Pair> query = new ArrayList<>();
        query.add(pair);
        this.query = query;
    }

    public void setCollection(List<Pair> collectionQueryParams) {
        this.collection = collectionQueryParams;
    }

    private void setQueryParams(List<Pair> queryParams) {
        localVarApiClient.setQueryParams(queryParams);
    }

    private void setCollectionQueryParams(List<Pair> collectionQueryParams) {
        localVarApiClient.setCollectionQueryParams(collectionQueryParams);
    }

    /**
     * Build call for call123testSpecialTags
     * @param body client model (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response call123testSpecialTagsCall(Client body, final ApiCallback _callback) throws ApiException {
        // create path and map variables
        String localVarPath = "/another-fake/dummy";
        localVarApiClient.setPath(localVarPath);
        localVarApiClient.setMethod("PATCH");
        setQueryParams(this.query);
        setCollectionQueryParams(this.collection);

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        return localVarApiClient.buildCall(localVarPath, "PATCH", this.query, this.collection);
    }

    @SuppressWarnings("rawtypes")
    private com.amazonaws.Response call123testSpecialTagsValidateBeforeCall(Client body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling call123testSpecialTags(Async)");
        }
        

        com.amazonaws.Response localVarCall = call123testSpecialTagsCall(body, _callback);
        return localVarCall;

    }

    /**
     * To test special tags
     * To test special tags and operation ID starting with number
     * @param body client model (required)
     * @return Client
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public Client call123testSpecialTags(Client body) throws ApiException {
        ApiResponse<Client> localVarResp = call123testSpecialTagsWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * To test special tags
     * To test special tags and operation ID starting with number
     * @param body client model (required)
     * @return ApiResponse&lt;Client&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Client> call123testSpecialTagsWithHttpInfo(Client body) throws ApiException {
        com.amazonaws.Response localVarCall = call123testSpecialTagsValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<Client>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

}
