package com.tosit.yl.service;

import com.tosit.yl.entity.DrugInstrument;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */

public interface DrugInstrumentService {
    /**
     * 根据页面编号和页面大小获取药品仪器列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<DrugInstrument> getDrugInstrumentList(int pageNo, int pageSize);

    /**
     * 根据药品编号查询药品列表
     * @param diId
     * @return
     */
    DrugInstrument getDrugInstrumentList(int diId);

    /**
     * 根据药品名称查询药品列表
     * @param diName
     * @return
     */
    List<DrugInstrument> getDrugInstrumentList(String diName);

    /**
     * 增加药品/仪器信息
     * @param drugInstrument
     * @return
     */
    int add(DrugInstrument drugInstrument);

    /**
     * 修改药品/仪器信息
     * @param drugInstrument
     * @return
     */
    int modify(DrugInstrument drugInstrument);

    /**
     * 删除药品/仪器信息
     * @param drugInstrument
     * @return
     */
    int remove(DrugInstrument drugInstrument);
}
