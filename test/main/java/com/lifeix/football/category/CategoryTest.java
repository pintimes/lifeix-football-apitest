package com.lifeix.football.category;

import java.util.List;

import org.junit.Test;

import io.swagger.client.ApiException;
import io.swagger.client.api.CategoriesApi;
import io.swagger.client.model.Category;
import junit.framework.Assert;

public class CategoryTest {

    CategoriesApi categoriesApi = new CategoriesApi();

    @Test
    public void testCategory() throws ApiException {
        String apiKey = "admin";
        /**
         * 添加一个类目
         */
        Category root = new Category();
        root.setName("中国足球队");
        root.setIconUrl("c-f.jpg");
        Category rooresult = categoriesApi.addCategory(apiKey, root);
        assertCategory(root, rooresult);
        /**
         * 添加一个子目录
         */
        Category man = new Category();
        man.setName("国足");
        man.setIconUrl("c-f.jpg");
        man.setFId(rooresult.getId());
        Category manresult = categoriesApi.addCategory(apiKey, root);
        assertCategory(man, manresult);
        /**
         * 查出List
         */
        List<Category> list = categoriesApi.getCategoryList();
        Assert.assertNotNull(list);
        System.out.println(list);
    }

    private void assertCategory(Category expect, Category acture) {
        Assert.assertNotNull(acture);
        Assert.assertEquals(expect.getName(), acture.getName());
        Assert.assertEquals(expect.getIconUrl(), acture.getIconUrl());
        Assert.assertEquals(expect.getFId(), acture.getFId());
    }

}
