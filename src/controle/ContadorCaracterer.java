package controle;

public class ContadorCaracterer {
	public static void main(String[] args) {
		String i = "#";
		for (; !i.equalsIgnoreCase("#####"); i += "#") {
			System.out.println(i);
		}
	}
}