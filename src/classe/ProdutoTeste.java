package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.89);
		double precoFinal1 = p1.precoComDesconto();

		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		Produto.desconto = 0.50;
		double precoFinal2 = p2.precoComDesconto(0.1);// Com o desconto do Gerente

		System.out.printf("Nome: %s\n", p1.nome);
		System.out.printf("Prço: %.2f\n", p1.preco);
		System.out.printf("Desconto: %.2f\n", p1.precoComDesconto());
		System.out.printf("Preço Final: R$%.2f\n", precoFinal1);

		System.out.printf("Nome: %s\n", p2.nome);
		System.out.printf("Prço: %.2f\n", p2.preco);
		System.out.printf("Desconto: %.2f\n", p2.precoComDesconto());
		System.out.printf("Preço Final: R$%.2f\n", precoFinal2);
	}
}
