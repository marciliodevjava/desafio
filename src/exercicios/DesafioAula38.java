package exercicios;

import java.util.Scanner;
/**
 * 
 * @author m-arc
 * Capturando os salarios e somando os mesmo
 */
public class DesafioAula38 {
//Vamos informar 3 salarios e depois converter para Wrapper e mostra com a m�dia
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Me informe os seus �ltimos 3 sal�rios.");
		System.out.println("1 Sal�rio:");
		String salario1 = entrada.nextLine().replace(".", "").replace(",", ".");
		System.out.println("2 Sal�rio:");
		String salario2 = entrada.nextLine().replace(".", "").replace(",", ".");
		System.out.println("3 Sal�rio:");
		String salario3 = entrada.nextLine().replace(".", "").replace(",", ".");
		
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);		
		double mediaSalario = (s1 + s2 + s3) / 2;
		
		System.out.printf("1� Sal�rio: %.2f", s1);
		System.out.printf("\n2� Sal�rio: %.2f", s2);
		System.out.printf("\n3� Sal�rio: %.2f", s3);
		System.out.printf("\nMedia do seu sal�rio: %.2f", mediaSalario);
		
		entrada.close();
	}
}
