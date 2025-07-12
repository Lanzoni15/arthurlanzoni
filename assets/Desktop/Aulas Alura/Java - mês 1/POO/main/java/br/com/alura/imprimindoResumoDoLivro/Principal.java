package main.java.br.com.alura.imprimindoResumoDoLivro;

public class Principal {
    public static void main(String[] args) {
        imprimindoResumo l = new imprimindoResumo();

        l.titulo = "O Guia do Mochileiro das Galáxias";
        l.autor = "Douglas Adams";
        l.paginas = 208;
        l.exibirResumo();
    }
}
