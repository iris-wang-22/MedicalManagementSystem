package com.tosit.yl.dao;

import com.tosit.yl.entity.Operation;
import com.tosit.yl.entity.User;
import com.tosit.yl.entity.Ward;
import org.apache.ibatis.annotations.Param;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Administrator on 2017/6/29.
 *
 * 病床的Dao层接口
 */

public interface WardDao {

    /**
     * 根据病床id查询
     * @param bedId
     * @return
     */
    Ward queryById(int bedId);

    /**
     * 插入
     * @param ward
     */
    void insert(Ward ward);


    /**
     * 更新
     * @param ward
     */
    void update(Ward ward);


    /**
     * 删除
     * @param ward
     */
    void delete(Ward ward);


    /**
     * 根据偏移量和限制查询
     * @param offset
     * @param limit
     * @return
     */
    List<Ward> queryAll(@Param("offset") int offset , @Param("limit") int limit);

}
