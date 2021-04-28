package br.com.ppnp2;

public class Gerente extends Funcionario{
    private int quantidadeDeFuncionarios;

    public Gerente(String nome, String cpf, double salario, int quantidadeDeFuncionarios) {
        super(nome, cpf, salario);
        this.quantidadeDeFuncionarios = quantidadeDeFuncionarios;
    }

    public int getQuantidadeDeFuncionarios() {
        return quantidadeDeFuncionarios;
    }

    @Override
    public double getBonificacao(){
        return super.getSalario() * 0.15;
    }
}
