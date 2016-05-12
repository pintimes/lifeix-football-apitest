package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-12T08:03:38.486Z")
public class TlcompetionsApi {
  private ApiClient apiClient;

  public TlcompetionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TlcompetionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u4FEE\u6539\u6BD4\u8D5B\u6BD4\u5206
   * \u4FEE\u6539\u6BD4\u8D5B\u6BD4\u5206\uFF1A\u7BA1\u7406\u5458\u4F20\u5165\u4E3B\u573A\u6BD4\u5206\u548C\u5BA2\u573A\u6BD4\u5206
   * @param apiKey key (required)
   * @param tlcompetitionId \u8D5B\u4E8BId (required)
   * @param hostScore \u4E3B\u573A\u6BD4\u5206 (required)
   * @param guestScore \u5BA2\u573A\u6BD4\u5206 (required)
   * @throws ApiException if fails to make API call
   */
  public void updateTLCompetitionScore(String apiKey, String tlcompetitionId, Integer hostScore, Integer guestScore) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling updateTLCompetitionScore");
    }
    
    // verify the required parameter 'tlcompetitionId' is set
    if (tlcompetitionId == null) {
      throw new ApiException(400, "Missing the required parameter 'tlcompetitionId' when calling updateTLCompetitionScore");
    }
    
    // verify the required parameter 'hostScore' is set
    if (hostScore == null) {
      throw new ApiException(400, "Missing the required parameter 'hostScore' when calling updateTLCompetitionScore");
    }
    
    // verify the required parameter 'guestScore' is set
    if (guestScore == null) {
      throw new ApiException(400, "Missing the required parameter 'guestScore' when calling updateTLCompetitionScore");
    }
    
    // create path and map variables
    String localVarPath = "/timeline/tlcompetitions/{tlcompetitionId}/score".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "tlcompetitionId" + "\\}", apiClient.escapeString(tlcompetitionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    if (apiKey != null)
      localVarHeaderParams.put("apiKey", apiClient.parameterToString(apiKey));
    

    if (hostScore != null)
      localVarFormParams.put("hostScore", hostScore);
    if (guestScore != null)
      localVarFormParams.put("guestScore", guestScore);
    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
}
