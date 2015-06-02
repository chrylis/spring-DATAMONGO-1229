package com.chrylis.datamongo1229;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chrylis.datamongo1229.domain.AuthInfo;
import com.chrylis.datamongo1229.domain.Person;
import com.chrylis.datamongo1229.domain.PersonRepository;

@Component
public class DbInitializer {

    @Autowired
    public DbInitializer(PersonRepository people) {
        AuthInfo auth = new AuthInfo();
        auth.setEmail("chrylis@gmail.com");

        Person p = new Person();
        p.setAuth(auth);

        people.save(p);
    }
}
