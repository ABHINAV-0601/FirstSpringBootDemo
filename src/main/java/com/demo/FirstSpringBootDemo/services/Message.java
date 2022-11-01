package com.demo.FirstSpringBootDemo.services;

import org.springframework.stereotype.Service;

@Service
public class Message {

    public String getMessage(){
        return "First Demo executes successfully";
    }
}
