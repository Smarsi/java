package br.com.java;

import java.util.Scanner;

public class VerificandoMaioridade {

	public static void main(String[] args) {
	String nome;
	int idade;
	Scanner teclado = new Scanner(System.in);
	System.out.print("Digite o seu nome: ");
	nome = teclado.nextLine();
	System.out.print("Digite a sua idade: ");
	idade = teclado.nextInt();
	System.out.println("");
	System.out.println("___________________");
	System.out.println("Nome: " + nome);
	System.out.println("Idade: " + idade);
	
	//  Estrutura Check if Else
	
	if (idade >= 18) {
		System.out.println("Maior de Idade");
	} else {
		System.out.println("Menor de Idade");
	}
	System.out.println("_________.i.-________");
	}

}
