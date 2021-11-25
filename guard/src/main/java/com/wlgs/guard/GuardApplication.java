package com.wlgs.guard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author whb
 * @version 1.0
 * @date 2021-11-25 15:10
 */
@SpringBootApplication
@EnableFeignClients
public class GuardApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuardApplication.class, args);
    }
}
