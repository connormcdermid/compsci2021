// BankAccount.java
package com.mcdermid;
import java.util.Arrays;

/** 
 * 
 * Implements a bank account storing balance and 
 * 	customer's name
 * 
 * @author  S. Andrianoff
 * @version July 21, 2014
 *
 */

public class BankAccount 
{
	private double balance;
	private String name;
	
	/**
	 * Constructs a BankAccount from a name and a balance
	 * @param n customer's name
	 * @param b starting balance
	 */
	public BankAccount(String n, double b)
	{
		balance = b;
		name = n;
	}
	   	
	/**
	 * Constructs a BankAccount from a name.
	 * Initial balance is 0.
	 * @param n customer's name
	 */
	public BankAccount(String n)
	{
		this(n, 0.0);
	}
	
	/**
	 * Returns the name of the owner of the account
	 * @return name of owner
	 */
 	public String getName()
 	{
		return name;	
 	}

	/**
	 * Returns the current balance in the account
	 * @return current balance
	 */
 	public double getBalance()
 	{
		return balance;	
 	}

	/**
	 * Deposits an amount into the account
	 * @param amount amount deposited
	 * @throws IllegalArgumentException if amount is negative
	 */
	public void deposit(double amount)
	{
		if (amount < 0.0)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			balance += amount;
		}
	}
	
	/**
	 * Withdraws an amount from the account
	 * @param amount amount withdrawn
	 * @throws IllegalArgumentException if amount is greater than balance
	 */
	public void withdraw(double amount)
	{
		if (amount > balance || amount <= 0)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			balance -= amount;
		}
	}

	@Override
	public String toString() {
		return "BankAccount{" +
				"balance=" + balance +
				", name='" + name + '\'' +
				'}';
	}
}
 