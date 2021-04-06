package com.tosit.yl.dao;

import com.tosit.yl.entity.MedicalRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Chenshufu on 2017/6/29.
 */
public interface MedicalRecordDao {
    /**
     * 通过用户编号查询该用户的全部病历列表
     * @param userId
     * @return
     */
    List<MedicalRecord> queryMrByUserId(int userId);

    /**
     * 根据偏移量和限制查询
     * @param offset
     * @param limit
     * @return
     */
    List<MedicalRecord> queryAll(@Param("offset")int offset, @Param("limit") int limit);

    /**
     * 通过医生编号查他负责的病历
     * @param DoctorId
     * @return
     */
    List<MedicalRecord> queryMrByDoctorId(int DoctorId);
    /**
     * 通过病历编号查病历
     * @param mrId
     * @return
     */
    MedicalRecord queryByMrId(int mrId);

    /**
     * 修改病历
     * @param medicalRecord
     */
    void update(MedicalRecord medicalRecord);

    /**
     * 插入病历
     * @param medicalRecord
     */
    void insert(MedicalRecord medicalRecord);

    /**
     * 通过病历编号删除病历
     * @param mrId
     */
    void deleteById(int mrId);
}
