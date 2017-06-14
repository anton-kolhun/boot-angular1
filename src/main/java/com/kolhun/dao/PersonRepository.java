package com.kolhun.dao;


import com.kolhun.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {

    Person findByName(String name);

}

