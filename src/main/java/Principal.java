import retorno.LeituraRetornoBancoBrasil;
import retorno.LeituraRetornoBradesco;
import retorno.ProcessarBoletos;

public class Principal {

	public static void main(String[] args) {
		
		
		final ProcessarBoletos processarBradesco = new ProcessarBoletos(new LeituraRetornoBradesco());
		
		final ProcessarBoletos processarBrasil = new ProcessarBoletos(new LeituraRetornoBancoBrasil());
		
		String arquivoBrasil = "src/main/resources/banco-brasil-1.csv";
		
		String arquivoBradesco = "src/main/resources/bradesco-1.csv";
		
		processarBradesco.processar(arquivoBradesco);
		
		processarBrasil.processar(arquivoBrasil);
		

	}

}
