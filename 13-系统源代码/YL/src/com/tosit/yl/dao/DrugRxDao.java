package com.tosit.yl.dao;

import com.tosit.yl.entity.DrugRx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2017/6/29.
 */
public interface DrugRxDao {
    DrugRx queryByDiId(int diId);

    List<DrugRx> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    List<DrugRx> queryByMrId(int mrId);

    DrugRx queryByOpId(int opId);

    void insert(DrugRx drugRx);

    void deleteByDiId(int diId);

    void deleteByOpId(int opId);

    void deleteByMrId(int mrId);

    void update(DrugRx drugRx);
}
