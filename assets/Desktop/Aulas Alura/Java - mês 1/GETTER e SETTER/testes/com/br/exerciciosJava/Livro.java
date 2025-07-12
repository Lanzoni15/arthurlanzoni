package testes.com.br.exerciciosJava;

public class Livro extends Midia {
    String autor;

    public void exibirInfo() {
        System.out.printf("Código: LIB-%.3s%d | Livro: %s - Autor: %s",
                titulo, anoDePublicacao, titulo, autor);
    }
}
