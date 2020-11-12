package com.mcdermid;

public class Main {

    public static void main(String[] args) {
        SavingsAccount myAcct = new SavingsAccount("Connor", 100.00d, 0.03);
        myAcct.deposit(50.00d);
        System.out.println(myAcct.getName());
        System.out.println(myAcct.getBalance());
        myAcct.addInterest();
        myAcct.withdraw(50.00d);
        System.out.println(myAcct.getBalance());

        //trigger withdraw's <0 check
        try {
            myAcct.withdraw(-50.00d);
        } catch (IllegalArgumentException e) {
            System.out.println("You can't withdraw less than nothing.");
        }

        //excercise tostring methods
        System.out.println(myAcct.toString());

        //utilise instanceof
        BankAccount otherAcct = new BankAccount("Not Connor", 150d);
        System.out.println("Is Connor's savings account a bank account?");
        //noinspection ConstantConditions
        System.out.println(myAcct instanceof BankAccount);
        System.out.println("Is another account a savings account?");
        //noinspection ConstantConditions
        System.out.println(otherAcct instanceof SavingsAccount);

        //checking accounts

        CheckingAccount checkingAccount = new CheckingAccount("ConnorChecking", 35d, 0.3d);
        checkingAccount.deposit(20d);
        checkingAccount.withdraw(10d);
        checkingAccount.withdraw(5d);
        checkingAccount.withdraw(7d);
        System.out.println("Transactions: " + checkingAccount.getTransactionCount());
        checkingAccount.deductFees();
        System.out.println(checkingAccount.getBalance());

        //noinspection ConstantConditions
        System.out.println(checkingAccount instanceof BankAccount);
        //noinspection ConstantConditions
        //System.out.println(checkingAccount instanceof SavingsAccount);
        /*
            ^^^^^^^
            The above statement produces a compile time error:
            java: incompatible types: com.mcdermid.CheckingAccount cannot be converted to com.mcdermid.SavingsAccount
            This is expected behaviour according to the Oracle docs
            (https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.20.2), which state that
            "If a cast (§15.16) of the RelationalExpression to the ReferenceType would be rejected as a
            compile-time error, then the instanceof relational expression likewise produces a compile-time error.
            In such a situation, the result of the instanceof expression could never be true."

            I am not entirely sure why, earlier in the code, I'm able to use instanceof to check whether or not
            a BankAccount is a SavingsAccount, and why that does *not* throw a compile-time error --
            according to this logic, it should.
         */

        
    }
}
