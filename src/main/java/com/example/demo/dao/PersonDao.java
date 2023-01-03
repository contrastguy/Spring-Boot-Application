package com.example.demo.dao;

import com.example.demo.model.Person;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id,@JsonProperty("name") Person person);
    default int addPerson(Person person){
        if (mostSigBits == null || leastSigBits == null) {
            id = UUID.randomUUID();
        } else {
            id = new UUID(mostSigBits, leastSigBits);
        }

        return insertPerson(id,person);
    }
}
