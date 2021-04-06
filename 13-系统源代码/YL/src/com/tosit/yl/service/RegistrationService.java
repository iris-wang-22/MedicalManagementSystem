package com.tosit.yl.service;

import com.tosit.yl.entity.Registration;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
public interface RegistrationService {
    /**
     * 根据页面编号和页面大小获取挂号列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Registration> getRegistrationList(int pageNo, int pageSize);

    /**
     * 根据用户id查询
     * @param userId
     * @return
     */
    List<Registration> getUserId(int userId);

    /**
     * 根据科室id查询
     * @param adId
     * @return
     */
    List<Registration> getAdId(int adId);

    /**
     * 增加挂号
     * @param registration
     * @return
     */
    int add(Registration registration);

    /**
     * 修改挂号信息
     * @param registration
     * @return
     */
    int modify(Registration registration);


    /**
     * 删除挂号记录
     * @param registration
     * @return
     */
    int remove(Registration registration);
}
