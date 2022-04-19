package fundamentos.operadores;

public class LogicosTabelaVerdade {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;

		System.out.println(condicao1 && condicao2); // && = E VERDADEIRO
		System.out.println(condicao1 || condicao2); // || = OU VERDADEIRO
		System.out.println(condicao1 ^ condicao2); // ^ = VERDADEIRO OU ExclusivO
		System.out.println(!condicao1); // ! = NEGACAO = VERDADEIRO
		System.out.println(!!condicao1);// !! = DUPLA NEGAÇAO = VERDADEIRO

		System.out.println("TABELA VERDADE E (AND)");
		System.out.println(true && true);// Verdadeiro
		System.out.println(true && false);// Falso
		System.out.println(false && true);// Falso
		System.out.println(false && false);// Falso

		System.out.println("TABELA VERDADE OU (OR)");
		System.out.println(true || true); // Verdadeiro
		System.out.println(true || false);// Verdadeiro
		System.out.println(false || true);// Verdadeiro
		System.out.println(false || false);// Falso

		System.out.println("TABELA VERDADE OU EXCLUSIVO (XOR)");
		System.out.println(true ^ true);// Falso
		System.out.println(true ^ false);// Verdadeiro
		System.out.println(false ^ true);// Verdadeiro
		System.out.println(false ^ false);// Falso

		System.out.println("TABELA VERDADE NEGAÇÃO");
		System.out.println(!true); // Falso
		System.out.println(!false);// Verdadeiro

		System.out.println("TABELA VERDADE DUPLA NEGAÇÃO ");
		System.out.println(!!true);// Falso
		System.out.println(!!false);// Verdadeiro
	}

}
