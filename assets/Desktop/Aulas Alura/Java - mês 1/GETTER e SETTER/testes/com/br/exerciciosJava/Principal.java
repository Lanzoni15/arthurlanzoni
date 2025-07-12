package testes.com.br.exerciciosJava;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.titulo = "O Guia do Mochileiro das Galáxias";
        livro.anoDePublicacao = 1979;
        livro.autor = "Douglas Adams";

        Revista revista = new Revista();

        revista.titulo = "National Geographic";
        revista.anoDePublicacao = 2023;
        revista.edicao = 245;

        Ebook ebook = new Ebook();

        ebook.titulo = "Clean Code";
        ebook.anoDePublicacao = 2008;
        ebook.formato = "PDF";

        livro.exibirInfo();
        revista.exibirInfo();
        ebook.exibirInfo();

    }
}
