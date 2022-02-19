package com.uk.features;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/*It supports both HTTP/1.1 and HTTP/2 protocols.
It supports both Synchronous (Blocking Mode) and Asynchronous Modes.
It supports Asynchronous Mode using WebSocket API.*/

//https://mkyong.com/java/java-11-httpclient-examples/
public class Http2ClientDemo {
    public static final HttpClient httpClient = HttpClient.newBuilder().version(HttpClient
            .Version.HTTP_2).connectTimeout(Duration.ofSeconds(10))
            .build();

    //public final HttpClient httpClient = HttpClient.newHttpClient();
    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException, TimeoutException {
        sync();
        async();
    }

    public static void sync() throws IOException, InterruptedException {


        HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create("https://www.httpbin.org/get"))
                .setHeader("User-Agent", "Java").build();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }

    public static void async() throws ExecutionException, InterruptedException, TimeoutException {
        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create("https://www.httpbin.org/get"))
                .GET()
                .header("User-Agent", "Java")
                .build();
        CompletableFuture<HttpResponse<String>> completableFuture = httpClient.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString());
        String result = completableFuture.thenApply(HttpResponse::body).get(5, TimeUnit.SECONDS);
        System.out.println(result);
    }
}
