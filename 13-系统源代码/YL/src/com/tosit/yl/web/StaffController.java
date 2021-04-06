package com.tosit.yl.web;

import com.tosit.yl.entity.User;
import com.tosit.yl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/7/6.
 */
@Controller("staff")
@RequestMapping("/staff")
public class StaffController {
    private final UserService userService;

    @Autowired
    public StaffController(UserService Service) {
        this.userService = Service;
    }

    @RequestMapping(path = "/D_staffRegister", method = RequestMethod.GET)
    public String registerGet(@ModelAttribute("staff")User user) {
        System.out.println("registerGet");
        return "D_staffRegister";
    }

    @RequestMapping(path = "/D_staffRegister", method = RequestMethod.POST)
    public String register(@ModelAttribute("staff") User user, ModelMap modelMap) {

        User temp = userService.getUserByAccount(user.getUserAccount());
        if (temp != null) {
            user.setUserPassword("");
            return "D_staffRegister";
        }
        userService.add(user);
        return "redirect:D_viewUser";

    }
    @RequestMapping(path = "/D_changeInfo",method = RequestMethod.GET)
    public String modify(@ModelAttribute("staff")User user) {
        System.out.println("registerGet");

        return "D_changeInfo";
    }

    @RequestMapping(path = "/D_changeInfo", method = RequestMethod.POST)
    public String modify(@ModelAttribute("staff") User user, ModelMap modelMap) {

        int te = userService.modify(user);
        if (te !=0){
            user.setUserPassword("");
            return "D_changeInfo";
        }
        return "redirect:D_viewUser";

    }
    @RequestMapping(path="/D_viewUser", method= RequestMethod.GET)
    public String D_viewUser(ModelMap modelMap){
        List<User> userList = userService.getUserList(0,100 );

        for (User u :
                userList) {
            System.out.println(u);

        }
        modelMap.addAttribute("userList",userList);
        return "D_viewUser";
    }
    @RequestMapping(path="/change",method = RequestMethod.GET)
    public String Change(int userId, int btn, HttpSession session, ModelMap modelMap){
        User user  = userService.getUser(userId);
        modelMap.addAttribute("staff",user);
        return "D_changeInfo";
    }

   @RequestMapping(path="/change",method = RequestMethod.POST)
    public String changepost(@ModelAttribute("staff") User user, HttpSession session,ModelMap modelMap){

        int userId = userService.getUserByAccount(user.getUserAccount()).getUserId();
        user.setUserId(userId);
        modelMap.addAttribute("staff",user);
        userService.modify(user);
        return "D_changeInfo";
    }
    @RequestMapping(path="/authority",method = RequestMethod.GET)
    public String auth(int userId, int btn, HttpSession session, ModelMap modelMap){
        User user  = userService.getUser(userId);
        modelMap.addAttribute("staff",user);
        return "D_authority";
    }

    @RequestMapping(path="/authority",method = RequestMethod.POST)
    public String authpost(@ModelAttribute("staff") User user, HttpSession session,ModelMap modelMap){

        int auth = user.getUserAuth();
        user = userService.getUserByAccount(user.getUserAccount());
        try {
            user.setUserAuth(auth);
        } catch (Exception e) {
            e.printStackTrace();
        }
        modelMap.addAttribute("staff",user);
        userService.modify(user);
        return "D_authority";
    }
    @RequestMapping(path="/deleteUser",method = RequestMethod.GET)
    public String delete(int userId, int btn, HttpSession session, ModelMap modelMap){
        userService.remove(userId);
        return "redirect:D_viewUser";
    }

}


