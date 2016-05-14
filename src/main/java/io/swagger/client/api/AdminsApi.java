package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class AdminsApi {
  private ApiClient apiClient;

  public AdminsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdminsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u83B7\u5F97Admin\u5217\u8868
   * \u8FD4\u56DE\u6240\u6709\u7684\u7BA1\u7406\u5458
   * @param key key (required)
   * @return List<Admin>
   * @throws ApiException if fails to make API call
   */
  public List<Admin> getAdminList(String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getAdminList");
    }
    
    // create path and map variables
    String localVarPath = "/admins".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Admin>> localVarReturnType = new GenericType<List<Admin>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Admin\u767B\u5F55
   * Admin\u767B\u5F55\uFF0C\u4F20\u5165Email,Password\u7684\u52A0\u5BC6\u5F62\u5F0F\u00B7
   * @param admin \u7BA1\u7406\u5458 (required)
   * @return Admin
   * @throws ApiException if fails to make API call
   */
  public Admin loginAdmin(Admin admin) throws ApiException {
    Object localVarPostBody = admin;
    
    // verify the required parameter 'admin' is set
    if (admin == null) {
      throw new ApiException(400, "Missing the required parameter 'admin' when calling loginAdmin");
    }
    
    // create path and map variables
    String localVarPath = "/admins/login".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Admin> localVarReturnType = new GenericType<Admin>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Admin\u6CE8\u518C
   * Admin\u6CE8\u518C\uFF0C\u5FC5\u987B\u63D0\u4F9BEmail,Password,Name
   * @param admin \u7BA1\u7406\u5458 (required)
   * @return Admin
   * @throws ApiException if fails to make API call
   */
  public Admin registAdmin(Admin admin) throws ApiException {
    Object localVarPostBody = admin;
    
    // verify the required parameter 'admin' is set
    if (admin == null) {
      throw new ApiException(400, "Missing the required parameter 'admin' when calling registAdmin");
    }
    
    // create path and map variables
    String localVarPath = "/admins/regist".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Admin> localVarReturnType = new GenericType<Admin>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
