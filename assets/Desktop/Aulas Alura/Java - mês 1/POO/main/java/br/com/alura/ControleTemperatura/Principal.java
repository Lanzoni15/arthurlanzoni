package main.java.br.com.alura.ControleTemperatura;

public class Principal {
    public static void main(String[] args) {
        Controle temperaturaDoLocal = new Controle();

        temperaturaDoLocal.local = "Setor A";
        temperaturaDoLocal.temperaturaAtual = 35.9;

        temperaturaDoLocal.controleDaTemperatura();
    }
}
