package sussinclyPart2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ArquivoDeTextoEnumeros {

		public ArquivoDeTextoEnumeros() {
			
			File file = new File("texto5.txt");
			try {
				PrintWriter out = new PrintWriter(file);
				
				out.println("Seja bom,se voc� n�o poder ser bom, seja sortudo!\n\t - Roberto Caetano");
				out.println(129);
				out.println(2.7183f);
				out.println(true);
				out.println(1.618034);
				out.close();
				
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				System.out.println("Arquivo n�o encontrado: " + e.getMessage());
			}
			
		}
}
