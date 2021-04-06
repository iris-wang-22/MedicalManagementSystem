package com.tosit.yl.service.impl;

import com.tosit.yl.dao.AsResultDao;
import com.tosit.yl.entity.AsResult;
import com.tosit.yl.service.AsResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
@Service
public class AsResultServiceImpl implements AsResultService {
    @Autowired
    private AsResultDao asResultDao;
    @Override
    public List<AsResult> getAsList(int pageNo, int pageSize) {
        List<AsResult> List=asResultDao.queryAll(pageNo,pageSize);
        return List;
    }

    @Override
    public List<AsResult> getMrList(int mrId) {
        List<AsResult> MrList=asResultDao.queryByMrId(mrId);
        return MrList;
    }

    @Override
    public List<AsResult> getAsList(int asItemId) {
        List<AsResult> AsList=asResultDao.queryByAsItemId(asItemId);
        return AsList;
    }

    @Override
    public List<AsResult> getDocList(int userId) {
        List<AsResult> DocList=asResultDao.queryByUserId(userId);
        return DocList;
    }

    @Override
    public int add(AsResult asResult) {
        asResultDao.insert(asResult);
        return 0;
    }

    @Override
    public int modify(AsResult asResult) {
        asResultDao.update(asResult);
        return 0;
    }

    @Override
    public int remove(AsResult asResult) {
        asResultDao.delete(asResult);
        return 0;
    }
}
