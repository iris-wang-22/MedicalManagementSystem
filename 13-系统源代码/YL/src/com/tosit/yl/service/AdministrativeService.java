package com.tosit.yl.service;

import com.tosit.yl.entity.Administrative;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
public interface AdministrativeService {
    /**
     * 根据页面编号和页面大小获取科室
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Administrative> getAdList(int pageNo, int pageSize);

    /**
     * 根据科室id查询
     * @param adId
     * @return
     */
    Administrative getId(int adId);

    /**
     * 根据科室名查询
     * @param adName
     * @return
     */
    List<Administrative> getAdNameList(String adName);

    /**
     * 增加科室
     * @param administrative
     * @return
     */

    int add(Administrative administrative);


    /**
     * 删除科室
     * @param administrative
     * @return
     */
    int remove(Administrative administrative);

    /**
     * 更新科室信息
     * @param administrative
     * @return
     */
    int modify(Administrative administrative);
}
