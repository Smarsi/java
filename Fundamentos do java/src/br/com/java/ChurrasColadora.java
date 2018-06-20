/**
 * Atividade de avaliação - Churrascoladora
 * @author Richard Smarsi, Diogo Diniz, Luis Freitas
 */



package br.com.java;

import java.util.Scanner;

public class ChurrasColadora {

	public static void main(String[] args) {
		short nmrhomem, nmrmulher, nmrcrianca;
		double carvao, carne, frango, linguica, cerveja, refri;
		double totalcarne, totalfrango, totallinguica, totalcarvao, totalcerveja, totalrefri, totaltotal;
		double precarne, prefrango, prelinguica, precarvao, precerveja, prerefri;
		double carvaodocao, totalpessoa,carvaum;
		
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.println("##### Churrascoladora 2000 #####");
		System.out.print("Digite quantidade de homens: ");
		nmrhomem = teclado.nextShort();
		System.out.print("Quantidade de mulheres: ");
		nmrmulher = teclado.nextShort();
		System.out.print("Quantidade de crianças: ");
		nmrcrianca = teclado.nextShort();
		System.out.print("Preço médio do Kg da carne: ");
		carne = teclado.nextDouble();
		System.out.print("Digite o preço da linguiça: ");
		linguica = teclado.nextDouble();
		System.out.print("Digite o preço do frango: ");
		frango = teclado.nextDouble();
		System.out.print("Preço médio da lata de cerveja: ");
		cerveja = teclado.nextDouble();
		System.out.print("Preço médio da lata de refri: ");
		refri = teclado.nextDouble();
		System.out.print("Digite o preço do pacote de carvão: ");
		carvao = teclado.nextDouble();
		
		//processamento de quantidade
		
		totalcarne = (nmrhomem * 0.2)  + (nmrmulher * 0.2) + (nmrcrianca * 0.06);
		totalfrango = (nmrhomem * 0.05) + (nmrmulher * 0.05) + (nmrcrianca * 0.015 / 100);
		totallinguica = (nmrhomem * 0.05) + (nmrmulher * 0.05) + (nmrcrianca * 0.015 / 100);
		totalcerveja = (nmrhomem * 12) + (nmrmulher * 4);
		totalrefri = (nmrmulher * 2) + (nmrcrianca * 2 );
		totaltotal = (totalcarne + totalfrango + totallinguica);
		totalcarvao = 5;
		carvaodocao = (totaltotal) * 4;
		carvaum = 4;
		
		
		if (totaltotal <= 3) {
			carvaum = 4;
			
			totalcarvao = 5;
		} else {
			;
		}
		
		//processamento de preço
		
		precarne = (totalcarne * carne);
		prefrango = (totalfrango * frango);
		prelinguica = (totallinguica * linguica);
		precerveja = (totalcerveja * cerveja);
		prerefri = (totalrefri * refri);
		totalpessoa = (precarne + prefrango + prerefri + prelinguica + precerveja);
		
		
		//saída
		System.out.println("");
		System.out.println("##################");
		System.out.println("Lista de compras");
		//exibir quantidade e preço
		System.out.println("Quantidade total de carne: " + totalcarne + " KG -- R$ " + precarne );
		System.out.println("Quantidade total de frango: " + totalfrango + " KG -- R$ " + prefrango);
		System.out.println("Quantidade total de Linguiça: " + totallinguica + " KG -- R$ " + prelinguica);
		System.out.println("Quantidade total de Cerveja: " + totalcerveja + " Latas -- R$ " + precerveja);
		System.out.println("Quantidade total de Latas de Refrigerante: " + totalrefri + " Latas -- R$ " + prerefri);
		System.out.println("Kilos de Carvao: " + carvaum + " KG -- R$ " + carvao * carvaodocao);
		
		System.out.println("___________________________________________________________________________________");
		System.out.println("");
		System.out.println("Valor por pessoa: " + (totalpessoa) / (nmrhomem + nmrmulher));
		
		

		
		
	}

}