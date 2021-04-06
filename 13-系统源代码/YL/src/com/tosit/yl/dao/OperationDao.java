package com.tosit.yl.dao;

import com.tosit.yl.entity.Operation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Chenshufu on 2017/6/28.
 */
public interface OperationDao {
    /**
     * 根据病历id查询
     * @param mrId
     * @return
     */
    Operation queryByMrId(int mrId);

    /**
     * 根据手术id查询
     * @param opId
     * @return
     */
    Operation queryById(int opId);

    /**
     * 根据偏移量和限制查询
     * @param offset
     * @param limit
     * @return
     */
    List<Operation> queryAll(@Param("offset")int offset,@Param("limit")int limit);

    /**
     * 更新
     * @param operation
     */
    void update(Operation operation);

    /**
     * 根据手术id删除
     * @param opId
     */
    void deleteById(int opId);

    /**
     * 根据病历id删除
     * @param mrId
     */
    void deleteByMrId(int mrId);

    /**
     * 更新
     * @param operation
     */
    void insert(Operation operation);
}
