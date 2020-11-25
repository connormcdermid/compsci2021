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

    public int getEmployeeID() {
        return this.employeeID;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public String getCompany() {
        return this.company;
    }
    public String toString() {
        return "Employee Information\n" +
                "-------------------\n" +
                "Name: " + getFirstname() + " " + getLastname() + "\n" +
                "Birthdate: " + getBirthdate() + "\n" +
                "Title and Company: " + getJobTitle() + " at " + getCompany() + "\n" +
                "ID: " + getEmployeeID() + "\n" +
                "Annual Salary: " + getAnnualSalary() + "\n";
    }
}
