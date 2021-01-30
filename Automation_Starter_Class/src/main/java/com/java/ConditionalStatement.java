package com.java;

public class ConditionalStatement 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//IF ELSE
		
		int velocidad = 90; //KM/H
		int LimiteVelocidad = 80;
		
//		if(velocidad > LimiteVelocidad)
//		{
//			System.out.println("El coche va a exceso de velocidad");
//		}
//			else
//			{
//				System.out.println("El coche va dentro de la velocidad adecuada");
//			}
//		
		//IF ANIDADO - IF ELSE
		
		boolean carretera = true;
		
		if (carretera)
		{
			System.out.println("El coche está en una carretera");
			
			LimiteVelocidad=110;
			
			if(velocidad > LimiteVelocidad)
			{
				System.out.println("El coche va a exceso de velocidad");
			}
				else
				{
					System.out.println("El coche va dentro de la velocidad adecuada");
				}
		}
		else if (velocidad > LimiteVelocidad)
		{
			System.out.println("El coche está en una calle y va a exceso de velocidad");
		}
		else
		{
			System.out.println("El coche está en una calle y va a una velocidad adecuada");
		}
		
		//SWITCH CASE
		
		int temperatura = 30;
		
		switch(temperatura)
		{
		case 5:
			System.out.println("Hace mucho frio");
			break;
			
		case 10:
			System.out.println("Hace algo de frio");
			break;
			
		case 20:
			System.out.println("Está agradable");
			break;
			
		case 30:
			System.out.println("Hace calor");
			break;
			
		default:
			System.out.println("No encontró relación con la temperatura");
			break;
		}
		
		
	}

}
