package com.tosit.yl.service.impl;

import com.tosit.yl.dao.WardDao;
import com.tosit.yl.entity.Ward;
import com.tosit.yl.service.WardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
@Service
public class WardServiceImpl implements WardService {

    private final WardDao wardDao;

    @Autowired
    public WardServiceImpl(WardDao wardDao) {
        this.wardDao = wardDao;
    }

    @Override
    public List<Ward> getWardList(int pageNo, int pageSize) {
        List<Ward> WardList=wardDao.queryAll(pageNo,pageSize);
        return WardList;
    }

    @Override
    public Ward getBedId(int bedId) {
        Ward ward = wardDao.queryById(bedId);
        return ward;
    }

    @Override
    public int add(Ward ward) {
        wardDao.insert(ward);
        return 0;
    }

    @Override
    public int modify(Ward ward) {
        wardDao.update(ward);
        return 0;
    }

    @Override
    public int remove(Ward ward) {
        wardDao.delete(ward);
        return 0;
    }
}
