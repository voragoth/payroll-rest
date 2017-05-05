package com.everis.rest.web.dto;

import java.io.Serializable;

public class Credentials implements Serializable{

    private static final long serialVersionUID = 1L;

    private String user;

    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
