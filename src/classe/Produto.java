package classe;

public class Produto {

	String nome;// paramentro nome;
	double preco;// paramentro preço.
	static double desconto = 0.25;// paramentro desconto.

	Produto() {

	}

	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	// metodo preco com desconto.
	double precoComDesconto() {
		return this.preco * (1 - desconto);
	}

	// metodo preco com desconto. + desconto do gerente
	double precoComDesconto(double descontoDoGerente) {
		return this.preco * (1 - (desconto + descontoDoGerente));
	}

}
