package com.lifeix.football.wemedia;

import java.util.List;

import org.junit.Test;

import com.lifeix.football.wemedia.util.CommonUtil;
import com.lifeix.football.wemedia.util.LifeixUserUtil;

import io.swagger.client.ApiException;
import io.swagger.client.api.LikesApi;
import io.swagger.client.model.Post;
import io.swagger.client.model.User;
import junit.framework.Assert;

public class LikeTest {

    /**
     * 用户给帖子点赞
     * 
     * @throws ApiException
     */
    public static User likePost(String userId, Post post) throws ApiException {
        LikesApi api = new LikesApi();
        User returnUser = api.addPostLike(userId, post.getId());
        Assert.assertNotNull(returnUser);
        User user = LifeixUserUtil.getUserByUserId(userId);
        if (!user.equals(returnUser)) {
            Assert.failNotEquals("like post return user is not original ", returnUser, user);
        }
        return returnUser;
    }

    /**
     * 获取给帖子点赞的用户列表
     * 
     * @throws ApiException
     */
    public static List<User> getlikedUsers(String postId, int limit) throws ApiException {
        LikesApi api = new LikesApi();
        List<User> users = api.likesUsersGet(postId, limit);
        System.out.println(users);
        return users;
    }

    /**
     * 获取用户点过赞的帖子列表
     * 
     * @throws ApiException
     */
    public static List<Post> getPostsByUser(String uerId, int limit) throws ApiException {
        LikesApi likesApi = new LikesApi();
        List<Post> posts = likesApi.likesPostsGet(uerId, limit);
        System.out.println(posts);
        return posts;
    }

    /**
     * 1.创建一个文章 2.like this post 3.list users of this post 4.list posts of this user
     * 
     * @throws ApiException
     */
    @Test
    public void allRun() throws ApiException {
        String userId = CommonUtil.getUserId();
        // 随机创建一个帖子
        Post randomPost = CommonUtil.createRandomPost(userId);
        // 用户列表全部like这个帖子
        String[] userids = CommonUtil.userIds;
        for (String likeUserId : userids) {
            likePost(likeUserId, randomPost);
        }
        System.out.println("get have liked post " + randomPost.getId() + " users ");
        getlikedUsers(randomPost.getId(), 100);
        System.out.println("get userId:" + userId + " liked posts  ");
        getPostsByUser(userId, 100);
    }

}
