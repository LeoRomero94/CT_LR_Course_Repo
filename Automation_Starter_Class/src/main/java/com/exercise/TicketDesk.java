package com.exercise;

public class TicketDesk 
{

	public static void main(String[] args) 
	{
		double precioCoolPark=150;
		double precioTestersPark=160;
		int age=25;
		boolean student=true;
		
//		CoolParkTicket coolPark = new CoolParkTicket(precioCoolPark,age,student);
//		coolPark.printPriceDay();
//		coolPark.getTicketPrice();
//		
//		TesterParkTicket testersPark = new TesterParkTicket(precioTestersPark,age,student);
//		testersPark.printPriceDay();
//		testersPark.getTicketPrice();
		
		TicketParks ticket = new CoolParkTicket(precioCoolPark,age,student);
		ticket.printPriceDay();
		ticket.getTicketPrice();
		
		ticket = new TesterParkTicket(precioTestersPark,age,student);
		ticket.printPriceDay();
		ticket.getTicketPrice();
	}

}
