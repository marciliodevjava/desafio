package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// if(...) = true ou False {}
		// while(...) sentença; ou {}
		// for(....)1 incilização; 2 expressao; 3 decremento ou incremento; {}
		// do sentença; ou {....} while(...) termina com ;

		Scanner entrada = new Scanner(System.in);

		String texto = "";
		do {
			System.out.println("Você precisa falar as palavras mágicas");
			System.out.print("Quer sair: ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado! Você saiu");
		
		entrada.close();

	}
}
