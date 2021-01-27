package com.mcdermid;

public class Manager extends Employee {

    private String department;

    public Manager(String name, int salary, String dept) {
        super(name, salary);
        this.department = dept;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "super=[" + super.toString() + "]" +
                "department='" + department + '\'' +
                '}';
    }
}
