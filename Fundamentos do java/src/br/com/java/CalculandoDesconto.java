package br.com.java;

import java.util.Scanner;

public class CalculandoDesconto {

	public static void main(String[] args) {
		//
		double DA,PT,valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculando o desconto");
		System.out.println("DA * PT = valor");
		//entrada
		System.out.print("Digite o valor do desconto aplicado: ");
		DA = teclado.nextDouble();
		System.out.print("Digite o valor do preço total: ");
		PT = teclado.nextDouble();
		//processamento
		valor = (DA * PT) / 100;
		//saida
		System.out.println(PT - valor );
		System.out.print(" foram descontados: " + valor);
		
	}

}