package br.com.ppnp;

public class Compra {
    private int id;
    private Produto produto;
    private Cliente cliente;


    public Compra(int id, Produto produto, Cliente cliente) {
        this.id = id;
        this.produto = produto;
        this.cliente = cliente;
    }

    public Compra(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
