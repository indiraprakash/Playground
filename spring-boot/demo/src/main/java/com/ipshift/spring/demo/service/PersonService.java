package com.ipshift.spring.demo.service;

import com.ipshift.spring.demo.model.Person;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {
    private List<Person> persons = Arrays.asList(
            new Person(1010,"Pop"),
            new Person(1020,"Max")
    );
    public List<Person> getAllPersons(){
        return persons;
    }


}
