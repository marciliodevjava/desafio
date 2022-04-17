package exercicios;

public class Temperatura {

	public static void main(String[] args) {
		//Caucula uma temperatura em graus Ceusos (°F -32) X 5 / 9 = ° C
		
		
		final int ajuste = 32;
		final double fator = 5.0/9.0;
		
		int fahrenheit = 86;
		double celsius = (fahrenheit - ajuste) * fator;
		System.out.println("Tempera em Celsius: " + celsius + "°C.");
		
		fahrenheit = 150;
		celsius = (fahrenheit - ajuste) * fator;
		System.out.println("Tempera em Celsius: " + celsius + "°C.");
	}
}
