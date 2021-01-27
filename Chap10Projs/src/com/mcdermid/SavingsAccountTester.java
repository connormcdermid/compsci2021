package com.mcdermid;

/**
 This program tests the SavingsAccount class.
 */
public class SavingsAccountTester
{
    public static void main(String[] args)
    {
        SavingsAccount momsSavings = new SavingsAccount(5);
        momsSavings.deposit(10000);
        momsSavings.addInterest();
        momsSavings.withdraw(5000);
        momsSavings.withdraw(3000);
        momsSavings.deposit(10000);
        momsSavings.addInterest(); // interest computed on $2000
        System.out.println("Balance: " +
            momsSavings.getBalance());
        System.out.println("Expected: 12100");
    }
}
