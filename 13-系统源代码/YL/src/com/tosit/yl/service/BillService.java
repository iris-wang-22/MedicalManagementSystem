package com.tosit.yl.service;

import com.tosit.yl.entity.Bill;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
public interface BillService {
    /**
     * 根据页面编号和页面大小获取账单列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Bill> getBillList(int pageNo,int pageSize);

    /**
     * 根据账单id查询
     * @param billId
     * @return
     */
    Bill getBillId(int billId);

    /**
     * 根据病历id查询
     * @param mrId
     * @return
     */
    Bill getMrId(int mrId);

    /**
     * 增加账单条目
     * @param bill
     * @return
     */
    int add(Bill bill);

    /**
     * 修改账单
     * @param bill
     * @return
     */
    int modify(Bill bill);

    /**
     * 根据账单id删除
     * @param billId
     * @return
     */
    int removeById(int billId);

    /**
     * 根据病历id删除
     * @param mrId
     * @return
     */
    int removeByMrId(int mrId);

}
