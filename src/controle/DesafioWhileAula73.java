package controle;

import java.util.Scanner;

public class DesafioWhileAula73 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a quatidade de Alunos");

		int quatidadeDeNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.print("Informe a nota (ou -1 para sair): ");
			String not = entrada.nextLine().replace(",", ".");
			nota = Double.parseDouble(not);

			if (nota <= 10 && nota >= 0) {
				total += nota;
				quatidadeDeNotas++;
			} else if (nota != -1) {
				System.out.println("Nota invalida!!!");
			}

		}
		// Calcular a média

		double media = total / quatidadeDeNotas;
		System.out.printf("Média = %.2f", media);
		entrada.close();
	}
}
