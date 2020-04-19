package com.ipshift.spring.demo.controller;

import com.ipshift.spring.demo.model.Person;
import com.ipshift.spring.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/persons")
    public List<Person> getAllPersons(){
        return personService.getAllPersons();

    }
    @RequestMapping("/persons/{id}")
    public Person getPerson(@PathVariable int id){
        return personService.getPerson(id);

    }
}
