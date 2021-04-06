package com.tosit.yl.service;

import com.tosit.yl.entity.Opma;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
public interface OpmaService {
    /**
     * 根据页面编号和页面大小获取手术
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Opma> getOpmaList(int pageNo, int pageSize);
    /**
     * 根据手术id查找手术安排
     * @param opId
     * @return
     */
    Opma getOpId(int opId);

    /**
     * 根据用户id查找手术安排
     * @param userId
     * @return
     */
    Opma getUserId(int userId);

    /**
     * 增加手术安排
     * @param opma
     * @return
     */
    int add(Opma opma);

    /**
     * 修改
     * @param opma
     * @return
     */
    int modify(Opma opma);

    /**
     * 根据手术id删除
     * @param opId
     * @return
     */
    int removeByOpId(int opId);

    /**
     * 根据用户id删除
     * @param userId
     * @return
     */
    int removeByUserId(int userId);

}
