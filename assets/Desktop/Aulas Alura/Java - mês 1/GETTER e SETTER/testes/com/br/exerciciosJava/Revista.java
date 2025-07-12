package testes.com.br.exerciciosJava;

public class Revista extends Midia{
    int edicao;

        public void exibirInfo() {
        System.out.printf("\nCódigo: LIB-%.3s%d | Revista: %s - Edição: %d",
                titulo, anoDePublicacao, titulo, edicao);
    }
}
