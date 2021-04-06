package com.tosit.yl.dao;

import com.tosit.yl.entity.AsResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Chenshufu on 2017/6/30.
 */
public interface AsResultDao {

    /**
     * 通过病历查询
     * @param mrId
     * @return
     */
    List<AsResult> queryByMrId(int mrId);

    /**
     * 通过检查项目查询
     * @param asItemId
     * @return
     */
    List<AsResult> queryByAsItemId(int asItemId);

    /***
     * 通过负责医生查询
     * @param userId
     * @return
     */
    List<AsResult> queryByUserId(int userId);

    /**
     * 通过偏移量和限制查询
     * @param offset
     * @param limit
     * @return
     */
    List<AsResult> queryAll(@Param("offset")int offset,@Param("limit")int limit);

    /**
     * 删除
     * @param asResult
     */
    void delete(AsResult asResult);

    /**
     * 修改
     * @param asResult
     */
    void update(AsResult asResult);

    /**
     * 插入
     * @param asResult
     */
    void insert(AsResult asResult);

}
