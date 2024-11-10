package com.example.springaddproduct.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**")
                        .allowedOrigins("http://127.0.0.1:54205", "http://localhost:8080") // specify allowed URLs
                        .allowedMethods("GET", "POST", "PUT", "DELETE") // specify allowed methods
                        .allowedHeaders("Content-Type", "Authorization")
                        .allowCredentials(true);
            }
        };
    }
}
