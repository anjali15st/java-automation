package com.exception;

public class Checkingaccount 
{
	int acno;
	String cname;
	double balance;
	public Checkingaccount(int acno, String cname, double balance) {
		this.acno=acno;
		this.cname=cname;
		this.balance=balance;
		System.out.println("Hello "+this.cname +",your Account number " +this.acno+"IS opened with " +this.balance+" RS.");
	
	}
	void deposit(double amount)
	{
		this.balance=this.balance+amount;
	}
	void withdraw(double amount) throws Insufficentfund
	{
		if(amount<=this.balance)
		{
			this.balance=this.balance-amount;
		}
		else
		{
			double needs=amount-this.balance;
			throw new Insufficentfund(needs);
		}
	}
void checkbalance()
{
	System.out.println("Current Balance :"+this.balance);
}
}
