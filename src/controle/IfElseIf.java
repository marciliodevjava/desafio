package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a nota: ");
		String not = entrada.nextLine();
		Double nota = Double.parseDouble(not);

		if (nota > 10 || nota < 0) {
			System.out.println("Nota invalida");
		} else if (nota >= 9.9 && nota <= 10.0) {
			System.out.println("Conceito A+: " + nota);
			System.out.println("Aprovado!");
		} else if (nota >= 9.1 && nota < 9.9) {
			System.out.println("Conceito B+: " + nota);
			System.out.println("Aprovado!");
		} else if (nota >= 8.1 && nota < 9.1) {
			System.out.println("Conceito C+: " + nota);
			System.out.println("Aprovado!");
		} else if (nota >= 7.0 && nota < 8.1) {
			System.out.println("Conceito D+: " + nota);
			System.out.println("Aprovado!");
		} else if (nota >= 6.1 && nota < 7.0) {
			System.out.println("Conceito A-: " + nota);
			System.out.println("Recupera!");
		} else if (nota >= 5.1 && nota < 6.1) {
			System.out.println("Conceito B-: " + nota);
			System.out.println("Recupera!");
		} else if (nota >= 4.1 && nota <= 5.1) {
			System.out.println("Conceito C-: " + nota);
			System.out.println("Recupera!");
		} else if (nota < 4.1) {
			System.out.println("Conceito D-: " + nota);
			System.out.println("Reprovado!");
		}

		entrada.close();
	}
}