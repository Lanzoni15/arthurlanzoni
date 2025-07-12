package main.java.br.com.alura.CalculadoraNotas;

public class Principal {
    public static void main(String[] args) {
        Calculadora calcularMedia = new Calculadora();

        calcularMedia.nome = "Arthur";
        calcularMedia.nota1 = 5;
        calcularMedia.nota2 = 6.6;

        calcularMedia.sitauacao();
    }
}
