package com.tosit.yl.dao;

import com.tosit.yl.entity.DrugInstrument;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Chenshufu on 2017/6/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class DrugInstrumentTest {

    @Resource
    private DrugInstrumentDao drugInstrumentDao;

    @Test
    public void queryById(){
        DrugInstrument drugInstrument=drugInstrumentDao.queryById(1);
        System.out.println(drugInstrument);
    }

    @Test
    public void queryByName(){
        List<DrugInstrument> drugInstruments=drugInstrumentDao.queryByName("A药");
        for (DrugInstrument drugInstrument: drugInstruments) {
            System.out.println(drugInstrument);
        }

    }

    @Test
    public void insert(){
        DrugInstrument drugInstrument = new DrugInstrument();
        drugInstrument.setDiName("A药");
        drugInstrument.setDiType("A型");
        drugInstrument.setDiExplain("NULL");
        drugInstrument.setDiSoldPrice(100);
        drugInstrument.setDiInPrice(1);
        drugInstrument.setDiAmount(100);
        drugInstrumentDao.insert(drugInstrument);
}

    @Test
    public void queryAll(){
        List<DrugInstrument> drugInstruments = drugInstrumentDao.queryAll(0,100);
        for (DrugInstrument drugInstrument: drugInstruments){
            System.out.println(drugInstrument);
        }
    }

    @Test
    public void update(){
        DrugInstrument drugInstrument = new DrugInstrument();
        drugInstrument.setDiName("A药");
        drugInstrument.setDiType("A型");
        drugInstrument.setDiExplain("NULL");
        drugInstrument.setDiSoldPrice(100);
        drugInstrument.setDiInPrice(1);
        drugInstrument.setDiAmount(12);
        drugInstrument.setDiId(1);
        drugInstrumentDao.update(drugInstrument);
        queryAll();
    }

    @Test
    public void delete(){
        DrugInstrument drugInstrument = new DrugInstrument();
        drugInstrument.setDiId(2);
        drugInstrumentDao.delete(drugInstrument);
        queryAll();
    }
}
