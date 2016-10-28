package com.optexample;

import java.util.Optional;

/**
 * Created by javapapo on 27/10/2016.
 */
public class Person {

    private String name;

    public Person() {
    }

    public Person(String aName){
        this.name = aName;
    }

    public Optional<String> getName(){
        return Optional.ofNullable(name);
    }

}
