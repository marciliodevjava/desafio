package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;

		a++; // a = a + 1; Pós Fixada
		a--; // a = a - 1; Pós Fixada

		++b; // b = b - 2; Pre Fixada
		--b; // b = b + 2; Pre Fixada

		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio");
		System.out.println(++a == b--);// deu verdadeiro por conta da ordem de precedencia do ++a ex ++a == b
		// ele vai descarta o incremento
		
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
