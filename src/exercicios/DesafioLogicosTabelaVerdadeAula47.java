package exercicios;

public class DesafioLogicosTabelaVerdadeAula47 {

	public static void main(String[] args) {
		// Trabalho na terça-feira
		// Trabalho na quinta-feira

		boolean trabalho1 = true;
		boolean trabalho2 = true;

		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorverte = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorverte;
		boolean maisSaudavel2 = !!comprouSorverte;

		System.out.println("\"Comprou TV de 50\"? " + comprouTv50);
		System.out.println("\"Comprou TV de 50\"? " + comprouTv32);
		System.out.println("\"Comprou sorvete\"? " + comprouSorverte);
		System.out.println("\"Mais saudável\"? " + maisSaudavel);// operador unário
		System.out.println("\"Mais saudável\"?" + maisSaudavel2);// operador unário
	}
}
