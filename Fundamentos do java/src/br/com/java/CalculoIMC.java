package br.com.java;

import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		// A linha abaixo cria variáveis numéricas de precisão
		//float e double são tipos primitivos numéricos
		double peso, altura, imc;
		Scanner teclado = new Scanner(System.in); 
		System.out.println("========Cálculo do IMC=======");
		System.out.print("Digite o peso em kg:");
		//entrada
		peso = teclado.nextDouble();
		System.out.println("digite a altura em metros");
		altura = teclado.nextDouble();
		//processamento
		imc = peso / (altura * altura);
		System.out.println(" IMC " + imc);
		
		
		
		

	}

}