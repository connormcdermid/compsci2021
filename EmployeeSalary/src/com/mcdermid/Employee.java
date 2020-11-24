package com.mcdermid;

public abstract class Employee extends Person {

    private int employeeID;
    private String jobTitle;
    private String company;

    Employee(String firstName, String lastName, String birth, int ID, String job, String company) {
        super(firstName, lastName, birth);
        this.employeeID = ID;
        this.jobTitle = job;
        this.company = company;
    }

    public abstract double getAnnualSalary();
}
