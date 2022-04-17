package controle;

public class DesafioForAula77 {

	public static void main(String[] args) {

		String valor1 = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor1);
			valor1 += "#";
		}
		String valor = "#";
		for (String i = "#"; !i.equals("######"); i += "#") {
			System.out.println(valor);
			valor += "#";
		}
	}
}
