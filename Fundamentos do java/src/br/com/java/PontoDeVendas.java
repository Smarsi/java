package br.com.java;

import java.util.Scanner;

public class PontoDeVendas {

	public static void main(String[] args) {
		double  total, desconto,totalDesconto, ValorPago, troco;
		Scanner teclado = new Scanner(System.in);
		System.out.println("================");
		System.out.println("||||||PDV||||||||");
		System.out.println("========-=========");
		System.out.println("Total: ");
	    total = teclado.nextDouble();
		System.out.print("% desconto: ");
		desconto = teclado.nextDouble();
		totalDesconto = total - ((total * desconto) / 100);
		System.out.println("Total com desconto: " + totalDesconto);
		System.out.println("___________________________");
		System.out.println("valor pago: ");
		ValorPago = teclado.nextDouble();
		troco = ValorPago - totalDesconto;
		System.out.println("Troco :" + troco);
	} 
	
}