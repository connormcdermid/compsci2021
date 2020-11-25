package com.mcdermid;

public class HourlyEmployee extends Employee {

    private double hourlyRate;
    private int hoursPerWeek;

    HourlyEmployee(String firstname,
                   String lastname,
                   String birth,
                   int ID,
                   String job,
                   String company,
                   double rate,
                   int hours) {
        super(firstname, lastname, birth, ID, job, company);
        this.hourlyRate = rate;
        this.hoursPerWeek = hours;
    }

    public double getAnnualSalary() {
        return hourlyRate * hoursPerWeek * 52;
    }

}
