package com.lifeix.football.wemedia;

import java.util.List;

import io.swagger.client.ApiException;
import io.swagger.client.api.TopsApi;
import io.swagger.client.model.Post;

/**
 * 
 * @author gcc
 */
public class TopTest {

    public static List<Post> getPostsByCategoryId(String categoryId, int topNum) throws ApiException {
        TopsApi api = new TopsApi();
        return api.getPostsByCategoryId(categoryId, topNum);
    }

    public static List<Post> getTopNews(String categoryId, int limit) throws ApiException {
        TopsApi api = new TopsApi();
        return api.getTopNews(categoryId, limit);
    }

}
