package com.tosit.yl.web;

import com.tosit.yl.entity.*;
import com.tosit.yl.service.BillService;
import com.tosit.yl.service.DrugInstrumentService;
import com.tosit.yl.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/7/6.
 */

@Controller("order")
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;
    private final DrugInstrumentService drugInstrumentService;

    @Autowired
    public OrderController(OrderService orderService, DrugInstrumentService drugInstrumentService) {
        this.orderService = orderService;
        this.drugInstrumentService = drugInstrumentService;
    }

    @ModelAttribute
    public void getUser(Order order,ModelMap map){
        System.out.println(order);
        if(order.getUserName()!= null) {
            if(order.getOrderId() != -1){
                map.addAttribute("order", order);
            }
            else {
                order = orderService.getDiId(0);
                map.addAttribute("order", order);
            }
        }
    }

    @RequestMapping(path = "/w_checkOrder", method = RequestMethod.GET)
    public String w_checkOrder(ModelMap modelMap) {
        List<Order> orderList = orderService.getOrderList(0, 100);

        for (Order o :
                orderList) {

            o.setDrugInstrument(drugInstrumentService.getDrugInstrumentList(o.getDiId()));
        }
        modelMap.addAttribute("orderList", orderList);
        return "w_checkOrder";
    }

    @RequestMapping(path = "/selectorder", method = RequestMethod.GET)
    public String selectOrder(ModelMap modelMap) {
        List<Order> orderList = orderService.getOrderList(0, 100);

        for (Order o : orderList) {
            o.setDrugInstrument(drugInstrumentService.getDrugInstrumentList(o.getDiId()));
        }
        modelMap.addAttribute("orderList", orderList);
        return "selectorder";
    }

    @RequestMapping(path = "/Chose", method = RequestMethod.GET)
    public String Chose(int orderId, int btn, HttpSession session, ModelMap modelMap) {
        Order o = orderService.getOrId(orderId);

        if (btn == 1)
            o.setOrderStatue(1);
        if (btn == 2)
            o.setOrderStatue(2);

        orderService.modify(o);


        return "redirect:w_checkOrder";
    }
    @RequestMapping(path = "/Chosee", method = RequestMethod.GET)
    public String Chosee(int diId, int btn, HttpSession session, ModelMap modelMap) {
            Order p = orderService.getOrId(diId);

        if (btn == 1)
            orderService.remove(diId);


        return "redirect:selectorder";
    }

    @RequestMapping(path = "/addorder", method = RequestMethod.POST)
    public String addorder(@ModelAttribute("order") Order order, ModelMap modelMap) {
        orderService.add(order);
        return "addorder";
    }

    @RequestMapping(path = "/addorder",method = RequestMethod.GET)
    public String addorderGet(User user){
        System.out.println("orderGet");
        return "addorder";
    }



    @RequestMapping(path="/xiugaiorder",method = RequestMethod.GET)
    public String xiugaiorder(@ModelAttribute("order") Order order, int diId, HttpSession session, ModelMap modelMap){
        List<Order> orderList = orderService.getOrderList(0,100);

        for (Order o :
                orderList) {

            o.setDrugInstrument(drugInstrumentService.getDrugInstrumentList(o.getDiId()));
        }

        modelMap.addAttribute("orderList", orderList);
        Order order1 = orderService.getDiId(diId);
        modelMap.addAttribute("order",order1);
        return "xiugaiorder";
    }

    @RequestMapping(path="/xiugaiorder",method = RequestMethod.POST)
    public String xiugaiorder(@ModelAttribute("order") Order order, HttpSession session, ModelMap modelMap){

        modelMap.addAttribute("order",order);
        orderService.modify(order);
        return "xiugaiorder";
    }






    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
    }
}