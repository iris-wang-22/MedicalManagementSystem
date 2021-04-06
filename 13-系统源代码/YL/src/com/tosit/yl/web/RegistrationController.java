package com.tosit.yl.web;

import com.tosit.yl.entity.Administrative;
import com.tosit.yl.entity.Registration;
import com.tosit.yl.entity.User;
import com.tosit.yl.service.AdministrativeService;
import com.tosit.yl.service.RegistrationService;
import com.tosit.yl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/7/6.
 */
@Controller("registration")
@RequestMapping("/registration")
public class RegistrationController {
    private final UserService userService;
    private final RegistrationService registrationService;
    private final AdministrativeService administrativeService;

    @Autowired
    public RegistrationController(UserService Service, RegistrationService registrationService, AdministrativeService administrativeService) {
        this.userService = Service;
        this.registrationService = registrationService;
        this.administrativeService = administrativeService;
    }

    @RequestMapping(path = "/registration", method = RequestMethod.GET)
    public String registrationGet(@ModelAttribute("registration")Registration registration , HttpSession session,ModelMap modelMap) {
        System.out.println("registrationGet");
        User user = (User)session.getAttribute("user");
        modelMap.addAttribute("user",user);
        List<Administrative> administratives = administrativeService.getAdList(0,1000);
        modelMap.addAttribute("administratives",administratives);
        return "registration";
    }

    @RequestMapping(path = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("registration")Registration registration, ModelMap modelMap) {
        registration.setRegistrationTime(new Date());
        registrationService.add(registration);
        return "redirect:/user/userinfo";

    }



}


