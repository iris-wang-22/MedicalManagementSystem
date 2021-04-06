package com.tosit.yl.service;
import com.tosit.yl.entity.AsResult;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
public interface AsResultService {
    /**
     * 根据页面编号和页面大小获取辅助检查结果
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<AsResult> getAsList(int pageNo, int pageSize);

    /**
     * 根据病历查询
     * @param mrId
     * @return
     */
    List<AsResult> getMrList(int mrId);

    /**
     * 根据辅助项目查询
     * @param asItemId
     * @return
     */
    List<AsResult> getAsList(int asItemId);

    /**
     * 通过负责医生查询
     * @param userId
     * @return
     */
    List<AsResult> getDocList(int userId);

    /**
     * 增加
     * @param asResult
     * @return
     */
    int add(AsResult asResult);

    /**
     * 修改
     * @param asResult
     * @return
     */
    int modify(AsResult asResult);

    /**
     * 删除
     * @param asResult
     * @return
     */
    int remove(AsResult asResult);



}
