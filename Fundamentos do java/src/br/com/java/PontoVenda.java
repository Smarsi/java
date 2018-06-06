package br.com.java;

import java.util.Scanner;

public class PontoVenda {

	public static void main(String[] args) {
		// PDV
		double total, desconto, valorFinal, pago, troco;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira o valor total da compra: ");
		total = teclado.nextDouble();
		System.out.print("Qual a porcentagem(%) de desconto: ");
		desconto = teclado.nextDouble();
			
			//processamento
			valorFinal = total - ((total*desconto)/100) ;
		
		System.out.println("Valor Total com desconto = " + valorFinal );
		System.out.println("---------------------------------------");
		System.out.println("");
		System.out.print("Insira o valor pago: ");
		pago = teclado.nextDouble();
			
			//processamento
			troco = pago - valorFinal;
		
			System.out.println("Troco = " + troco);
	}

}
