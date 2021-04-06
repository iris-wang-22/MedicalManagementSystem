package com.tosit.yl.dao;

import com.tosit.yl.entity.Order;
import com.tosit.yl.entity.Registration;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/6/29.
 */
public interface OrderDao {
    /**
     * 根据药品编号查询采购计划
     * @param DiId
     * @return
     */
    Order queryByDiId(int DiId);

    /**
     * 根据计划编号查询采购计划
     * @param OrderId
     * @return
     */
    Order queryByOrId(int OrderId);

    /**
     * 根据偏移量及限制条件查询部分列表
     * @param offset
     * @param limit
     * @return
     */
    List<Order> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 根据药品编号删除采购计划
     * @param DiId
     */
    void deleteByDiId(int DiId);

    /**
     * 插入
     * @param order
     */
    void insert(Order order);

    /**
     * 修改
     * @param order
     */
    void update(Order order);
}
