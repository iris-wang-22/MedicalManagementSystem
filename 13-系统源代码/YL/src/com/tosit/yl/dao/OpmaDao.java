package com.tosit.yl.dao;

import com.tosit.yl.entity.Opma;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/6/30.
 */
public interface OpmaDao {
    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    Opma queryByUserId(int userId);

    /**
     * 根据手术id查询
     * @param opId
     * @return
     */
    Opma queryByOpId(int opId);

    /**
     * 根据偏移量和限制查询
     * @param offset
     * @param limit
     * @return
     */
    List<Opma> queryAll(@Param("offset")int offset, @Param("limit")int limit);

    /**
     * 更新
     * @param opma
     */

    void update(Opma opma);

    /**
     * 根据用户id删除
     * @param userId
     */
    void deleteByUserId(int userId);

    /**
     * 根据手术id删除
     * @param opId
     */
    void deleteByOpId(int opId);

    /**
     * 插入
     * @param opma
     */
    void insert(Opma opma);
}
