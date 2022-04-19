package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {

		Integer num1 = 10000;
		System.out.println(num1.toString().length());// length está presente somente na string

		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());// convertendo um int para integer

		System.out.println(("" + num2).length());// convertendo um int para string
	}
}
