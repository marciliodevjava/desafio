package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		System.out.print("Bom");
		System.out.print(" dia!\n");
		System.out.println("Bom");
		System.out.println("dia!");

		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salario: R$%.2f%n", 1200.23498);
		System.out.printf("Nome: %s %n", "João");

		// metodo para receber uma entrada no console "System.in" para saida
		// "System.out"
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine(); // armazena a informação na variavel String no console
		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt(); // armazena a informação da variavel Int no console
		System.out.println("Digite a seu e-mail: ");
		String email = entrada.next();// armazena a informação da proxima String no console

		System.out.printf("Muito prazer senhor(a) %s segue seus dados.%n", nome.substring(0, 8));
		System.out.printf("Nome: %s", nome);
		System.out.printf("\nIdade: %d", idade);
		System.out.printf("\nE-mail: %s", email);

		entrada.close();// fechamento do Scanner

	}
}
