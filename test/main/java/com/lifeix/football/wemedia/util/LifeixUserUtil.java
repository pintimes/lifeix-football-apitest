package com.lifeix.football.wemedia.util;

import io.swagger.client.model.User;

/**
 * @desc 通过权限字符串获取用户信息
 * @author gcc
 */
public class LifeixUserUtil {

    public static User getUser() {
        User user = new User();
        user.setId("14");
        user.setName("lyl");
        user.setPicture("lifeix_lyl.jpg");
        return user;
    }

    /**
     * @desc 调用userCenter获取用户的完整信息
     * @param userId
     * @return
     */
    public static User getUserByUserId(String userId) {
        User user = new User();
        switch (userId) {
        case "13": {
            user.setId("13");
            user.setName("gcc");
            user.setPicture("lifeix_gcc.jpg");
            return user;
        }
        case "14": {
            user.setId("14");
            user.setName("lyl");
            user.setPicture("lifeix_lyl.jpg");
            return user;
        }
        case "15": {
            user.setId("15");
            user.setName("neo");
            user.setPicture("lifeix_neo.jpg");
            return user;
        }
        default: {
            user.setId("14");
            user.setName("lyl");
            user.setPicture("lifeix_lyl.jpg");
            return user;
        }
        }

    }

}
