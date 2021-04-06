package com.tosit.yl.dao;

import com.tosit.yl.entity.Inhospital;

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
public class InhospitalDaoTest {

    @Resource
    private InhospitalDao inhospitalDao;

    @Test
    public void queryByUId(){
        int id = 1;
        Inhospital inhospital = inhospitalDao.queryByUId(id);
        System.out.println(inhospital);
        System.out.println(inhospital.toString());
    }

    @Test
    public void queryByBId(){
        int id = 2;
        Inhospital inhospital = inhospitalDao.queryByBId(id);
        System.out.println(inhospital);
        System.out.println(inhospital.toString());
    }

    @Test
    public void queryAll(){
        List<Inhospital> inhospitals = inhospitalDao.queryAll(0,100);
        for(Inhospital inhospital : inhospitals){
            System.out.println(inhospital);
        }
    }

    @Test
    public void insert(){
        Inhospital inhospital = new Inhospital();
        inhospital.setUserId(1);
        inhospital.setBedId(3);
        inhospital.setInStatue(1);
        inhospital.setInStarttime(new Date());
        inhospital.setInEndtime(new Date());
        inhospitalDao.insert(inhospital);
    }

    @Test
    public void update(){
        Inhospital inhospital = new Inhospital();
        inhospital.setUserId(2);
        inhospital.setBedId(2);
        inhospital.setInStatue(2);
        inhospital.setInStarttime(new Date());
        inhospital.setInEndtime(new Date());
        inhospitalDao.update(inhospital);
        queryAll();

    }

    @Test
    public void deleteByUId(){
        inhospitalDao.deleteByUId(1);
    }

}
