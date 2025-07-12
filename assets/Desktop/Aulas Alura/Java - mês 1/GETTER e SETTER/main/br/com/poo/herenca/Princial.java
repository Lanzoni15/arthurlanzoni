package herenca;

public class Princial {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Mario", 15000);
        ((Gerente) gerente).setBonus(1000);
        gerente.exibirInformacoes();
        gerente.reajusteSalario(2);
        ((Gerente) gerente).aprovarProjeto("utilização de IA nos códigos Java");

        Funcionario desenvolvedor = new Desenvolvedor("Arthur", 5000, "Back-End Java");
        desenvolvedor.reajusteSalario();
        desenvolvedor.exibirInformacoes();



    }
}
