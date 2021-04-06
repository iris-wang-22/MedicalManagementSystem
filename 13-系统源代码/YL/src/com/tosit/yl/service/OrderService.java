package com.tosit.yl.service;

import com.tosit.yl.entity.Order;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
public interface OrderService {
    /**
     * 根据页面编号和页面大小获取采购计划列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Order> getOrderList(int pageNo, int pageSize);

    /**
     * 根据药品编号查询药品采购计划
     * @param diId
     * @return
     */
    Order getDiId(int diId);

    /**
     * 根据药品编号查询药品采购计划
     * @param orderId
     * @return
     */
    Order getOrId(int orderId);

    /**
     * 添加药品采购计划
     * @param order
     * @return
     */
    int add(Order order);

    /**
     * 修改药品采购计划
     * @param order
     * @return
     */
    int modify(Order order);

    /**
     * 根据药品编号删除采购计划
     * @param diId
     * @return
     */
    int remove(int diId);
}
