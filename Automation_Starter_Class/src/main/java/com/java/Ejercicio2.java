//Escribe un m�todo que se llame imprimirVerificadorNumeros con 3 par�metros de tipo int. 
//El m�todo no debe devolver nada (vac�o).
//
//Si uno de los par�metros es menor que 0, imprima el texto "Valor no v�lido".
//
//Si todos los n�meros son iguales, imprima el texto "Todos los n�meros son iguales"
//
//Si todos los n�meros son diferentes, imprima el texto "Todos los n�meros son diferentes".
//
//De lo contrario, imprima "Ni todos son iguales ni diferentes".
//
//EJEMPLOS DE ENTRADA / SALIDA:
//
//* printEqual (1, 1, 1); debe imprimir texto Todos los n�meros son iguales
//
//* printEqual (1, 1, 2); deben imprimir texto Ni todos son iguales o diferentes
//
//* printEqual (-1, -1, -1); debe imprimir el texto Valor no v�lido
//
//* printEqual (1, 2, 3); debe imprimir texto Todos los n�meros son diferentes

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
			System.out.println("Todos los n�meros son iguales");
		} else
			if(para1!=para2&&para1!=para3)
			{//&&para2!=para3&&para2!=para1&&para3!=para1&&para3!=para2
				System.out.println("Todos los n�meros son diferentes");
			} else
				{
				System.out.println("Ni todos son iguales ni diferentes");
				}
	}
}
