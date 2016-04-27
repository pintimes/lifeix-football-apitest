package com.lifeix.football.wemedia;

import org.junit.Test;

import com.lifeix.football.wemedia.util.CommonUtil;

import io.swagger.client.ApiException;
import io.swagger.client.api.CommentApi;
import io.swagger.client.model.Comment;
import junit.framework.Assert;

public class CommentTest {

    public static Comment getComment(String commentId) throws ApiException {
        CommentApi api = new CommentApi();
        System.out.println("get comment begin ...");
        Comment comment = api.getComment(commentId);
        Assert.assertNotNull(comment);
        Assert.assertEquals(commentId, comment.getId());
        System.out.println(comment);
        return comment;
    }

    public static Comment deleteComment(String userId, String commentId) throws ApiException {
        CommentApi api = new CommentApi();
        System.out.println("delete comment ...");
        Comment comment = api.deleteComment(userId, commentId);
        Assert.assertNotNull(comment);
        Assert.assertEquals(commentId, comment.getId());
        Assert.assertEquals(userId, comment.getUser().getId());
        return comment;
    }

    @Test
    public void runAll() {
        Comment comment = CommonUtil.createRamdomComment();
        String commentId = comment.getId();
        try {
            getComment(commentId);
            deleteComment(comment.getUser().getId(), commentId);
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
