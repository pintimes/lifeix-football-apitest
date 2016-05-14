package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class RedisApi {
  private ApiClient apiClient;

  public RedisApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RedisApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u7BA1\u7406\u5458\u5220\u9664zset,\u76EE\u524DcollectionName[ posts timelineNews topNews homepageNews]
   * \u7BA1\u7406\u5458\u5220\u9664zset,categoryId\u6709\u503C\u65F6\u5220\u9664zset\u4E0B\u542B\u6709categoryId\u7684\u7F13\u5B58\u3002\u6CA1\u6709\u503C\u65F6\uFF0C\u6E05\u7A7Azset
   * @param key key (required)
   * @param collectionName \u63A5\u53E3\u5BF9\u5E94\u7684cacheName (required)
   * @param categoryId \u7C7B\u76EEid (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteRedisByKey(String key, String collectionName, String categoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling deleteRedisByKey");
    }
    
    // verify the required parameter 'collectionName' is set
    if (collectionName == null) {
      throw new ApiException(400, "Missing the required parameter 'collectionName' when calling deleteRedisByKey");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/redis/cacheCollection".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collectionName", collectionName));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "categoryId", categoryId));
    

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

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
}
