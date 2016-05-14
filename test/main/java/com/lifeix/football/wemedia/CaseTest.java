package com.lifeix.football.wemedia;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import io.swagger.client.ApiException;
import io.swagger.client.model.TimeLineNews;

/**
 * 1.创建一批文章 2.设定条件查询这些文章list 3.设定条件查询这些文章timelineNews 3.将其中一些文章置顶 4.查询置顶后的文章 5.查询首页top news list
 * 
 * @author gcc
 */
public class CaseTest {
    @Test
    public void create() throws ApiException, ParseException {
        // 创建一批文章
        List<String> categories1 = new ArrayList<>();
        categories1.add("3");
        categories1.add("31");
        PostTest.createPost(20, categories1, "2016-05-13");
        // 创建一批文章
        List<String> categories2 = new ArrayList<>();
        categories2.add("3");
        categories2.add("32");
        PostTest.createPost(20, categories2, "2016-05-13");
    }

    @Test
    public void search() throws ApiException, ParseException {

        // tlnews ###########################
        List<TimeLineNews> tlNews = PostTest.getTlNews("3", null, null);
        System.out.println(tlNews);
        // tlnews ###########################
    }

}
