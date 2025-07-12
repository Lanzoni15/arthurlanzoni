package testes.com.br.exerciciosJava;

public class Ebook extends Midia {
    String formato;

    public void exibirInfo() {
        System.out.printf("\nCódigo: LIB-%.3s%d | Ebook: %s - Formato: %s",
                titulo, anoDePublicacao, titulo, formato);
    }
}
