package fundamentos.operadores;

public class AtribuicaoParoOuImpar {

	public static void main(String[] args) {

		int a = 3; // variável.
		int b = a; // atribuição.
		int c = a + b; // com 2 operandor.

		c += b; // c = c + b //Atribuição Aditiva.
		c -= a; // c = c -a //Atribuição subtrativa.
		c *= b; // c = c * b //Atribuição multiplicativa.
		c /= a; // c = c / a //Atribuição divisiva.
		c ++; // Operador unário de emcremento.
		c --; // Operador unário de decremento.

		System.out.println(c);

		c %= 2; // c = c % 2 Resultado 0 "par" ou 1 "ímpar" utiliza-se para para saber par ou ímpar.
				// Atribuição modulo.

		System.out.println(c);

	}
}
