package main.com.conversordemoedas.api;

import com.google.gson.Gson; // Essa é a biblioteca usada para converter JSON em objetos Java

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Método que faz a chamada à API de câmbio e retorna a taxa de conversão entre duas moedas
public class ServicoConversaodeMoedas {

    public static Double currencyApi(String moedaOrigem, String moedaDestino) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/4d4e06c62cc36d78d6ca9175/pair/" + moedaOrigem + "/" + moedaDestino))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                // Aqui converte o JSON de resposta para um objeto Java usando Gson
                Gson gson = new Gson();
                String json = response.body();
                MoedaFormatada retorno = gson.fromJson(json, MoedaFormatada.class);
                // Aqui retorna apenas a taxa de conversão
                return retorno.conversion_rate();
            } else {
                System.err.println("Erro ao obter taxa de câmbio. Código de status: " + response.statusCode());
                return null;
            }
        } catch (IOException e) {
            System.err.println("Erro de E/S ao conectar à API: " + e.getMessage());
            e.printStackTrace();
            return null;
        } catch (InterruptedException e) {
            System.err.println("Thread interrompida durante a conexão à API: " + e.getMessage());
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
