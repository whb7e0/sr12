package com.wlgs.guard.web.controller;

import com.wlgs.guard.web.server.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author whb
 * @version 1.0
 * @date 2021-11-25 16:51
 */
@RestController
@RequestMapping("/user")
public class UserFeignController {

    @Autowired
    private UserFeignService userService;

    @GetMapping("/listUsersByIds")
    public String listUsersByIds() {
        return userService.listUsersByIds();
    }

}
