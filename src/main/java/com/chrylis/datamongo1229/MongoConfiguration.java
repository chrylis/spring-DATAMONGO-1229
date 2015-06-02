package com.chrylis.datamongo1229;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.github.fakemongo.Fongo;
import com.mongodb.Mongo;

@Configuration
@EnableMongoRepositories
public class MongoConfiguration {

    @Bean
    public Fongo fongo() {
        return new Fongo("DATAMONGO-1229");
    }

    @Bean
    public Mongo mongo(Fongo fongo) {
        return fongo.getMongo();
    }
}
