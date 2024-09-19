import java.util.ArrayList;

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
//        for (Titulo item: lista){
//         System.out.println(item.getNome());
////         Filme filme = (Filme) item;
////         System.out.println("Classificação" + filme.getClassificacao());
//	}
	}
}
