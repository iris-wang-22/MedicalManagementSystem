package com.tosit.yl.dao;

import com.tosit.yl.entity.Order;
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
public class OrderDaoTest {
    @Resource
    private OrderDao orderDao;

    @Test
    public void queryById(){
        Order order=orderDao.queryByDiId(1);
        System.out.println(order);
    }
    @Test
    public void insert(){
        Order order = new Order();
        order.setDiId(1);
        //order.setOrderDate();
        orderDao.insert(order);
    }
    @Test
    public void delete(){
        Order order = new Order();
        order.setDiId(1);
        //order.setOrderDate();
        orderDao.deleteByDiId(1);
    }
    @Test
    public void queryAll(){
        List<Order> orders= orderDao.queryAll(0,100);
        for(Order order: orders){
            System.out.println(order);
        }
    }
    @Test
    public void update(){
        Order order = new Order();
        order.setDiId(1);
        //order.setOrderDate();
        orderDao.update(order);
    }
}
