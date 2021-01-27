// SavingsAccount.java
package com.mcdermid;
/**
 *
 * Simulates a savings account on which interest can
 * 			be earned.
 * @author S. Andrianoff
 * @version July 21, 2014
 *
 */

public class SavingsAccount extends BankAccount
{
    private double interestRate;
    private double minBal;

    /**
     * Constructs a savings account from
     * 	a customer name, an initial balance, and an
     * 	interest rate.
     * @param name customer's name
     * @param balance initial balance
     * @param rate interest rate
     */
    public SavingsAccount(String name, double balance, double rate)
    {
        super(name, balance);
        interestRate = rate;
        minBal = balance;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                ", minBal=" + minBal +
                '}';
    }

    public SavingsAccount(String name, double balance) {
        super(name, balance);
        interestRate = 5d;
        minBal = balance;
    }

    /**
     * Adds interest to the balance using the interest rate.
     */
    public void addInterest()
    {
        double current;
        current = this.getBalance();
        this.deposit(interestRate*current);
    }

    public void addInterestMin() {
        this.deposit(interestRate*minBal);
    }

    public void withdraw(double amount) {
        super.withdraw(amount);
        minBal = minBal > amount ? minBal - amount : 0;
    }


}
