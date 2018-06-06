package br.com.java;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		float x, y;
		Scanner teclado = new Scanner(System.in);
		System.out.println(" Operadores Aritméticos ");
		System.out.print(" Coloque o valor de X : ");
		x = teclado.nextFloat();
		System.out.print(" Coloque o valor de Y : ");
		y = teclado.nextFloat();
			
		//soma
			System.out.println("X + Y = " + (x + y));
			
			//subtração
			System.out.println("X - Y = " + (x - y));
			
			//divisão 
			System.out.println("X / Y = " + (x / y));
			
			//multiplicação
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
