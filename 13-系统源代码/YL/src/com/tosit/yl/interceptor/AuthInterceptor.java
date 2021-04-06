package com.tosit.yl.interceptor;

import com.tosit.yl.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by chens on 2017/7/7.
 * Description：
 * ToDo:
 */
public class AuthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest,
                             HttpServletResponse httpServletResponse, Object o) throws Exception {
        String reqUri = httpServletRequest.getRequestURI()
                .replace(httpServletRequest.getContextPath(),"");
        if(reqUri.contains("login") || reqUri.contains("register") || reqUri.contains("error"))
            return true;
        HttpSession session = httpServletRequest.getSession();
        User user = (User) session.getAttribute("user");
        int auth = user.getUserAuth();
        if(auth == 1 && reqUri.contains("outpatient"))
            return true;
        else if(auth == 3 && reqUri.contains("drugInstrument") || reqUri.contains("order"))
            return true;
        else if(auth == 4 || auth==0)
            return true;
        else if(auth == 5 && reqUri.contains("viewop"))
            return true;
        else if(auth == 6 && (reqUri.contains("bill")||reqUri.contains("order")))
            return true;
        else if(auth == 7 && reqUri.contains("inhospital"))
            return true;
        else{
            httpServletResponse.sendRedirect("/error/noAuth.jsp");
            return false;
        }

    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
