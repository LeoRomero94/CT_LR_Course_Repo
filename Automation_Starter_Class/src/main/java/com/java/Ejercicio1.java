//Escribe un metodo que se llame hasEqualSum con 3 parametros de tipo int.
//
//El metodo debe regresar un valor booleano verdadero si la suma de los dos primeros parametros 
//es igual a la suma del tercer parametro, en otro caso devolver false.
//
//Aqui algunos ejemplos de input y output:
//
//* hasEqualSum(1, 1, 1);  deberia regresar FALSE porque la suma de 1+1 no es 1
//
//* hasEqualSum(1, 1, 2);  deberia regresar TRUE porque la suma de 1+1 si es 2

package com.java;

public class Ejercicio1 
{

	public static void main(String[] args) 
	{
		boolean isEqualSum=hasEqualSum(1,1,2);
		System.out.println("El valor es "+isEqualSum);
	}
	
	public static boolean hasEqualSum(int operador1,int operador2,int resultado)
	{
		if (operador1+operador2 == resultado)
		{
			System.out.println("La suma de los operadores es igual al resultado");
			return true;
		}
		else
		{
			System.out.println("La suma de los operadores NO es igual al resultado");
			return false;
		}
			
			
	}

}
