package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Author;
import io.swagger.client.model.Category;
import io.swagger.client.model.PostTop;
import io.swagger.client.model.Post;
import io.swagger.client.model.Admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class AdminApi {
  private ApiClient apiClient;

  public AdminApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdminApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * \u521B\u5EFA\u4E00\u4E2AAuthor
   * \u521B\u5EFA\u4E00\u4E2AAuthor,\u5176\u4E2Dname\u5FC5\u586B
   * @param key key (required)
   * @param author \u4F5C\u8005 (required)
   * @return Author
   * @throws ApiException if fails to make API call
   */
  public Author addAuthor(String key, Author author) throws ApiException {
    Object localVarPostBody = author;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling addAuthor");
    }
    
    // verify the required parameter 'author' is set
    if (author == null) {
      throw new ApiException(400, "Missing the required parameter 'author' when calling addAuthor");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/authors".replaceAll("\\{format\\}","json");

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u521B\u5EFA\u4E00\u4E2ACategory
   * \u521B\u5EFA\u4E00\u4E2ACategory\uFF0C\u5E76\u5237\u65B0\u7F13\u5B58\u5217\u8868
   * @param key key (required)
   * @param category \u7C7B\u76EE (required)
   * @return Category
   * @throws ApiException if fails to make API call
   */
  public Category addCategory(String key, Category category) throws ApiException {
    Object localVarPostBody = category;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling addCategory");
    }
    
    // verify the required parameter 'category' is set
    if (category == null) {
      throw new ApiException(400, "Missing the required parameter 'category' when calling addCategory");
    }
    
    // create path and map variables
    String localVarPath = "/categories".replaceAll("\\{format\\}","json");

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

    
    GenericType<Category> localVarReturnType = new GenericType<Category>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
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
   * \u521B\u5EFA\u4E00\u4E2APost
   * \u521B\u5EFA\u4E00\u4E2APost,\u5176\u4E2Dtitle\u5FC5\u586B\u3002content\u3001images\u3001videos\u4E09\u8005\u81F3\u5C11\u6709\u4E00\u4E2A\u4E0D\u4E3A\u7A7A
   * @param key key (required)
   * @param post \u5E16\u5B50 (required)
   * @return Post
   * @throws ApiException if fails to make API call
   */
  public Post addPost(String key, Post post) throws ApiException {
    Object localVarPostBody = post;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling addPost");
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

    
    GenericType<Post> localVarReturnType = new GenericType<Post>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u7528\u6237\u5220\u9664Post
   * \u7528\u6237\u5220\u9664Post\uFF0C\u53EA\u80FD\u5220\u9664\u81EA\u5DF1\u7684Post
   * @param key key (required)
   * @param postIds \u5E16\u5B50Id\u5217\u8868,\u5220\u9664\u591A\u4E2A\u65F6\uFF0C\u4F20\u591A\u6B21postIds.example:xxx?postIds=111&amp;postIds=222 (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePost(String key, String postIds) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling deletePost");
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

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * \u7BA1\u7406\u5458\u5220\u9664zset,\u76EE\u524DcollectionName[ posts timelineNews topNews homepageNews]
   * \u7BA1\u7406\u5458\u5220\u9664zset,categoryId\u6709\u503C\u65F6\u5220\u9664zset\u4E0B\u542B\u6709categoryId\u7684\u7F13\u5B58\u3002\u6CA1\u6709\u503C\u65F6\uFF0C\u6E05\u7A7Azset
   * @param key key (required)
   * @param collectionName \u63A5\u53E3\u5BF9\u5E94\u7684cacheName (required)
   * @param categoryId \u7C7B\u76EEid (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteRedisByKey(String key, String collectionName, String categoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling deleteRedisByKey");
    }
    
    // verify the required parameter 'collectionName' is set
    if (collectionName == null) {
      throw new ApiException(400, "Missing the required parameter 'collectionName' when calling deleteRedisByKey");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/redis/cacheCollection".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collectionName", collectionName));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "categoryId", categoryId));
    

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

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
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
  
  /**
   * \u83B7\u5F97Authors\u5217\u8868
   * \u67E5\u770BPost\u7684\u8BC4\u8BBA\u5217\u8868
   * @param key key (required)
   * @return List<Author>
   * @throws ApiException if fails to make API call
   */
  public List<Author> getAuthors(String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getAuthors");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/authors".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Author>> localVarReturnType = new GenericType<List<Author>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
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
   * \u5237\u65B0\u7F13\u5B58
   * \u5237\u65B0\u7F13\u5B58\uFF0C\u8FD4\u56DE\u6570\u636E
   * @param key key (required)
   * @return List<Category>
   * @throws ApiException if fails to make API call
   */
  public List<Category> refreshCategory(String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling refreshCategory");
    }
    
    // create path and map variables
    String localVarPath = "/categories/refresh".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Category>> localVarReturnType = new GenericType<List<Category>>() {};
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
  
  /**
   * \u4FEE\u6539\u4E00\u4E2APost
   * 
   * @param key key (required)
   * @param postId Post\u7684ID (required)
   * @param post \u5B8C\u6574\u7684post json\u683C\u5F0F\u3002example:\u5C06\u67E5\u8BE2\u7ED3\u679C\u4FEE\u6539\u540E  \u5B8C\u6574\u4F20\u56DE (required)
   * @return Post
   * @throws ApiException if fails to make API call
   */
  public Post wemediaPostsPostIdPut(String key, String postId, Post post) throws ApiException {
    Object localVarPostBody = post;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling wemediaPostsPostIdPut");
    }
    
    // verify the required parameter 'postId' is set
    if (postId == null) {
      throw new ApiException(400, "Missing the required parameter 'postId' when calling wemediaPostsPostIdPut");
    }
    
    // verify the required parameter 'post' is set
    if (post == null) {
      throw new ApiException(400, "Missing the required parameter 'post' when calling wemediaPostsPostIdPut");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/posts/{postId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "postId" + "\\}", apiClient.escapeString(postId.toString()));

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

    
    GenericType<Post> localVarReturnType = new GenericType<Post>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
