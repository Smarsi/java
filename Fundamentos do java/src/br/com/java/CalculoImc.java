package br.com.java;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		// A linha abaixo cria vari�veis n�mericas de precis�o
		//obs: double e float s�o tipos primitivos num�ricos
		double peso, altura, imc;
		System.out.print("Digite o seu peso:");
		//Criando o objeto Digitando
		Scanner teclado = new Scanner(System.in);
		// a linha abaixo passa o valor de digitando para a variavel peso
		peso = teclado.nextDouble();
		System.out.print("Digite a sua altura:");
		altura = teclado.nextDouble();
		//a linha abaixo faz o calculo do imc
		imc = peso/(altura*altura);
		System.out.print("O valor do seu indice de massa corporal �:" + imc);		
	}

}
