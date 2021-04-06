package com.tosit.yl.dao;

import com.tosit.yl.entity.Feedback;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/6/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class FeedbackDaoTest {
    @Resource
    private FeedbackDao feedbackDao;

    @Test
    public void queryByFeedbackId(){
        Feedback feedback = feedbackDao.queryByFeedbackId(1);
        System.out.println(feedback);
    }

    @Test
    public void queryFbByUserId(){
        List<Feedback> feedbacks = feedbackDao.queryFbByUserId(1);
        for (Feedback feedback : feedbacks){
            System.out.println(feedback);
        }
    }

    @Test
    public void queryFbByAdId(){
        List<Feedback> feedbacks = feedbackDao.queryFbByAdId(2);
        for (Feedback feedback : feedbacks){
            System.out.println(feedback);
        }
    }

    @Test
    public void queryAll(){
        List<Feedback> feedbacks = feedbackDao.queryAll(0,100);
        for(Feedback feedback:feedbacks){
            System.out.println(feedback);
        }
    }

    @Test
    public void insert(){
        Feedback feedback = new Feedback();
        feedback.setFeedbackId(1);
        feedback.setDetail("???");
        feedback.setAdId(2);
        feedback.setUserId(0010);
        feedbackDao.insert(feedback);
    }

    @Test
    public void delete(){
        feedbackDao.deleteById(1);
    }
}
