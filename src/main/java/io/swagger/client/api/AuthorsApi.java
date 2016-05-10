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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-09T07:53:17.665Z")
public class AuthorsApi {
  private ApiClient apiClient;

  public AuthorsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthorsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u83B7\u5F97Authors\u5217\u8868
   * \u67E5\u770BPost\u7684\u8BC4\u8BBA\u5217\u8868
   * @param apiKey key (required)
   * @param limit \u4E00\u9875\u663E\u793A\u6570\u76EE\uFF0C\u5982\u679C\u4E0D\u4F20\u9ED8\u8BA4=10 (optional, default to 10)
   * @param orderBy \u6839\u636E\u54EA\u4E00\u4E2A\u5B57\u6BB5\u8FDB\u884C\u6392\u5E8F\uFF1Aid,name (optional, default to name)
   * @param isAsc \u662F\u5426\u662F\u5347\u5E8F\uFF0C\u9ED8\u8BA4\u662F\u5347\u5E8F (optional, default to false)
   * @return List<Author>
   * @throws ApiException if fails to make API call
   */
  public List<Author> getAuthors(String apiKey, Integer limit, String orderBy, Boolean isAsc) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getAuthors");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/authors".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    
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

    
    GenericType<List<Author>> localVarReturnType = new GenericType<List<Author>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
