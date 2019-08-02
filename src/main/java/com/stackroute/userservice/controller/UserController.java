package com.stackroute.userservice.controller;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.service.UserService;
import com.stackroute.userservice.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.attribute.UserPrincipalLookupService;

@RestController
@RequestMapping("api/v1/")
public class UserController
{
    private UserService userService;

    public UserController() {
    }

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("user")
    public ResponseEntity<?> saveUser(@RequestBody User user)
    {
       User savedUser =  userService.saveUser(user);
       return new ResponseEntity<>(savedUser, HttpStatus.OK);
    }

    @GetMapping("user/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id)
    {
        System.out.println(id);
        User retrievedUser = userService.getUserById(id);
        return new ResponseEntity<User>(retrievedUser, HttpStatus.OK);

    }
}
