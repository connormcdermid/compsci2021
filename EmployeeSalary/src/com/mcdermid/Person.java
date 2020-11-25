package com.mcdermid;

public abstract class Person {

    private String firstname;
    private String lastname;
    private final String birthdate;

    Person(String firstname, String lastname, String birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }

    public String getFirstname() {
        return this.firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    public String getBirthdate() {
        return this.birthdate;
    }
}
