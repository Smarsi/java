package br.com.java;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		float x, y;
		Scanner teclado = new Scanner(System.in);
		System.out.println(" Operadores Aritm�ticos ");
		System.out.print(" Coloque o valor de X : ");
		x = teclado.nextFloat();
		System.out.print(" Coloque o valor de Y : ");
		y = teclado.nextFloat();
			
		//soma
			System.out.println("X + Y = " + (x + y));
			
			//subtra��o
			System.out.println("X - Y = " + (x - y));
			
			//divis�o 
			System.out.println("X / Y = " + (x / y));
			
			//multiplica��o
			System.out.println("X * Y = " + (x * y));
			
			//modulo
			System.out.println("X % Y = " + (x % y));
			
			//incremento X ++ equivale a X = X + 1
			x++;
			System.out.println("X ++ = " + x);
			
			//decremento Y-- equivale a X = X - 1
			y--;
			System.out.println("Y-- = " + y);
			
	}

}
