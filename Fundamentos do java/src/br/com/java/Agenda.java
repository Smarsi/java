package br.com.java;

public class Agenda {

	public static void main(String[] args) {

		String[][] contato = { { "Bill Gates", "1111-1111", "bill@outlook.com" },
				{ "Linuns Torvalds", " 2222-2222 ", "linus@gmail.com" },
				{ "Steve Jobs", "3333-3333", "steve@icloud.com" } };

		// System.out.println("Recuperando o e-mail do linus :" + contato[1][2]);

		// contato[0][1] = "9999-9999" ;

		// System.out.println("Novo telefone do Bill Gates: " + contato [0][1]);

		for (int i = 0; i < contato.length; i++) {
			System.out.println("_______________________________________________");
			for (int j = 0; j < contato.length; j++) {
				System.out.println(contato[i][j]);
			}
		}

	}

}
