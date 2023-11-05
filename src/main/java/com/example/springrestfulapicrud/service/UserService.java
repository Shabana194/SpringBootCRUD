package com.example.springrestfulapicrud.service;

import com.example.springrestfulapicrud.entity.User;

import java.util.List;

public interface UserService {
    public User createUser(User user);
    public User getUserById(Long Id);
    public List<User> getAllUsers();
    public User updateUser(User user);
    public void deleteUser(Long Id);
}
