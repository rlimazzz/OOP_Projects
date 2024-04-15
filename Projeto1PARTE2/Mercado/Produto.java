package Mercado;

public class Produto extends Item{
    Produto(String nome, double preco) {
        super(nome, preco);
    }

    public void realizado() {
        System.out.println("Pedido realizado com sucesso!");
    }
}
