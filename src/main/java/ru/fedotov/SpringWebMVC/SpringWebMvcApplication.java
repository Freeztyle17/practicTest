package ru.fedotov.SpringWebMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@SpringBootApplication
public class SpringWebMvcApplication {

	public static void main(String[] args) throws Exception {


//		HttpClient client = HttpClient.newHttpClient();
//		HttpRequest request = HttpRequest.newBuilder()
//				.uri(URI.create("https://647310c7d784bccb4a3c3c79.mockapi.io/StockManager"))
//				.build();
//
//		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//
//		System.out.println(response.body());



		SpringApplication.run(SpringWebMvcApplication.class, args);
	}

}
