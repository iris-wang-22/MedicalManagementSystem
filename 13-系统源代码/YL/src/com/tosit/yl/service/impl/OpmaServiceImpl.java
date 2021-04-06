package com.tosit.yl.service.impl;

import com.tosit.yl.dao.OperationDao;
import com.tosit.yl.dao.OpmaDao;
import com.tosit.yl.entity.Opma;
import com.tosit.yl.service.OpmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
@Service
public class OpmaServiceImpl implements OpmaService {
    @Autowired
    private OpmaDao opmaDao;
    @Override
    public List<Opma> getOpmaList(int pageNo, int pageSize) {
        List<Opma> OperationList=opmaDao.queryAll(pageNo,pageSize);
        return OperationList;
    }

    @Override
    public Opma getOpId(int opId) {
        Opma opma=opmaDao.queryByOpId(opId);
        return opma;
    }

    @Override
    public Opma getUserId(int userId) {
        Opma opma=opmaDao.queryByUserId(userId);
        return opma;
    }

    @Override
    public int add(Opma opma) {
        opmaDao.insert(opma);
        return 0;
    }

    @Override
    public int modify(Opma opma) {
        opmaDao.update(opma);
        return 0;
    }

    @Override
    public int removeByOpId(int opId) {
        opmaDao.deleteByOpId(opId);
        return 0;
    }

    @Override
    public int removeByUserId(int userId) {
        opmaDao.deleteByUserId(userId);
        return 0;
    }
}
