//Escribe un método que se llame imprimirVerificadorNumeros con 3 parámetros de tipo int. 
//El método no debe devolver nada (vacío).
//
//Si uno de los parámetros es menor que 0, imprima el texto "Valor no válido".
//
//Si todos los números son iguales, imprima el texto "Todos los números son iguales"
//
//Si todos los números son diferentes, imprima el texto "Todos los números son diferentes".
//
//De lo contrario, imprima "Ni todos son iguales ni diferentes".
//
//EJEMPLOS DE ENTRADA / SALIDA:
//
//* printEqual (1, 1, 1); debe imprimir texto Todos los números son iguales
//
//* printEqual (1, 1, 2); deben imprimir texto Ni todos son iguales o diferentes
//
//* printEqual (-1, -1, -1); debe imprimir el texto Valor no válido
//
//* printEqual (1, 2, 3); debe imprimir texto Todos los números son diferentes

package com.java;

public class Ejercicio2 
{

	public static void main(String[] args) 
	{
		//TODO
		imprimirVerificadorNumeros(2,1,2);
	}

	public static void imprimirVerificadorNumeros(int para1,int para2,int para3)
	{
		if(para1<0||para2<0||para3<0)
		{
			System.out.println("El valor no es valido");
		} else
		if(para1==para2&&para1==para3)
		{
			System.out.println("Todos los números son iguales");
		} else
			if(para1!=para2&&para1!=para3)
			{//&&para2!=para3&&para2!=para1&&para3!=para1&&para3!=para2
				System.out.println("Todos los números son diferentes");
			} else
				{
				System.out.println("Ni todos son iguales ni diferentes");
				}
	}
}
