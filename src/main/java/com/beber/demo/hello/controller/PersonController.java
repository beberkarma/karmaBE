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

    @GetMapping("/getAll")
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @GetMapping("/get/{personId}")
    public Person get(@PathVariable Long personId) throws Exception {
        return personRepository.findById(personId).orElseThrow(Exception::new);
    }

    @PostMapping("/create")
    public Person create(@RequestBody Person person) {
        return personRepository.save(person);
    }


}
