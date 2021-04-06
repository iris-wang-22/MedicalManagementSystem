package com.tosit.yl.service;

import com.tosit.yl.entity.Operation;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
public interface OperationService {
    /**
     * 根据页面编号和页面大小获取手术列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Operation> getOperationList(int pageNo, int pageSize);

    /**
     * 根据手术id查找手术
     * @param opId
     * @return
     */
    Operation getOpId(int opId);

    /**
     * 根据病历id查找手术
     * @param mrId
     * @return
     */
    Operation getMrId(int mrId);

    /**
     * 增加手术
     * @param operation
     * @return
     */
    int add(Operation operation);

    /**
     * 修改手术信息
     * @param operation
     * @return
     */
    int modify(Operation operation);

    /**
     * 根据手术id删除手术
     * @param opId
     * @return
     */
    int removeByOpId(int opId);

    /**
     * 根据病历id删除手术
     * @param mrId
     * @return
     */
    int removeByMrId(int mrId);


}
