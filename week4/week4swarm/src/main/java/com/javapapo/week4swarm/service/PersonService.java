package com.javapapo.week4swarm.service;


import com.javapapo.week4swarm.model.Person;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@ApplicationScoped
public class PersonService {

    private Map<Long, Person> people;

    public PersonService() {
        people = new HashMap<>();
        people.put(1L, Person.builder().age(18).name("Peter").surname("Smith").build());
        people.put(2L, Person.builder().age(25).name("Jane").surname("Jackson").build());
        people.put(3L, Person.builder().age(66).name("Chris").surname("Haze").build());
    }


    public Optional<Person> getPerson(Long id){
        return Optional.ofNullable(people.get(id));
    }
}
