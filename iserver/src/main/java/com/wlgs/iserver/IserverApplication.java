package com.wlgs.iserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author whb
 * @version 1.0
 * @date 2021-11-25 10:31
 */
@SpringBootApplication
@EnableEurekaServer
public class IserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(IserverApplication.class, args);
    }
}
