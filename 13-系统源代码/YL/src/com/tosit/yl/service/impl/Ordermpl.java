package com.tosit.yl.service.impl;

import com.tosit.yl.dao.OrderDao;
import com.tosit.yl.entity.Order;
import com.tosit.yl.entity.Registration;
import com.tosit.yl.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
@Service
public class Ordermpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> getOrderList(int pageNo, int pageSize) {
        List<Order> orderList = orderDao.queryAll(pageNo,pageSize);
        return orderList;
    }

    @Override
    public Order getDiId(int diId) {
        Order orderList = orderDao.queryByDiId(diId);
        return orderList;
    }

    @Override
    public Order getOrId(int orderId) {
        Order OrderList = orderDao.queryByOrId(orderId);
        return OrderList;
    }


    @Override
    public int add(Order order) {
        orderDao.insert(order);
        return 0;
    }

    @Override
    public int modify(Order order) {
        orderDao.update(order);
        return 0;
    }

    @Override
    public int remove(int diId) {
        orderDao.deleteByDiId(diId);
        return 0;
    }
}
