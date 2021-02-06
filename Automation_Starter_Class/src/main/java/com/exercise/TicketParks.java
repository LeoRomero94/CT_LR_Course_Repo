package com.exercise;

public abstract class TicketParks 
{
	String welcomeMessage;
	
	public TicketParks()
	{
		this.welcomeMessage = "Welcome Cooltesters park - ";
	}
	
	public String welcomeMessageString()
	{
		return this.welcomeMessage;
	}
	
	//Abstraction
	public abstract double getTicketPrice();
	public abstract void printPriceDay();
	public abstract void printPriceDay(String keyManager, String priceDay);
	
}
