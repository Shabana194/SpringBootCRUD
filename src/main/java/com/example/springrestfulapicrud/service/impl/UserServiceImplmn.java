package com.example.springrestfulapicrud.service.impl;

import com.example.springrestfulapicrud.entity.User;
import com.example.springrestfulapicrud.repository.UserRepository;
import com.example.springrestfulapicrud.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImplmn implements UserService {
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser=userRepository.findById(userId);
        return optionalUser.get();
    }

}
