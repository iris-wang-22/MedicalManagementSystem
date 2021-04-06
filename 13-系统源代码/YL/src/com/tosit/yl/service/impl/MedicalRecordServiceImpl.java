package com.tosit.yl.service.impl;

import com.tosit.yl.dao.AdministrativeDao;
import com.tosit.yl.dao.MedicalRecordDao;
import com.tosit.yl.entity.Administrative;
import com.tosit.yl.entity.MedicalRecord;
import com.tosit.yl.service.AdministrativeService;
import com.tosit.yl.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {
    @Autowired
    private MedicalRecordDao medicalRecordDao;

    @Override
    public List<MedicalRecord> getMedicalRecordList(int pageNo, int pageSize) {
        List<MedicalRecord> MrList=medicalRecordDao.queryAll(pageNo,pageSize);
        return MrList;
    }

    @Override
    public MedicalRecord getMrId(int mrId) {
        MedicalRecord medicalRecord=medicalRecordDao.queryByMrId(mrId);
        return medicalRecord;
    }

    @Override
    public List<MedicalRecord> getUserId(int userId) {
        List<MedicalRecord> UserIdList=medicalRecordDao.queryMrByUserId(userId);
        return UserIdList;
    }

    @Override
    public List<MedicalRecord> getUseUserId(int useuserId) {
        List<MedicalRecord> UseUserIdList=medicalRecordDao.queryMrByDoctorId(useuserId);
        return UseUserIdList;
    }

    @Override
    public int add(MedicalRecord medicalRecord) {
        medicalRecordDao.insert(medicalRecord);
        return 0;
    }

    @Override
    public int removeById(int mrId) {
        medicalRecordDao.deleteById(mrId);
        return 0;
    }

    @Override
    public int modify(MedicalRecord medicalRecord) {
        medicalRecordDao.update(medicalRecord);
        return 0;
    }
}
