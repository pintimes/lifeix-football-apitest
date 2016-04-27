package com.lifeix.football.wemedia;

import java.util.List;

import org.junit.Test;

import com.lifeix.football.wemedia.util.CommonUtil;

import io.swagger.client.ApiException;
import io.swagger.client.api.CommentsApi;
import io.swagger.client.model.Comment;
import io.swagger.client.model.Post;

public class CommentListTest {

    private CommentsApi api = new CommentsApi();

    @Test
    public void getAll() throws ApiException {
        Post post = CommonUtil.getOneExistsPost(true);
        List<Comment> comments = api.getComments(post.getId(), null, null, null, null, null);
        System.out.println(comments);
    }

    @Test
    public void getCommentsByAuthorId() throws ApiException {
        List<Comment> comments = api.getComments(null, "13", null, null, null, null);
        System.out.println(comments);
    }

    @Test
    public void getCommentsByAuthorName() throws ApiException {
        List<Comment> comments = api.getComments(null, null, "gcc", null, null, null);
        System.out.println(comments);
    }

    @Test
    public void getCommentsWithOrder() throws ApiException {
        List<Comment> comments = api.getComments(null, null, "gcc", "createTime", 10, true);
        System.out.println(comments);
    }
}
