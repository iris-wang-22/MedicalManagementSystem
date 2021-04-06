package com.tosit.yl.dao;

import com.tosit.yl.entity.MedicalRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by Chenshufu on 2017/6/29.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class MedicalRecordTest {

    @Resource
    private MedicalRecordDao medicalRecordDao;

    @Test
    public void insert(){
        MedicalRecord medicalRecord = new MedicalRecord();
        medicalRecord.setUserId(1);
        medicalRecord.setUserUserId(2);
        medicalRecord.setMrChiefComplaint("HAHA");
        //medicalRecord.setMrTime(new Date());
        medicalRecordDao.insert(medicalRecord);
    }
    @Test
    public void queryByMrId(){
        MedicalRecord medicalRecord = medicalRecordDao.queryByMrId(2);
        System.out.println(medicalRecord);
    }

    @Test
    public void queryByUserId(){
        List<MedicalRecord> medicalRecords = medicalRecordDao.queryMrByUserId(1);
        for (MedicalRecord medicalRecord : medicalRecords){
            System.out.println(medicalRecord);
        }
    }

    @Test
    public void queryByDoctorId(){
        List<MedicalRecord> medicalRecords = medicalRecordDao.queryMrByDoctorId(2);
        for (MedicalRecord medicalRecord : medicalRecords){
            System.out.println(medicalRecord);
        }
    }

    @Test
    public void update(){

        MedicalRecord medicalRecord = new MedicalRecord();
        medicalRecord.setMrId(1);
        medicalRecord.setUserId(1);
        medicalRecord.setUserUserId(2);
        medicalRecord.setMrChiefComplaint("HEHE");
        //medicalRecord.setMrTime(new Date());
    }

    @Test
    public void delete(){
        medicalRecordDao.deleteById(1);
    }

    @Test
    public void queryAll(){
        List<MedicalRecord> medicalRecords = medicalRecordDao.queryAll(0,100);
        for(MedicalRecord medicalRecord:medicalRecords){
            System.out.println(medicalRecord);
        }
    }
}
