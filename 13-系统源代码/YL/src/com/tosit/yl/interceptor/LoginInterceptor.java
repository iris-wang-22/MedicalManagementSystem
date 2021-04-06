package com.tosit.yl.interceptor;


import com.tosit.yl.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Created by chens on 2017/7/5.
 * Description：
 * ToDo:
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse, Object o) throws Exception {
        String reqUri = httpServletRequest.getRequestURI()
                .replace(httpServletRequest.getContextPath(),"");
        if(reqUri.contains("login") || reqUri.contains("register"))
            return true;
        else {
            HttpSession session = httpServletRequest.getSession();
            Object user = session.getAttribute("user");
            if(user == null || "".equals(user.toString())){
                httpServletResponse.sendRedirect("/error/nologin.jsp");
                return false;
            }
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
