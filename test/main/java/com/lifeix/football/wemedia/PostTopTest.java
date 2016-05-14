package com.lifeix.football.wemedia;

import java.util.List;

import io.swagger.client.ApiException;
import io.swagger.client.api.PosttopApi;
import io.swagger.client.model.PostTop;

/**
 * 
 * @author gcc
 *
 */
public class PostTopTest {

    public static PostTop addPostTop(PostTop posttop) throws ApiException {
        PosttopApi api = new PosttopApi();

        return api.addOrUpdatePostTop(ApiKey.key, posttop);
    }

    public List<String> getChildPostIds(String parent) throws ApiException {
        PosttopApi api = new PosttopApi();

        return api.getChildTopPosts(ApiKey.key, parent);
    }
}
