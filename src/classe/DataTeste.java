package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data data1 = new Data(1, 11, 1994);
		data1.dia = 1;
		data1.mes = 11;
		data1.ano = 1994;

		// utilizando inferencia
		var data2 = new Data();
		data2.dia = 2;
		data2.mes = 9;
		data2.ano = 1996;

		Data data3 = new Data();

		System.out.println(data1.ObterDataFormatada());
		System.out.println(data2.ObterDataFormatada());
		System.out.println(data3.ObterDataFormatada());// Construtor Default
//
//		data1.imprimirDataFormata();
//		data2.imprimirDataFormata();
	}
}
