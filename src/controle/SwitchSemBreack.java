package controle;

import java.util.Scanner;

public class SwitchSemBreack {

	public static void main(String[] args) {

		// if() = booleana
		// while() = booleana

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a sua Faixa do Karater");
		String faixa = entrada.nextLine().trim();

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
			break;
		case "marron":
			System.out.println("Sei o Tekki Shodan");
			break;
		case "roxa":
			System.out.println("Sei o Heian Godan");
			break;
		case "verde":
			System.out.println("Sei o Heian Yodan");
			break;
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
			break;
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		case "branca":
			System.out.println("Não sei de nada.");
			break;
		}

		int idade = 3;
		switch (idade) {
		case 3:
			System.out.println("Sabe falar");
		case 2:
			System.out.println("Sabe andar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe de nada");
		}

		entrada.close();
	}
}
