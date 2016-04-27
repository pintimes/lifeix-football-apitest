package com.lifeix.football.wemedia.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import io.swagger.client.ApiException;
import io.swagger.client.api.CommentApi;
import io.swagger.client.api.PostApi;
import io.swagger.client.api.PostsApi;
import io.swagger.client.model.Comment;
import io.swagger.client.model.Post;
import junit.framework.Assert;

public class CommonUtil {

    public static final String[] userIds = { "13", "14", "15" };

    public static String getUserId() {
        int num = new Random().nextInt(2);
        return userIds[num];
    }

    public static Post createRandomPost(String userId) {
        Assert.assertNotNull(userId);
        long flag = System.currentTimeMillis();

        PostApi api = new PostApi();
        Post post = new Post();
        System.out.println("create post begin ....");
        post.setContent("swagger-post-api test " + flag);
        post.setTitle("swagger postApi " + flag);
        post.setDescription("test swagger ui " + flag);

        Post addedPost = null;
        try {
            addedPost = api.addPost(userId, post);
            System.out.println(addedPost);
            Assert.assertNotNull(addedPost);
            Assert.assertNotNull(addedPost.getId());
            Assert.assertNotNull(addedPost.getCommentNum());
            Assert.assertNotNull(addedPost.getLikeNum());
            Assert.assertNotNull(addedPost.getCreateTime());
            Assert.assertNotNull(addedPost.getGood());
            Assert.assertNotNull(addedPost.getTop());
            Assert.assertNotNull(addedPost.getHot());

            Assert.assertEquals(post.getContent(), addedPost.getContent());
            Assert.assertEquals(post.getTitle(), addedPost.getTitle());
            Assert.assertEquals(post.getDescription(), addedPost.getDescription());
            Assert.assertEquals(post.getCommentTime(), addedPost.getCommentTime());
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return addedPost;

    }

    public static Post getOneExistsPost(boolean haveComment) {
        Post post = null;
        PostsApi api = new PostsApi();
        try {
            List<Post> postList = api.getPostList(null, null, null, null, null, null, null, 1000, null);
            if (!haveComment) {
                return postList.get(0);
            }
            for (Post post2 : postList) {
                if (post2.getCommentNum() > 0) {
                    return post2;
                }
            }
            post = postList.get(0);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return post;

    }

    public static Comment createRamdomComment() {
        int num = new Random().nextInt(2);
        Post post = createRandomPost(userIds[num]);

        int nextInt = new Random().nextInt(10000);
        System.out.println("create a ramdom comment under post: " + post.getId() + " begin ....");
        CommentApi api = new CommentApi();
        Comment comment = new Comment();
        comment.setPostId(post.getId());
        comment.setContent(" comment content" + nextInt);
        List<String> images = new ArrayList<String>();
        images.add("comment" + nextInt + ".jpg");
        images.add("comment" + nextInt + ".jpg");
        comment.setImages(images);
        Comment addComment = null;
        try {
            addComment = api.addComment(userIds[num], comment);
            System.out.println(addComment);

            Assert.assertNotNull(addComment);
            Assert.assertNotNull(addComment.getId());
            Assert.assertNotNull(addComment.getCreateTime());
            Assert.assertNotNull(addComment.getFloorNum());

            Assert.assertEquals(comment.getPostId(), addComment.getPostId());
            Assert.assertEquals(comment.getContent(), addComment.getContent());
            Assert.assertEquals(comment.getImages(), addComment.getImages());

        } catch (ApiException e) {
            e.printStackTrace();
        }
        return addComment;
    }

}
