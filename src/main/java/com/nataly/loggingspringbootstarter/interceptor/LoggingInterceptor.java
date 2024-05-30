package com.nataly.loggingspringbootstarter.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
public class LoggingInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        try {
            log.info("1 - preHandle() : Before sending request");
            log.info("Method Type: {}", request.getMethod());
            log.info("Request URL: {}", request.getRequestURI());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        try {
            log.info("2 - postHandle() : After the request (before returning back response to the client)");
            log.info("Status: {}", response.getStatus());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
