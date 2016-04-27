package com.lifeix.football.wemedia;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.lifeix.football.wemedia.util.CommonUtil;

import io.swagger.client.ApiException;
import io.swagger.client.api.PostApi;
import io.swagger.client.model.Post;
import io.swagger.client.model.User;
import junit.framework.Assert;

/**
 * 1.create 2.get 3.update 4.delete
 * 
 * @author gcc
 */
public class PostTest {

    public static Post getPost(String postId) throws ApiException {
        PostApi api = new PostApi();
        Post post = new Post();
        System.out.println("get post begin ....");
        post = api.getPost(postId);
        System.out.println("post now is :" + post);
        return post;
    }

    public static Post updatePost(String userId, Post post) throws ApiException {
        long flag = System.currentTimeMillis();
        PostApi api = new PostApi();
        System.out.println("update post begin ....");
        post.setTop(false);
        List<String> images = new ArrayList<String>();
        images.add("swagger" + flag + ".jpg");
        images.add("swagger" + flag + ".jpg");
        post.setImages(images);
        User author = new User();
        author.setName("swagger" + flag);
        author.setPicture("avatar" + flag + ".jpg");
        post.setAuthor(author);

        post.setDescription(flag + "");
        Post postsPut = api.postsPut(userId, post);
        System.out.println("the post have updated is : \n" + postsPut);
        Post returnPost = api.getPost(post.getId());
        System.out.println("the post after updated is : \n" + returnPost);

        Assert.assertNotNull(returnPost);
        Assert.assertEquals(post.getImages(), returnPost.getImages());
        author.setId(returnPost.getAuthor().getId());
        if (!returnPost.getAuthor().equals(author)) {
            Assert.failNotEquals("the return post author is not right ", author, returnPost.getAuthor());
        }
        return returnPost;
    }

    public static void deletePost(String userId, String postIds) throws ApiException {
        PostApi api = new PostApi();
        api.deletePost(userId, postIds);
        System.out.println("have delete post ....");
    }

    @Test
    public void allRun() throws ApiException {
        String userId = CommonUtil.getUserId();
        Post createPost = CommonUtil.createRandomPost(userId);
        Post updatedPost = updatePost(createPost.getAuthor().getId(), createPost);

        // 同时删除多个帖子,往Crontroller 的List<String>类型的参数中传值，只需要以“，”分隔
        Post createPost1 = CommonUtil.createRandomPost(userId);
        String postIds = updatedPost.getId() + "," + createPost1.getId();
        deletePost(updatedPost.getAuthor().getId(), postIds);
        System.out.println("all is end");
    }
}
