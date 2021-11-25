package com.wlgs.user.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author whb
 * @version 1.0
 * @date 2021-11-25 13:46
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping(value = {"/info"}, produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public String test() {
       return "info success!";
    }
}
