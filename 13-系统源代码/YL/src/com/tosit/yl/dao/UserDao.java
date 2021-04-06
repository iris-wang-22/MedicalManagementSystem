package com.tosit.yl.dao;

import com.tosit.yl.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Chenshufu on 2017/6/28.
 *
 * 用户的Dao层接口
 */

public interface UserDao{

    /**
     *根据用户id查询
     * @param userId
     * @return
     */
    User queryById(int userId);

    /**
     * 通过账号查询
     * @param userAccount
     * @return
     */
    User queryAccount(String userAccount);

    /**
     * 根据用户名查询
     * @param userName
     * @return
     */
    List<User> queryByName(String userName);

    /**
     *
     * @param userAccount
     * @param userPassword
     * @return
     */
    User queryByAccount(@Param("userAccount") String userAccount ,@Param("userPassword") String userPassword);

    /**
     * 插入
     * @param user
     */
    void insert(User user);

    /**
     * 根据用户ID删除
     * @param userId
     */
    void deleteById(int userId);

    /**
     * 更新
     * @param user
     */
    void update(User user);

    /**
     * 根据偏移量和限制查询
     * @param offset
     * @param limit
     * @return
     */
    List<User> queryAll(@Param("offset") int offset,@Param("limit") int limit);
}