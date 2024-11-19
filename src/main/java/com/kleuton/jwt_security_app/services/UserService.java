package com.kleuton.jwt_security_app.services;

import com.kleuton.jwt_security_app.entity.User;
import com.kleuton.jwt_security_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }
}
