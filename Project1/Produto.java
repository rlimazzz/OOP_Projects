package Mercado;

public class Produto extends Pedido {
    int ID;
    double Preco;
    String Nome;
    public Produto(int ID, String Nome, double Preco) {
        super(ID, Nome, Preco);
    }
}
