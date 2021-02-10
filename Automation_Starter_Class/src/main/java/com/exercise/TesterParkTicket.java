// Agregar constructor en la clase TestersParkTicket donde tenga un descuento especial y usarlo en nuestra clase Main

package com.exercise;

public class TesterParkTicket extends TicketParks
{
	
	double adultTicket, childTicket, studentTicket,SpecialOneTimeDiscount;
	int age;
	boolean student = false;
	boolean canHave1TDiscount = false;
	String priceDay, park;
	
	// Constructor
	
	public TesterParkTicket(double price, int personAge, boolean studentId)
	{
		super();
		age = personAge;
		student = studentId;
		adultTicket = price;
		childTicket = price * (.60);
		studentTicket = price * (.30);
		SpecialOneTimeDiscount = price * (.10);
		priceDay = "Normal Day Price";
		park = "Testers Park";
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
	
	//Overloading the previous method for changing a variable in the day price.
	@Override
	public void printPriceDay(String keyManager, String priceDay)
	{
		setPriceDay(priceDay);
		System.out.println(welcomeMessageString() + park + " - " + getPriceDay(priceDay));
	}
	
}
