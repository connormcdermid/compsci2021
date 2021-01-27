package com.mcdermid;

public class CEO extends Executive {
    public CEO(String name, int salary, String dept) {
        super(name, salary, dept);
    }

    @Override
    public String toString() {
        return "CEO{super=" + super.toString() + "}";
    }
}
