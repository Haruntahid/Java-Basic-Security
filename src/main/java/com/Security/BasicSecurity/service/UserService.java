package com.Security.BasicSecurity.service;

import com.Security.BasicSecurity.model.Users;
import com.Security.BasicSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // save user
    public Users save(Users user) {
        return userRepository.save(user);
    }

    // get all user
    public List<Users> findAllUsers() {
        return userRepository.findAll();
    }

}
