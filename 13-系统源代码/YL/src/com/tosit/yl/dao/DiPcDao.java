package com.tosit.yl.dao;

import com.tosit.yl.entity.DiPc;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Chenshufu on 2017/6/28.
 */
public interface DiPcDao {
    /**
     * 根据药品编号查询批次信息
     * @param DiId
     * @return
     */
    DiPc queryByDiId(int DiId);

    /**
     * 根据批次号查询批次信息
     * @param DiPcId
     * @return
     */
    DiPc queryByDiPcId(int DiPcId);

    /**
     * 根据偏移量及限制条件查询部分列表
     * @param offset
     * @param limit
     * @return
     */
    List <DiPc> queryAll(@Param("offset")  int offset,@Param("limit") int limit);

    /**
     * 删除
     * @param diPc
     */
    void delete(DiPc diPc);

    /**
     * 插入
     * @param diPc
     */
    void insert(DiPc diPc);

    /**
     * 修改
     * @param diPc
     */
    void update(DiPc diPc);
}
