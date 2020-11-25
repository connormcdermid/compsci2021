package com.mcdermid;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new SalariedEmployee("Bill",
                "Gates",
                "Oct 28 1955",
                1,
                "Co-Founder",
                "Microsoft",
                1.15E10));
        employees.add(new SalariedEmployee("Paul",
                "Allen",
                "Jan 21 1953",
                2,
                "Co-Founder",
                "Microsoft",
                1.0E9));
        employees.add(new CommissionEmployee("Sammy",
                "Salesman",
                "Jan 1 1970",
                3,
                "Salesman",
                "Sales, Inc.",
                400000.0,
                1700,
                38));
        employees.add(new HourlyEmployee("Harriet",
                "Hourly",
                "Dec 31 1971",
                4,
                "Hourly Woman",
                "Hours R Us",
                25,
                40));


        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
