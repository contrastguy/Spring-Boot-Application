package com.example.demo.dao;

import com.example.demo.model.Person;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(@JsonProperty("name") Person person);
    default int addPerson(Person person){
        return insertPerson(person);
    }
    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(Person person);

    int updatePersonById(Person person);

}
