package com.example.d2.controller;

import com.example.d2.entity.User;
import com.example.d2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zzy
 * @description user
 * @date 2022-07-02
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/getAllUser")
    public List<User> getAllUser() {
        List<User> list = userService.getAllUser();
        return list;
    }

}