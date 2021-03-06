// Agregar la condicion si es ni�o y es estudiante donde se sumen los porcentajes

package com.exercise;

public class CoolParkTicket extends TicketParks 
{
	
	double adultTicket, childTicket, studentTicket;
	int age;
	boolean student = false;
	String priceDay, park;
	
	// Constructor
	
	public CoolParkTicket(double price, int personAge, boolean studentId)
	{
		super();
		age = personAge;
		student = studentId;
		adultTicket = price;
		childTicket = price * (.80);
		studentTicket = price * (.50);
		priceDay = "Normal Day Price";
		park = "Cool Park";
	}
	
	// Encapsulation
	
	//Setter
	private void setPriceDay(String priceDay)
	{
		this.priceDay = priceDay;
	}
	
	//Getter
	private String getPriceDay(String priceDay)
	{
		return priceDay;
	}
	
	
	// Method for getting the price of the tickets.
	
	@Override
	public double getTicketPrice()
	{
		double priceTicket;
		if(student == true && age>=18)
		{
			priceTicket = studentTicket;
			System.out.println("Adult student Price (50% applied): $"+studentTicket);
		} 	
			else if(student == true && age<18)
			{
				priceTicket = studentTicket;
				System.out.println("Child student Price (70% applied): $"+(childTicket -= studentTicket));
			}
				else if(age>=18)
				{
					priceTicket = adultTicket;
					System.out.println("Adult Price: $"+adultTicket);
				} 
					else
					{
						priceTicket = childTicket;
						System.out.println("Child Price (20% applied): $"+childTicket);
					}
		
		return priceTicket;
	}
	

	
	// Method for displaying the price.
	@Override
	public void printPriceDay()
	{
		System.out.println(welcomeMessageString() + park + " - " + getPriceDay(priceDay));
	}
	
	//Overloading
	@Override
	public void printPriceDay(String keyManager, String priceDay)
	{
		setPriceDay(priceDay);
		System.out.println(welcomeMessageString() + park + " - " + getPriceDay(priceDay));
	}
	
}
