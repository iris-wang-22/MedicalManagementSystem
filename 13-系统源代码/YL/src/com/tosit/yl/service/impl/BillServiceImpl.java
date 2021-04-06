package com.tosit.yl.service.impl;

import com.tosit.yl.dao.BillDao;
import com.tosit.yl.entity.Bill;
import com.tosit.yl.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillDao billDao;
    @Override
    public List<Bill> getBillList(int pageNo, int pageSize) {
        List<Bill> BillList=billDao.queryAll(pageNo,pageSize);
        return BillList;
    }

    @Override
    public Bill getBillId(int billId) {
        Bill bill=billDao.queryById(billId);
        return bill;
    }

    @Override
    public Bill getMrId(int mrId) {
        Bill bill=billDao.queryByMrId(mrId);
        return bill;
    }

    @Override
    public int add(Bill bill) {
        billDao.insert(bill);
        return 0;
    }

    @Override
    public int modify(Bill bill) {
        billDao.update(bill);
        return 0;
    }

    @Override
    public int removeById(int billId) {
        billDao.deleteById(billId);
        return 0;
    }

    @Override
    public int removeByMrId(int mrId) {
        billDao.deleteByMrId(mrId);
        return 0;
    }
}
