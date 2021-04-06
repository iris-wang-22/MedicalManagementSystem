package com.tosit.yl.web;


import com.sun.org.apache.regexp.internal.RE;
import com.tosit.yl.entity.*;
import com.tosit.yl.service.*;
import com.tosit.yl.service.impl.InhospitalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Created by chens on 2017/7/5.
 * Description：
 * ToDo:
 */
@Controller("outpatient")
@RequestMapping("/outpatient")
public class OutpatientController {

    private final RegistrationService registrationService;
    private final MedicalRecordService medicalRecordService;
    private final DrugInstrumentService drugInstrumentService;
    private final DrugRxService drugRxService;
    private final InhospitallService inhospitallService;
    private final OperationService operationService;
    private final BillService billService;
    private final UserService userService;

    @Autowired
    public OutpatientController(RegistrationService registrationService,
                                MedicalRecordService medicalRecordService,
                                DrugInstrumentService drugInstrumentService,
                                DrugRxService drugRxService,
                                InhospitallService inhospitallService,
                                OperationService operationService,
                                BillService billService,
                                UserService userService) {
        this.registrationService = registrationService;
        this.medicalRecordService = medicalRecordService;
        this.drugInstrumentService = drugInstrumentService;
        this.drugRxService = drugRxService;
        this.inhospitallService = inhospitallService;
        this.operationService = operationService;
        this.billService = billService;
        this.userService =userService;
    }





    @RequestMapping(path="/ChoseToServer", method=RequestMethod.GET)
    public String ChoseToServe(ModelMap modelMap){
        List<Registration> registrationList = registrationService.getRegistrationList(0,100);
        for (Registration r :
                registrationList) {
            System.out.println(r);

        }
        modelMap.addAttribute("registrationList",registrationList);
        return "ChoseToServer";
    }

    @RequestMapping(path="/Chose",method = RequestMethod.GET)
    public String Chose(int userId, int adId, HttpSession session, ModelMap modelMap){
        modelMap.addAttribute("userId", userId);

        session.setAttribute("userId",userId);
        List<Registration> registrations  = registrationService.getUserId(userId);
        for (Registration r :
                registrations) {
            if(r.getRegistrationStatue() != 1){
                r.setRegistrationStatue(1);
                registrationService.modify(r);
            }
        }
        List<MedicalRecord> medicalRecordList = medicalRecordService.getUserId(userId);

        session.setAttribute("mrid",medicalRecordList.get(0).getMrId());
        modelMap.addAttribute("medicalRecord",medicalRecordList.get(0));
        return "outpainterServer";
    }

    @RequestMapping(path="/MedicalRecord",method = RequestMethod.GET)
    public  String medicalRecord(@ModelAttribute MedicalRecord medicalRecord, HttpSession session, ModelMap modelMap){
        Object userId = session.getAttribute("userId");
        return "outpainterServer";
    }

    @RequestMapping(path="/modifyMedicalRecord",method = RequestMethod.POST)
    public String modifyMedicalRecord(@ModelAttribute MedicalRecord medicalRecord, HttpSession session,ModelMap modelMap){
        Object userId = session.getAttribute("user");
        medicalRecord.setMrId((int)session.getAttribute("mrid"));
        MedicalRecord temp = medicalRecordService.getMrId((int)session.getAttribute("mrid"));
        medicalRecord.setMrId(temp.getMrId());
        medicalRecord.setUserUserId(temp.getUserUserId());
        medicalRecord.setUseUserId(temp.getUseUserId());
        medicalRecord.setUserId(temp.getUserId());
        medicalRecordService.modify(medicalRecord);
        medicalRecord = medicalRecordService.getMrId(medicalRecord.getMrId());
        modelMap.addAttribute("medicalRecord",medicalRecord);
        return "outpainterServer";
    }
    @RequestMapping(path="/modifyMedicalRecord",method = RequestMethod.GET)
    public String modifyMedicalRecordGet(int userId, HttpSession session,ModelMap modelMap){
        MedicalRecord medicalRecord = medicalRecordService.getUserId(userId).get(0);
        modelMap.addAttribute("medicalRecord",medicalRecord);
        return "outpainterServer";
    }

    @RequestMapping(path="/drug",method = RequestMethod.GET)
    public String  drugGet(int mrId, @ModelAttribute DrugRx drugRx  ,ModelMap modelMap) {
        List<DrugInstrument> drugInstruments = drugInstrumentService.getDrugInstrumentList(0, 1000);
        List<DrugRx> drugRxes = drugRxService.getDrugRxBymrId(mrId);
        modelMap.addAttribute("drugs",drugInstruments);
        modelMap.addAttribute("drugRxes",drugRxes);
        modelMap.addAttribute("mrid",mrId);
        return "kaiyao";
    }

    @RequestMapping(path = "/drugrx", method = RequestMethod.POST)
    public String drugRx(@ModelAttribute  DrugRx drugRx, HttpSession session, ModelMap modelMap){
        drugRx.setDrugRxTime(new Date());
        drugRxService.add(drugRx);

        DrugInstrument drugInstrument = drugInstrumentService.getDrugInstrumentList(drugRx.getDiId());
        drugInstrument.setDiAmount(drugInstrument.getDiAmount()-drugRx.getDrugRxAmount());
        drugInstrumentService.modify(drugInstrument);

        Bill bill = new Bill();
        bill.setDiId(drugRx.getDiId());
        bill.setMrId(drugRx.getMrId());
        bill.setBillSum(drugRx.getDrugRxAmount()*drugInstrument.getDiSoldPrice());
        bill.setBillTime(new Date());
        billService.add(bill);
        return "redirect: drug?mrId="+drugRx.getMrId();
    }

    @RequestMapping(path="/manOP",method = RequestMethod.GET)
    public String ManOP(int MrId,int opStatue,ModelMap modelMap){
        Operation operation = new Operation();
        operation.setMrId(MrId);
        operation.setOpStatue(0);
        operation.setOpTime(new Date());
        operationService.add(operation);
        return "redirect:ChoseToServer";
    }
    @RequestMapping(path="/manBed",method = RequestMethod.GET)
    public String ManBed(int userId,int inStatue,ModelMap modelMap){
        Inhospital inhospital=new Inhospital();
        inhospital.setInStatue(inStatue);
        inhospital.setUserId(userId);
        modelMap.addAttribute("inhospital",inhospital);
        inhospitallService.add(inhospital);
        return "redirect:ChoseToServer";
    }

    @RequestMapping(path = "/drugDelete", method = RequestMethod.GET)
    public String deleteDrug(int drugRx, int amount,int mrId,ModelMap modelMap){
        drugRxService.remove(drugRx);
        DrugInstrument drugInstrument = drugInstrumentService.getDrugInstrumentList(drugRx);
        drugInstrument.setDiAmount(drugInstrument.getDiAmount()+amount);
        drugInstrumentService.modify(drugInstrument);
        return "redirect: drug?mrId="+mrId;
    }

}

