package com.example.onlinelearningmanagementsystem.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ScopeAppConfig implements WebMvcConfigurer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScopeAppConfig.class);

    public HandlerInterceptor requestLogInterceptor(){
        return new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                LOGGER.info("interceptor başladı {}", request.getRequestURI());
                return HandlerInterceptor.super.preHandle(request, response, handler);
            }

            @Override
            public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
                LOGGER.info("interceptor bitti {}", request.getRequestURI());
                HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
            }
        };
    }


}
