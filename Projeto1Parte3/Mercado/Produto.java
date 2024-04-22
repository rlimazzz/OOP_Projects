//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Mercado;

public class Produto extends Item {
    Produto(String nome, double preco) {
        super(nome, preco);
    }

    public void realizado() {
        System.out.println("Pedido realizado com sucesso!");
    }
}
