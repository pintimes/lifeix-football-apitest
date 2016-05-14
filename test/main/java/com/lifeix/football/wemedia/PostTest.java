package com.lifeix.football.wemedia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import io.swagger.client.ApiException;
import io.swagger.client.api.NewsApi;
import io.swagger.client.api.PostApi;
import io.swagger.client.api.PostsApi;
import io.swagger.client.model.Author;
import io.swagger.client.model.Post;
import io.swagger.client.model.TimeLineNews;
import io.swagger.client.model.Video;

/**
 * 
 * 
 * @author gcc
 */
public class PostTest {
    /**
     * 在一个类目下创建一批文章
     * 
     * @return
     * @throws ApiException
     * @throws ParseException
     */
    public static List<Post> createPost(int postNum, List<String> categories, String createDate)
            throws ApiException, ParseException {
        PostApi api = new PostApi();
        List<Post> list = new ArrayList<Post>();
        // 文章的作者
        Post post = new Post();
        Author createAuthor = AuthorTest.createAuthor("小懂", "xd.jpg");
        post.setAuthor(createAuthor);
        // 文章tags
        post.setCategories(categories);
        for (int i = 0; i < postNum; i++) {
            post.setTitle("swagger create title " + i);
            // 内容和时间不一致
            int seed = new Random().nextInt(100);
            // txt
            if (seed % 3 == 0) {
                post.setContent("swagger content test");
            }
            // video
            if (seed % 3 == 1) {
                List<Video> videos = new ArrayList<Video>();
                Video v = new Video();
                v.setUrl("url.jpsg");
                v.setPreview("preview.jpg");
                v.setTime(120);
                videos.add(v);
                post.setVideos(videos);
            }
            // image
            if (seed % 3 == 2) {
                List<String> images = new ArrayList<String>();
                images.add("image.jpg");
                post.setImages(images);
            }
            if (seed % 5 == 0) {
                post.setCreateDate(createDate);
            }
            if (seed % 5 == 1) {
                String date = getUpdatedCreateDate(createDate, 1);
                post.setCreateDate(date);
            }
            if (seed % 5 == 2) {
                String date = getUpdatedCreateDate(createDate, 2);
                post.setCreateDate(date);
            }
            if (seed % 5 == 3) {
                String date = getUpdatedCreateDate(createDate, 3);
                post.setCreateDate(date);
            }
            if (seed % 5 == 4) {
                String date = getUpdatedCreateDate(createDate, 4);
                post.setCreateDate(date);
            }

            Post addPost = api.addPost(ApiKey.key, post);
            list.add(addPost);
        }
        return list;
    }

    public static List<TimeLineNews> getTlNews(String categoryId, String startDate, Integer limit)
            throws ApiException {
        NewsApi api = new NewsApi();
        return api.getTimeLineNewsByCategoryId(categoryId, startDate, limit);
    }

    public static List<Post> getPosts(String categoryId, String startDate, String endDate, String startTime,
            Integer limit) throws ApiException {
        PostsApi api = new PostsApi();
        return api.list(ApiKey.key, null, categoryId, null, startDate, endDate, startTime, limit, null, null);
    }

    private static String getUpdatedCreateDate(String createDate, int decNum) throws ParseException {
        SimpleDateFormat formate = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = formate.parse(createDate);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parse);
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) - decNum);
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) + 1);
        return calendar.get(Calendar.YEAR) + "-" + calendar.get(Calendar.MONTH) + "-"
                + +calendar.get(Calendar.DAY_OF_MONTH);
    }

}
