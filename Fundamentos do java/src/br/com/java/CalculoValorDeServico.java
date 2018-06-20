package br.com.java;

import java.util.Scanner;

public class CalculoValorDeServico {

	public static void main(String[] args) {
		double remuneracao, custo, horas, servico, estimativa, total;
		Scanner teclado = new Scanner(System.in);
		
	System.out.println("_______Calculadora de serviço_______");
	System.out.print("Remuneração Mensal: ");
	remuneracao = teclado.nextDouble();
	System.out.print("Custo operacional mensal: ");
	custo = teclado.nextDouble();
	System.out.print("Carga horária mensal de trabalho: ");
	horas = teclado.nextDouble();
	servico = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / horas;
	System.out.println("Valor da hora de serviço : " + servico);
	System.out.print("Estimativa de horas deste serviço: ");
	estimativa = teclado.nextDouble();
	total = estimativa * servico;
	System.out.print("Valor a ser cobrado deste cliente: " + total);
	}

}
