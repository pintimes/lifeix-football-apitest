package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.UploadToken;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class TokenApi {
  private ApiClient apiClient;

  public TokenApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TokenApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u4EE4\u724C
   * \u83B7\u53D6\u6587\u4EF6\u4E0A\u4F20\u4EE4\u724C
   * @param type \u4E0A\u4F20\u6587\u4EF6\u7C7B\u578B\uFF0C|null \u6240\u6709\u7C7B\u578B|0 \u56FE\u7247|1 \u97F3\u9891|2 \u89C6\u9891| (optional)
   * @param key \u5DF2\u5B58\u5728\u4E91\u4E0A\u7684\u6587\u4EF6key\uFF0C\u5982\u679C\u4E0D\u4E3A\u7A7A\uFF0C\u5219\u6B64\u4EE4\u724C\u53EA\u7528\u4E8E\u66FF\u6362\u548C\u8986\u76D6 (optional)
   * @param fileList \u8981\u4E0A\u4F20\u7684\u539F\u59CB\u6587\u4EF6\u540D\u79F0\u5217\u8868 (optional)
   * @return UploadToken
   * @throws ApiException if fails to make API call
   */
  public UploadToken getToken(Integer type, String key, List<String> fileList) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/file/token".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "file_list", fileList));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<UploadToken> localVarReturnType = new GenericType<UploadToken>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
