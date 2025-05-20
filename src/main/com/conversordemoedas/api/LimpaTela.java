package main.com.conversordemoedas.api;

// Método para "limpar" a tela do terminal usando sequências ANSI
public class LimpaTela {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J"); // Aqui o código ANSI para limpar o terminal
        System.out.flush();
    }
    // Método para centralizar texto no terminal
    public static void centralizarTexto(String texto) {
        int larguraTerminal = 80; // Aqui define a largura padrão do terminal
        int espacosAntes = (larguraTerminal - texto.length()) / 2;
        String espacos = " ".repeat(espacosAntes);
        System.out.println(espacos + texto);
    }
}
