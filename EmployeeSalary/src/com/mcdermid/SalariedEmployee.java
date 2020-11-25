package com.mcdermid;

public class SalariedEmployee extends Employee {
    /**
     * Annual salary
     */
    private double salary;

    public SalariedEmployee(String first,
                            String last,
                            String birth,
                            int ID,
                            String job,
                            String company,
                            double salary) {
        super(first, last, birth, ID, job, company);
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return this.salary;
    }
}
