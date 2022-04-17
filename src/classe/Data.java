package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {
		this.dia = 1;
		this.mes = 1;
		this.mes = 1970;
	}

	Data(int diaInicial, int mesInicial, int anoInicial) {
		this.dia = diaInicial;
		this.mes = mesInicial;
		this.ano = anoInicial;
	}

	String ObterDataFormatada() {
		return String.format("Data: %d/%d/%d", dia, mes, ano);
	}

	void imprimirDataFormata() {
		System.out.println(ObterDataFormatada());
	}
}
