package com.tosit.yl.web;

import com.tosit.yl.entity.DrugInstrument;
import com.tosit.yl.entity.Inhospital;
import com.tosit.yl.entity.Order;
import com.tosit.yl.service.DrugInstrumentService;
import com.tosit.yl.service.DrugRxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/7/6.
 */
@Controller("drugInstrument")
@RequestMapping("/drugInstrument")
public class DrugInstrumentController {

    private final DrugInstrumentService drugInstrumentService;

    private final DrugRxService drugRxService;

    @Autowired
    public DrugInstrumentController(DrugInstrumentService drugInstrumentService, DrugRxService drugRxService) {
        this.drugInstrumentService = drugInstrumentService;
        this.drugRxService = drugRxService;
    }
    @RequestMapping(path="/selectmedical", method=RequestMethod.GET)
    public String selectmedical(ModelMap modelMap){
        List<DrugInstrument> drugInstrumentList = drugInstrumentService.getDrugInstrumentList(0,100);
        for (DrugInstrument r :
               drugInstrumentList) {
            System.out.println(r);

        }
        modelMap.addAttribute("drugInstrumentList",drugInstrumentList);
        return "selectmedical";
    }

    @RequestMapping(path = "/medicalamount",method = RequestMethod.GET)
    public String medicalamount(ModelMap modelMap) {
        List<DrugInstrument> drugInstrumentList = drugInstrumentService.getDrugInstrumentList(0, 100);
        for (DrugInstrument r :
                drugInstrumentList) {
            System.out.println(r);
        }
        modelMap.addAttribute("drugInstrumentList",drugInstrumentList);
        return "medicalamount";
    }
    @RequestMapping(path = "/inoutrecord",method = RequestMethod.GET)
    public String inoutrecord(ModelMap modelMap){
        List<DrugInstrument> drugInstrumentList = drugInstrumentService.getDrugInstrumentList(0,100);
        for (DrugInstrument r:
                drugInstrumentList){
            System.out.println(r);
        }
        modelMap.addAttribute("drugInstrumentList",drugInstrumentList);
        return "inoutrecord";

    }

    @RequestMapping(path="/userdrugRx", method=RequestMethod.GET)
    public String userDrugRx(ModelMap modelMap){
        List<DrugInstrument> drugInstrumentList = drugInstrumentService.getDrugInstrumentList(0,100);

        for (DrugInstrument r :
                drugInstrumentList) {
            System.out.println(r);
        }
        modelMap.addAttribute("drugInstrumentList",drugInstrumentList);
        return "userDrugRx";
    }

    @RequestMapping(path = "/Chose", method = RequestMethod.GET)
    public String Chose(int diId, int btn, HttpSession session, ModelMap modelMap) {
        DrugInstrument i = drugInstrumentService.getDrugInstrumentList(diId);

        if (btn == 1)
            drugInstrumentService.remove(i);


        return "redirect:inoutrecord";
    }
    @RequestMapping(path = "/inrecord", method = RequestMethod.POST)
    public String inrecord(@ModelAttribute("drugInstrument") DrugInstrument drugInstrument, ModelMap modelMap) {
        drugInstrumentService.add(drugInstrument);
        return "inrecord";
    }

    @RequestMapping(path = "/inrecord",method = RequestMethod.GET)
    public String inrecordGet(DrugInstrument drugInstrument){
        System.out.println("drugInstrumentGet");
        return "inrecord";
    }

    @RequestMapping(path = "/outrecord", method = RequestMethod.POST)
    public String outrecord(@ModelAttribute("drugInstrument") DrugInstrument drugInstrument, ModelMap modelMap) {
        drugInstrumentService.add(drugInstrument);
        return "outrecord";
    }

    @RequestMapping(path = "/outrecord",method = RequestMethod.GET)
    public String outrecordGet(DrugInstrument drugInstrument){
        System.out.println("drugInstrumentGet");
        return "outrecord";
    }

    @RequestMapping(path="/xiugaiinout",method = RequestMethod.GET)
    public String xiugaiinout(int diId, HttpSession session, ModelMap modelMap){
        List<DrugInstrument> DrugInstrumentList = drugInstrumentService.getDrugInstrumentList(0,100);

        DrugInstrument drugInstrument1 = drugInstrumentService.getDrugInstrumentList(diId);
        modelMap.addAttribute("drugInstrument",drugInstrument1);
        return "xiugaiinout";
    }

    @RequestMapping(path="/xiugaiinout",method = RequestMethod.POST)
    public String xiugaiout(@ModelAttribute("drugInstrument") DrugInstrument drugInstrument, HttpSession session, ModelMap modelMap){

        modelMap.addAttribute("drugInstrument",drugInstrument);
        drugInstrumentService.modify(drugInstrument);
        return "xiugaiinout";
    }



    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
    }
}
