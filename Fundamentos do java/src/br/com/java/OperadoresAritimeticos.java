package br.com.java;

import java.util.Scanner;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		float x,y;
        Scanner teclado = new Scanner(System.in);
		System.out.println("Operadores Aritm�ticos");
		System.out.println("--------------------");
		System.out.print("Digite o valor de X: ");
		x = teclado.nextFloat();
		System.out.print("Digite o valor de y: ");
		y = teclado.nextFloat();
		// Soma
		System.out.println("x + y = " + (x + y));
		// Subtra��o
		System.out.println("x - y = " + (x - y));
		// Divis�o
		System.out.println("x / y = " + (x / y));
		// Multiplica��o
		System.out.println("x * y = " + (x * y));
		// Modulo
		System.out.println("x % y = " + (x % y));
		// Incremento x++ ( equivale a x = x + 1)
		x++;
		System.out.println("x++ " + x);
		// Decremento y-- ( equivale a y = y - 1)
		y--;
		System.out.println("y-- " +y);
	}
}