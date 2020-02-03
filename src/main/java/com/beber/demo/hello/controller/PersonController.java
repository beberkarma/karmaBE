package com.beber.demo.hello.controller;

import com.beber.demo.hello.model.Person;
import com.beber.demo.hello.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/getall")
    public List<Person> all() {
        return personRepository.findAll();
    }

    @PostMapping("/create")
    public Person create(@RequestBody Person person) {
        return personRepository.save(person);
    }


}
