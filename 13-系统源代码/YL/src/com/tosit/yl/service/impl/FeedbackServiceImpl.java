package com.tosit.yl.service.impl;

import com.tosit.yl.dao.FeedbackDao;
import com.tosit.yl.entity.Feedback;
import com.tosit.yl.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/1.
 */
@Service
public class FeedbackServiceImpl implements FeedbackService{
    @Autowired
    private FeedbackDao feedbackDao;
    @Override
    public List<Feedback> getFeedBackList(int pageNo, int pageSize) {
        List<Feedback> FeedbackList=feedbackDao.queryAll(pageNo,pageSize);
        return FeedbackList;
    }

    @Override
    public List<Feedback> getUserId(int userId) {
        List<Feedback> UserList=feedbackDao.queryFbByUserId(userId);
        return UserList;
    }

    @Override
    public Feedback getId(int feedbackId) {
        Feedback feedback=feedbackDao.queryByFeedbackId(feedbackId);
        return feedback;
    }

    @Override
    public List<Feedback> getAdId(int adId) {
        List<Feedback> AdList=feedbackDao.queryFbByAdId(adId);
        return AdList;
    }

    @Override
    public int add(Feedback feedback) {
        feedbackDao.insert(feedback);
        return 0;
    }


    @Override
    public int removeById(int feedbackId) {
        feedbackDao.deleteById(feedbackId);
        return 0;
    }
}
