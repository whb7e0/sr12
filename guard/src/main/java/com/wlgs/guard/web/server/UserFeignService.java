package com.wlgs.guard.web.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author whb
 * @version 1.0
 * @date 2021-11-25 16:49
 */
@FeignClient(value = "user")
public interface UserFeignService {

    @GetMapping("/user/user/info")
    String listUsersByIds();

}
