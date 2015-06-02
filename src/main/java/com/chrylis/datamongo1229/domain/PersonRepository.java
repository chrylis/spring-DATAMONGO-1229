package com.chrylis.datamongo1229.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
    Person findByAuthEmail(String email);
    Person findByAuthEmailIgnoreCase(String email);
}
