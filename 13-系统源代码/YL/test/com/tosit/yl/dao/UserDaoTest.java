package com.tosit.yl.dao;

import com.tosit.yl.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Chenshufu on 2017/6/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void queryById(){
        int id = 1;
        User user = userDao.queryById(id);
        System.out.println(user.getUserName());
        System.out.println(user.toString());
    }

    @Test
    public void queryAll(){
        List<User> users = userDao.queryAll(0,100);
        for(User user : users){
            System.out.println(user);
        }
    }

    @Test
    public void queryByName(){
        List<User> users = userDao.queryByName("lzs");
        for(User user : users){
            System.out.println(user);
        }
    }

    @Test
    public void insert(){
        User user = new User();
        user.setUserName("lzs");
        user.setUserAccount("2014141462124");
        user.setUserPassword("62124");
        user.setUserAge(21);
        userDao.insert(user);
        queryAll();
    }

    @Test
    public void update(){
        User user = new User();
        user.setUserName("lzs");
        user.setUserAccount("2014141462124");
        user.setUserPassword("update");
        user.setUserAge(21);
        user.setUserId(4);
        userDao.update(user);
        queryAll();
    }

    @Test
    public void delete(){
        User user = new User();
        user.setUserId(3);
        userDao.deleteById(3);
    }
}
