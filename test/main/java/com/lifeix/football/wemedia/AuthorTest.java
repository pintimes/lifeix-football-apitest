package com.lifeix.football.wemedia;

import java.util.List;

import io.swagger.client.ApiException;
import io.swagger.client.api.AuthorsApi;
import io.swagger.client.model.Author;

/**
 * author 没有提供创建接口数据直接数据库中
 * 
 * @author gcc
 */
public class AuthorTest {
    /**
     * 创建一个编辑
     * 
     * @param name
     * @param image
     * @return
     * @throws ApiException
     */
    public static Author createAuthor(String name, String image) throws ApiException {
        Author author = new Author();
        author.setName(name);
        author.setImage(image);
        AuthorsApi api = new AuthorsApi();
        return api.addAuthor(ApiKey.key, author);
    }

    /**
     * 获取编辑列表
     * 
     * @return
     * @throws ApiException
     */
    public static List<Author> getAuthors() throws ApiException {
        AuthorsApi api = new AuthorsApi();
        return api.getAuthors(ApiKey.key);
    }
}
