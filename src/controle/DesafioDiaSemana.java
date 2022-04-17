package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		// domingo -> 1, 8, 15, 22, 29
		// Segunda-feira -> 2, 9, 16, 23, 30
		// Terça-feira -> 3, 10, 17, 24, 31
		// Quarta-feira -> 4, 11, 18, 25
		// Quinta-feira -> 5, 12, 19, 26
		// Sexta-feira -> 6, 13, 20, 27
		// Sabado -> 7, 14, 21, 28

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia do mês");
		String dia = entrada.nextLine().trim();
		int diaSemana = Integer.parseInt(dia);

		if (diaSemana == 1 || diaSemana == 8 || diaSemana == 15 || diaSemana == 22 || diaSemana == 29) {
			System.out.println("O dia " + diaSemana + " é Domigo!");
		} else if (diaSemana == 2 || diaSemana == 9 || diaSemana == 16 || diaSemana == 23 || diaSemana == 30) {
			System.out.println("O dia " + diaSemana + " é Segunda-feira!");
		} else if (diaSemana == 3 || diaSemana == 10 || diaSemana == 17 || diaSemana == 24 || diaSemana == 31) {
			System.out.println("O dia " + diaSemana + " é Terça-feira!");
		} else if (diaSemana == 4 || diaSemana == 11 || diaSemana == 18 || diaSemana == 25) {
			System.out.println("O dia " + diaSemana + " é Quarta-feira!");
		} else if (diaSemana == 5 || diaSemana == 12 || diaSemana == 19 || diaSemana == 26) {
			System.out.println("O dia " + diaSemana + " é Quinta-feira!");
		} else if (diaSemana == 6 || diaSemana == 13 || diaSemana == 20 || diaSemana == 27) {
			System.out.println("O dia " + diaSemana + " é Sexta-feira!");
		} else if (diaSemana == 7 || diaSemana == 14 || diaSemana == 21 || diaSemana == 28) {
			System.out.println("O dia " + diaSemana + " é Sábado");
		}
		
		entrada.close();
	}
}
