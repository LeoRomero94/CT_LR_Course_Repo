//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//
//The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
//
//
//EXAMPLES OF INPUT/OUTPUT:
//
//* areEqualByThreeDecimalPlaces(-3.1756, -3.175); ? should return true since numbers are equal up to 3 decimal places.
//
//* areEqualByThreeDecimalPlaces(3.175, 3.176); ? should return false since numbers are not equal up to 3 decimal places
//
//* areEqualByThreeDecimalPlaces(3.0, 3.0); ? should return true since numbers are equal up to 3 decimal places.
//
//* areEqualByThreeDecimalPlaces(-3.123, 3.123); ? should return false since numbers are not equal up to 3 decimal places.
//
//
//TIP: Use paper and pencil.
//
//TIP: Use casting.

package com.java;

public class Ejercicio5_Decimal 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//areEqualByThreeDecimalPlaces(-3.1756,-3.175);
		System.out.println("This is "+areEqualByThreeDecimalPlaces(3.175, 3.176));
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double para1, double para2)
	{
		para1*=1000;
		para2*=1000;
		int convertPara1=(int) para1;
		int convertPara2=(int) para2;
		if(convertPara1==convertPara2)
		{
			return true;
		}
		else
			return false;
	}

}
