package fundamentos.operadores;

import javax.swing.JOptionPane;

public class Ternario {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		String nota = JOptionPane.showInputDialog("Senhor(a) " + nome + " Digite sua nota");
		double media = Double.parseDouble(nota);
		String resultado = media >= 7 ? "Aprovado" : "Reprovado"; // Operador Ternario ">=" "?" ":" 
		boolean a = resultado == "Aprovado";

		if (a == true) {
			System.out.println("Parabéns " + nome);
			System.out.println("Você está : " + resultado);
			System.out.println("Sua média é :" + media);
		} else {
			resultado = media >= 5 ? "Em Recuperação" : "Reprovado";
			System.out.println("Senhor(a) " + nome);
			System.out.println("Você está :" + resultado);
			System.out.println("Sua média é : " + media);
		}
	}
}