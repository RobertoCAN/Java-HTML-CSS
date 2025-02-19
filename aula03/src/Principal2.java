import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        lista.forEach(System.out::println);
//       lista.forEach(nome -> System.out.println(nome));
//       
        for (Titulo item: lista){
         System.out.println(item.getNome());
         if (item instanceof Filme filme && filme.getClassificacao() > 2) {
			
		}
////         Filme filme = (Filme) item;
////         System.out.println("Classificação" + filme.getClassificacao());
	}
        
        ArrayList<String> buscaPorArtista = new ArrayList<String>();
        buscaPorArtista.add("Adam Sander");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jackeline");
        buscaPorArtista.add("Roberto Caetano");
        
        System.out.println(buscaPorArtista);
        
        Collections.sort(buscaPorArtista);
        
        System.out.println("Ordenados: ");
        System.out.println(buscaPorArtista);
	
        
        
        System.out.println("Lista de titulos ordenados.");
        Collections.sort(lista);
        System.out.println(lista);
        
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
	}
}
