package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Post;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class TopsApi {
  private ApiClient apiClient;

  public TopsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TopsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u6BCF\u4E2A\u7C7B\u76EE\u4E0Btop\u90E8\u5206\u7684\u65B0\u95FB
   * \u6BCF\u4E2A\u7C7B\u76EE\u4E0Btop\u90E8\u5206\u7684\u65B0\u95FB
   * @param categoryId \u7C7B\u76EEId (required)
   * @param topNum \u4E00\u9875\u663E\u793A\u6570\u76EE\uFF0C\u5982\u679C\u4E0D\u4F20\u9ED8\u8BA4=6 (optional, default to 6)
   * @return List<Post>
   * @throws ApiException if fails to make API call
   */
  public List<Post> getPostsByCategoryId(String categoryId, Integer topNum) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'categoryId' is set
    if (categoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'categoryId' when calling getPostsByCategoryId");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/tops/category/{categoryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "categoryId" + "\\}", apiClient.escapeString(categoryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "topNum", topNum));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<Post>> localVarReturnType = new GenericType<List<Post>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * top\u65B0\u95FB\u7684news\u8868\u73B0\u5F62\u5F0F
   * top\u65B0\u95FB\u7684news\u8868\u73B0\u5F62\u5F0F
   * @param categoryId \u76EE\u5F55id (optional)
   * @param limit \u4E00\u9875\u663E\u793A\u6570\u76EE\uFF0C\u5982\u679C\u4E0D\u4F20\u9ED8\u8BA4=20 (optional, default to 20)
   * @return List<Post>
   * @throws ApiException if fails to make API call
   */
  public List<Post> getTopNews(String categoryId, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/wemedia/tops/news".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "categoryId", categoryId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<Post>> localVarReturnType = new GenericType<List<Post>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
