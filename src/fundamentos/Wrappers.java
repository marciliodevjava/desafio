package fundamentos;

import java.util.Scanner;

public class Wrappers {
	/*
	 * / Wrapper são os metodos primitivos ou metodo "."
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número Byte: ");
		Byte b = Byte.parseByte(entrada.next());
		System.out.println("Digite um número ate Short: ");
		Short s = Short.parseShort(entrada.next());
		System.out.println("Digite um número Int");
		Integer i = Integer.parseInt(entrada.next()); // int
		System.out.println("Digite um número Long");
		Long l = Long.parseLong(entrada.next());
		System.out.println("Digite um número Float: ");
		Float f = Float.parseFloat(entrada.next());
		System.out.println("Digite um número Double: ");
		Double d = Double.parseDouble(entrada.next());

		System.out.printf("Número Byte: " + b.byteValue());
		System.out.printf("\nNúmero Short: " + s.shortValue());
		System.out.printf("\nNúmero Int: " + i.intValue());
		System.out.printf("\nNúmero Long: " + l.longValue());
		System.out.printf("\nNúmero Float: " + f.floatValue());
		System.out.printf("\nNúmero Double: " + d.doubleValue());

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println("\nBooelean: " + bo);
		System.out.println(bo.toString().toUpperCase());

		Character c = '#'; // char
		System.out.println("Char: " + c.charValue());

		entrada.close();
	}
}
