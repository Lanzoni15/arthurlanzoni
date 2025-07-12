package main.java.br.com.alura.relatorioDoProduto;

public class Estoque {
    String nome;
    double preco;
    int quantidade;

    public void exibirItensEstoque() {
        System.out.printf("Produto: %s \nPreço: R$ %.2f \nQuantidade em estoque: %d", nome, preco, quantidade);
    }
}
