package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {

		int a = 97;
		int b = 'a';// tabela unicode 97

		System.out.println(a == b); // 97
		System.out.println('\u0061'); // 97

		System.out.println(a == b); // igual/igual
		System.out.println(3 > 4); // maior
		System.out.println(3 >= 3); // mair igual
		System.out.println(3 < 7); // menor
		System.out.println(30 <= 7); // menor igual
		System.out.println(30 != 7); // diferente

		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;

		System.out.println("Tem desconto" + temDesconto);
	}
}
