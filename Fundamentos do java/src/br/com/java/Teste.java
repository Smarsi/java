package br.com.java;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
	//a linha abaixo cria variaveis do tipo real
	Float nota1, nota2, nota3, nota4, media;
	//a linha a seguir cria o teclado usando Scann
	Scanner teclado = new Scanner(System.in);
	System.out.print("digite a nota1:");
	nota1 = teclado .nextFloat();
	System.out.print("Digite a nota2:");
	nota2 = teclado .nextFloat();
	System.out.print("Digite a nota3:");
	nota3 = teclado .nextFloat();
	System.out.println("Digite a nota4");
	nota4 = teclado .nextFloat();
	//a linha abaixo faz o processamento
	media = (nota1 + nota2 + nota3 + nota4) /4;
	System.out.println("A média do aluno é:" + media);
	//a linha abaixo cria a variavel aluno
	Scanner aluno = new Scanner(System.in);
	System.out.println("Digite o nome do aluno: ");
    String nome = aluno.nextLine();
    System.out.print(" você colocou as notas do aluno: " + nome + ", a média dele é: " + media);

	}

}