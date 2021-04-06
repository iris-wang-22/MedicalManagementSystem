package com.tosit.yl.service;

import com.tosit.yl.entity.DrugRx;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */

public interface DrugRxService {
    /**
     * 根据页面编号和页面大小获取处方列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<DrugRx> getDrugRxList(int pageNo,int pageSize);

    /**
     * 根据药品编号查询药品处方
     * @param diId
     * @return
     */
    DrugRx getDrugRx(int diId);

    /**
     * 根据手术编号查询药品处方
     * @param opId
     * @return
     */
    DrugRx getDrugRxByopId(int opId);

    /**
     * 根据病例编号查询药品处方
     * @param mrId
     * @return
     */
    List<DrugRx> getDrugRxBymrId(int mrId);

    /**
     * 添加药品处方
     * @param drugRx
     * @return
     */
    int add(DrugRx drugRx);

    /**
     * 修改药品处方
     * @param drugRx
     * @return
     */
    int modify(DrugRx drugRx);

    /**
     * 根据药品编号删除药品处方
     * @param diId
     * @return
     */
    int remove(int diId);

    /**
     * 根据手术编号删除处方
     * @param opId
     * @return
     */
    int removeByopId(int opId);

    /**
     * 根据病例编号删除药品处方
     * @param mrId
     * @return
     */
    int removeBymrId(int mrId);
}
