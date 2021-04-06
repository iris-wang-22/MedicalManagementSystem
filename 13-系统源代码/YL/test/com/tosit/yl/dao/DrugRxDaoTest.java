package com.tosit.yl.dao;

import com.tosit.yl.entity.DrugRx;
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
public class DrugRxDaoTest {
    @Resource
    private DrugRxDao drugRxDao;

    @Test
    public void queryByDiId(){
        DrugRx drugRx=drugRxDao.queryByDiId(1);
        System.out.println(drugRx);
    }
    @Test
    public void queryByMrId(){
        List<DrugRx> drugRx=drugRxDao.queryByMrId(1);
        System.out.println(drugRx);
    }
    @Test
    public void queryByOpId(){
        DrugRx drugRx=drugRxDao.queryByOpId(1);
        System.out.println(drugRx);
    }
    @Test
    public void queryAll(){
        List<DrugRx> drugRxes=drugRxDao.queryAll(0,100);
        for (DrugRx drugRx:drugRxes){
            System.out.println(drugRx);
        }
    }
    @Test
    public void update(){
        DrugRx drugRx = new DrugRx();
        drugRx.setDiId(1);
        drugRx.setMrId(1);
        drugRx.setOpId(1);
        drugRx.setDrugRxTime(new Date());
        drugRxDao.update(drugRx);
    }
    @Test
    public void deleteByDiId(){
        DrugRx drugRx = new DrugRx();
        drugRx.setDiId(1);
        drugRxDao.deleteByDiId(1);
    }
    @Test
    public void deleteByOpId(){
        DrugRx drugRx = new DrugRx();
        drugRx.setOpId(1);
        drugRxDao.deleteByOpId(1);
    }
    @Test
    public void deleteByMrId(){
        DrugRx drugRx = new DrugRx();
        drugRx.setOpId(1);
        drugRxDao.deleteByMrId(1);
    }
    @Test
    public void insert(){
        DrugRx drugRx = new DrugRx();
        drugRx.setDiId(1);
        drugRx.setOpId(1);
        drugRx.setMrId(1);
        drugRx.setDrugRxTime(new Date());
        drugRxDao.insert(drugRx);
    }
}
