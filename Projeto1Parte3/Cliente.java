
  // IntelliJ API Decompiler stub source generated from a class file
  // Implementation of methods is not available
import Mercado.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Cliente {
    private String nome;
    List<Produto> items = new ArrayList<Produto>();

    public Cliente(String nome) { this.nome = nome; }

    public void setNome(String entrada) { nome = entrada; }

    public String getNome() { return nome; }
    
    public void cadastraProduto(int quantidades) {
    	
    	for(int i = 0;i < quantidades;i++) {
    		String nomeItem = JOptionPane.showInputDialog(null, nome +  " , digite o item que quer colocar no seu carrinho!");
    		double precoItem = Double.parseDouble(JOptionPane.showInputDialog(nome + " , digite o preço do item que deseja comprar!"));
    		Produto entradaItems = new Produto(nomeItem, precoItem);
    		items.add(entradaItems);
    	}
    	
    }
    
    public void mostraCarrinho() {
    
    	String resultante = "";
    	
    	for(Produto element : items) {
    		
    		resultante += "Produto : " + element.getNome();
    		resultante += " | ";
    		resultante += "Preço : R$ " + element.getPreco();
    		resultante += '\n';
    		
    	}
    	JOptionPane.showMessageDialog(null, resultante);
    }
    
   
}
