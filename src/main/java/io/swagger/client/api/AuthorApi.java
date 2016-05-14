package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Author;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class AuthorApi {
  private ApiClient apiClient;

  public AuthorApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthorApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u83B7\u5F97\u5355\u4E2A\u4F5C\u8005
   * \u67E5\u770B\u5355\u4E2A\u4F5C\u8005\u7684\u4FE1\u606F
   * @param key key (required)
   * @param authorId \u4F5C\u8005\u7684Id (required)
   * @return Author
   * @throws ApiException if fails to make API call
   */
  public Author getAuthor(String key, String authorId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getAuthor");
    }
    
    // verify the required parameter 'authorId' is set
    if (authorId == null) {
      throw new ApiException(400, "Missing the required parameter 'authorId' when calling getAuthor");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/authors/{authorId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "authorId" + "\\}", apiClient.escapeString(authorId.toString()));

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

    
    GenericType<Author> localVarReturnType = new GenericType<Author>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
