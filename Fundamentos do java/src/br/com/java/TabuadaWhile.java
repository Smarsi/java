package br.com.java;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		int valor;
		int i = 1; // VARIAVEL DE APOIO AO LAÇO WHILE
			Scanner teclado = new Scanner(System.in);
			System.out.println("========== Tabuada =======");
			System.out.println("");
			System.out.print(" Digite o valor para a Tabuada: ");
			valor = teclado.nextInt();

		while (i < 11) {

				System.out.println(valor + " x " + i + " = " + (valor * i));
				i++;
		}

	}

}