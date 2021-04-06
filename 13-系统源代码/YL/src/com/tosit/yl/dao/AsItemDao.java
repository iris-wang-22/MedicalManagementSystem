package com.tosit.yl.dao;

import com.tosit.yl.entity.AsItem;

import java.util.List;

/**
 * Created by Chenshufu on 2017/6/30.
 */
public interface AsItemDao {

    /**
     * 根据辅助检查编号来查找
     * @param asItemId
     * @return
     */
    AsItem queryById(int asItemId);

    /**
     * 根据辅助检查名来查找
     * @param asItemName
     * @return
     */
    List<AsItem> queryByName(String asItemName);

    /**
     * 更新修改
     * @param asItem
     */
    void update(AsItem asItem);

    /**
     * 根据编号来删除
     * @param asItemId
     */
    void deleteById(int asItemId);

    /**
     * 插入
     * @param asItem
     */
    void insert(AsItem asItem);
}
