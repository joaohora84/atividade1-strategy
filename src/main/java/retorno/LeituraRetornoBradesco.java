package retorno;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LeituraRetornoBradesco implements LeituraRetorno{

	@Override
	public List<Boleto> lerArquivo(String nomeArquivo) {
		
		List<Boleto> boletos = new ArrayList();
		
		try {
			
			BufferedReader br = Files.newBufferedReader(Paths.get(nomeArquivo));
			
			String linha;
			String divisor = ";";
			
			while ((linha = br.readLine()) != null) {
				
				String[] campo = linha.split(divisor);
				
				Boleto boleto = new Boleto();
				
				boleto.setId(Integer.parseInt(campo[0]));
				boleto.setCodBanco(campo[1]);
				boleto.setDataVencimento(LocalDate.parse(campo[4], dataFormatada));
				boleto.setDataPagamento(LocalDate.parse(campo[5], dataFormatada).atTime(0, 0, 0));
				boleto.setCpfCliente(campo[6]);
				boleto.setValor(Double.parseDouble(campo[7]));
				boleto.setMulta(Double.parseDouble(campo[8]));
				boleto.setJuros(Double.parseDouble(campo[9]));
				boleto.setAgencia(campo[2]);
				boleto.setContaBancaria(campo[3]);
				
				boletos.add(boleto);
				
			}
			
			return boletos;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	

	

	
	
	
	
	/*
	 * 
	 * 
	 * */
	

}
