package strategy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Boleto;

public class LeituraRetornoBradesco implements LeituraRetorno{

	
	public List<Boleto> lerArquivo(String nomeArquivo) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	/*
	 * String[] campo = linha.split(csvDivisor);
				
				Boleto boleto = new Boleto();
				boleto.setId(Integer.parseInt(campo[0]));
				boleto.setCodBanco(campo[1]);
				boleto.setDataVencimento(LocalDate.parse(campo[2], dataFormatada));
				boleto.setDataPagamento(LocalDate.parse(campo[3], dataFormatada).atTime(0, 0, 0));
				boleto.setCpfCliente(campo[4]);
				boleto.setValor(Double.parseDouble(campo[5]));
				boleto.setMulta(Double.parseDouble(campo[6]));
				boleto.setJuros(Double.parseDouble(campo[7]));
				boleto.setAgencia(campo[8]);
				boleto.setContaBancaria(campo[9]);
				
				boletos.add(boleto);
	 * 
	 * */
	

}
