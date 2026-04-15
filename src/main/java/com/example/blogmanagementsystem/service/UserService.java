package com.example.blogmanagementsystem.service;

import com.example.blogmanagementsystem.entity.User;
import com.example.blogmanagementsystem.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }


}
