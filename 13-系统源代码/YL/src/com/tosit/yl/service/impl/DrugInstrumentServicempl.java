package com.tosit.yl.service.impl;

import com.tosit.yl.dao.DrugInstrumentDao;
import com.tosit.yl.entity.DrugInstrument;
import com.tosit.yl.service.DrugInstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
@Service
public class DrugInstrumentServicempl implements DrugInstrumentService {
    @Autowired
    private DrugInstrumentDao drugInstrumentDao;

    @Override
    public List<DrugInstrument> getDrugInstrumentList(int pageNo, int pageSize) {
        List<DrugInstrument> drugInstrumentList = drugInstrumentDao.queryAll(pageNo,pageSize);
        return drugInstrumentList;
    }

    @Override
    public DrugInstrument getDrugInstrumentList(int diId) {
        DrugInstrument drugInstrumentList = drugInstrumentDao.queryById(diId);
        return drugInstrumentList;
    }

    @Override
    public List<DrugInstrument> getDrugInstrumentList(String diName) {
        List<DrugInstrument> drugInstrumentList = drugInstrumentDao.queryByName(diName);
        return drugInstrumentList;
    }

    @Override
    public int add(DrugInstrument drugInstrument) {
        drugInstrumentDao.insert(drugInstrument);
        return 0;
    }

    @Override
    public int modify(DrugInstrument drugInstrument) {
        drugInstrumentDao.update(drugInstrument);
        return 0;
    }

    @Override
    public int remove(DrugInstrument drugInstrument) {
        drugInstrumentDao.delete(drugInstrument);
        return 0;
    }
}
