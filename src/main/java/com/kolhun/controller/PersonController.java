package com.kolhun.controller;

import com.kolhun.dao.PersonRepository;
import com.kolhun.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Person getPerson(@PathVariable String id) {
        return personRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Person createPerson(@RequestBody Person person) {
        return personRepository.insert(person);
    }
}

