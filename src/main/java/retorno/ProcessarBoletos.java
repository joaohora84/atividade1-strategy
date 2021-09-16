package retorno;


import java.util.List;

public class ProcessarBoletos {

	private LeituraRetorno lr;

	public ProcessarBoletos(LeituraRetorno lr) {
		this.lr = lr;
	}

	public final void processar(String nomeArquivo) {

		List<Boleto> boletos = lr.lerArquivo(nomeArquivo);
		

		for (Boleto boleto : boletos) {
			
			if (boleto.getCodBanco().equals("001")) {
				
				System.out.println();
				System.out.println("********** Banco do Brasil **********");
				System.out.println();
				System.out.println(boleto);
				
			} else {
				
				System.out.println();
				System.out.println("********** Bradesco **********");
				System.out.println();
				System.out.println(boleto);
				
			}

		}

	}

	public LeituraRetorno getLr() {
		return lr;
	}

	public void setLr(LeituraRetorno lr) {
		this.lr = lr;
	}

}
