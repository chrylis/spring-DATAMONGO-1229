package com.chrylis.datamongo1229;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chrylis.datamongo1229.domain.Person;
import com.chrylis.datamongo1229.domain.PersonRepository;

@RestController
public class Controller {

    private final PersonRepository people;

    @Autowired
    public Controller(PersonRepository people) {
        this.people = people;
    }

    @RequestMapping("/email/{email:.+}")
    public Person byEmail(@PathVariable String email) {
        return people.findByAuthEmail(email);
    }

    @RequestMapping("/emailIgnoreCase/{email:.+}")
    public Person byEmailIgnoreCase(@PathVariable String email) {
        return people.findByAuthEmailIgnoreCase(email);
    }
}
