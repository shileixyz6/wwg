package com.example.wwg.config;/**
 * @Author : xiao
 * @Date : 2020/7/17 11:22
 */

import com.example.wwg.common.LoginInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: wwg1
 * @description: 拦截器配置类
 * @author: Mr.Xiao
 * @create: 2020-07-17 11:22
 **/
@SpringBootConfiguration
public class MyWebConfigurer implements WebMvcConfigurer {

    public LoginInterceptor getLoginInterceptor() {
           return new LoginInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getLoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.html");
    }
}
