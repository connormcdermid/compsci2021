package com.mcdermid;

public class CommissionEmployee extends SalariedEmployee {
    private double salesTotal;
    private int salesCommission;

    CommissionEmployee(String firstname,
                       String lastname,
                       String birth,
                       int ID,
                       String job,
                       String company,
                       double salary,
                       double salesTotal,
                       int salesCommission) {
        super(firstname, lastname, birth, ID, job, company, salary);
        this.salesTotal = salesTotal;
        this.salesCommission = salesCommission;
    }

    public double getAnnualSalary() {
        return super.getAnnualSalary() + Math.round(salesTotal / salesCommission);
    }
}
