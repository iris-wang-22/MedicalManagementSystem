package com.tosit.yl.web;

import com.tosit.yl.entity.*;
import com.tosit.yl.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/7/7.
 */

@Controller("inhospital")
@RequestMapping("/inhospital")
public class InhospitalController {
    private final InhospitallService inhospitallService;
    private final UserService userService;
    private final WardService wardService;
    private final AdministrativeService administrativeService;

    @Autowired
    public InhospitalController(InhospitallService inhospitallService, UserService userService, WardService wardService, AdministrativeService administrativeService) {
        this.inhospitallService = inhospitallService;
        this.userService = userService;
        this.wardService = wardService;
        this.administrativeService = administrativeService;
    }


    @RequestMapping(path="/w_viewInList", method= RequestMethod.GET)
    public String w_viewInList(ModelMap modelMap){
        List<Inhospital> inhospitalList = inhospitallService.getInhospitallList(0,100);

        for (Inhospital i :
                inhospitalList) {
            i.setUser(userService.getUser(i.getUserId()));
            i.setWard(wardService.getBedId(i.getBedId()));

        }
        modelMap.addAttribute("inhospitalList",inhospitalList);
        return "w_viewInList";
    }

    @RequestMapping(path="/w_updateBed", method= RequestMethod.GET)
    public String w_updateBed(ModelMap modelMap){
        List<Inhospital> inhospitalList = inhospitallService.getInhospitallList(0,100);

        for (Inhospital i :
                inhospitalList) {
            i.setUser(userService.getUser(i.getUserId()));

        }
        modelMap.addAttribute("inhospitalList",inhospitalList);
        return "w_updateBed";
    }

    @RequestMapping(path = "/Chose", method = RequestMethod.GET)
    public String Chose(int userId, int btn, HttpSession session, ModelMap modelMap) {
        Inhospital i = inhospitallService.getUserId(userId);

        if (btn == 1)
            i.setInStatue(2);

        inhospitallService.modify(i);


        return "redirect:w_updateBed";
    }

    @RequestMapping(path="/w_newBed", method= RequestMethod.GET)
    public String w_newBed(ModelMap modelMap){
        List<Inhospital> inhospitalList = inhospitallService.getInhospitallList(0,100);

        for (Inhospital i :
                inhospitalList) {
            i.setUser(userService.getUser(i.getUserId()));

        }
        modelMap.addAttribute("inhospitalList",inhospitalList);
        return "w_newBed";
    }

    @RequestMapping(path="/ins",method = RequestMethod.GET)
    public String w_inhospital(@ModelAttribute("inhospital") Inhospital inhospital, int userId, HttpSession session, ModelMap modelMap){
        List<Inhospital> inhospitalList = inhospitallService.getInhospitallList(0,100);
        for (Inhospital n :
                inhospitalList) {
            n.setUser(userService.getUser(n.getUserId()));
            n.setWard(wardService.getBedId(n.getBedId()));

        }
        List<Administrative> administrativeList = administrativeService.getAdList(0,100);

        modelMap.addAttribute("administrativeList",administrativeList);
        Inhospital inhos  = inhospitallService.getUserId(userId);
        modelMap.addAttribute("inhospital",inhos);
        return "w_inhospital";
    }

    @RequestMapping(path="/w_inhospital",method = RequestMethod.POST)
    public String w_inhospital(@ModelAttribute("inhospital") Inhospital inhospital, HttpSession session, ModelMap modelMap){

        modelMap.addAttribute("inhospital",inhospital);
        inhospitallService.modify(inhospital);
        return "w_inhospital";
    }


}


