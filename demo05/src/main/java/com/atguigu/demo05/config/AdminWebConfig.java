package com.atguigu.demo05.config;

import com.atguigu.demo05.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor( new LoginInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/","/index.html","/login","/index","/css/**","/fonts/**","/images/**","/js/**","/live2dw/**");
    }
}
