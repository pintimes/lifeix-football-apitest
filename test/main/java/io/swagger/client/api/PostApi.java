package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Comment;
import io.swagger.client.model.Post;
import io.swagger.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-04-27T01:11:00.955Z")
public class PostApi {
  private ApiClient apiClient;

  public PostApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PostApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u8BC4\u8BBA
   * \u8BC4\u8BBA\uFF0CpostId\uFF08\u5FC5\u987B\uFF09\u3001content(\u5FC5\u987B)\u3001images(\u975E\u5FC5\u987B\uFF0C\u4E0D\u4E0A\u4F20\u56FE\u7247\u53EF\u4EE5\u4E0D\u4F20),\u5176\u4ED6\u5B57\u6BB5\u540E\u53F0\u751F\u6210\u3002
   * @param userId authorization (required)
   * @param comment \u8BC4\u8BBA (required)
   * @return Comment
   * @throws ApiException if fails to make API call
   */
  public Comment addComment(String userId, Comment comment) throws ApiException {
    Object localVarPostBody = comment;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling addComment");
    }
    
    // verify the required parameter 'comment' is set
    if (comment == null) {
      throw new ApiException(400, "Missing the required parameter 'comment' when calling addComment");
    }
    
    // create path and map variables
    String localVarPath = "/comments".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (userId != null)
      localVarHeaderParams.put("userId", apiClient.parameterToString(userId));
    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Comment> localVarReturnType = new GenericType<Comment>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u521B\u5EFA\u4E00\u4E2APost
   * \u521B\u5EFA\u4E00\u4E2APost,\u5176\u4E2Dtitle,content\u5FC5\u586B\u3002
   * @param userId authorization (required)
   * @param post \u5E16\u5B50 (required)
   * @return Post
   * @throws ApiException if fails to make API call
   */
  public Post addPost(String userId, Post post) throws ApiException {
    Object localVarPostBody = post;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling addPost");
    }
    
    // verify the required parameter 'post' is set
    if (post == null) {
      throw new ApiException(400, "Missing the required parameter 'post' when calling addPost");
    }
    
    // create path and map variables
    String localVarPath = "/posts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (userId != null)
      localVarHeaderParams.put("userId", apiClient.parameterToString(userId));
    

    

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
   * \u7528\u6237\u5BF9Post\u70B9\u8D5E
   * \u7528\u6237\u5BF9Post\u70B9\u8D5E
   * @param userId authorization (required)
   * @param postId \u7528\u6237\u559C\u6B22\u7684PostId (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User addPostLike(String userId, String postId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling addPostLike");
    }
    
    // verify the required parameter 'postId' is set
    if (postId == null) {
      throw new ApiException(400, "Missing the required parameter 'postId' when calling addPostLike");
    }
    
    // create path and map variables
    String localVarPath = "/likes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "postId", postId));
    

    if (userId != null)
      localVarHeaderParams.put("userId", apiClient.parameterToString(userId));
    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u7528\u6237\u5220\u9664Post
   * \u7528\u6237\u5220\u9664Post\uFF0C\u53EA\u80FD\u5220\u9664\u81EA\u5DF1\u7684Post\uFF1B\u8BC4\u8BBA\u7B49\u4E0D\u53D8
   * @param userId authorization (required)
   * @param postIds \u5E16\u5B50Id\u5217\u8868,\u5220\u9664\u591A\u4E2A\u65F6\uFF0C\u4F20\u591A\u6B21postIds (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePost(String userId, String postIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling deletePost");
    }
    
    // verify the required parameter 'postIds' is set
    if (postIds == null) {
      throw new ApiException(400, "Missing the required parameter 'postIds' when calling deletePost");
    }
    
    // create path and map variables
    String localVarPath = "/posts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "postIds", postIds));
    

    if (userId != null)
      localVarHeaderParams.put("userId", apiClient.parameterToString(userId));
    

    

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
   * @param postId Post\u7684ID (required)
   * @return Post
   * @throws ApiException if fails to make API call
   */
  public Post getPost(String postId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'postId' is set
    if (postId == null) {
      throw new ApiException(400, "Missing the required parameter 'postId' when calling getPost");
    }
    
    // create path and map variables
    String localVarPath = "/posts/{postId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "postId" + "\\}", apiClient.escapeString(postId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Post> localVarReturnType = new GenericType<Post>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u4FEE\u6539\u4E00\u4E2APost
   * 
   * @param userId authorization (required)
   * @param post \u5E16\u5B50 postId\u5FC5\u987B\u4F20 (required)
   * @return Post
   * @throws ApiException if fails to make API call
   */
  public Post postsPut(String userId, Post post) throws ApiException {
    Object localVarPostBody = post;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling postsPut");
    }
    
    // verify the required parameter 'post' is set
    if (post == null) {
      throw new ApiException(400, "Missing the required parameter 'post' when calling postsPut");
    }
    
    // create path and map variables
    String localVarPath = "/posts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (userId != null)
      localVarHeaderParams.put("userId", apiClient.parameterToString(userId));
    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Post> localVarReturnType = new GenericType<Post>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
