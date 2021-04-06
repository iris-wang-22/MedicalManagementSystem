package com.tosit.yl.web;

import com.tosit.yl.entity.Administrative;
import com.tosit.yl.entity.Bill;
import com.tosit.yl.entity.Ward;
import com.tosit.yl.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Administrator on 2017/7/7.
 */
@Controller("bed")
@RequestMapping("/bed")
public class BedController {
    private  final AdministrativeService administrativeService;
    private final WardService wardService;

    @Autowired
    public BedController(AdministrativeService administrativeService, WardService wardService) {
        this.administrativeService = administrativeService;
        this.wardService = wardService;
    }


    @RequestMapping(path="/w_viewBed", method= RequestMethod.GET)
    public String w_viewBed(ModelMap modelMap){
        List<Administrative> administrativeList = administrativeService.getAdList(0,100);

        for (Administrative a :
                administrativeList) {
            System.out.println(a);

        }
        modelMap.addAttribute("administrativeList",administrativeList);
        return "w_viewBed";
    }

    @RequestMapping(path="/w_updateBed", method= RequestMethod.GET)
    public String w_updateBed(ModelMap modelMap){
        List<Administrative> administrativeList = administrativeService.getAdList(0,100);

        for (Administrative a :
                administrativeList) {
            System.out.println(a);

        }
        modelMap.addAttribute("administrativeList",administrativeList);
        return "w_updateBed";
    }
}
