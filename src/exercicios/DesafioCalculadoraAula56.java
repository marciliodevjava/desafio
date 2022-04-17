package exercicios;

import java.util.Scanner;

public class DesafioCalculadoraAula56 {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva um numero: ");
		String numero1 = entrada.next();
		System.out.println("Escreva outro numero:");
		String numero2 = entrada.next();
		System.out.println("Qual o tipo de operação você deseja fazer? +, -, *, /");
		String sinal = entrada.next();
		String s1 = "+";
		String s2 = "-";
		String s3 = "*";
		String s4 = "/";
		double num1 = Double.parseDouble(numero1);
		double num2 = Double.parseDouble(numero2);
		
		if (sinal.equals(s1)) {
			double calculo = num1 + num2;
			System.out.println("Resultado: " + num1 + " + " + num2 + " = " + calculo);
		}
		if (sinal.equals(s2)) {
			double calculo = num1 - num2;
			System.out.println("Resultado: " + num1 + " - " + num2 + " = " + calculo);
		}
		if (sinal.equals(s3)) {
			double calculo = num1 * num2;
			System.out.println("Resultado: " + num1 + " x " + num2 + " = " + calculo);
		}
		if (sinal.equals(s4)) {
			double calculo = num1 / num2;
			System.out.println("Resultado: " + num1 + " / " + num2 + " = " + calculo);
		}
		entrada.close();
	}
}
