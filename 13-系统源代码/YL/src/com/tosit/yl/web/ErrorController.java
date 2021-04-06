package com.tosit.yl.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chens on 2017/7/5.
 * Description：
 * ToDo:
 */
@Controller("error")
@RequestMapping("/error")
public class ErrorController {

    @RequestMapping(path = "/nologin")
    public String noLogin(){
        return "/error/nologin.jsp";
    }
}
