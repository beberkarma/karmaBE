package com.beber.demo.hello.controller;

import com.beber.demo.hello.model.Person;
import com.beber.demo.hello.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/person")
    List<Person> all() {
        return personRepository.findAll();
    }

}
