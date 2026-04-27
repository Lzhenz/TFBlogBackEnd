package com.tfgo.blog.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry  registry){
        registry.addMapping("/**")
                .allowedMethods("GET","POST")
                .allowedOrigins("http://127.0.0.1:5500")
                .allowCredentials(true)
                .maxAge(3600);
    }
}
