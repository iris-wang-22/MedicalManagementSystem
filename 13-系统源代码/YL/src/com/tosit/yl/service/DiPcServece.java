package com.tosit.yl.service;

import com.tosit.yl.entity.DiPc;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */

public interface DiPcServece {
    /**
     * 根据页面编号和页面大小获取批次列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<DiPc> getDiPcList(int pageNo,int pageSize);

    /**
     * 根据药品批次编号查询批次列表
     * @param diPcId
     * @return
     */
    DiPc getDiPcList(int diPcId);

    /**
     * 根据药品编号查询批次列表
     * @param diId
     * @return
     */
    DiPc getDiPcLise(int diId);

    /**
     * 添加药品批次信息
     * @param diPc
     * @return
     */
    int add(DiPc diPc);

    /**
     * 修改药品批次信息
     * @param diPc
     * @return
     */
    int modify(DiPc diPc);

    /**
     * 删除药品批次信息
     * @param diPc
     * @return
     */
    int remove(DiPc diPc);
}
