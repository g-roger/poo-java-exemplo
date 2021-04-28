package br.com.ppnp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente cliente = new Cliente();

        cliente.setId(1);
        cliente.setNome("Gabriel");
        cliente.setIdade(24);


        Produto produto = new Produto();
        produto.setDescricao("Kombi de brinquedo");
        produto.setId(1);
        produto.setNome("Acessório para enfeite");
        produto.setPreco(200.00);

        Compra compra = new Compra();
        compra.setId(1);
        compra.setCliente(cliente);
        compra.setProduto(produto);

        System.out.println("Parabéns " + compra.getCliente().getNome() + " você comprou um(a) " +
                compra.getProduto().getNome() + " no valor de R$ " + compra.getProduto().getPreco());

    }
}
