package br.com.java;

public class ArrayMultimensional {

	public static void main(String[] args) {
	// a linha abaixo cria um array multimensional (matriz)
		double [][] boletim = {{8,7,9,3}, {4,5,8,6}};
	//recuperando a nota de português do 3º bimestre
		System.out.println("Média de português 3o bimestre: " + boletim[1][2]);

	}

}
