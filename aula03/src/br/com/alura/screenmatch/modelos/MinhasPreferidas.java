package br.com.alura.screenmatch.modelos;

import br.com.minhasMusicas.Audio;

public class MinhasPreferidas {
	public void incluid(Audio audio) {
		if (audio.getClassificacao() >= 9) {
			System.out.println(audio.getTitulo() + " � considerado sucesso absoluto e preferido por todes!");
		} else {
			System.out.println(audio.getTitulo() + " tamb�m � um dos que todo munda est� curtindo");
		}
	}
}
