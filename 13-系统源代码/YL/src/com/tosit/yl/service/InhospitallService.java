package com.tosit.yl.service;

import com.tosit.yl.entity.Inhospital;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */

public interface InhospitallService {
    /**
     * 根据页面编号和页面大小获取住院列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Inhospital> getInhospitallList(int pageNo, int pageSize);

    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    Inhospital getUserId(int userId);

    /**
     * 根据病床id查询
     * @param bedId
     * @return
     */
    Inhospital getBedId(int bedId);

    /**
     * 增加
     * @param inhospital
     * @return
     */
    int add(Inhospital inhospital);

    /**
     * 修改住院表
     * @param inhospital
     * @return
     */
    int modify(Inhospital inhospital);

    /**
     * 根据用户id删除
     * @param userId
     * @return
     */
    int removeByUserId(int userId);



}
