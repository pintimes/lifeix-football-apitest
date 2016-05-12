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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-12T02:16:00.506Z")
public class PostsApi {
  private ApiClient apiClient;

  public PostsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PostsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u521B\u5EFA\u4E00\u4E2APost
   * \u521B\u5EFA\u4E00\u4E2APost,\u5176\u4E2Dtitle,content\u5FC5\u586B\u3002
   * @param apiKey key (required)
   * @param post \u5E16\u5B50 (required)
   * @return Post
   * @throws ApiException if fails to make API call
   */
  public Post addPost(String apiKey, Post post) throws ApiException {
    Object localVarPostBody = post;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling addPost");
    }
    
    // verify the required parameter 'post' is set
    if (post == null) {
      throw new ApiException(400, "Missing the required parameter 'post' when calling addPost");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/posts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (apiKey != null)
      localVarHeaderParams.put("apiKey", apiClient.parameterToString(apiKey));
    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Post> localVarReturnType = new GenericType<Post>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u7528\u6237\u5220\u9664Post
   * \u7528\u6237\u5220\u9664Post\uFF0C\u53EA\u80FD\u5220\u9664\u81EA\u5DF1\u7684Post\uFF1B\u8BC4\u8BBA\u7B49\u4E0D\u53D8
   * @param apiKey key (required)
   * @param postIds \u5E16\u5B50Id\u5217\u8868,\u5220\u9664\u591A\u4E2A\u65F6\uFF0C\u4F20\u591A\u6B21postIds (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePost(String apiKey, String postIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling deletePost");
    }
    
    // verify the required parameter 'postIds' is set
    if (postIds == null) {
      throw new ApiException(400, "Missing the required parameter 'postIds' when calling deletePost");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/posts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "postIds", postIds));
    

    if (apiKey != null)
      localVarHeaderParams.put("apiKey", apiClient.parameterToString(apiKey));
    

    

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
  
  /**
   * \u6839\u636EId\u83B7\u53D6Post\u8BE6\u60C5
   * \u8FD4\u56DEPost\u8BE6\u60C5\u5BF9\u8C61
   * @param apiKey key (required)
   * @param postId Post\u7684ID (required)
   * @return Post
   * @throws ApiException if fails to make API call
   */
  public Post getPost(String apiKey, String postId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getPost");
    }
    
    // verify the required parameter 'postId' is set
    if (postId == null) {
      throw new ApiException(400, "Missing the required parameter 'postId' when calling getPost");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/posts/{postId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "postId" + "\\}", apiClient.escapeString(postId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (apiKey != null)
      localVarHeaderParams.put("apiKey", apiClient.parameterToString(apiKey));
    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Post> localVarReturnType = new GenericType<Post>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u6839\u636E\u641C\u7D22\u6761\u4EF6\u83B7\u53D6Post\u5217\u8868
   * \u6839\u636E\u641C\u7D22\u6761\u4EF6\u83B7\u53D6Post\u5217\u8868\uFF0C\u6BCF\u6B21\u641C\u7D22\u4E0D\u80FD\u8D85\u8FC730\u6761
   * @param apiKey key (required)
   * @param title \u6587\u7AE0\u7684\u6807\u9898 (optional)
   * @param hot \u662F\u5426\u662F\u70ED\u5E16 (optional)
   * @param good \u662F\u5426\u5DF2\u52A0\u7CBE (optional)
   * @param top \u662F\u5426\u5DF2\u7F6E\u9876 (optional)
   * @param authorName \u4F5C\u8005\u540D\u5B57 (optional)
   * @param authorId \u4F5C\u8005id (optional)
   * @param orderBy \u6839\u636E\u54EA\u4E00\u4E2A\u5B57\u6BB5\u8FDB\u884C\u6392\u5E8F\uFF1AcreateTime,commentTime (optional, default to commentTime)
   * @param limit \u4E00\u9875\u663E\u793A\u6570\u76EE\uFF0C\u5982\u679C\u4E0D\u4F20\u9ED8\u8BA4=10 (optional, default to 10)
   * @param isAsc \u662F\u5426\u662F\u5347\u5E8F\uFF0C\u9ED8\u8BA4\u662F\u5347\u5E8F (optional, default to false)
   * @return List<Post>
   * @throws ApiException if fails to make API call
   */
  public List<Post> getPostList(String apiKey, String title, Boolean hot, Boolean good, Boolean top, String authorName, String authorId, String orderBy, Integer limit, Boolean isAsc) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getPostList");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/posts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hot", hot));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "good", good));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "top", top));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "author.name", authorName));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "author.id", authorId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isAsc", isAsc));
    

    if (apiKey != null)
      localVarHeaderParams.put("apiKey", apiClient.parameterToString(apiKey));
    

    

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
   * \u4FEE\u6539\u4E00\u4E2APost
   * 
   * @param apiKey key (required)
   * @param post \u5E16\u5B50 postId\u5FC5\u987B\u4F20 (required)
   * @return Post
   * @throws ApiException if fails to make API call
   */
  public Post wemediaPostsPut(String apiKey, Post post) throws ApiException {
    Object localVarPostBody = post;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling wemediaPostsPut");
    }
    
    // verify the required parameter 'post' is set
    if (post == null) {
      throw new ApiException(400, "Missing the required parameter 'post' when calling wemediaPostsPut");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/posts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (apiKey != null)
      localVarHeaderParams.put("apiKey", apiClient.parameterToString(apiKey));
    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Post> localVarReturnType = new GenericType<Post>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
