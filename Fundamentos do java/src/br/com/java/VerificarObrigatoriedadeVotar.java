package br.com.java;

import java.util.Scanner;

public class VerificarObrigatoriedadeVotar {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Verificar obrigatoriedade de votar");
		System.out.print("Digite a sua idade: ");
		idade = teclado.nextInt();
		//check if else
		if (idade < 16) {
			System.out.println("PROIBIDO VOTAR");
		} else if (idade == 16 || idade == 17 || idade >70 ) {
			System.out.println("VOTO FACULTATIVO");
		} else {
			System.out.println("VOTO OBRIGATÓRIO");
		}
	}

}
