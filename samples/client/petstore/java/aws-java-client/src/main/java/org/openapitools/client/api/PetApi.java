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

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;




import java.io.File;
import org.openapitools.client.model.ModelApiResponse;
import org.openapitools.client.model.Pet;
import java.util.Set;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetApi {
    private ApiClient localVarApiClient;

    List<Pair> collection;
    List<Pair> query;

    public PetApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PetApi(ApiClient apiClient) {
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
     * Build call for addPet
     * @param body Pet object that needs to be added to the store (required)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response addPetCall() throws ApiException {
        // create path and map variables
        String localVarPath = "/pet";
        localVarApiClient.setPath(localVarPath);
        localVarApiClient.setMethod("POST");
        setQueryParams(this.query);
        setCollectionQueryParams(this.collection);

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        return localVarApiClient.buildCall(localVarPath, "POST", this.query, this.collection);
    }

    @SuppressWarnings("rawtypes")
    private com.amazonaws.Response addPetValidateBeforeCall() throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addPet(Async)");
        }
        

        com.amazonaws.Response localVarCall = addPetCall();
        return localVarCall;

    }

    /**
     * Add a new pet to the store
     * 
     * @param body Pet object that needs to be added to the store (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
     */
    public void addPet(Pet body) throws ApiException {
        addPetWithHttpInfo(body);
    }

    /**
     * Add a new pet to the store
     * 
     * @param body Pet object that needs to be added to the store (required)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response addPetWithHttpInfo(Pet body) throws ApiException {
        com.amazonaws.Response localVarCall = addPetValidateBeforeCall();
        return localVarCall;
    }

    /**
     * Build call for deletePet
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid pet value </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response deletePetCall() throws ApiException {
        // create path and map variables
        String localVarPath = "/pet/{petId}"
            .replaceAll("\\{" + "petId" + "\\}", localVarApiClient.escapeString(petId.toString()));
        localVarApiClient.setPath(localVarPath);
        localVarApiClient.setMethod("DELETE");
        setQueryParams(this.query);
        setCollectionQueryParams(this.collection);

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (apiKey != null) {
            localVarHeaderParams.put("api_key", localVarApiClient.parameterToString(apiKey));
        }

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        return localVarApiClient.buildCall(localVarPath, "DELETE", this.query, this.collection);
    }

    @SuppressWarnings("rawtypes")
    private com.amazonaws.Response deletePetValidateBeforeCall() throws ApiException {
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new ApiException("Missing the required parameter 'petId' when calling deletePet(Async)");
        }
        

        com.amazonaws.Response localVarCall = deletePetCall();
        return localVarCall;

    }

    /**
     * Deletes a pet
     * 
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid pet value </td><td>  -  </td></tr>
     </table>
     */
    public void deletePet(Long petId, String apiKey) throws ApiException {
        deletePetWithHttpInfo(petId, apiKey);
    }

    /**
     * Deletes a pet
     * 
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid pet value </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response deletePetWithHttpInfo(Long petId, String apiKey) throws ApiException {
        com.amazonaws.Response localVarCall = deletePetValidateBeforeCall();
        return localVarCall;
    }

    /**
     * Build call for findPetsByStatus
     * @param status Status values that need to be considered for filter (required)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid status value </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response findPetsByStatusCall() throws ApiException {
        // create path and map variables
        String localVarPath = "/pet/findByStatus";
        localVarApiClient.setPath(localVarPath);
        localVarApiClient.setMethod("GET");
        setQueryParams(this.query);
        setCollectionQueryParams(this.collection);

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        return localVarApiClient.buildCall(localVarPath, "GET", this.query, this.collection);
    }

    @SuppressWarnings("rawtypes")
    private com.amazonaws.Response findPetsByStatusValidateBeforeCall() throws ApiException {
        
        // verify the required parameter 'status' is set
        if (status == null) {
            throw new ApiException("Missing the required parameter 'status' when calling findPetsByStatus(Async)");
        }
        

        com.amazonaws.Response localVarCall = findPetsByStatusCall();
        return localVarCall;

    }

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param status Status values that need to be considered for filter (required)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid status value </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response findPetsByStatus(List<String> status) throws ApiException {
        com.amazonaws.Response localVarResp = findPetsByStatusWithHttpInfo(status);
        return localVarResp;
    }

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param status Status values that need to be considered for filter (required)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid status value </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response findPetsByStatusWithHttpInfo(List<String> status) throws ApiException {
        com.amazonaws.Response localVarCall = findPetsByStatusValidateBeforeCall();
        return localVarCall;
    }

    /**
     * Build call for findPetsByTags
     * @param tags Tags to filter by (required)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid tag value </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public com.amazonaws.Response findPetsByTagsCall() throws ApiException {
        // create path and map variables
        String localVarPath = "/pet/findByTags";
        localVarApiClient.setPath(localVarPath);
        localVarApiClient.setMethod("GET");
        setQueryParams(this.query);
        setCollectionQueryParams(this.collection);

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        return localVarApiClient.buildCall(localVarPath, "GET", this.query, this.collection);
    }

    @Deprecated
    @SuppressWarnings("rawtypes")
    private com.amazonaws.Response findPetsByTagsValidateBeforeCall() throws ApiException {
        
        // verify the required parameter 'tags' is set
        if (tags == null) {
            throw new ApiException("Missing the required parameter 'tags' when calling findPetsByTags(Async)");
        }
        

        com.amazonaws.Response localVarCall = findPetsByTagsCall();
        return localVarCall;

    }

    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * @param tags Tags to filter by (required)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid tag value </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public com.amazonaws.Response findPetsByTags(Set<String> tags) throws ApiException {
        com.amazonaws.Response localVarResp = findPetsByTagsWithHttpInfo(tags);
        return localVarResp;
    }

    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * @param tags Tags to filter by (required)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid tag value </td><td>  -  </td></tr>
     </table>
     * @deprecated
     */
    @Deprecated
    public com.amazonaws.Response findPetsByTagsWithHttpInfo(Set<String> tags) throws ApiException {
        com.amazonaws.Response localVarCall = findPetsByTagsValidateBeforeCall();
        return localVarCall;
    }

    /**
     * Build call for getPetById
     * @param petId ID of pet to return (required)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Pet not found </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response getPetByIdCall() throws ApiException {
        // create path and map variables
        String localVarPath = "/pet/{petId}"
            .replaceAll("\\{" + "petId" + "\\}", localVarApiClient.escapeString(petId.toString()));
        localVarApiClient.setPath(localVarPath);
        localVarApiClient.setMethod("GET");
        setQueryParams(this.query);
        setCollectionQueryParams(this.collection);

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        return localVarApiClient.buildCall(localVarPath, "GET", this.query, this.collection);
    }

    @SuppressWarnings("rawtypes")
    private com.amazonaws.Response getPetByIdValidateBeforeCall() throws ApiException {
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new ApiException("Missing the required parameter 'petId' when calling getPetById(Async)");
        }
        

        com.amazonaws.Response localVarCall = getPetByIdCall();
        return localVarCall;

    }

    /**
     * Find pet by ID
     * Returns a single pet
     * @param petId ID of pet to return (required)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Pet not found </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response getPetById(Long petId) throws ApiException {
        com.amazonaws.Response localVarResp = getPetByIdWithHttpInfo(petId);
        return localVarResp;
    }

    /**
     * Find pet by ID
     * Returns a single pet
     * @param petId ID of pet to return (required)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Pet not found </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response getPetByIdWithHttpInfo(Long petId) throws ApiException {
        com.amazonaws.Response localVarCall = getPetByIdValidateBeforeCall();
        return localVarCall;
    }

    /**
     * Build call for updatePet
     * @param body Pet object that needs to be added to the store (required)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Pet not found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Validation exception </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response updatePetCall() throws ApiException {
        // create path and map variables
        String localVarPath = "/pet";
        localVarApiClient.setPath(localVarPath);
        localVarApiClient.setMethod("PUT");
        setQueryParams(this.query);
        setCollectionQueryParams(this.collection);

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        return localVarApiClient.buildCall(localVarPath, "PUT", this.query, this.collection);
    }

    @SuppressWarnings("rawtypes")
    private com.amazonaws.Response updatePetValidateBeforeCall() throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updatePet(Async)");
        }
        

        com.amazonaws.Response localVarCall = updatePetCall();
        return localVarCall;

    }

    /**
     * Update an existing pet
     * 
     * @param body Pet object that needs to be added to the store (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Pet not found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Validation exception </td><td>  -  </td></tr>
     </table>
     */
    public void updatePet(Pet body) throws ApiException {
        updatePetWithHttpInfo(body);
    }

    /**
     * Update an existing pet
     * 
     * @param body Pet object that needs to be added to the store (required)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid ID supplied </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Pet not found </td><td>  -  </td></tr>
        <tr><td> 405 </td><td> Validation exception </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response updatePetWithHttpInfo(Pet body) throws ApiException {
        com.amazonaws.Response localVarCall = updatePetValidateBeforeCall();
        return localVarCall;
    }

    /**
     * Build call for updatePetWithForm
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response updatePetWithFormCall() throws ApiException {
        // create path and map variables
        String localVarPath = "/pet/{petId}"
            .replaceAll("\\{" + "petId" + "\\}", localVarApiClient.escapeString(petId.toString()));
        localVarApiClient.setPath(localVarPath);
        localVarApiClient.setMethod("POST");
        setQueryParams(this.query);
        setCollectionQueryParams(this.collection);

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        return localVarApiClient.buildCall(localVarPath, "POST", this.query, this.collection);
    }

    @SuppressWarnings("rawtypes")
    private com.amazonaws.Response updatePetWithFormValidateBeforeCall() throws ApiException {
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new ApiException("Missing the required parameter 'petId' when calling updatePetWithForm(Async)");
        }
        

        com.amazonaws.Response localVarCall = updatePetWithFormCall();
        return localVarCall;

    }

    /**
     * Updates a pet in the store with form data
     * 
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
     */
    public void updatePetWithForm(Long petId, String name, String status) throws ApiException {
        updatePetWithFormWithHttpInfo(petId, name, status);
    }

    /**
     * Updates a pet in the store with form data
     * 
     * @param petId ID of pet that needs to be updated (required)
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 405 </td><td> Invalid input </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response updatePetWithFormWithHttpInfo(Long petId, String name, String status) throws ApiException {
        com.amazonaws.Response localVarCall = updatePetWithFormValidateBeforeCall();
        return localVarCall;
    }

    /**
     * Build call for uploadFile
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param file file to upload (optional)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response uploadFileCall() throws ApiException {
        // create path and map variables
        String localVarPath = "/pet/{petId}/uploadImage"
            .replaceAll("\\{" + "petId" + "\\}", localVarApiClient.escapeString(petId.toString()));
        localVarApiClient.setPath(localVarPath);
        localVarApiClient.setMethod("POST");
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
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        return localVarApiClient.buildCall(localVarPath, "POST", this.query, this.collection);
    }

    @SuppressWarnings("rawtypes")
    private com.amazonaws.Response uploadFileValidateBeforeCall() throws ApiException {
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new ApiException("Missing the required parameter 'petId' when calling uploadFile(Async)");
        }
        

        com.amazonaws.Response localVarCall = uploadFileCall();
        return localVarCall;

    }

    /**
     * uploads an image
     * 
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param file file to upload (optional)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response uploadFile(Long petId, String additionalMetadata, File file) throws ApiException {
        com.amazonaws.Response localVarResp = uploadFileWithHttpInfo(petId, additionalMetadata, file);
        return localVarResp;
    }

    /**
     * uploads an image
     * 
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param file file to upload (optional)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response uploadFileWithHttpInfo(Long petId, String additionalMetadata, File file) throws ApiException {
        com.amazonaws.Response localVarCall = uploadFileValidateBeforeCall();
        return localVarCall;
    }

    /**
     * Build call for uploadFileWithRequiredFile
     * @param petId ID of pet to update (required)
     * @param requiredFile file to upload (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response uploadFileWithRequiredFileCall() throws ApiException {
        // create path and map variables
        String localVarPath = "/fake/{petId}/uploadImageWithRequiredFile"
            .replaceAll("\\{" + "petId" + "\\}", localVarApiClient.escapeString(petId.toString()));
        localVarApiClient.setPath(localVarPath);
        localVarApiClient.setMethod("POST");
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
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        return localVarApiClient.buildCall(localVarPath, "POST", this.query, this.collection);
    }

    @SuppressWarnings("rawtypes")
    private com.amazonaws.Response uploadFileWithRequiredFileValidateBeforeCall() throws ApiException {
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new ApiException("Missing the required parameter 'petId' when calling uploadFileWithRequiredFile(Async)");
        }
        
        // verify the required parameter 'requiredFile' is set
        if (requiredFile == null) {
            throw new ApiException("Missing the required parameter 'requiredFile' when calling uploadFileWithRequiredFile(Async)");
        }
        

        com.amazonaws.Response localVarCall = uploadFileWithRequiredFileCall();
        return localVarCall;

    }

    /**
     * uploads an image (required)
     * 
     * @param petId ID of pet to update (required)
     * @param requiredFile file to upload (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response uploadFileWithRequiredFile(Long petId, File requiredFile, String additionalMetadata) throws ApiException {
        com.amazonaws.Response localVarResp = uploadFileWithRequiredFileWithHttpInfo(petId, requiredFile, additionalMetadata);
        return localVarResp;
    }

    /**
     * uploads an image (required)
     * 
     * @param petId ID of pet to update (required)
     * @param requiredFile file to upload (required)
     * @param additionalMetadata Additional data to pass to server (optional)
     * @return com.amazonaws.Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public com.amazonaws.Response uploadFileWithRequiredFileWithHttpInfo(Long petId, File requiredFile, String additionalMetadata) throws ApiException {
        com.amazonaws.Response localVarCall = uploadFileWithRequiredFileValidateBeforeCall();
        return localVarCall;
    }

}
