package com.sologamesbackend.sologamesbackend.controllers;

import com.sologamesbackend.sologamesbackend.dto.request.UserRequest;
import com.sologamesbackend.sologamesbackend.dto.response.UserResponse;
import com.sologamesbackend.sologamesbackend.servises.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sologames")
public class UserController {

    @Autowired
   private UserService userService;

    @PostMapping("/save-user")
    public UserResponse saveUsers(@RequestBody UserRequest userRequest){
        return userService.saveUser(userRequest);
    }
}
