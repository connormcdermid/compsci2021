package com.mcdermid;

public class CheckingAccount extends BankAccount {

    private final double TRANSACTION_FEE;
    private int transactionCount;

    public CheckingAccount(String name, double amount, double fee) {
        super(name, amount);
        this.TRANSACTION_FEE = fee;
    }

    public CheckingAccount(String name, double amount) {
        super(name, amount);
        this.TRANSACTION_FEE = 3d; //I have no context to tell me whether or not this number is unreasonable
    }

    public void deposit(double amount) {
        super.deposit(amount);
        transactionCount++;
    }

    public void withdraw(double amount) {
        super.withdraw(amount);
        transactionCount++;
    }

    public String toString() {
        return "CheckingAccount{" +
                super.toString() +
                "TRANSACTION_FEE=" + TRANSACTION_FEE +
                ", transactionCount=" + transactionCount +
                '}';
    }

    public void deductFees() {
        for (int i = 0; i < transactionCount; i++) {
            super.withdraw(TRANSACTION_FEE);
        }
    }

    public int getTransactionCount() {
        return this.transactionCount;
    }
}
