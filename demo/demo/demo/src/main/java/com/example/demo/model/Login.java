package com.example.demo.model;

public class Login {
    //Campi di login
    private Integer id_users;
    private String email;
    private String password;

    //Costruttore di login
    public Login(int id_users, String email, String password) {
        this.id_users = id_users;
        this.email = email;
        this.password = password;
    }

    //Getter e setter

    public Integer getId_users() {
        return id_users;
    }

    public void setId_users(Integer id_users) {
        this.id_users = id_users;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
