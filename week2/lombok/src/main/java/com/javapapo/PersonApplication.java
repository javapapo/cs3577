package com.javapapo;

import com.javapapo.model.Person;
import com.javapapo.model.SmartPerson;

/**
 * Created by javapapo on 05/11/2016.
 */
public class PersonApplication {

    public static void main(String[] args) {

        Person paris = Person.builder()
                .address("12 essex road")
                .name("paris")
                .build();

//                new Person();
//        paris.setAddress("12 essex road");
//        paris.setName("paris");
//


        SmartPerson smartPerson =
                SmartPerson.builder()
                        .address("12 essex road")
                        .name("paris2")
                        .build();
    }
}
