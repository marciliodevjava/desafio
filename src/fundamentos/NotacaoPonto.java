package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		String s = "Bom dia X";// Tipo String = Texto entre "" aspas duplas
		s = s.toUpperCase(); // metodo que converte em letra MAIUSCULA /Ela não altera o valor atual.
								// /Alteramos o valor atual

		System.out.println(s);

		s = s.replace("X", "Senhora");// metodo substitui uma letra
		System.out.println(s);

		s = s.concat("!!!!");// metodo que concatena com a frase
		System.out.println(s);

		String x = "Marcilio".toUpperCase().concat("!!!");
		System.out.println(x);

		String y = "Bom dia X".replace("X", "Gui").concat("!!!");
		System.out.println(y);

		y = y.toUpperCase();
		System.out.println(y);

		// Tipos primitivos não tem o operado "."

		int a = 3;
		System.out.println(a);

	}
}
