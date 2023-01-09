package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component("fakeDao")
public class FakePersonDataAccessService implements  PersonDao{

    private static List<Person> DB = new ArrayList<>();
    @Override
    public int  insertPerson(Person person) {
        DB.add(new Person(person.getName()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersonById(Person person) {
        return DB.stream();
    }

    @Override
    public int deletePersonById(Person person) {
        return 0;
    }

    @Override
    public int updatePersonById(Person person) {
        return 0;
    }
}
