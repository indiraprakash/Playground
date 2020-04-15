package com.ipshift.spring.demo.dao;

import com.ipshift.spring.demo.model.Person;

import java.util.List;

public interface PersonDao {
    List <Person> getAllPersons();
}
