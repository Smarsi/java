package br.com.java;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int valor;
		Scanner teclado = new Scanner(System.in);
			System.out.println("========== Tabuada =======");
			System.out.println("");
			System.out.print(" Digite o valor para a Tabuada: ");
			valor = teclado.nextInt();
		
		for (int i = 1; i < 11; i++) {
			
			System.out.println(valor + " x " + i + " = " + (valor * i));
			
		}

	}

}
