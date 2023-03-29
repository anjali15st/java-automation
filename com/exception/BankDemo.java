package com.exception;

import java.util.Scanner;

public class BankDemo 
{
	public static void main(String[] args) {
		double amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("******************************************");
		System.out.print("Enter Account Number :");
		int acno=sc.nextInt();
		System.out.println("******************************************");
		System.out.print("Enter Customer Name :");
		String cname=sc.next();
		System.out.println("******************************************");
		System.out.print("Enter Initial Balance :");
		double balance=sc.nextDouble();
		System.out.println("******************************************");
		Checkingaccount ch = new Checkingaccount(acno, cname, balance);
		while(true)
		{
			System.out.println("******************************************");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.println("******************************************");
			System.out.print("Enter your choice  :");
			int choice=sc.nextInt();	
			System.out.println("******************************************");
		
			if(choice==1)
			{
				System.out.print("Enter Deposit amount :");
				amount=sc.nextDouble();
				ch.deposit(amount);
				System.out.println("******************************************");
			}
			else if(choice==2)
			{
				try {
					System.out.println("Enter Withdraw amount :");
					amount=sc.nextDouble();
					ch.withdraw(amount);
				}catch(Insufficentfund  e)
				{
					System.out.println("Sorry you need another"+e.getamount());
				
				}
				System.out.println("******************************************");
			}
			else if(choice==3)
			{
				ch.checkbalance();
				System.out.println("******************************************");
			}
			else
			{
				System.out.println("Good bye.Thank you for using our services");
				System.out.println("******************************************");
				break;
			}
			
		
		
		
		}
		
		
	
	
	}

}
