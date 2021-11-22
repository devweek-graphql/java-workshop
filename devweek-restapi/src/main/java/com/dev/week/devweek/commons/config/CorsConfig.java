package com.dev.week.devweek.commons.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer restBean() {
        return new WebMvcConfigurer() {
          @Override
          public void addCorsMappings(CorsRegistry registry) {
            registry
                .addMapping("/**")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("POST", "GET", "PUT", "DELETE");
            }
        };
    }
}