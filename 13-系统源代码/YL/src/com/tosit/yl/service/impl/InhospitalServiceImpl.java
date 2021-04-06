package com.tosit.yl.service.impl;

import com.tosit.yl.dao.InhospitalDao;
import com.tosit.yl.entity.Inhospital;
import com.tosit.yl.service.InhospitallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
@Service
public class InhospitalServiceImpl implements InhospitallService {
    @Autowired
    private InhospitalDao inhospitalDao;
    @Override
    public List<Inhospital> getInhospitallList(int pageNo, int pageSize) {
        List<Inhospital> InhospitalList=inhospitalDao.queryAll(pageNo,pageSize);
        return InhospitalList;
    }

    @Override
    public Inhospital getUserId(int userId) {
        Inhospital inhospital=inhospitalDao.queryByUId(userId);
        return inhospital;
    }

    @Override
    public Inhospital getBedId(int bedId) {
        Inhospital inhospital=inhospitalDao.queryByUId(bedId);
        return inhospital;
    }

    @Override
    public int add(Inhospital inhospital) {
        inhospitalDao.insert(inhospital);
        return 0;
    }

    @Override
    public int modify(Inhospital inhospital) {
        inhospitalDao.update(inhospital);
        return 0;
    }

    @Override
    public int removeByUserId(int userId) {
        inhospitalDao.deleteByUId(userId);
        return 0;
    }
}
