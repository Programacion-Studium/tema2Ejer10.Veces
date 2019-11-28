package es.Studium.Veces;

import java.util.Scanner;

public class Veces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, veces, i; //números Enteros
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca un numero");
		numero = teclado.nextInt();
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca las veces que deve repetirse");
		veces = teclado.nextInt();
		teclado.close();
		for(i=1; i<=veces;i++) 
		{
			System.out.println(numero);
		}

	}
}