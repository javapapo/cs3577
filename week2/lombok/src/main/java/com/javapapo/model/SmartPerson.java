package com.javapapo.model;

import lombok.*;

/**
 * Created by javapapo on 05/11/2016.
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class SmartPerson {

    private String name;
    private String surname;
    private String gender;
    private int age;
    private String address;
    private String postcode;
    private String country;
    private String occupation;
    private String anotherOccupation;


}
