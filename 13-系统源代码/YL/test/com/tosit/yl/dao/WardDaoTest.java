package com.tosit.yl.dao;

import com.tosit.yl.entity.DrugInstrument;
import com.tosit.yl.entity.User;
import com.tosit.yl.entity.Ward;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/6/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class WardDaoTest {
    @Resource
    private WardDao wardDao;

    @Test
    public void queryById(){
        int id = 1;
        Ward ward = wardDao.queryById(id);
        System.out.println(ward);

    }

    @Test
    public void queryAll(){
        List<Ward> wards = wardDao.queryAll(0,100);
        for(Ward ward:wards){
            System.out.println(ward);
        }

    }

    @Test
    public void insert(){
        Ward ward = new Ward();
        ward.setBedId(2);
        ward.setAdId(1);
        ward.setBedLocal("601");
        wardDao.insert(ward);
    }

    @Test
    public void update(){
        Ward ward = new Ward();
        ward.setBedId(2);
        ward.setAdId(5);
        ward.setBedLocal("501");
        wardDao.update(ward);
        queryAll();
    }

    @Test
    public void delete(){
        Ward ward = new Ward();
        ward.setBedId(2);
        wardDao.delete(ward);
        queryAll();
    }


}
