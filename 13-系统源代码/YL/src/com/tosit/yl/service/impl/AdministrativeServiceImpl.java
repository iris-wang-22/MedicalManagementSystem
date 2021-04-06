package com.tosit.yl.service.impl;

import com.tosit.yl.dao.AdministrativeDao;
import com.tosit.yl.entity.Administrative;
import com.tosit.yl.service.AdministrativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
@Service
public class AdministrativeServiceImpl implements AdministrativeService {
    @Autowired
    private AdministrativeDao administrativeDao;

    @Override
    public List<Administrative> getAdList(int pageNo, int pageSize) {
        List<Administrative> AdList=administrativeDao.queryAll(pageNo,pageSize);
        return AdList;
    }

    @Override
    public Administrative getId(int adId) {
        Administrative administrative=administrativeDao.queryByAdId(adId);
        return administrative;
    }

    @Override
    public List<Administrative> getAdNameList(String adName) {
        List<Administrative> AdNameList=administrativeDao.queryByAdName(adName);
        return AdNameList;
    }

    @Override
    public int add(Administrative administrative) {
        administrativeDao.insert(administrative);
        return 0;
    }

    @Override
    public int remove(Administrative administrative) {
        administrativeDao.delete(administrative);
        return 0;
    }

    @Override
    public int modify(Administrative administrative) {
        administrativeDao.update(administrative);
        return 0;
    }
}
