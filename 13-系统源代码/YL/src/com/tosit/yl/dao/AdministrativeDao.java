package com.tosit.yl.dao;

import com.tosit.yl.entity.Administrative;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Chenshufu on 2017/6/29.
 */
public interface AdministrativeDao {
    /**
     * 根据科室id查询
     * @param adId
     * @return
     */
    Administrative queryByAdId(int adId);

    /**
     * 根据科室名字查询
     * @param adName
     * @return
     */
    List<Administrative> queryByAdName(String adName);

    /**
     * 根据偏移量和限制查询
     * @param offset
     * @param limit
     * @return
     */
    List<Administrative> queryAll(@Param("offset")int offset, @Param("limit")int limit);

    /**
     * 更新
     * @param administrative
     */
    void update(Administrative administrative);

    /**
     * 删除
     * @param administrative
     */
    void delete(Administrative administrative);

    /**
     * 插入
     * @param administrative
     */
    void insert(Administrative administrative);
}
