package com.tosit.yl.service.impl;

import com.tosit.yl.dao.DiPcDao;
import com.tosit.yl.entity.DiPc;
import com.tosit.yl.service.DiPcServece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
@Service
public class DiPcServicempl implements DiPcServece{
    @Autowired
    private DiPcDao diPcDao;

    @Override
    public List<DiPc> getDiPcList(int pageNo, int pageSize) {
        List<DiPc> diPcList = diPcDao.queryAll(pageNo,pageSize);
        return diPcList;
    }


    @Override
    public DiPc getDiPcLise(int diPcId) {
        DiPc diPcList = diPcDao.queryByDiPcId(diPcId);
        return diPcList;
    }

    @Override
    public DiPc getDiPcList(int diId) {
        DiPc diPcList = diPcDao.queryByDiId(diId);
        return diPcList;
    }

    @Override
    public int add(DiPc diPc) {
        diPcDao.insert(diPc);
        return 0;
    }

    @Override
    public int modify(DiPc diPc) {
        diPcDao.update(diPc);
        return 0;
    }

    @Override
    public int remove(DiPc diPc) {
        return 0;
    }
}
