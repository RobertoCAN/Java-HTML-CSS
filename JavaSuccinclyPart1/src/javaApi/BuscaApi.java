package javaApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class BuscaApi {

	public static void main(String[] args) throws IOException, InterruptedException {

		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um nome de filme.:");
		var busca = leitura.nextLine(); 
		
		String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=f8625842";
		
		HttpClient client = HttpClient.newHttpClient();

		HttpRequest httpRequest = HttpRequest.newBuilder()
				.uri(URI.create(endereco))
				.build();

		HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

		System.out.println(response.body());
	}

}
