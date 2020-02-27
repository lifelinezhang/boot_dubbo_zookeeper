package com.zhang.controller;

import com.zhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserServiceController {

    @Autowired
    UserService userService;

    @RequestMapping("/ticket")
    public String getTicker(){
        return userService.bugTicket();
    }


}
