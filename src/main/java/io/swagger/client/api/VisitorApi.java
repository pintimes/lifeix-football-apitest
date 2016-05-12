package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.Category;
import io.swagger.client.model.Comment;
import io.swagger.client.model.TLCompetition;
import io.swagger.client.model.Post;
import io.swagger.client.model.TLClub;
import io.swagger.client.model.TLPlayer;
import io.swagger.client.model.TLTeam;
import io.swagger.client.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-12T02:16:00.506Z")
public class VisitorApi {
  private ApiClient apiClient;

  public VisitorApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VisitorApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
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
  
  /**
   * \u83B7\u5F97Post\u8BC4\u8BBA\u5217\u8868
   * \u67E5\u770BPost\u7684\u8BC4\u8BBA\u5217\u8868
   * @param apiKey key (required)
   * @param postId \u6587\u7AE0\u7F16\u53F7 (optional)
   * @param userId \u53D1\u8868\u8BC4\u8BBA\u7684\u4EBA\u7684id (optional)
   * @param userName \u53D1\u8868\u8BC4\u8BBA\u7684\u4EBA\u7684\u59D3\u540D (optional)
   * @param orderBy \u6839\u636E\u54EA\u4E00\u4E2A\u5B57\u6BB5\u8FDB\u884C\u6392\u5E8F\uFF1AcreateTime,floorNum\u7B49 (optional, default to commentTime)
   * @param limit \u4E00\u9875\u663E\u793A\u6570\u76EE\uFF0C\u5982\u679C\u4E0D\u4F20\u9ED8\u8BA4=10 (optional, default to 10)
   * @param isAsc \u662F\u5426\u662F\u5347\u5E8F\uFF0C\u9ED8\u8BA4\u662F\u5347\u5E8F (optional, default to false)
   * @return List<Comment>
   * @throws ApiException if fails to make API call
   */
  public List<Comment> getComments(String apiKey, String postId, String userId, String userName, String orderBy, Integer limit, Boolean isAsc) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getComments");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/comments".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "postId", postId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user.id", userId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user.name", userName));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
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

    
    GenericType<List<Comment>> localVarReturnType = new GenericType<List<Comment>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u6839\u636E\u641C\u7D22\u6761\u4EF6\u83B7\u53D6\u8D5B\u4E8B\u5217\u8868
   * \u83B7\u5F97\u8D5B\u4E8B\u4FE1\u606F
   * @param apiKey key (required)
   * @return List<TLCompetition>
   * @throws ApiException if fails to make API call
   */
  public List<TLCompetition> getCompetitionList(String apiKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getCompetitionList");
    }
    
    // create path and map variables
    String localVarPath = "/timeline/tlcompetitions".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<TLCompetition>> localVarReturnType = new GenericType<List<TLCompetition>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u6839\u636EId\u83B7\u53D6Post\u8BE6\u60C5
   * \u8FD4\u56DEPost\u8BE6\u60C5\u5BF9\u8C61
   * @param apiKey key (required)
   * @param postId Post\u7684ID (required)
   * @return Post
   * @throws ApiException if fails to make API call
   */
  public Post getPost(String apiKey, String postId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getPost");
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

    
    GenericType<Post> localVarReturnType = new GenericType<Post>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u6839\u636E\u641C\u7D22\u6761\u4EF6\u83B7\u53D6Post\u5217\u8868
   * \u6839\u636E\u641C\u7D22\u6761\u4EF6\u83B7\u53D6Post\u5217\u8868\uFF0C\u6BCF\u6B21\u641C\u7D22\u4E0D\u80FD\u8D85\u8FC730\u6761
   * @param apiKey key (required)
   * @param title \u6587\u7AE0\u7684\u6807\u9898 (optional)
   * @param hot \u662F\u5426\u662F\u70ED\u5E16 (optional)
   * @param good \u662F\u5426\u5DF2\u52A0\u7CBE (optional)
   * @param top \u662F\u5426\u5DF2\u7F6E\u9876 (optional)
   * @param authorName \u4F5C\u8005\u540D\u5B57 (optional)
   * @param authorId \u4F5C\u8005id (optional)
   * @param orderBy \u6839\u636E\u54EA\u4E00\u4E2A\u5B57\u6BB5\u8FDB\u884C\u6392\u5E8F\uFF1AcreateTime,commentTime (optional, default to commentTime)
   * @param limit \u4E00\u9875\u663E\u793A\u6570\u76EE\uFF0C\u5982\u679C\u4E0D\u4F20\u9ED8\u8BA4=10 (optional, default to 10)
   * @param isAsc \u662F\u5426\u662F\u5347\u5E8F\uFF0C\u9ED8\u8BA4\u662F\u5347\u5E8F (optional, default to false)
   * @return List<Post>
   * @throws ApiException if fails to make API call
   */
  public List<Post> getPostList(String apiKey, String title, Boolean hot, Boolean good, Boolean top, String authorName, String authorId, String orderBy, Integer limit, Boolean isAsc) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getPostList");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/posts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hot", hot));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "good", good));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "top", top));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "author.name", authorName));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "author.id", authorId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
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

    
    GenericType<List<Post>> localVarReturnType = new GenericType<List<Post>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u83B7\u5F97\u4FF1\u4E50\u90E8\u5217\u8868
   * \u83B7\u5F97\u4FF1\u4E50\u90E8\u5217\u8868
   * @param apiKey key (required)
   * @return List<TLClub>
   * @throws ApiException if fails to make API call
   */
  public List<TLClub> getTLClubList(String apiKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getTLClubList");
    }
    
    // create path and map variables
    String localVarPath = "/timeline/tlclubs".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<TLClub>> localVarReturnType = new GenericType<List<TLClub>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
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
  
  /**
   * \u83B7\u5F97\u7403\u961F\u4FE1\u606F
   * \u83B7\u5F97\u7403\u961F\u4FE1\u606F
   * @param apiKey key (required)
   * @param tlteamId \u7403\u961FId (required)
   * @return TLTeam
   * @throws ApiException if fails to make API call
   */
  public TLTeam getTLTeam(String apiKey, String tlteamId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getTLTeam");
    }
    
    // verify the required parameter 'tlteamId' is set
    if (tlteamId == null) {
      throw new ApiException(400, "Missing the required parameter 'tlteamId' when calling getTLTeam");
    }
    
    // create path and map variables
    String localVarPath = "/timeline/tlteams/{tlteamId}".replaceAll("\\{format\\}","json")
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

    
    GenericType<TLTeam> localVarReturnType = new GenericType<TLTeam>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u83B7\u5F97\u7403\u961F\u4FE1\u606F
   * \u83B7\u5F97\u7403\u961F\u4FE1\u606F
   * @param apiKey key (required)
   * @return List<TLTeam>
   * @throws ApiException if fails to make API call
   */
  public List<TLTeam> getTLTeamList(String apiKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling getTLTeamList");
    }
    
    // create path and map variables
    String localVarPath = "/timeline/tlteams".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<TLTeam>> localVarReturnType = new GenericType<List<TLTeam>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * \u6839\u636EpostId\u83B7\u53D6\u5BF9\u6B64\u7BC7\u6587\u7AE0\u70B9\u8D5E\u7684\u7528\u6237\u5217\u8868
   * \u8FD4\u56DE\u70B9\u8D5E\u7684\u7528\u6237\u5217\u8868
   * @param apiKey key (required)
   * @param postId \u7528\u6237\u559C\u6B22\u7684PostId (required)
   * @param limit \u4E00\u9875\u663E\u793A\u6570\u76EE\uFF0C\u5982\u679C\u4E0D\u4F20\u9ED8\u8BA4=10 (optional, default to 10)
   * @return List<User>
   * @throws ApiException if fails to make API call
   */
  public List<User> wemediaLikesUsersGet(String apiKey, String postId, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'apiKey' when calling wemediaLikesUsersGet");
    }
    
    // verify the required parameter 'postId' is set
    if (postId == null) {
      throw new ApiException(400, "Missing the required parameter 'postId' when calling wemediaLikesUsersGet");
    }
    
    // create path and map variables
    String localVarPath = "/wemedia/likes/users".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "postId", postId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

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

    
    GenericType<List<User>> localVarReturnType = new GenericType<List<User>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
