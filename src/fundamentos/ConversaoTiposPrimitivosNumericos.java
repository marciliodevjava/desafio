package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; // aqui temos um numero inteiro convertendo ele para double 1.0
		System.out.println("Double: " + a);
		
		float b = (float) 1.0;// cast
		System.out.println("Float: " + b);
		
		int c = 4;
		byte d = (byte)c;
		System.out.println("Int: " + c);
		System.out.println("Byte: " + d);
	}
}
