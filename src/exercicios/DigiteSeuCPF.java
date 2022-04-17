package exercicios;

import java.util.Scanner;

public class DigiteSeuCPF {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine().trim();
		System.out.println("Digite seu cpf:");
		String cpf = entrada.nextLine().replace(".", "").replace("-", "");
		System.out.println("Seu nome: " + nome);
		System.out.println("Seu CPF: " + cpf.trim());
		entrada.close();
	}
}
