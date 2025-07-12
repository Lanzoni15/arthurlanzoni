package main.java.br.com.alura.relatorioDoProduto;

public class Principal {
    public static void main(String[] args) {
        Estoque informacaoEstoque = new Estoque();
        
        informacaoEstoque.nome = "Mouse Gamer";
        informacaoEstoque.preco = 159.9;
        informacaoEstoque.quantidade = 25;

        informacaoEstoque.exibirItensEstoque();
    }
}
