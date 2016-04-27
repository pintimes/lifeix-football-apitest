package com.lifeix.football.wemedia;

import java.util.List;

import org.junit.Test;

import io.swagger.client.ApiException;
import io.swagger.client.api.PostsApi;
import io.swagger.client.model.Post;

public class PostListTest {

    private PostsApi api = new PostsApi();

    @Test
    public void getAll() throws ApiException {
        List<Post> postList = api.getPostList(null, null, null, null, null, null, null, null, null);
        for (Post post : postList) {
            System.out.println(post);
        }
    }

    /**
     * title 中包含test的post列表
     * 
     * @throws ApiException
     */
    @Test
    public void getPostsWithTitle() throws ApiException {
        List<Post> postList = api.getPostList("test", null, null, null, null, null, null, null, null);
        System.out.println(postList);
    }

    /**
     * 热帖
     * 
     * @throws ApiException
     */
    @Test
    public void getHotPosts() throws ApiException {
        List<Post> postList = api.getPostList(null, true, null, null, null, null, null, null, null);
        System.out.println(postList);
    }

    /**
     * 加精
     * 
     * @throws ApiException
     */
    @Test
    public void getGoodPosts() throws ApiException {
        List<Post> postList = api.getPostList(null, null, true, null, null, null, null, null, null);
        System.out.println(postList);
    }

    /**
     * 置顶
     * 
     * @throws ApiException
     */
    @Test
    public void getTopPosts() throws ApiException {
        List<Post> postList = api.getPostList(null, null, null, true, null, null, null, null, null);
        System.out.println(postList);
    }

    /**
     * 查询姓名是gc的作者的文章
     * 
     * @throws ApiException
     */
    @Test
    public void getPostsWithAuthorName() throws ApiException {
        List<Post> postList = api.getPostList(null, null, null, null, "gc", null, null, null, null);
        System.out.println(postList);
    }

    /**
     * 查询id是16的作者的文章
     * 
     * @throws ApiException
     */
    @Test
    public void getPostsWithAuthorId() throws ApiException {
        List<Post> postList = api.getPostList(null, null, null, null, null, "16", null, null, null);
        System.out.println(postList);
    }

    /**
     * orderBy limit isAsc
     * 
     * @throws ApiException
     */
    @Test
    public void getPostsWithOrder() throws ApiException {
        List<Post> postList = api.getPostList(null, null, null, null, null, null, "createTime", 10, false);
        System.out.println(postList);
    }
}
