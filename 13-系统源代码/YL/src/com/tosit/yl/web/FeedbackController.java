package com.tosit.yl.web;

import com.tosit.yl.entity.Feedback;
import com.tosit.yl.entity.Registration;
import com.tosit.yl.service.FeedbackService;
import com.tosit.yl.service.RegistrationService;
import com.tosit.yl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/7/6.
 */
@Controller("feedback")
@RequestMapping("/feedback")
public class FeedbackController {
    private final UserService userService;
    private final FeedbackService feedbackService;

    @Autowired
    public FeedbackController(UserService Service, FeedbackService feedbackService) {
        this.userService = Service;
        this.feedbackService = feedbackService;
    }

    @RequestMapping(path = "/feedback", method = RequestMethod.GET)
    public String feedbackGet(@ModelAttribute("feedback")Feedback feedback) {
        System.out.println("feedbackGet");
        return "feedback";
    }

    @RequestMapping(path = "/feedback", method = RequestMethod.POST)
    public String feedback(@ModelAttribute("feedback") Feedback feedback, ModelMap modelMap) {

        feedbackService.add(feedback);
        return "registration";

    }

}


