package com.mcdermid;

public class Person {

    private String firstname;
    private String lastname;
    private final String birthdate;

    Person(String firstname, String lastname, String birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }
}
