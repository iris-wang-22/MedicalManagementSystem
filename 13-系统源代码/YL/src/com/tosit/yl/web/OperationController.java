package com.tosit.yl.web;

import com.tosit.yl.entity.MedicalRecord;
import com.tosit.yl.entity.Operation;
import com.tosit.yl.service.OperationService;
import com.tosit.yl.service.MedicalRecordService;
import com.tosit.yl.service.OpmaService;
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
@Controller("viewop")
@RequestMapping("/viewop")
public class OperationController {
    private final OperationService operationService;
    private final MedicalRecordService medicalRecordService;


    @Autowired
    public OperationController(OperationService operationService, MedicalRecordService medicalRecordService) {
        this.operationService = operationService;
        this.medicalRecordService = medicalRecordService;
    }



    @RequestMapping(path="/D_viewOp", method= RequestMethod.GET)
    public String D_viewOp(ModelMap modelMap){
        List<Operation> OperationList = operationService.getOperationList(0,100);

        for (Operation o :
                OperationList) {
            o.setMedicalRecord(medicalRecordService.getMrId(o.getMrId()));

        }
        modelMap.addAttribute("OperationList",OperationList);
        return "D_viewOp";
    }
    @RequestMapping(path="/planop",method = RequestMethod.GET)
    public String plan(int opId, HttpSession session, ModelMap modelMap){
        Operation operation  = operationService.getOpId(opId);
        modelMap.addAttribute("staff",operation);
        return "D_planOp";
    }

    @RequestMapping(path="/planop",method = RequestMethod.POST)
    public String plan(@ModelAttribute("staff") Operation operation, HttpSession session, ModelMap modelMap){

        operation.setOpStatue(1);
        modelMap.addAttribute("staff",operation);
        operationService.modify(operation);
        return "redirect:D_viewOp";
    }
    @RequestMapping(path="/deleteop",method = RequestMethod.GET)
    public String delete(int opId, HttpSession session, ModelMap modelMap){
        operationService.removeByOpId(opId);
        return "redirect:D_viewOp";
    }




}
