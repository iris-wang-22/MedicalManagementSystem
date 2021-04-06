package com.tosit.yl.dao;

import com.tosit.yl.entity.DrugInstrument;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Chenshufu on 2017/6/28.
 */
public interface DrugInstrumentDao {
    /**
     * 根据药品编号查询药品
     * @param diId
     * @return
     */
    DrugInstrument queryById(int diId);

    /**
     * 根据药品名称查询药品
     * @param diName
     * @return
     */
    List<DrugInstrument> queryByName(String diName);

    /**
     * 根据偏移量及限制条件查询部分列表
     * @param offset
     * @param limit
     * @return
     */
    List<DrugInstrument> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 插入
     * @param druginstrument
     */
    void insert(DrugInstrument druginstrument);

    /**
     * 修改
     * @param druginstrument
     */
    void update(DrugInstrument druginstrument);


    /**
     * 删除
     * @param druginstrument
     */
    void delete(DrugInstrument druginstrument);

}

