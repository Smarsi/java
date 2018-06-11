package br.com.java;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		// a linha abaixo cria variaveis do tipo real
		float nota1, nota2, media;
		// entrada
		System.out.print("Digite a nota1:");
		// a linha abaixo cria um objeto de nome teclado usando o Scanner
		Scanner teclado = new Scanner(System.in);
		// a linha abaixo usa o objeto teclado para capturar o que foi
		// digitado no console e armazenar na variavel nota1
		nota1 = teclado .nextFloat();
		System.out.print("Digite a nota2:");
		nota2 = teclado.nextFloat();
		// processamento
		media = (nota1 + nota2) /2;
		// saida
		// + concatena (junta) um texto com o conteúdo da variável media
		System.out.println("Média Final:" + media);
		//Estrutura de check true false,
		//MENOR OU IGUAL A 2 - REPROVADO
		//ENTRE 2 E 5 - RECUPERAÇÃO
		// MAIOR OU IGUAL A 5 - APROVADO
		if (media <= 2) {
			System.out.println("REPROVADO");
		} else if (media > 2 && media < 5){
			System.out.println("RECUPERAÇÃO");
		} else {
			System.out.println("APROVADO");
		}
	}

}