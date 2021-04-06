package com.tosit.yl.dao;

import com.tosit.yl.entity.Feedback;
import com.tosit.yl.entity.MedicalRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by LZS on 2017/6/30.
 */
public interface FeedbackDao {

    /**
     * 根据偏移量和限制查询
     * @param offset
     * @param limit
     * @return
     */
    List<Feedback>queryAll(@Param("offset")int offset, @Param("limit") int limit);

    /**
     * 通过用户编号查他提交的反馈
     * @param userId
     * @return
     */
    List<Feedback> queryFbByUserId(int userId);

    /**
     * 通过反馈编号编号查反馈
     * @param feedbackId
     * @return
     */
    Feedback queryByFeedbackId(int feedbackId);

    /**
     * 通过科室编号查反馈
     * @param adId
     */
    List<Feedback> queryFbByAdId(int adId);

    /**
     * 插入反馈
     * @param feedback
     */
    void insert(Feedback feedback);

    /**
     * 通过反馈编号删除反馈
     * @param feedbackId
     */
    void deleteById(int feedbackId);


}
