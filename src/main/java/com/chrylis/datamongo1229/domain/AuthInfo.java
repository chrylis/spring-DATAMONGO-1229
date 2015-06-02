package com.chrylis.datamongo1229.domain;

import org.springframework.data.mongodb.core.index.Indexed;

public class AuthInfo {

    @Indexed
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
