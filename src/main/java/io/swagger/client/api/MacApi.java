package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Like;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-12T08:03:38.486Z")
public class MacApi {
  private ApiClient apiClient;

  public MacApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MacApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u5BF9\u67D0\u4E00\u4E2A\u7403\u5458\u70B9\u8D5E
   * \u4E00\u4E2AMac\u5730\u5740\u53EA\u80FD\u5BF9\u4E00\u4E2A\u7403\u5458\u70B9\u8D5E\u4E00\u6B21
   * @param apiKey key (required)
   * @param playerId \u7403\u5458Id (required)
   * @return Like
   * @throws ApiException if fails to make API call
   */
  public Like likeTLPlayer(String apiKey, String playerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling likeTLPlayer");
    }
    
    // verify the required parameter 'playerId' is set
    if (playerId == null) {
      throw new ApiException(400, "Missing the required parameter 'playerId' when calling likeTLPlayer");
    }
    
    // create path and map variables
    String localVarPath = "/likes/timeline".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (apiKey != null)
      localVarHeaderParams.put("apiKey", apiClient.parameterToString(apiKey));
    

    if (playerId != null)
      localVarFormParams.put("playerId", playerId);
    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Like> localVarReturnType = new GenericType<Like>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
