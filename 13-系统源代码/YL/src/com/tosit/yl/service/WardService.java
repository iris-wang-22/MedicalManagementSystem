package com.tosit.yl.service;

import com.tosit.yl.entity.Ward;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
public interface WardService {
    /**
     * 根据页面编号和页面大小获取病床列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Ward> getWardList(int pageNo, int pageSize);

    /**
     * 根据床位id查询
     * @param bedId
     * @return
     */
    Ward getBedId(int bedId);

    /**
     * 增加
     * @param ward
     * @return
     */
    int add(Ward ward);

    /**
     * 修改
     * @param ward
     * @return
     */
    int modify(Ward ward);

    /**
     * 删除
     * @param ward
     * @return
     */
    int remove(Ward ward);
}
