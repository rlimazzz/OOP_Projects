package Mercado;

public class Item extends Pedido{
    int ID;
    double Preco;
    String Nome;
    public Item(int ID, String Nome, double Preco) {
        super(ID, Nome, Preco);
    }
}
