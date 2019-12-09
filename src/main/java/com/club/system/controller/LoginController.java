package com.club.system.controller;

import  com.club.system.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;
import  com.club.system.service.UserService;
import  com.club.system.bean.User;

@CrossOrigin
@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "/api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        User user = userService.get(username, requestUser.getPassword(),requestUser.getType());
        if (null == user) {
            return new Result(400);
        } else {
            return new Result(200);
        }
    }


}
