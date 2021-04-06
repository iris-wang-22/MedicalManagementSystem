package com.tosit.yl.dao;

import com.tosit.yl.entity.AsItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Chenshufu on 2017/6/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class AsItemDaoTest {

    @Resource
    private AsItemDao asItemDao;

    @Test
    public void queryByID(){
        AsItem asItem = asItemDao.queryById(1);
        System.out.println(asItem);
    }

    @Test
    public void queryByName(){
        List<AsItem> asItems = asItemDao.queryByName("X");
        for(AsItem asItem:asItems){
            System.out.println(asItem);
        }
    }

    @Test
    public void update(){
        AsItem asItem = new AsItem();
        asItem.setAsItemName("X光");
        asItem.setAsPrice(100.1);
        asItem.setAsItemId(1);
        asItemDao.update(asItem);
    }

    @Test
    public void deleteById(){
        asItemDao.deleteById(1);
    }

    @Test
    public void insert(){
        AsItem asItem = new AsItem();
        asItem.setAsItemName("X光");
        asItem.setAsPrice(100.1);
        asItemDao.insert(asItem);
    }

}
