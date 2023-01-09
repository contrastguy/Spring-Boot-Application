package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component("fakeDao")
public class FakePersonDataAccessService implements  PersonDao{

    private static List<Person> DB = new ArrayList<>();
    @Override
    public int  insertPerson(Person person) {
        DB.add(new Person(person.getName()));
        return 1;
    }
}
