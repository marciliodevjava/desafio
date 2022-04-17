package exercicios;

public class DesafiosAritmeticosAula43 {

	public static void main(String[] args) {

		double numA = Math.pow(6 * (3 + 2), 2);
		double numAA = 3 * 2;
		double numAAA = numA / numAA;

		double numB = Math.pow((1 - 5) * (2 - 7), 2);
		double numBB = 2;
		double numBBBB = numB / numBB;
		double numBBBBB = numBBBB / 2;

		System.out.println("Primeira equação: " + numAAA);
		System.out.println("Segunda equação: " + numBBBBB);

		double numAB = 150 - 100;
		double numABB = Math.pow(numAB, 3);
		double numC = 10;
		double numAABB = Math.pow(numC, 3);
		double resultado = numABB / numAABB;
		
		System.out.println("Terceira equação: " + numAB);
		System.out.println("Resultado: " + resultado);
	}
}
