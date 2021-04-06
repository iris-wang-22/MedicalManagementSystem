package com.tosit.yl.dao;

import com.tosit.yl.entity.Inhospital;
import com.tosit.yl.entity.Ward;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/6/29.
 * 住院的Dao层接口
 */
public interface InhospitalDao {
    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    Inhospital queryByUId(int userId);

    /**
     * 根据病床id查询
     * @param bedId
     * @return
     */
    Inhospital queryByBId(int bedId);

    /**
     * 插入
     * @param inhospital
     */
    void insert(Inhospital inhospital);

    /**
     * 更新
     * @param inhospital
     */
    void update(Inhospital inhospital);

    /**
     * 根据用户删除
     * @param userId
     */
    void deleteByUId(int userId);

    /**
     * 根据偏移量和限制查询
     * @param offset
     * @param limit
     * @return
     */
    List<Inhospital> queryAll(@Param("offset") int offset , @Param("limit") int limit);

}
