package com.technical.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technical.crud.models.User;
import com.technical.crud.services.UserService;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    //create user 
    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.Create(user);
    }

    //get users
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getUsers();
    }
}
