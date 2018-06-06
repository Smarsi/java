package br.com.java;

import java.util.Scanner;

public class CalcularAreaCirculo {

	public static void main(String[] args) {
		double area, raio;
		Scanner digitando = new Scanner(System.in);
		System.out.println("=================================================");
		System.out.println("======== Calculo Da Area Do Circulo =============");
		System.out.println("=================================================");
		System.out.println("");
		System.out.println("-------------------------------------------------");
		System.out.println("Qual o raio do circulo?");
		System.out.print("R: ");
		raio = digitando.nextDouble();
			//calculo
			area = (3.14 * (raio*raio));
		System.out.println("A area do circulo é: " + area);
			

	}

}
