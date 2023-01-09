package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
    //Atributos
    private UUID id;

    private String name;

    //Construtor
    public Person( @JsonProperty("name") String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    //gets & sets
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
