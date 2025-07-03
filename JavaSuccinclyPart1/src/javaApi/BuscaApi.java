package javaApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaApi {

	public static void main(String[] args) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();

		HttpRequest httpRequest = HttpRequest.newBuilder()
				.uri(URI.create("https://www.omdbapi.com/?i=tt3896198&apikey=f8625842"))
				.build();

		HttpResponse<String> response = client
				.send(httpRequest, HttpResponse.BodyHandlers.ofString());

		System.out.println(response.body());
	}

}
