package com.javapapo.controllers;

import com.javapapo.model.Person;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PersonController {

    private Map<Long,Person> people;

    public PersonController(){
        people= new HashMap<>();
        people.put(1L,Person.builder().age(18).name("Peter").surname("Smith").build());
        people.put(2L,Person.builder().age(25).name("Jane").surname("Jackson").build());
        people.put(3L,Person.builder().age(66).name("Chris").surname("Haze").build());
    }

    @Async
    @RequestMapping(value = "/person/{userId}", method = RequestMethod.GET,
                produces= MediaType.APPLICATION_JSON_VALUE)
    public Person getPerson(@PathVariable Long userId) {
       return people.get(userId);
    }
}
