package com.example.demo.dao;

import com.example.demo.model.Person;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public interface PersonDao {
    int insertPerson(@JsonProperty("name") Person person);
    default int addPerson(Person person){
        return insertPerson(person);
    }
}
