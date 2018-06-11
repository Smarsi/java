package br.com.java;

import java.util.Scanner;

public class CalculadoraFlex {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double gasolina, alcool, porcentagem;

		System.out.println(".");
		System.out.print("Digite o valor do álcool:");
		alcool = teclado.nextDouble();
		System.out.print("Digite o valor da gasolina:");
		gasolina = teclado.nextDouble();
		// Check if else

		porcentagem = (alcool / gasolina);
		System.out.println(porcentagem);
		if (porcentagem < 0.70) {
			System.out.println("Abasteça com Alcool");
		} else {
			System.out.println("Abasteça com Gasolina");
		}

	}

}
