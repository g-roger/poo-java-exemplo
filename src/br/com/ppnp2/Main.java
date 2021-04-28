package br.com.ppnp2;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionarioComum = new Funcionario();
        funcionarioComum.setCpf("46789373637");
        funcionarioComum.setNome("José");
        funcionarioComum.setSalario(2000);

        System.out.println("Novo salário Funcionário comum com bonificação: " +
                (funcionarioComum.getSalario() + funcionarioComum.getBonificacao()));

        Gerente gerente = new Gerente("Groger", "2838823828", 20000, 100);
        System.out.println("Bonificação do gerente " + gerente.getNome() + ": " + gerente.getBonificacao());
        System.out.println("Novo salário Gerente com bonificação: " +
                (gerente.getSalario() + gerente.getBonificacao()));
    }
}
