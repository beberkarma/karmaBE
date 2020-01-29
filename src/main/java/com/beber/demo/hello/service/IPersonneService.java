package com.beber.demo.hello.service;

import com.beber.demo.hello.model.Person;

import java.util.List;

public interface IPersonneService {
    List<Person> findAll();
}
