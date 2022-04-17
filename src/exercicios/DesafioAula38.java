package exercicios;

import java.util.Scanner;
/**
 * 
 * @author m-arc
 * Capturando os salarios e somando os mesmo
 */
public class DesafioAula38 {
//Vamos informar 3 salarios e depois converter para Wrapper e mostra com a média
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Me informe os seus últimos 3 salários.");
		System.out.println("1 Salário:");
		String salario1 = entrada.nextLine().replace(".", "").replace(",", ".");
		System.out.println("2 Salário:");
		String salario2 = entrada.nextLine().replace(".", "").replace(",", ".");
		System.out.println("3 Salário:");
		String salario3 = entrada.nextLine().replace(".", "").replace(",", ".");
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);		
		double mediaSalario = (s1 + s2 + s3) / 2;
		
		System.out.printf("1° Salário: %.2f", s1);
		System.out.printf("\n2° Salário: %.2f", s2);
		System.out.printf("\n3° Salário: %.2f", s3);
		System.out.printf("\nMedia do seu salário: %.2f", mediaSalario);
		
		entrada.close();
	}
}
