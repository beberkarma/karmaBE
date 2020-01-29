package com.beber.demo.hello.repository;

import com.beber.demo.hello.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>  {


}
