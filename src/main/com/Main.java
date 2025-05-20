package main.com;

import main.com.Menu.MenuIOp;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("file.encoding", "UTF-8");
        // Chama o método que inicia o menu do conversor de moedas
        MenuIOp.inicio();


    }
}