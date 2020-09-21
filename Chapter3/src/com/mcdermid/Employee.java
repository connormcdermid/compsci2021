package com.mcdermid;

public class Employee {

    private String name;

    private double salary;

    public Employee(String name, double salary) {
        this.name = name; // I use "this" each time for clarity
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percentage) {
        this.salary *= (100 + percentage); //multiply the salary by 100% plus the raise percentage
    }

    public String toString() {
        return this.name + " has a salary of " + this.salary + ".";
    }
}
