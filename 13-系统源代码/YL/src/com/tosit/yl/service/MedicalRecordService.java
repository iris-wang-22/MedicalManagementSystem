package com.tosit.yl.service;

import com.tosit.yl.entity.Feedback;
import com.tosit.yl.entity.MedicalRecord;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
public interface MedicalRecordService {
    /**
     * 根据页面编号和页面大小获取病例列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<MedicalRecord> getMedicalRecordList(int pageNo, int pageSize);

    /**
     * 根据用户编号查病例
     * @param userId
     * @return
     */
    List<MedicalRecord> getUserId(int userId);

    /**
     * 根据病例id查病例
     * @param medicalId
     * @return
     */
    MedicalRecord getMrId(int medicalId);

    /**
     * 根据医师id查病例
     * @param useUserId
     * @return
     */
    List<MedicalRecord> getUseUserId(int useUserId);

    /**
     * 增加病例
     * @param medicalRecord
     * @return
     */

    int add(MedicalRecord medicalRecord);


    /**
     * 根据病例id删除
     * @param mrId
     * @return
     */
    int removeById(int mrId);


    /**
     * 更新病例信息
     * @param medicalRecord
     * @return
     */
    int modify(MedicalRecord medicalRecord);
}
