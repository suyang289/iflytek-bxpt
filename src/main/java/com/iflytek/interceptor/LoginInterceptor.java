package com.iflytek.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.AsyncHandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//拦截器

@Component
public class LoginInterceptor implements AsyncHandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();
        if (url.contains("login")
                || url.endsWith(".css")
                || url.endsWith(".js")
                || url.endsWith(".jpg")
                || url.endsWith(".gif")
                || url.endsWith(".png")
                || url.endsWith(".ico")
                || url.endsWith(".map")) {
            return true;
        }
        String username = (String) request.getSession().getAttribute("username");
//        if (StringUtils.isBlank(username)) {
//            response.sendRedirect(request.getContextPath() + "/login.html");
//            return false;
//        }
        return true;
    }

}
