package com.tosit.yl.dao;

import com.tosit.yl.entity.Bill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/6/30.
 */
public interface BillDao {

    /**
     * 根据账单id查询
     * @param billId
     * @return
     */
    Bill queryById(int billId);

    /**
     * 根据病历id查询
     * @param mrId
     * @return
     */
    Bill queryByMrId(int mrId);

    /**
     * 插入
     * @param bill
     */

    void insert(Bill bill);

    /**
     * 根据账单id删除
     * @param billId
     */
    void deleteById(int billId);

    /**
     * 根据病历id删除
     * @param mrId
     */
    void deleteByMrId(int mrId);

    /**
     * 更新
     * @param bill
     */
    void update(Bill bill);

    /**
     * 根据偏移量和限制查询
     * @param offset
     * @param limit
     * @return
     */
    List<Bill> queryAll(@Param("offset") int offset, @Param("limit") int limit);







}
