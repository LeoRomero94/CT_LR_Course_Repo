package com.java;

public class Bucles 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//WHILE
		
		int numero = 1;
//		
//		while (numero<=10)
//			{
//			System.out.println("El numero es "+ numero);
//			++numero;
//			}

		// DO WHILE -- ¿Cuantas veces tiene que sumar un mismo numero para llegar a 100?

		int NumeroLimite = 10;
		int SumTotal = 0;
		int Count = 0;

		do {
			SumTotal += NumeroLimite;
			++Count;
		} while (SumTotal < 100);
		System.out.println("El número se sumó: " + Count);

		int NumeroFor = 10;

		for (int i = 1; i <= NumeroFor; i++) {
			System.out.println("El número del FOR es " + i);
		}
		
	}

}
