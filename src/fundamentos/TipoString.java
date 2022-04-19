package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		// metodo para saber se a palavra inica com a palavra "Boa" devolve um booleano
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		// metodo .toLowerCase serve para formata em letras minusculas a frase
		System.out.println(s.toLowerCase().startsWith("boa"));
		// metodo para saber o tamanho do testo
		System.out.println(s.length());
		// metodo que verifica se termina com texto com a palavra solicitada
		System.out.println(s.endsWith("boa"));
		// metodo que verifica a comparação de igualdade.
		System.out.println(s.equals("boa tarde"));
		// metodo que verifica a comparação de igual, porém ignora se a letra é
		// maiuscula ou minuscula.
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		// metodo para pular a linha \n
		System.out
				.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario);
		// metodo para substituir o + na string =
		System.out.println("Nome: " + nome);
		// metodo que verifica se tem a palavra "qual"
		System.out.println("Frase qualquer".contains("qual"));
		// metodo que verifica o indice a parti da palavra informada "qual"
		System.out.println("Frase qualquer".indexOf("qual"));
		// metodo que começa a frase pelo o indice informado
		System.out.println("Frase qualquer".substring(6));
		// metodo que começa a frase pelo indice informado e termina pelo indice
		// informado
		System.out.println("Frase qualquer".substring(6, 8));

	}
}
