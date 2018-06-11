package br.com.java;

import java.util.Scanner;

public class CalculadoraLucro {

	public static void main(String[] args) {
		double custo,lucro,venda;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora do Lucro '-' ");
		System.out.println("''''''''''''''''''''''''");
		//entrada
		System.out.print("Preço de custo: ");
		custo = teclado.nextDouble();
		System.out.print("% de lucro: ");
		lucro = teclado.nextDouble();
		//processamento
		venda = custo = ((custo * lucro ) / 100 );
		//saida
		System.out.println("Preço de venda: " + venda);
		
		

	}

}