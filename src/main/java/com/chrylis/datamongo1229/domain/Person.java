package com.chrylis.datamongo1229.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {

    @Id
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    AuthInfo auth = new AuthInfo();

    public AuthInfo getAuth() {
        return auth;
    }

    public void setAuth(AuthInfo auth) {
        this.auth = auth;
    }
}
