package herenca;

public class Desenvolvedor extends Funcionario {
    private String stack;

    public Desenvolvedor(String nome, double salario, String stack) {
        super(nome, salario);
        this.stack = stack;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("\nDesenvolvedor: %s - Stack: %s - Salário: %.2f",
                nome, stack, salario);
    }

    @Override
    public void calcularPLR() {
     System.out.println("PLR do Desenvolvedor");
    }

}
