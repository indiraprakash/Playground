package com.ipshift.spring.demo.model;

public class Person {
    private int id;
    private String name;

    public Person() {
    }

    // constructor will generate automatic Id
    public Person(String name) {
        this.name = name;
        this.id= (int)(Math.random() * (19999 - 10000 + 1) + 10000);
    }
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
