package br.com.java;

import java.util.Scanner;

public class CalculadoraLucro {

	public static void main(String[] args) {
		double custo, lucro, venda;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Calculadora de Lucro");
		System.out.println("");
		System.out.print("Preço de custo: ");
		custo = teclado.nextDouble();
		System.out.print("% de lucro: ");
		lucro = teclado.nextDouble();
		//processamento 
		venda = custo + ((custo * lucro)/100);
		//saída
		System.out.print("Preço de Venda : " + venda);
			
	}

}
