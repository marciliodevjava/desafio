package classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.1415;

	public AreaCirc(double raioInicial) {
		this.raio = raioInicial;
	}

	double area() {
		return PI * raio * raio; // this.pi * Math.pow(raio * 2);
	}

	static double area(double raio) {
		return PI * raio + raio;
	}
}
