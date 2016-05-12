package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.TLPlayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-12T02:16:00.506Z")
public class TlplayersApi {
  private ApiClient apiClient;

  public TlplayersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TlplayersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u83B7\u53D6\u67D0\u4E00Team\u4E0B\u7403\u5458\u5217\u8868
   * \u83B7\u53D6\u67D0\u4E00Team\u4E0B\u7403\u5458\u5217\u8868
   * @param apiKey key (required)
   * @param tlteamId \u7403\u961FId (required)
   * @return List<TLPlayer>
   * @throws ApiException if fails to make API call
   */
  public List<TLPlayer> getTLPlayerList(String apiKey, String tlteamId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getTLPlayerList");
    }
    
    // verify the required parameter 'tlteamId' is set
    if (tlteamId == null) {
      throw new ApiException(400, "Missing the required parameter 'tlteamId' when calling getTLPlayerList");
    }
    
    // create path and map variables
    String localVarPath = "/timeline/tlteams/{tlteamId}/tlplayers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "tlteamId" + "\\}", apiClient.escapeString(tlteamId.toString()));

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

    
    GenericType<List<TLPlayer>> localVarReturnType = new GenericType<List<TLPlayer>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
