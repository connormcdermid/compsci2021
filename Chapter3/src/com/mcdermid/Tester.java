package com.mcdermid;

/**
 * Name: Connor McDermid
 * Labs: P3.4 and P3.6
 * Extra: Use of the ::toString() method.
 * Questions:
 *      R3.1: The bank account already has a default initial balance: $0
 *      R3.2: The second one initialises the variable b with an object, the first one only declares an empty var.
 *      R3.3: The first one initialises a new object but does not assign it to a variable: its constructor is executed
 *      and the object is promptly destroyed and put out for the garbage collector.
 *      R3.4:
 *      R3.5: $2505
 *      R3.6: No. b2 = b1 + 2b2
 *      R3.7: this references the current object. I use it for clarity when referencing instance vars.
 *      R3.8: It subtracts the amount provided from both bank accounts. ex: acct1.mystery(acct2, 9.99);
 *      R3.10:
 *      R3.11: A local variable is created when it is declared and dies at the end of the method. A parameter variable
 *      is created when the method is called and dies when it ends.
 *      R3.12: An instance field is created when the object is instantiated and dies when the object dies. A local var
 *      is created when it is declared and dies when the methods ends.
 */
public class Tester {

    public static void main(String[] args) {
        // Employee Section
        Employee harry = new Employee("Hacker, Harry", 50000);
        harry.raiseSalary(10);
        System.out.println("Expected: Hacker, Harry has a salary of 55000.");
        System.out.println(harry);

        // Student Section
        Student connor = new Student("Connor McDermid");
        connor.addQuiz(95.5);
        connor.addQuiz(100);
        connor.addQuiz(75.8);
        System.out.println("Expected: Connor McDermid has a total score of 271.3 and an average score of 90.43333...");
        System.out.println(connor);
    }
}
