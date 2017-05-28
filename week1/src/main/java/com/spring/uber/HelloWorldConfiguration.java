package com.spring.uber;

import com.spring.uber.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by zoe on 5/26/17.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.spring.uber")
public class HelloWorldConfiguration {

    @Bean
    public HelloWorldService createHelloWorldService() {
        return new HelloWorldService();
    }
}
