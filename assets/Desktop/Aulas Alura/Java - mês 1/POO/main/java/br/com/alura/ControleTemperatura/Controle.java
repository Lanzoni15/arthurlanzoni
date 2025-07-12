package main.java.br.com.alura.ControleTemperatura;

public class Controle {
    String local;
    double temperaturaAtual;

    public void controleDaTemperatura() {
        if (temperaturaAtual >= 37.5) {
            System.out.printf("Sensor no local = %s \nTemperatura: %.1f ºC \nAlerta: Temperatura acima do limite!!!",
                    local, temperaturaAtual);
        } else {
            System.out.printf("Sensor no local = %s \nTemperatura: %.1f ºC",
                    local, temperaturaAtual);
        }
    }
}
