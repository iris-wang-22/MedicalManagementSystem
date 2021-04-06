package com.tosit.yl.dao;

import com.tosit.yl.entity.Administrative;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Chenshufu on 2017/6/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class AdministrativeTest {
    @Resource
    private AdministrativeDao administrativeDao;

    @Test
    public void queryByAdId(){
        int id = 2;
        Administrative administrative = administrativeDao.queryByAdId(id);
        System.out.println(administrative);
        System.out.println(administrative.toString());
    }

    @Test
    public void queryByAdName(){
        List<Administrative> administratives = administrativeDao.queryByAdName("妇产科");
        for(Administrative administrative : administratives){
            System.out.println(administrative);
        }
    }

    @Test
    public void queryAll(){
        List<Administrative> administratives = administrativeDao.queryAll(0,100);
        for(Administrative administrative : administratives){
            System.out.println(administrative);
        }
    }

    @Test
    public void insert(){
        Administrative administrative = new Administrative();
        //administrative.setAdId(2);
        administrative.setAdName("妇产科");
        administrative.setAdLocal("七楼");
        administrativeDao.insert(administrative);
    }

    @Test
    public void update(){
        Administrative administrative = new Administrative();
        administrative.setAdId(2);
        administrative.setAdName("妇产科");
        administrative.setAdLocal("七楼");
        administrativeDao.update(administrative);
        queryAll();

    }

    @Test
    public void delete(){
        Administrative administrative = new Administrative();
        administrative.setAdId(3);
        administrativeDao.delete(administrative);
        queryAll();

    }

}
