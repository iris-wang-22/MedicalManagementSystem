package com.tosit.yl.dao;

import com.tosit.yl.entity.DiPc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class DiPcDaoTest {
    @Resource
    private DiPcDao diPcDao;

    @Test
    public void queryByDiId(){
        DiPc diPc=diPcDao.queryByDiId(1);
        System.out.println(diPc);
    }

    @Test
    public void queryByDiPcId(){
        DiPc diPc=diPcDao.queryByDiPcId(1);
        System.out.println(diPc);
    }

    @Test
    public void queryAll() {
        List<DiPc> diPcs = diPcDao.queryAll(0, 100);
        for (DiPc diPc : diPcs) {
            System.out.println(diPcs);
        }
    }

    @Test
    public void insert(){
        DiPc diPc = new DiPc();
        diPc.setDiPcId(1);
        diPc.setDiId(1);
        diPc.setDiPcOt(new Date());
        diPc.setDiPcNumber(1);
        //order.setOrderDate();
        diPcDao.insert(diPc);
    }

    @Test
    public void delete(){
        DiPc diPc = new DiPc();
        diPc.setDiPcId(1);
        diPc.setDiId(1);
        diPc.setDiPcOt(new Date());
        diPc.setDiPcNumber(1);
        diPcDao.delete(diPc);
    }

    @Test
    public void update(){
        DiPc diPc = new DiPc();
        diPc.setDiPcId(1);
        diPc.setDiId(1);
        diPc.setDiPcOt(new Date());
        diPc.setDiPcNumber(1);
        diPcDao.update(diPc);
    }

}
