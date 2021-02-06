package com.java;

public class Ejercicio5_Decimal 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//areEqualByThreeDecimalPlaces(-3.1756,-3.175);
		System.out.println("This is "+areEqualByThreeDecimalPlaces(-3.1756,-3.175));
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double para1, double para2)
	{
		if(para1==para2)
		{
			return true;
		}
		else
			return false;
	}

}
