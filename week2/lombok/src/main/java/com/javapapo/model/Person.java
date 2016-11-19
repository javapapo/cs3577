package com.javapapo.model;

import lombok.Builder;

/**
 * Created by javapapo on 05/11/2016.
 */
@Builder
public class Person {

    private String name;
    private String surname;
    private String gender;
    private int age;
    private String address;
    private String postcode;
    private String country;
    private String occupation;

    public String getSomethingElse() {
        return somethingElse;
    }

    public void setSomethingElse(String somethingElse) {
        this.somethingElse = somethingElse;
    }

    private String somethingElse;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (surname != null ? !surname.equals(person.surname) : person.surname != null) return false;
        if (gender != null ? !gender.equals(person.gender) : person.gender != null) return false;
        if (address != null ? !address.equals(person.address) : person.address != null) return false;
        if (postcode != null ? !postcode.equals(person.postcode) : person.postcode != null) return false;
        if (country != null ? !country.equals(person.country) : person.country != null) return false;
        if (occupation != null ? !occupation.equals(person.occupation) : person.occupation != null) return false;
        return somethingElse != null ? somethingElse.equals(person.somethingElse) : person.somethingElse == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (postcode != null ? postcode.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (occupation != null ? occupation.hashCode() : 0);
        result = 31 * result + (somethingElse != null ? somethingElse.hashCode() : 0);
        return result;
    }
}
