package fundamentos;

public class Inferencia {

	public static void main(String[] args) {

		double a = 4.5;
		System.out.println(a);

		// Inferencia e quando o java ele denomina a váriavel.
		// Inferencia tipo Double
		var b = 4.5;
		System.out.println(b);

		// Inferencia tipo String
		var c = "Texto";
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);

		double d; // varável foi declarada
		d = 123.65; // variável foi inicializada
		System.out.println(d); // usada!

	}
}
