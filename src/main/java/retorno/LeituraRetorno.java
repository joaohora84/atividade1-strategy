package retorno;


import java.time.format.DateTimeFormatter;
import java.util.List;

public interface LeituraRetorno {
	
	DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DateTimeFormatter dataHoraFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	List<Boleto> lerArquivo(String arquivo);

}
