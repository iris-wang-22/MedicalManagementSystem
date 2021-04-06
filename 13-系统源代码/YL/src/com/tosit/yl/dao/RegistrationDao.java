package com.tosit.yl.dao;

import com.tosit.yl.entity.MedicalRecord;
import com.tosit.yl.entity.Registration;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/6/30.
 */
public interface RegistrationDao {

    /**
     * 通过用户编号查询该用户的全部挂号列表
     * @param userId
     * @return
     */
    List<Registration> queryRgByUserId(int userId);

    /**
     * 根据偏移量和限制查询
     * @param offset
     * @param limit
     * @return
     */
    List<Registration> queryAll(@Param("offset")int offset, @Param("limit") int limit);

    /**
     * 通过科室编号查挂号列表
     * @param adId
     * @return
     */
    List<Registration> queryRgByAdId(int adId);

    /**
     * 修改挂号
     * @param registration
     */
    void update(Registration registration);

    /**
     * 插入挂号
     * @param registration
     */
    void insert(Registration registration);

    /**
     * 删除挂号
     * @param registration
     */
    void deleteRg(Registration registration);

    List<Registration> query();
}
