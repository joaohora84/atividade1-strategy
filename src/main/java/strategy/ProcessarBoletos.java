package strategy;

import java.util.List;

import model.Boleto;

public class ProcessarBoletos {

	private LeituraRetorno lr;

	public ProcessarBoletos(LeituraRetorno lr) {
		this.lr = lr;
	}

	public final void processar(String nomeArquivo) {

		List<Boleto> boletos = lr.lerArquivo(nomeArquivo);

		for (Boleto boleto : boletos) {

			System.out.print(boleto);

		}

	}

	public LeituraRetorno getLr() {
		return lr;
	}

	public void setLr(LeituraRetorno lr) {
		this.lr = lr;
	}

}
