package herenca;

public class Gerente extends Funcionario implements Aprovador {

    private double bonus;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("\nGerente: %s - Salário: %.2f - Bônus: %.2f",
                nome, salario, bonus);
    }

    @Override
    public void calcularPLR() {
        System.out.println("PLR do Gerente");
    }

    @Override
    public void aprovarProjeto(String nomeDoProjeto) {
        System.out.printf("\nGerente %s aprovou o projeto %s",
                nome, nomeDoProjeto);
    }

}
