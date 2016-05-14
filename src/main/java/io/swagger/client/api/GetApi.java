package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Admin;
import io.swagger.client.model.Author;
import io.swagger.client.model.Category;
import io.swagger.client.model.TLCompetition;
import io.swagger.client.model.Post;
import io.swagger.client.model.TLPlayer;
import io.swagger.client.model.TLClub;
import io.swagger.client.model.TLTeam;
import io.swagger.client.model.TimeLineNews;
import io.swagger.client.model.UploadToken;
import io.swagger.client.model.PostTop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-13T11:51:50.380Z")
public class GetApi {
  private ApiClient apiClient;

  public GetApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GetApi(ApiClient apiClient) {
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
   * \u83B7\u53D6\u7C7B\u76EE
   * \u8FD4\u56DE\u6240\u6709\u7684\u7C7B\u76EE
   * @return List<Category>
   * @throws ApiException if fails to make API call
   */
  public List<Category> getCategoryList() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/categories".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Category>> localVarReturnType = new GenericType<List<Category>>() {};
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
   * \u6839\u636E\u641C\u7D22\u6761\u4EF6\u83B7\u53D6\u8D5B\u4E8B\u5217\u8868
   * \u83B7\u5F97\u8D5B\u4E8B\u4FE1\u606F
   * @param key key (required)
   * @return List<TLCompetition>
   * @throws ApiException if fails to make API call
   */
  public List<TLCompetition> getCompetitionList(String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getCompetitionList");
    }
    
    // create path and map variables
    String localVarPath = "/timeline/tlcompetitions".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<TLCompetition>> localVarReturnType = new GenericType<List<TLCompetition>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u6839\u636EId\u83B7\u53D6Post\u8BE6\u60C5
   * \u8FD4\u56DEPost\u8BE6\u60C5\u5BF9\u8C61
   * @param key key (required)
   * @param postId Post\u7684ID (required)
   * @return Post
   * @throws ApiException if fails to make API call
   */
  public Post getPost(String key, String postId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getPost");
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u6BCF\u4E2A\u7C7B\u76EE\u4E0Btop\u90E8\u5206\u7684\u65B0\u95FB
   * \u6BCF\u4E2A\u7C7B\u76EE\u4E0Btop\u90E8\u5206\u7684\u65B0\u95FB
   * @param categoryId \u7C7B\u76EEId (required)
   * @param topNum \u4E00\u9875\u663E\u793A\u6570\u76EE\uFF0C\u5982\u679C\u4E0D\u4F20\u9ED8\u8BA4=6 (optional, default to 6)
   * @return List<Post>
   * @throws ApiException if fails to make API call
   */
  public List<Post> getPostsByCategoryId(String categoryId, Integer topNum) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'categoryId' is set
    if (categoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'categoryId' when calling getPostsByCategoryId");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/tops/category/{categoryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "categoryId" + "\\}", apiClient.escapeString(categoryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "topNum", topNum));
    

    

    

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
   * \u83B7\u5F97\u7403\u5458\u4FE1\u606F
   * \u67E5\u770B\u7403\u5458\u4FE1\u606F
   * @param key key (required)
   * @param tlplayerId \u7403\u5458Id (required)
   * @return TLPlayer
   * @throws ApiException if fails to make API call
   */
  public TLPlayer getTLPlayer(String key, String tlplayerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getTLPlayer");
    }
    
    // verify the required parameter 'tlplayerId' is set
    if (tlplayerId == null) {
      throw new ApiException(400, "Missing the required parameter 'tlplayerId' when calling getTLPlayer");
    }
    
    // create path and map variables
    String localVarPath = "/timeline/tlplayers/{tlplayerId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "tlplayerId" + "\\}", apiClient.escapeString(tlplayerId.toString()));

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

    
    GenericType<TLPlayer> localVarReturnType = new GenericType<TLPlayer>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u83B7\u5F97\u7403\u5458\u4FF1\u4E50\u90E8\u4FE1\u606F
   * \u67E5\u770B\u7403\u5458\u4FE1\u606F
   * @param key key (required)
   * @param tlplayerId \u7403\u5458Id (required)
   * @return TLClub
   * @throws ApiException if fails to make API call
   */
  public TLClub getTLPlayerClub(String key, String tlplayerId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getTLPlayerClub");
    }
    
    // verify the required parameter 'tlplayerId' is set
    if (tlplayerId == null) {
      throw new ApiException(400, "Missing the required parameter 'tlplayerId' when calling getTLPlayerClub");
    }
    
    // create path and map variables
    String localVarPath = "/timeline/tlplayers/{tlplayerId}/tlclub".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "tlplayerId" + "\\}", apiClient.escapeString(tlplayerId.toString()));

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

    
    GenericType<TLClub> localVarReturnType = new GenericType<TLClub>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u6839\u636E\u641C\u7D22\u6761\u4EF6\u83B7\u53D6\u7403\u961F\u5217\u8868
   * \u83B7\u5F97\u7403\u961F\u4FE1\u606F
   * @param key key (required)
   * @return List<TLTeam>
   * @throws ApiException if fails to make API call
   */
  public List<TLTeam> getTeamList(String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getTeamList");
    }
    
    // create path and map variables
    String localVarPath = "/timeline/tlteams".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<TLTeam>> localVarReturnType = new GenericType<List<TLTeam>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
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
  
  /**
   * \u4EE4\u724C
   * \u83B7\u53D6\u6587\u4EF6\u4E0A\u4F20\u4EE4\u724C
   * @param type \u4E0A\u4F20\u6587\u4EF6\u7C7B\u578B\uFF0C|null \u6240\u6709\u7C7B\u578B|0 \u56FE\u7247|1 \u97F3\u9891|2 \u89C6\u9891| (optional)
   * @param key \u5DF2\u5B58\u5728\u4E91\u4E0A\u7684\u6587\u4EF6key\uFF0C\u5982\u679C\u4E0D\u4E3A\u7A7A\uFF0C\u5219\u6B64\u4EE4\u724C\u53EA\u7528\u4E8E\u66FF\u6362\u548C\u8986\u76D6 (optional)
   * @param fileList \u8981\u4E0A\u4F20\u7684\u539F\u59CB\u6587\u4EF6\u540D\u79F0\u5217\u8868 (optional)
   * @return UploadToken
   * @throws ApiException if fails to make API call
   */
  public UploadToken getToken(Integer type, String key, List<String> fileList) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/file/token".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "file_list", fileList));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<UploadToken> localVarReturnType = new GenericType<UploadToken>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * top\u65B0\u95FB\u7684news\u8868\u73B0\u5F62\u5F0F
   * top\u65B0\u95FB\u7684news\u8868\u73B0\u5F62\u5F0F
   * @param categoryId \u76EE\u5F55id (optional)
   * @param limit \u4E00\u9875\u663E\u793A\u6570\u76EE\uFF0C\u5982\u679C\u4E0D\u4F20\u9ED8\u8BA4=20 (optional, default to 20)
   * @return List<Post>
   * @throws ApiException if fails to make API call
   */
  public List<Post> getTopNews(String categoryId, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/wemedia/tops/news".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "categoryId", categoryId));
    
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

    
    GenericType<List<Post>> localVarReturnType = new GenericType<List<Post>>() {};
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
   * \u6839\u636E\u641C\u7D22\u6761\u4EF6\u83B7\u53D6Post\u5217\u8868
   * \u6839\u636E\u641C\u7D22\u6761\u4EF6\u83B7\u53D6Post\u5217\u8868\uFF0C\u6BCF\u6B21\u641C\u7D22\u4E0D\u80FD\u8D85\u8FC730\u6761
   * @param key key (required)
   * @param postIds \u6587\u7AE0\u7684id,\u591A\u4E2A\u65F6\u4EE5,\u5206\u9694 (optional)
   * @param categoryId \u7C7B\u76EEid (optional)
   * @param authorId \u4F5C\u8005id (optional)
   * @param startDate \u67E5\u8BE2\u5F00\u59CB\u65E5\u671F,\u5355\u4F4D\u5929 (optional)
   * @param endDate \u67E5\u8BE2\u7ED3\u675F\u65E5\u671F,\u5355\u4F4D\u5929 (optional)
   * @param startTime \u67E5\u8BE2\u5F00\u59CB\u65F6\u95F4\u3002example:\u5206\u9875\u65F6\uFF0C\u4F20\u9012\u7B2C\u4E00\u9875\u6700\u540E\u4E00\u6761\u8BB0\u5F55\u7684createTime(long) (optional)
   * @param limit \u4E00\u9875\u663E\u793A\u591A\u5C11 (optional)
   * @param orderBy \u6309\u7167\u90A3\u4E2A\u5B57\u6BB5\u6392\u5E8F (optional)
   * @param isDesc \u662F\u5426\u6309\u65F6\u95F4\u5012\u5E8F,\u9ED8\u8BA4\u503Ctrue (optional)
   * @return List<Post>
   * @throws ApiException if fails to make API call
   */
  public List<Post> list(String key, String postIds, String categoryId, String authorId, String startDate, String endDate, String startTime, Integer limit, String orderBy, Boolean isDesc) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling list");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/posts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "postIds", postIds));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "categoryId", categoryId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "authorId", authorId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isDesc", isDesc));
    

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

    
    GenericType<List<Post>> localVarReturnType = new GenericType<List<Post>>() {};
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
  
}
