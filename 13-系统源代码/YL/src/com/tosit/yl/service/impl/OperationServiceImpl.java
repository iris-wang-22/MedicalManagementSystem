package com.tosit.yl.service.impl;

import com.tosit.yl.dao.OperationDao;
import com.tosit.yl.entity.Operation;
import com.tosit.yl.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
@Service
public class OperationServiceImpl implements OperationService {

    @Autowired
    private OperationDao operationDao;

    @Override
    public List<Operation> getOperationList(int pageNo, int pageSize) {
        List<Operation> OperationList=operationDao.queryAll(pageNo,pageSize);
        return OperationList;
    }

    @Override
    public Operation getOpId(int opId) {
        Operation operation=operationDao.queryById(opId);
        return operation;
    }

    @Override
    public Operation getMrId(int mrId) {
        Operation operation=operationDao.queryByMrId(mrId);
        return operation;
    }

    @Override
    public int add(Operation operation) {
        operationDao.insert(operation);
        return 0;
    }

    @Override
    public int modify(Operation operation) {
        operationDao.update(operation);
        return 0;
    }

    @Override
    public int removeByOpId(int opId) {
        operationDao.deleteById(opId);
        return 0;
    }

    @Override
    public int removeByMrId(int mrId) {
        operationDao.deleteByMrId(mrId);
        return 0;
    }
}
