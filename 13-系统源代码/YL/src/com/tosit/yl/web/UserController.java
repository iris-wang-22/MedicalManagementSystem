package com.tosit.yl.web;

import com.tosit.yl.entity.Bill;
import com.tosit.yl.entity.Registration;
import com.tosit.yl.entity.User;
import com.tosit.yl.service.BillService;
import com.tosit.yl.service.DrugInstrumentService;
import com.tosit.yl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by Chenshufu on 2017/7/1.
 * Description：
 * ToDo:
 */
@Controller("user")
@RequestMapping("/user")
public class UserController {


    private final UserService userService;
    private final BillService billService;
    private final DrugInstrumentService drugInstrumentService;

    @Autowired
    public UserController(UserService Service, BillService billService, DrugInstrumentService drugInstrumentService) {
        this.userService = Service;
        this.billService = billService;
        this.drugInstrumentService = drugInstrumentService;
    }

    @ModelAttribute
    public void getUser(User user,ModelMap map){
        System.out.println(user);
        if(user.getUserAccount() != null) {
            if(user.getUserName() != null){
                map.addAttribute("user", user);
            }
            else {
                user = userService.getUserByAccount(user.getUserAccount());
                map.addAttribute("user", user);
            }
        }
    }
    @RequestMapping(path = "/login",method = RequestMethod.GET)
    public String loginGet(@ModelAttribute User user){
        System.out.println("loginGet");
        return "login";
    }

    @RequestMapping(path="/login",method = RequestMethod.POST)
    public String login(@ModelAttribute User user, HttpSession session, ModelMap modelMap) {

        boolean loginResult = userService.login(user.getUserAccount(), user.getUserPassword());
        if (loginResult) {
            System.out.println(user.getUserName() + user.getUserPassword());
            modelMap.addAttribute("user", user);
            session.setAttribute("user",user);
            int auth = user.getUserAuth();
            if(auth == 0){
                return "redirect:/user/userinfo";
            }
            else{
                return "redirect:/user/w_ownInformation";
            }

        }

        user.setUserPassword("");
        return "login";
    }

    @RequestMapping(path = "/register",method = RequestMethod.GET)
    public String registerGet(User user){
        System.out.println("registerGet");
        return "register";
    }

    @RequestMapping(path = "/register",method = RequestMethod.POST)
    public String register(User user , HttpServletResponse response, ModelMap modelMap) throws IOException{

        User temp = userService.getUserByAccount(user.getUserAccount());
        if(temp!= null){
            user.setUserPassword("");
            return "register";
        }

        boolean registerResult = userService.register(user);
        if (registerResult) {
            user.setUserPassword("");
            modelMap.addAttribute("info","注册成功");
            return "login";
        }

        user.setUserPassword("");
        return "register";
    }


    @RequestMapping(path="/userinfo", method=RequestMethod.GET)
    public String userinfo(HttpSession session ,ModelMap modelMap){
        User userinfo = (User)session.getAttribute("user");

        modelMap.addAttribute("userinfo",userinfo);
        return "userinfo";
    }

    @RequestMapping(path="/w_ownInformation", method=RequestMethod.GET)
    public String w_ownInformation(HttpSession session ,ModelMap modelMap){
        User user = (User)session.getAttribute("user");

        modelMap.addAttribute("user",user);
        return "w_ownInformation";
    }



}
