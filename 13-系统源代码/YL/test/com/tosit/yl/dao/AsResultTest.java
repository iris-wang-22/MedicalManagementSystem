package com.tosit.yl.dao;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.tosit.yl.entity.AsResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.swing.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Chenshufu on 2017/6/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class AsResultTest {

    @Resource
    private AsResultDao asResultDao;

    @Test
    public void queryByDoctorId(){
        List<AsResult> asResults = asResultDao.queryByUserId(1);
        for(AsResult asResult : asResults){
            System.out.println(asResult);
        }
    }

    @Test
    public void queryByMrId(){
        List<AsResult> asResults= asResultDao.queryByMrId(1);
        for(AsResult asResult : asResults){
            System.out.println(asResult);
        }
    }

    @Test
    public void queryByAsItemId(){
        List<AsResult> asResults = asResultDao.queryByAsItemId(1);
        for(AsResult asResult : asResults){
            System.out.println(asResult);
        }
    }

    @Test
    public void queryAll(){
        List<AsResult> asResults = asResultDao.queryAll(0,100);
        for(AsResult asResult : asResults){
            System.out.println(asResult);
        }
    }

    @Test
    public void insert(){
        AsResult asResult = new AsResult();
        asResult.setAsItemId(2);
        asResult.setAsResultTime(new Date());
        asResult.setAsResultReport("asdasd");
        asResult.setMrId(3);
        asResult.setUserId(2);
        asResultDao.insert(asResult);
    }
    @Test
    public void update(){
        AsResult asResult = new AsResult();
        asResult.setAsItemId(2);
        asResult.setAsResultTime(new Date());
        asResult.setAsResultReport("sd");
        asResult.setMrId(3);
        asResult.setUserId(2);
        asResultDao.update(asResult);
    }

    @Test
    public void delete(){
        AsResult asResult = new AsResult();
        asResult.setAsItemId(2);
        asResult.setAsResultTime(new Date());
        asResult.setAsResultReport("sd");
        asResult.setMrId(3);
        asResult.setUserId(2);
        asResultDao.delete(asResult);
    }

}
