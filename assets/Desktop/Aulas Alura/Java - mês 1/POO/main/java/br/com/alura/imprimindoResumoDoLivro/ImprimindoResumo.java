package main.java.br.com.alura.imprimindoResumoDoLivro;

class imprimindoResumo {
    String titulo;
    String autor;
    int paginas;

    void exibirResumo() {
        System.out.printf("\"%s\" de %s com %d páginas%n", titulo, autor, paginas);
    }

}
