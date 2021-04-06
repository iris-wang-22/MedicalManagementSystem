package com.tosit.yl.service;

import com.tosit.yl.entity.AsItem;
import com.tosit.yl.entity.AsResult;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
public interface AsItemService {
    /**
     * 根据页面编号和页面大小获取辅助检查表
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<AsItem> getAsList(int pageNo, int pageSize);
    /**
     * 根据辅助id查询
     * @param asItemId
     * @return
     */
    AsItem getAsId(int asItemId);

    /**
     * 根据辅助名字
     * @param asItemName
     * @return
     */
    List<AsItem> getAsName(String asItemName);

    /**
     * 增加一个辅助项目
     * @param asItem
     * @return
     */

    int add(AsItem asItem);

    /**
     * 修改
     * @param asItem
     * @return
     */
    int modify(AsItem asItem);

    /**
     * 删除
     * @param asItemId
     * @return
     */
    int remove(int asItemId);

}
