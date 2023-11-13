package com.example.demo.controller;

import com.example.demo.model.Login;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping(value = "/getAll")
    public List<Login> getAllAccess(){
        return loginService.getAllAccess();
    }
}
