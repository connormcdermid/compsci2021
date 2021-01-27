package com.mcdermid;

public class TimeDepositAccount extends SavingsAccount {

    private int timelock;
    private final int PENALTY = 15;

    public TimeDepositAccount(String name, double amount, int time) {
        super(name, amount);
        this.timelock = time;
    }

    @Override
    public void addInterest() {
        super.addInterest();
        timelock--;
    }

    public void withdraw(double amt) {
        super.withdraw(amt);
        if (timelock > 0) {
            super.withdraw(PENALTY);
            System.out.println("You have withdrawn from an immature time-locked account. A penalty has been applied.");
        }
    }
}
