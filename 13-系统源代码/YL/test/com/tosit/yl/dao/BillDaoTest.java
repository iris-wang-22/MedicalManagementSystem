package com.tosit.yl.dao;

import com.tosit.yl.entity.Bill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})

public class BillDaoTest {
    @Resource
    private BillDao billDao;
    @Test
    public void queryById(){
        int id = 1;
        Bill bill= billDao.queryById(id);
        System.out.println(bill);
       // System.out.println(bill.toString());
    }
    @Test
    public void queryAll(){
        List<Bill> bills = billDao.queryAll(0,100);
        for(Bill bill: bills){
            System.out.println(bill);
        }
    }
    @Test
    public void insert(){
        Bill bill = new Bill();
        bill.setAsItemId(123456);
        bill.setDiId(2014);
        bill.setMrId(62041);
        bill.setBillTime(new Date());
        bill.setBillAs(666);
        bill.setBillSum(666.66);
        billDao.insert(bill);
        queryAll();
    }
    @Test
    public void update(){
        Bill bill = new Bill();
        bill.setAsItemId(12345);
        bill.setDiId(201);
        bill.setMrId(6204);
        bill.setBillTime(new Date());
        bill.setBillAs(66);
        bill.setBillSum(666.6);
        bill.setBillId(3);
        billDao.update(bill);
        queryAll();
    }
    @Test
    public void deleteById(){
        Bill bill= new Bill();
        bill.setBillId(3);
        billDao.deleteById(3);
    }


}
