package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.PostTop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class PosttopApi {
  private ApiClient apiClient;

  public PosttopApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PosttopApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u521B\u5EFA\u4E00\u4E2APostTop\u5373\u4FEE\u6539\u6216\u6DFB\u52A0\u7C7B\u76EE\u4E0B\u7684\u6587\u7AE0
   * \u521B\u5EFA\u4E00\u4E2APostTop\u5373\u4FEE\u6539\u6216\u6DFB\u52A0\u7C7B\u76EE\u4E0B\u7684\u6587\u7AE0
   * @param key key (required)
   * @param posttop \u6587\u7AE0\u7F6E\u9876\u5BF9\u8C61 (required)
   * @return PostTop
   * @throws ApiException if fails to make API call
   */
  public PostTop addOrUpdatePostTop(String key, PostTop posttop) throws ApiException {
    Object localVarPostBody = posttop;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling addOrUpdatePostTop");
    }
    
    // verify the required parameter 'posttop' is set
    if (posttop == null) {
      throw new ApiException(400, "Missing the required parameter 'posttop' when calling addOrUpdatePostTop");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/posttop".replaceAll("\\{format\\}","json");

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

    
    GenericType<PostTop> localVarReturnType = new GenericType<PostTop>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u901A\u8FC7\u7236categoryId\u83B7\u53D6\u6240\u6709\u5B50\u96C6category\u7684\u7F6E\u9876post
   * \u901A\u8FC7\u7236categoryId\u83B7\u53D6\u6240\u6709\u5B50\u96C6category\u7684\u7F6E\u9876post
   * @param key key (required)
   * @param parent \u7236\u7C7B\u76EE\u7684categoryId (optional)
   * @return List<String>
   * @throws ApiException if fails to make API call
   */
  public List<String> getChildTopPosts(String key, String parent) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getChildTopPosts");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/posttop".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "parent", parent));
    

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

    
    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u83B7\u53D6\u4E00\u4E2A\u7C7B\u76EE\u4E0B\u7F6E\u9876\u7684\u6587\u7AE0id\u5217\u8868
   * \u83B7\u53D6\u4E00\u4E2A\u7C7B\u76EE\u4E0B\u7F6E\u9876\u7684\u6587\u7AE0id\u5217\u8868
   * @param key key (required)
   * @param categoryId \u7C7B\u76EEId (required)
   * @return PostTop
   * @throws ApiException if fails to make API call
   */
  public PostTop getTopPosts(String key, String categoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getTopPosts");
    }
    
    // verify the required parameter 'categoryId' is set
    if (categoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'categoryId' when calling getTopPosts");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/posttop/category/{categoryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "categoryId" + "\\}", apiClient.escapeString(categoryId.toString()));

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

    
    GenericType<PostTop> localVarReturnType = new GenericType<PostTop>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
