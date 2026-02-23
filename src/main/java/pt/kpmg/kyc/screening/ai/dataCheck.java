package pt.kpmg.kyc.screening.ai;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class dataCheck {
  HttpClient client = HttpClient.newHttpClient();

  HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create("http://localhost:8080/"))
      .build();

  HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

  String responseBody = response.body();


  public dataCheck() throws IOException, InterruptedException {
  }
}
