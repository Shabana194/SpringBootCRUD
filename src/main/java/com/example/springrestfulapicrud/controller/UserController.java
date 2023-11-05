package com.example.springrestfulapicrud.controller;

import com.example.springrestfulapicrud.entity.User;
import com.example.springrestfulapicrud.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/users")
public class UserController {
    UserService userService;
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User savedUser=userService.createUser(user);

        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
        User getUser=userService.getUserById(userId);
        return  new ResponseEntity<>(getUser,HttpStatus.OK);
    }
}

