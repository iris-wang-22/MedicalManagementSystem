package com.tosit.yl.service;

import com.tosit.yl.entity.Feedback;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */

public interface FeedbackService {
    /**
     * 根据页面编号和页面大小获取反馈列表
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Feedback> getFeedBackList(int pageNo, int pageSize);

    /**
     * 根据用户编号查反馈
     * @param userId
     * @return
     */
    List<Feedback> getUserId(int userId);

    /**
     * 根据反馈id查反馈
     * @param feedbackId
     * @return
     */
    Feedback getId(int feedbackId);

    /**
     * 根据科室id查反馈
     * @param adId
     * @return
     */
    List<Feedback> getAdId(int adId);

    /**
     * 增加反馈
     * @param feedback
     * @return
     */

    int add(Feedback feedback);


    /**
     * 根据反馈id删除
     * @param feedbackId
     * @return
     */
    int removeById(int feedbackId);



}
