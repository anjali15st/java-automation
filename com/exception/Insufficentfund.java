package com.exception;

public class Insufficentfund extends Exception
{
double amount;
public Insufficentfund(double amount) 
{
	this.amount=amount;
}
public double getamount()
{
	return this.amount;
}
}
