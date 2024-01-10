package com.easy.marketgo.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @projectName: marketgo-server
 * @package: com.easy.marketgo.core.config
 * @className: CorsMapping
 * @author: Jasper Liu
 * @description:  解决全局跨域
 * @date: 2023/12/31 23:32
 * @version: 1.0
 */
@Configuration
public class CorsMapping implements WebMvcConfigurer {
    @Override
    /**
     * 重新跨域支持方法
     * CorsRegistry  开启跨域注册
     */
    public void addCorsMappings(CorsRegistry registry) {
        //addMapping 添加可跨域的请求地址
        registry.addMapping("/**")
                //设置跨域 域名权限 规定由某一个指定的域名+端口能访问跨域项目
                .allowedOrigins("*")
                //是否开启cookie跨域
                .allowCredentials(true)
                //allowedHeaders：表示允许的请求头，默认允许所有的请求头信息
                .allowedHeaders("*")
                //规定能够跨域访问的方法类型
                //.allowedMethods("GET","POST","DELETE","PUT","OPTIONS")
                .allowedMethods("*")
                //添加验证头信息  token
                //.allowedHeaders()
                //预检请求存活时间 在此期间不再次发送预检请求
                .maxAge(3600);
    }
}
