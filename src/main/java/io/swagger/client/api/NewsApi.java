package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.TimeLineNews;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class NewsApi {
  private ApiClient apiClient;

  public NewsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NewsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u83B7\u53D6\u65F6\u95F4\u8F74\u5F62\u5F0F\u7684\u65B0\u95FB
   * \u8FD4\u56DETimeLineNews\u5BF9\u8C61
   * @param categoryId \u7C7B\u76EEId (required)
   * @param startDate \u67E5\u8BE2\u5F00\u59CB\u65E5\u671F,\u5355\u4F4D\u5929.\u9ED8\u8BA4\u4E3A\u5F53\u5929 (optional)
   * @param limit \u4E00\u9875\u663E\u793A\u6570\u76EE\uFF0C\u5982\u679C\u4E0D\u4F20\u9ED8\u8BA4=5 (optional, default to 5)
   * @return List<TimeLineNews>
   * @throws ApiException if fails to make API call
   */
  public List<TimeLineNews> getTimeLineNewsByCategoryId(String categoryId, String startDate, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'categoryId' is set
    if (categoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'categoryId' when calling getTimeLineNewsByCategoryId");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/posts/news/category/{categoryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "categoryId" + "\\}", apiClient.escapeString(categoryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    
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

    
    GenericType<List<TimeLineNews>> localVarReturnType = new GenericType<List<TimeLineNews>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
