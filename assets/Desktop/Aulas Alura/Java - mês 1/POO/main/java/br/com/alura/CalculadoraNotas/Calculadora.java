package main.java.br.com.alura.CalculadoraNotas;

public class Calculadora {
    String nome;
    double nota1;
    double nota2;
    double media;

    public void sitauacao() {
        media = (nota1 + nota2) / 2;
        System.out.printf("Nome: %s \nNota 1: %.1f \nNota 2: %.1f \nMéida: %.1f\n",
                nome, nota1, nota2, media);

        if (media < 7) {
            System.out.printf("Situação: Reprovado");
        } else {
            System.out.printf("Situação: Aprovado");

        }

    }
}
