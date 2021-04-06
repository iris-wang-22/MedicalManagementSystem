package com.tosit.yl.dao;


import com.tosit.yl.entity.Registration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class RegistrationDaoTest {
    @Resource
    private RegistrationDao registrationDao;

    @Test
    public void queryRgByUserId(){
        List<Registration> registrations = registrationDao.queryRgByUserId(1);
        for (Registration registration : registrations){
            System.out.println(registration);
        }
    }

    @Test
    public void queryRgByAdId(){
        List<Registration> registrations = registrationDao.queryRgByAdId(1);
        for (Registration registration : registrations){
            System.out.println(registration);
        }
    }


    @Test
    public void queryAll(){
        List<Registration> registrations = registrationDao.queryAll(0,100);
        for(Registration registration : registrations){
            System.out.println(registration);
        }
    }

    @Test
    public void insert(){
        Registration registration = new Registration();
        registration.setAdId(1);
        registration.setUserId(1);
        registration.setRegistrationTime(new Date());
        registrationDao.insert(registration);
    }

    @Test
    public void update(){

        Registration registration = new Registration();
        registration.setAdId(1);
        registration.setUserId(1);
        registration.setRegistrationTime(new Date());
    }

    @Test
    public void delete() {
        Registration registration = new Registration();
        registration.setUserId(1);
        registration.setAdId(1);
        registrationDao.deleteRg(registration);
    }

    @Test
    public void query(){
        List<Registration> registrations = registrationDao.query();
        for(Registration registration : registrations){
            System.out.println(registration);
        }

    }

}
