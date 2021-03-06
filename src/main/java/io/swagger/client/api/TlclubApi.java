package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.TLClub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class TlclubApi {
  private ApiClient apiClient;

  public TlclubApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TlclubApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u83B7\u5F97\u7403\u5458\u4FF1\u4E50\u90E8\u4FE1\u606F
   * \u67E5\u770B\u7403\u5458\u4FE1\u606F
   * @param key key (required)
   * @param tlplayerId \u7403\u5458Id (required)
   * @return TLClub
   * @throws ApiException if fails to make API call
   */
  public TLClub getTLPlayerClub(String key, String tlplayerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getTLPlayerClub");
    }
    
    // verify the required parameter 'tlplayerId' is set
    if (tlplayerId == null) {
      throw new ApiException(400, "Missing the required parameter 'tlplayerId' when calling getTLPlayerClub");
    }
    
    // create path and map variables
    String localVarPath = "/timeline/tlplayers/{tlplayerId}/tlclub".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "tlplayerId" + "\\}", apiClient.escapeString(tlplayerId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (key != null)
      localVarHeaderParams.put("key", apiClient.parameterToString(key));
    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<TLClub> localVarReturnType = new GenericType<TLClub>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
