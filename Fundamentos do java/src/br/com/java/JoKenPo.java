/*
 * Atividade JokenPo
 * @author Richard A., Luis Freitas, Diogo Diniz.
 * Date 06/13/2018
 */

package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class JoKenPo {

	public static void main(String[] args) {
		
		int opcao;
		int jogadorganha = 0, computadorganha = 0;
		char novamente;
		Scanner digitando = new Scanner(System.in);
		do {
		
		System.out.println("");
		System.out.println("========== JoKenPo ==========");
		System.out.println("");
		System.out.println("1. PEDRA");
		System.out.println("2. PAPEL");
		System.out.println("3. TESOURA");
		System.out.println("");
		System.out.print("Escolha uma opção de jogada : ");
		opcao = digitando.nextInt();
			switch (opcao) {
			
			case 1:
				System.out.println("________________________");
				System.out.println("Você jogou Pedra.");
				System.out.println("");
				break;
			case 2:
				System.out.println("________________________");
				System.out.println("Você jogou Papel.");
				System.out.println("");
				break;
			case 3:
				System.out.println("________________________");
				System.out.println("Você jogou Tesoura.");
				System.out.println("");
				break;
			default:
				System.out.println("_________________________");
				System.out.println("OPÇÃO INVÁLIDA, POR FAVOR JOGUE NOVAMENTE");
				System.out.println("");
				break;	
			}
			
		System.out.println("===========================");
		
			Random computador = new Random();
			
		int aleatorio = computador.nextInt(3) +1 ;
		
		switch (aleatorio) {
		case 1:
			pedra();
			break;
		case 2:
			papel();
			break;
		case 3:
			tesoura();
			break;
		}
		
			if (opcao == aleatorio) {
				System.out.println("EMPATE");
			} else if (opcao == 1 && aleatorio == 2) {
				System.out.println("");
				System.out.println("VOCÊ PERDEU ESSA RODADA");
				System.out.println("");
				computadorganha ++;
			} else if (opcao == 2 && aleatorio == 1) {
				System.out.println("");
				System.out.println("VOCÊ VENCEU ESSA RODADA");
				System.out.println("");
				jogadorganha ++;
			} else if (opcao == 2 && aleatorio == 3) {
				System.out.println("");
				System.out.println("VOCÊ PERDEU ESSA RODADA");
				System.out.println("");
				computadorganha ++;
			} else if (opcao == 3 && aleatorio == 2) {
				System.out.println("");
				System.out.println("VOCÊ VENCEU ESSA RODADA");
				System.out.println("");
				jogadorganha ++;
			} else if (opcao == 1 && aleatorio == 3) {
				System.out.println("");
				System.out.println("VOCÊ VENCEU ESSA RODADA");
				System.out.println("");
				jogadorganha ++;
			} else if (opcao == 3 && aleatorio == 1) {
				System.out.println("");
				System.out.println("VOCÊ PERDEU ESSA RODADA");
				System.out.println("");
				computadorganha ++;
			} else {
				
			}
			
			
			System.out.print("Placar: ");
			System.out.println("Você está com " + jogadorganha + " e o oponente esta com " + computadorganha);
			
			if (jogadorganha == 3 && computadorganha < jogadorganha ) {
				System.out.println("___________________________");
				System.out.println(" Você venceu essa PARTIDA  ");
				System.out.println("___________________________");
				System.out.println("");
				jogadorganha = 0;
				computadorganha = 0;
			} else if (computadorganha == 3 && jogadorganha < computadorganha)  {
				System.out.println("__________________________");
				System.out.println(" Você perdeu essa PARTIDA ");
				System.out.println("__________________________");
				System.out.println("");
				jogadorganha = 0;
				computadorganha = 0;
			} else {
				
			}
			
				System.out.println("===========================");
				System.out.println("");
				System.out.print("Deseja jogar novamente? (S/N):");
				novamente = digitando.next().charAt(0);
				System.out.println("");
				System.out.println("===========================");
				} while (novamente == 's');
				
		
	} 
	
			static void pedra( ) {
				System.out.println("O oponente escolheu Pedra");
			}
	
			static void papel( ) {
				System.out.println("O oponente escolheu Papel");
			}
	
			static void tesoura( ) {
				System.out.println("O oponente escolheu Tesoura");
			}

}
