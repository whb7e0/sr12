package com.wlgs.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author whb
 * @version 1.0
 * @date 2021-11-25 13:43
 */
@SpringBootApplication
public class UserApplication{
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
