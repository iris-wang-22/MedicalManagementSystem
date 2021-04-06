package com.tosit.yl.service.impl;

import com.tosit.yl.dao.RegistrationDao;
import com.tosit.yl.entity.Registration;
import com.tosit.yl.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
@Service
public class RegistrationServiceImpl implements RegistrationService{
    @Autowired
    private RegistrationDao registrationDao;
    @Override
    public List<Registration> getRegistrationList(int pageNo, int pageSize) {
        List<Registration> ReList=registrationDao.queryAll(pageNo,pageSize);
        return ReList ;
    }

    @Override
    public List<Registration> getUserId(int userId) {
        List<Registration> UserList=registrationDao.queryRgByUserId(userId);
        return UserList;
    }

    @Override
    public List<Registration> getAdId(int adId) {
        List<Registration> Adlist=registrationDao.queryRgByAdId(adId);
        return Adlist;
    }

    @Override
    public int add(Registration registration) {
        registrationDao.insert(registration);
        return 0;
    }

    @Override
    public int modify(Registration registration) {
        registrationDao.update(registration);
        return 0;
    }

    @Override
    public int remove(Registration registration) {
        registrationDao.deleteRg(registration);
        return 0;
    }
}
