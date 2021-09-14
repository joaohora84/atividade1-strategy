package strategy;

public class Principal {

	public static void main(String[] args) {
		
		
		final ProcessarBoletos processarBradesco = new ProcessarBoletos(new LeituraRetornoBradesco());
		
		//final ProcessarBoletos processarBrasil = new ProcessarBoletos(new LeituraRetornoBancoBrasil());
		
		String arquivo = Principal.class.getResource("bradesco-1.csv").getPath();
		
		processarBradesco.processar(arquivo);
		
		

	}

}
