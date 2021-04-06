package com.tosit.yl.web;

import com.tosit.yl.entity.*;
import com.tosit.yl.service.BillService;
import com.tosit.yl.service.DrugInstrumentService;
import com.tosit.yl.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/7/5.
 */
@Controller("bill")
@RequestMapping("/bill")

public class BillController {
    private final BillService billService;
    private final MedicalRecordService medicalRecordService;
    private final DrugInstrumentService drugInstrumentService;

    @Autowired
    public BillController(BillService billService, MedicalRecordService medicalRecordService, DrugInstrumentService drugInstrumentService) {
        this.billService = billService;
        this.medicalRecordService = medicalRecordService;
        this.drugInstrumentService = drugInstrumentService;
    }


    @RequestMapping(path="/w_viewBillList", method=RequestMethod.GET)
    public String w_viewBillList(ModelMap modelMap){
        List<Bill> billList = billService.getBillList(0,100);

        for (Bill b :
                billList) {
            b.setMedicalRecord(medicalRecordService.getMrId(b.getMrId()));

        }
        modelMap.addAttribute("billList",billList);
        return "w_viewBillList";
    }


    @RequestMapping(path="/viewBillList", method=RequestMethod.GET)
    public String viewBillList(ModelMap modelMap){
        List<Bill> billList = billService.getBillList(0,100);

        for (Bill b :
                billList) {
            b.setDrugInstrument(drugInstrumentService.getDrugInstrumentList(b.getDiId()));

        }
        modelMap.addAttribute("billList",billList);
        return "viewBillList";
    }

}
