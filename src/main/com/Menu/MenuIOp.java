package main.com.Menu;

import main.com.conversordemoedas.api.LimpaTela;
import main.com.conversordemoedas.api.ServicoConversaodeMoedas;
import java.io.IOException;
import java.util.Scanner;

import static main.com.conversordemoedas.api.LimpaTela.centralizarTexto;

public class MenuIOp {
    public static void inicio() throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        // Aqui vai exibir o menu principal ao usuário
        System.out.println("\n*************************************\n");
        System.out.println("Bem vindo ao super convertor de moedas :) \n");
        int op;
        System.out.print("""
                1) Real -> Dólar
                2) Real -> Peso argentino
                3) Real -> Euro
                4) Dólar -> Real
                5) Peso argentino -> Real
                6) Euro -> Real
                7) Outras opções
                0) Sair
                                      
                Escolha uma opção:\s""");
        op = sc.nextInt();
        do {
            switch (op) {
                case 1:
                    // Conversão de Real para Dólar
                    try {
                        Double currency = ServicoConversaodeMoedas.currencyApi("BRL", "USD");
                        System.out.print("Digite o valor que quer converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        LimpaTela.clearScreen();
                        MenuIOp.inicio();

                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }
                    break;
                case 2:
                    // Conversão de Real para Peso Argentino
                    System.out.println("A conversão de BRL para ARS é: ");
                    try {
                        Double currency = ServicoConversaodeMoedas.currencyApi("BRL", "ARS");
                        System.out.print("Digite o valor que quer converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        LimpaTela.clearScreen();
                        MenuIOp.inicio();
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }

                    break;
                case 3:
                    // Conversão de Real para Euro

                    try {
                        Double currency = ServicoConversaodeMoedas.currencyApi("BRL", "EUR");
                        System.out.print("Digite o valor que quer converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        LimpaTela.clearScreen();
                        MenuIOp.inicio();
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é invalido.");
                    }
                    break;
                case 4:
                    // Conversão de Dólar para Real
                    try {
                        Double currency = ServicoConversaodeMoedas.currencyApi("USD", "BRL");
                        System.out.print("Digite o valor que quer converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        LimpaTela.clearScreen();
                        MenuIOp.inicio();
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }
                    break;
                case 5:
                    // Conversão de Peso Argentino para Real
                    try {
                        Double currency = ServicoConversaodeMoedas.currencyApi("ARS", "BRL");
                        System.out.print("Digite o valor que quer converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);


                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        LimpaTela.clearScreen();
                        MenuIOp.inicio();
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }

                    break;
                case 6:
                    // Conversão de Euro para Real
                    try {
                        Double currency = ServicoConversaodeMoedas.currencyApi("EUR", "BRL");
                        System.out.print("Digite o valor que quer converter: ");
                        sc.nextLine();
                        String moedaString = sc.nextLine().replace(",", ".");

                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * currency));

                        System.out.println();
                        centralizarTexto("************************************ ");
                        centralizarTexto(texto);
                        centralizarTexto("Enter para retornar");
                        centralizarTexto("************************************ ");
                        sc.nextLine();
                        LimpaTela.clearScreen();
                        MenuIOp.inicio();

                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }
                    break;
                case 7:
                    // Chama submenu de outras opções
                    MenuOutrasOpcoes.exibirSubMenuOutrasOpcoes();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (op != 0);

    }

    // Método reservado para outras conversões futuras
    public static void exibirSubMenuOutrasOpcoes() {
        System.out.println("\n*** Outras opções ***\n");
        // Aqui pode ser adicionado suporte a outras moedas
    }
}
