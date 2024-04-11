package Mercado;

public class Pedido {
    int ID;
    double Preco;
    String Nome;
    public Pedido(int ID, String Nome, double Preco) {
        this.ID = ID;
        this.Preco = Preco;
        this.Nome = Nome;
    }

    public String getID() {
        return "Esse é o ID do produto : " + ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPreco() {
        return "Esse é o Preço : R$ " + Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public String getNome() {
        return "Esse é o Nome : " + Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
