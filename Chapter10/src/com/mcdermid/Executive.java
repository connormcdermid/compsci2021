package com.mcdermid;

public class Executive extends Manager {

    public Executive(String name, int salary, String dept) {
        super(name, salary, dept);
    }

    @Override
    public String toString() {
        return "Executive{super=" + super.toString() + "}";
    }
}
