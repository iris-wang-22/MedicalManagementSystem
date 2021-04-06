package com.tosit.yl.service.impl;

import com.tosit.yl.dao.DrugRxDao;
import com.tosit.yl.entity.DrugRx;
import com.tosit.yl.service.DrugRxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
@Service
public class DrugRxServicempl implements DrugRxService {

    @Autowired
    private DrugRxDao drugRxDao;

    @Override
    public List<DrugRx> getDrugRxList(int pageNo, int pageSize) {
        List<DrugRx> drugRxList = drugRxDao.queryAll(pageNo,pageSize);
        return drugRxList;
    }

    @Override
    public DrugRx getDrugRx(int diId) {
        DrugRx drugRxList = drugRxDao.queryByDiId(diId);
        return drugRxList;
    }

    @Override
    public DrugRx getDrugRxByopId(int opId) {
        DrugRx drugRxList = drugRxDao.queryByOpId(opId);
        return drugRxList;
    }

    @Override
    public List<DrugRx> getDrugRxBymrId(int mrId) {
        List<DrugRx> drugRxList = drugRxDao.queryByMrId(mrId);
        return drugRxList;
    }

    @Override
    public int add(DrugRx drugRx) {
        drugRxDao.insert(drugRx);
        return 0;
    }

    @Override
    public int modify(DrugRx drugRx) {
        drugRxDao.update(drugRx);
        return 0;
    }

    @Override
    public int remove(int diId) {
        drugRxDao.deleteByDiId(diId);
        return 0;
    }

    @Override
    public int removeByopId(int opId) {
        drugRxDao.deleteByOpId(opId);
        return 0;
    }

    @Override
    public int removeBymrId(int mrId) {
        drugRxDao.deleteByMrId(mrId);
        return 0;
    }
}
