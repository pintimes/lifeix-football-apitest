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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T07:53:17.665Z")
public class CommentApi {
  private ApiClient apiClient;

  public CommentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CommentApi(ApiClient apiClient) {
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
   * @param apiKey key (required)
   * @param comment \u8BC4\u8BBA (required)
   * @return Comment
   * @throws ApiException if fails to make API call
   */
  public Comment addComment(String apiKey, Comment comment) throws ApiException {
    Object localVarPostBody = comment;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling addComment");
    }
    
    // verify the required parameter 'comment' is set
    if (comment == null) {
      throw new ApiException(400, "Missing the required parameter 'comment' when calling addComment");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/comments".replaceAll("\\{format\\}","json");

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

    
    GenericType<Comment> localVarReturnType = new GenericType<Comment>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u7528\u6237\u5220\u9664Comment
   * \u7528\u6237\u5220\u9664Comment,\u53EA\u80FD\u5220\u9664\u81EA\u5DF1\u7684Comment
   * @param apiKey key (required)
   * @param commentId \u8BC4\u8BBAId (required)
   * @return Comment
   * @throws ApiException if fails to make API call
   */
  public Comment deleteComment(String apiKey, String commentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling deleteComment");
    }
    
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling deleteComment");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/comments/{commentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()));

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

    
    GenericType<Comment> localVarReturnType = new GenericType<Comment>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u83B7\u5F97Post\u8BC4\u8BBA
   * \u67E5\u770BPost\u7684\u5355\u4E2A\u8BC4\u8BBA
   * @param apiKey key (required)
   * @param commentId \u8BC4\u8BBAId (required)
   * @return Comment
   * @throws ApiException if fails to make API call
   */
  public Comment getComment(String apiKey, String commentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getComment");
    }
    
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling getComment");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/comments/{commentId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()));

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

    
    GenericType<Comment> localVarReturnType = new GenericType<Comment>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
