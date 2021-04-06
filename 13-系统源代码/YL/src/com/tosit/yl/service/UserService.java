package com.tosit.yl.service;

import com.tosit.yl.entity.User;

import java.util.List;

/**
 * Created by Chenshufu on 2017/7/1.
 */
public interface UserService {

    /**
     * 根据页面编号和页面大小获取用户列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<User> getUserList(int pageNo,int pageSize);

    /**
     * 根据用户名查找用户
     * @param userName
     * @return
     */
    List<User> getUserList(String userName);

    /**
     *
     * @param userAccount
     * @return
     */
    User getUserByAccount(String userAccount);

    /**
     * 根据用户Id查找用户
     * @param userId
     * @return
     */
    User getUser(int userId);

    /**
     *
     * @param userAccount
     * @param userPassword
     * @return
     */
    boolean login(String userAccount,String userPassword);

    /**
     *
     * @param user
     * @return
     */
    boolean register(User user);

    /**
     *增加用户
     * @param user
     * @return
     */
    int add(User user);

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    int modify(User user);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    int remove(int userId);

    /**
     * 删除用户
     * @param user
     * @return
     */
    int remove(User user);
}
