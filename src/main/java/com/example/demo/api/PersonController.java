package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public String addPerson(@RequestBody Person person){
        personService.addPerson(person);
        return person.getName();
    }

    @GetMapping
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }


    @GetMapping(path = "{id}")
    public Person getPersonById(@PathVariable("id") UUID id){
        return personService.getPersonById(id).orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deletePersonById(@PathVariable("id") UUID id){
        personService.deletePersonById(id);
    }
    @PutMapping(path ="{id}")
    public void updatePerson(@PathVariable("id") UUID id ,@RequestBody Person personToUpdate){
        personService.updatePersonById(id,personToUpdate);
    }
}
