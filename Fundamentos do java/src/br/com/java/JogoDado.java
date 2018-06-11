package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class JogoDado {

	public static void main(String[] args) {
		char opcao;
		Scanner teclado = new Scanner(System.in);
		do {
			// a linha abaixo usa a classe Random para criar um objeto que será usado para
			// gerar numeros aleatórios
			Random dado = new Random();
			int face = dado.nextInt(6) + 1; // gerar números aleatórios (0 a 5) somamos 1 ao resultado pois nao existe a face 0 no dado
			System.out.println("Face Do Dado: " + face);
			System.out.println("");
			System.out.println("Deseja Jogar Novamente? (S/N)");
			//charAT(0) captura a primeira letra do que foi digitado
			opcao = teclado.next().charAt(0);
		} while (opcao == 's');

	}

}
