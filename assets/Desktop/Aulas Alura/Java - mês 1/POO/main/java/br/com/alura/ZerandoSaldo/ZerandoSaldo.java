package main.java.br.com.alura.ZerandoSaldo;

public class ZerandoSaldo {
    double saldo;

    public void redefinirSaldo() {
        System.out.printf("Saldo atual R$ %.2f\n",
        saldo);
        saldo = 0.0;
        System.out.printf("Saldo atual R$ %.2f",
        saldo);
    }
}
