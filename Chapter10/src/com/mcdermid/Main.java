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

            I am also not entirely sure why Oracle isn't OK with it just always evaluating to false.
         */


        //P10.1 tester
        System.out.println("P10.1");
        SavingsAccount testSavings = new SavingsAccount("tester",5d); //added the d to indicate double
        testSavings.deposit(10000);
        testSavings.addInterestMin();
        testSavings.withdraw(5000);
        testSavings.withdraw(3000);
        testSavings.deposit(10000);
        testSavings.addInterestMin(); // interest computed on $2000
        System.out.println("Balance: " +
                           testSavings.getBalance());
        System.out.println("Expected: 12100");
        //P10.2 tester
        System.out.println("\nP10.2");
        SavingsAccount momsSavings = new SavingsAccount("mom",5);
        CheckingAccount harrysChecking = new
                CheckingAccount("harry",4.0/5);
        TimeDepositAccount collegeFund = new
                TimeDepositAccount("college",10, 3);
        momsSavings.deposit(10000);
        momsSavings.transfer(2000, harrysChecking);
        harrysChecking.withdraw(1500);
        harrysChecking.withdraw(80);
        momsSavings.transfer(1100, harrysChecking);
        harrysChecking.withdraw(400);
        momsSavings.transfer(3000, collegeFund);
        collegeFund.withdraw(800);
        momsSavings.addInterest();
        collegeFund.addInterest();
        harrysChecking.deductFees();
        System.out.println("Mom's savings balance: "
                + momsSavings.getBalance());
        System.out.println("Expected: 4200");
        System.out.println("Harry's checking balance: "
                + harrysChecking.getBalance());
        System.out.println("Expected: 1116");
        System.out.println("College fund's time deposit balance: "
                + collegeFund.getBalance());
        System.out.println("Expected: 2398");
        //lab P10.5
        System.out.println("\nP10.5");
        Employee e = new Employee("Edgar", 65000);
        Manager m = new Manager("Mary", 85000,"Engineering");
        Executive v = new Executive("Veronica", 105000, "Engineering");
        CEO c = new CEO("Veronica", 105000, "Executive");
        System.out.println(e);
        System.out.println("Expected:Employee[name=Edgar,salary=65000.0]");
        System.out.println(m);
        System.out.println("Expected: Manager[super=Employee[name=Mary,salary=85000.0],department=Engineering]");
        System.out.println(v);
        System.out.println("Expected: Executive[super=Manager[super=Employee[name=Veronica,salary=105000.0], department=Engineering]]");
        System.out.println(c);
        System.out.println("Expected: CEO[super=Executive[super=Manager[super=Employee[name=Veronica,salary=105000.0], department=Engineering]]]");
        // The Expected CEO part here is a little confusing -- his department should be "executive", not "Engineering",
        // yet the worksheet expects me to overwrite its own changes and make his dept "Engineering". I've elected to
        // not do so, as I feel it would be in error.

        
    }
}
