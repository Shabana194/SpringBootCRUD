package com.example.springrestfulapicrud.service;

import com.example.springrestfulapicrud.entity.User;

public interface UserService {
    User createUser(User user);
    User getUserById(Long Id);
}
