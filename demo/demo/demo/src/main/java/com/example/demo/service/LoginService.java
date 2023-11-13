package com.example.demo.service;

import com.example.demo.model.Login;

import java.util.ArrayList;
import java.util.List;

public class LoginService {
    //Lista con i campi di login
    private List<Login> loginList = new ArrayList<>();

    //Riempimento campi
    public LoginService () {
        loginList.add(new Login(1, "vincenzolabella@gmail.com", "CiaoSonoIo"));
        loginList.add(new Login(2, "cristinazito@gmail.com", "CiaoSonoCristina"));
        loginList.add(new Login(3, "fedeledimattia@hotmail.com", "FDM7"));
        loginList.add(new Login(4, "valeriomortella@hotmail.com", "Bambino2013"));
    }

    public List<Login> getAllAccess(){
        return loginList;
    }

}
