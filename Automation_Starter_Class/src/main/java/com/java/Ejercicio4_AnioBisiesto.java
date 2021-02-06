package com.java;

public class Ejercicio4_AnioBisiesto 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		isLeapYear(2000);
	}
	
	public static boolean isLeapYear(int year)
	{
		if(year < 1 || year > 9999)
		{
			System.out.println("Invalid value, please insert a value between 1 and 9999");
			return false;
		} 		
		else 
			if(year % 4 == 0)
			{
				if(year % 100 == 0)
				{
					if(year % 400 == 0)
					{
						System.out.println("This is a leap year");
						return true;
					} else
						System.out.println("The year is not a leap year");
					return false;
				} else System.out.println("This is a leap year");
				return true;
				
			} else
					System.out.println("The year is not a leap year");
					return false;
	}

}
