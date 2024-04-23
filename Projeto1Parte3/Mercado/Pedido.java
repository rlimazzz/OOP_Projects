//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Mercado;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	String nome;
    List<Item> items = new ArrayList<Item>();

    Pedido(String nome, List<Item> items) {
        this.nome = nome;
        this.items = items;
    }

    public void mostraPedidos() {
        for(Item elemento : items) {
            System.out.println(elemento);
        }
    }

}
