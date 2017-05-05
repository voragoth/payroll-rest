package com.everis.rest.service.vo;

import java.io.Serializable;

public class LoginVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
