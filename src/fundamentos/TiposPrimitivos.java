package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do funcionário

		// Tipos número inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 2_147_399_999L;// "_" é = a "."

		// Tipos numéricos reais
		float salario = 11_445.44F;// "_" é = a "."
		double vendasAcumuladas = 2_991_797_103.01;// "_" é = a "."

		// Tipo booleano false ou true
		boolean estaDeFerias = false;

		// tipos caracteres char aceit somente 1 número
		char status = 'A';

		// Dias de empresa
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365 + " dias.");
		// Número de viagens
		System.out.println("Realizou: " + numeroDeVoos / 2 + " voos");
		// Pontos por real
		System.out.println("Para cada real você ganhou: " + pontosAcumulados / vendasAcumuladas + " pontos.");
		// id ganha de salario
		System.out.println("Funcionário id: " + id + " ganha R$ " + salario);
		// está de ferias
		System.out.println("Funcionario está de férias: " + estaDeFerias);
		// Status
		System.out.println("Status: " + status);

	}
}
