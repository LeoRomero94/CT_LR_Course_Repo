package com.java;

public class Operators 
{
	public static void main (String[] args)
	{
		//TODO Auto-Generated method stub
		
		//Arithmetics
		
		int x = 2;
		int y = 3;
		
		int z = x + y;
		System.out.println("Este es el valor de z: "+ z);
		
		//Unarios
		
		int A = 1;
		int B = 2;
		
		System.out.println("El Value que vamos a imprimir se le suma uno y queda en: "+ ++B);
		
		//Relacionales
		
		if(A < B)
		{
			System.out.println("BLOCK CODE 1: A es menor que B");
		}
		
		// Condicionales
		
		int var1 = 5;
		int var2 = 6;
		int var3 = 5;
		int var4 = 5;
		
		if(var1 == var2 && var3 == var4)
		{
			System.out.println("BLOCK CODE 2A: var1 es igual a var2, Y var3 es igual a var4");
		}
		
		if(var1 == var2 || var3 == var4)
		{
			System.out.println("BLOCK CODE 2B: var1 es igual a var2, O var3 es igual a var4");
		}
	}
}
