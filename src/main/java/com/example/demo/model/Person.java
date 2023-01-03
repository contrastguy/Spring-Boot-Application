package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
    //Atributos
    private final  UUID id;
    private final String name;
    private final B mostSigBits



    //Construtor
    public Person(@JsonProperty("id") UUID id,@JsonProperty("name") String name) {
        this.id = id;
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
