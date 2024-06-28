package br.com.minhasMusicas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Musica musica = new Musica();
		musica.setTitulo("Rorever");
		musica.setCantor("Kiss");

		for (int i = 0; i < 1000; i++) {
			musica.reproduz();
		}

		for (int i = 0; i < 50; i++) {
			musica.curte();
		}

		Podcast podcast = new Podcast();
		podcast.setTitulo("BolhaDev");
		podcast.setApresentador("Marcos Mennees");
		
		for (int i = 0; i < 5000; i++) {
			podcast.reproduz();
		}
		
		for (int i = 0; i < 1000; i++) {
			podcast.curte();
		}
	}

}
