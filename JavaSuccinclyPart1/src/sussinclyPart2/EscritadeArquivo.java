package sussinclyPart2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscritadeArquivo {

	public String nome;

	public void NomeDoArquivo(String nome) throws FileNotFoundException {

		assert nome instanceof String:"Coloque uma string por favor";
		
		this.nome = nome;
		File file = new File(this.nome);
		PrintWriter printWriter = new PrintWriter(file);
		printWriter.println("Este � um exemplo de texto para o arquivo" + nome);
		printWriter.close();
	}

}
