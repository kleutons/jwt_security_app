package com.kleuton.jwt_security_app.services;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String helloWorld(String name){
        return "Hello World! " + name;
    }
}
