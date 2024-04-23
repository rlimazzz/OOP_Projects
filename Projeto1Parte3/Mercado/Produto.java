//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Mercado;

import javax.swing.*;

public class Produto extends Item {
    public Produto(String nome, double preco) {
        super(nome, preco);
    }

    public void realizado() {
    	JOptionPane.showMessageDialog(null, "Pedido realizado com sucesso!");
    }
}
