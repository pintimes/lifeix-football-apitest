package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Comment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-27T01:11:00.955Z")
public class CommentsApi {
  private ApiClient apiClient;

  public CommentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CommentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u83B7\u5F97Post\u8BC4\u8BBA\u5217\u8868
   * \u67E5\u770BPost\u7684\u8BC4\u8BBA\u5217\u8868
   * @param postId \u6587\u7AE0\u7F16\u53F7 (optional)
   * @param userId \u53D1\u8868\u8BC4\u8BBA\u7684\u4EBA\u7684id (optional)
   * @param userName \u53D1\u8868\u8BC4\u8BBA\u7684\u4EBA\u7684\u59D3\u540D (optional)
   * @param orderBy \u6839\u636E\u54EA\u4E00\u4E2A\u5B57\u6BB5\u8FDB\u884C\u6392\u5E8F\uFF1AcreateTime,floorNum\u7B49 (optional, default to commentTime)
   * @param limit \u4E00\u9875\u663E\u793A\u6570\u76EE\uFF0C\u5982\u679C\u4E0D\u4F20\u9ED8\u8BA4=10 (optional, default to 10)
   * @param isAsc \u662F\u5426\u662F\u5347\u5E8F\uFF0C\u9ED8\u8BA4\u662F\u5347\u5E8F (optional, default to false)
   * @return List<Comment>
   * @throws ApiException if fails to make API call
   */
  public List<Comment> getComments(String postId, String userId, String userName, String orderBy, Integer limit, Boolean isAsc) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/comments".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "postId", postId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user.id", userId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user.name", userName));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isAsc", isAsc));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<Comment>> localVarReturnType = new GenericType<List<Comment>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
