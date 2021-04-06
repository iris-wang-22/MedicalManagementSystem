package com.tosit.yl.service.impl;


import com.tosit.yl.dao.UserDao;
import com.tosit.yl.entity.User;
import com.tosit.yl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.nio.cs.US_ASCII;

import java.util.List;

/**
 * Created by Chenshufu on 2017/7/1.
 */

@Service
public class UserServiceImpl  implements UserService{


    private final UserDao userDao;


    @Autowired
    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public User getUserByAccount(String userAccount) {
        return userDao.queryAccount(userAccount);
    }
    @Override
    public List<User> getUserList(int pageNo, int pageSize) {
        List<User> userList = userDao.queryAll(pageNo,pageSize);
        return userList;
    }

    @Override
    public List<User> getUserList(String userName) {
        List<User> userList = userDao.queryByName(userName);
        return userList;
    }

    @Override
    public User getUser(int userId) {
        User user = userDao.queryById(userId);
        return user;
    }

    @Override
    public boolean login(String userAccount, String userPassword) {
        User user = userDao.queryByAccount(userAccount,userPassword);
        return null != user;
    }

    @Override
    public boolean register(User user) {
        try {
            user.setUserAuth(0);
            user.setUserSex('X');
            userDao.insert(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public int add(User user) {
        userDao.insert(user);
        return 0;
    }

    @Override
    public int modify(User user) {
        userDao.update(user);
        return 0;
    }

    @Override
    public int remove(int userId) {
        userDao.deleteById(userId);
        return 0;
    }

    @Override
    public int remove(User user) {
        userDao.deleteById(user.getUserId());
        return 0;
    }
}
