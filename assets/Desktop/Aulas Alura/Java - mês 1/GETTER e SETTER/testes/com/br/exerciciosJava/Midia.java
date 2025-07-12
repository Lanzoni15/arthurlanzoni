package testes.com.br.exerciciosJava;

public class Midia {
    String titulo;
    int anoDePublicacao;

    public void exibirInfo() {
        System.out.printf("\nCódigo: LIB- %.3s%d | Livro: %s",
                titulo, anoDePublicacao, titulo);
    }
}
