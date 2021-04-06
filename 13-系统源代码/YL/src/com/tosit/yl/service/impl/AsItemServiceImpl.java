package com.tosit.yl.service.impl;

import com.tosit.yl.dao.AsItemDao;
import com.tosit.yl.entity.AsItem;
import com.tosit.yl.service.AsItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
@Service
public class AsItemServiceImpl implements AsItemService{
    @Autowired
    private AsItemDao asItemDao;
    @Override
    public List<AsItem> getAsList(int pageNo, int pageSize) {
        //List<AsItem> List=asItemDao.queryAll(pageNo,pageSize);
        return null;//List;
    }

    @Override
    public AsItem getAsId(int asItemId) {
        AsItem asItem=asItemDao.queryById(asItemId);
        return asItem;
    }

    @Override
    public List<AsItem> getAsName(String asItemName) {
        List<AsItem> AsNameList=asItemDao.queryByName(asItemName);
        return AsNameList;
    }

    @Override
    public int add(AsItem asItem) {
        asItemDao.insert(asItem);
        return 0;
    }

    @Override
    public int modify(AsItem asItem) {
        asItemDao.update(asItem);
        return 0;
    }

    @Override
    public int remove(int asItemId) {
        asItemDao.deleteById(asItemId);
        return 0;
    }
}
