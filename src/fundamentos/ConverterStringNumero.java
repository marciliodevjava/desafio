package fundamentos;

import javax.swing.JOptionPane;

public class ConverterStringNumero {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero:");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo numero:");
		
		double d1 = Double.parseDouble(valor1);
		double d2 = Double.parseDouble(valor2);
		
		System.out.println(d1 + d2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double soma = numero1 + numero2;
		
		System.out.printf("\nSoma é : %.2f", soma);
		System.out.printf("\nMédia da soma: %.2f", soma /2);
	}
}
