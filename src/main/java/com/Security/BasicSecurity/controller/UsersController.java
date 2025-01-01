package com.Security.BasicSecurity.controller;

import com.Security.BasicSecurity.model.Users;
import com.Security.BasicSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UserService userService;

    //save user
    @PostMapping("/user")
    public Users addUser(@RequestBody Users user) {
        return userService.save(user);
    }

    //get users
    @GetMapping("/user")
    public List<Users> getUser() {
        return userService.findAllUsers();
    }

}
