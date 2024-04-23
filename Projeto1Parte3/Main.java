import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    	
        PessoaJuridica CNPJOTO = new PessoaJuridica("1231231", "123123123");
        PessoaFisica CPFJOTO = new PessoaFisica("12312312", "12312312");

        while(true) {
        	
	        int option = Integer.parseInt(JOptionPane.showInputDialog("Terminator 2000\n1 - CNPJ\n2 - CPF\n3 - Shopping\n4 - Fechar o Aplicativo"));
	        int reset;
	        
	        if(option > 4 || option < 1) {
	        	
	        	//checando se as opções de entrada estão corretas
		        while(true) {
		        	
		            JOptionPane.showMessageDialog(null, "Digite novamente, opção inválida");
		            reset = Integer.parseInt(JOptionPane.showInputDialog("Terminator 2000\n1 - CNPJ\n2 - CPF\n3 - Shopping"));
		            
	            if(reset >= 1 && reset <= 4) {
	            	
	            		break;
	            		
	            	}
	        	}
		        
	        }
	
	        if(option == 1) {
	
	        	//Pessoa Jurídica
	            JOptionPane.showMessageDialog(null, "Digite o nome da sua empresa e sua cnpj!");
	            String nomePess = JOptionPane.showInputDialog(null, "Nome da empresa");
	            String cnpjota = JOptionPane.showInputDialog(null, "Sua cnpj");
	            CNPJOTO = new PessoaJuridica(nomePess, cnpjota);
	            String entr = JOptionPane.showInputDialog(null, "Está correta Sua CNPJ? S/N");
	
	            if(entr.equalsIgnoreCase("N")) {
	                while (true) {
	                    String cnpj1 = JOptionPane.showInputDialog(null, "Digite sua CNPJ novamente");
	                    CPFJOTO.setCpf(cnpj1);
	                    String resposta = JOptionPane.showInputDialog(null, "Está correta Sua CNPJ? S/N");
	
	                    if(resposta.equalsIgnoreCase("S")) {
	                        break;
	                    }
	
	                }
	            }
	
	            if(CNPJOTO.getCnpj().length() == 14 && option == 1) {
	
	                System.out.println(CNPJOTO.getNome1() +" CNPJ VALIDA");
	                JOptionPane.showMessageDialog(null, CNPJOTO.getNome1() + " CNPJ válida");
	                int verifica = Integer.parseInt(JOptionPane.showInputDialog(null, "O que você quer fazer? \n1 - DENUNCIAR\n2 - BLOQUEAR\n3 - PEDIDO DE AMIZADE?\n4 - COMPRAR ALGO"));
	                JOptionPane.showMessageDialog(null, CNPJOTO.juridicaFuncoes(verifica));
	
	            }
	            else if(CNPJOTO.getCnpj() != "123123123"){
	
	                JOptionPane.showMessageDialog(null, CNPJOTO.getNome1() + " CNPJ inválida");
	
	            }
	            
	            JOptionPane.showMessageDialog(null, "Sua CNPJ " + CNPJOTO.getNome1());
	
	        }
	        
	        else if(option == 2){
	
	        	//PessoaFísica
	        	
	            JOptionPane.showMessageDialog(null, "Digite seu nome e cpf!");
	            String nomePess = JOptionPane.showInputDialog(null, "Digite seu nome");
	            String cpf1 = JOptionPane.showInputDialog(null, "Digite seu cpf");
	            CPFJOTO = new PessoaFisica(nomePess, cpf1);
	
	            System.out.println(CPFJOTO.getCpf() + ", está correto o cpf? S/N ");
	            String entr = JOptionPane.showInputDialog(null, "Está correto o cpf : " + CPFJOTO.getCpf() + " ? \nS/N");
	
	            String s = "N";
	            if(entr.equalsIgnoreCase(s)) {
	            	
	                while (true) {
	                	
	                    String cpf = JOptionPane.showInputDialog(null, "Digite novamente");
	                    CPFJOTO.setCpf(cpf);
	                    String resposta = JOptionPane.showInputDialog(null, "Está correto o cpf : " + CPFJOTO.getCpf() + " ? \nS/N");
	
	                    if(resposta.equalsIgnoreCase("S")) {
	                    	
	                        break;
	                        
	                    }
	
	                }
	            }
	
	            if(CPFJOTO.getCpf().length() == 11 && option == 2) {
	
	            	while(true) {
	            		
		                JOptionPane.showMessageDialog(null, CPFJOTO.getNome1() + " CPF VALIDO");
		                int verifica = Integer.parseInt(JOptionPane.showInputDialog(null, "O que você quer fazer? \n1 - DENUNCIAR\n2 - BLOQUEAR\n3 - PEDIDO DE AMIZADE?\n4 - Sair"));
		                
		                if(verifica == 4) {
		                	break;
		                }
		                
		                System.out.println(CPFJOTO.fisicaFuncoes(verifica));
		                
	            	}
	
	
	            }else if (CPFJOTO.getCpf() != "12312312"){
	
	                JOptionPane.showMessageDialog(null, "Cpf inválido : " + CPFJOTO.getNome1());
	
	            }
	
	            System.out.println("SEU CPF " + CPFJOTO.getCpf());
	            JOptionPane.showMessageDialog(null, "Seu CPF : " + CPFJOTO.getCpf());
	        }
	        
	        else if(option == 3) {
	        	
	        	//Shopping
	   
	        	//opção para não cadastrar a mesma pessoa 2 vezes
	        	String nomeCliente = JOptionPane.showInputDialog(null, "Digite o nome do seu usuário :");
	            Cliente meuCliente = new Cliente(nomeCliente);
	        	while(true) {
	   
		            int optionShopping = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja fazer?\n1 - Compras\n2 - Ver Carrinho\n3 - Sair"));
		            
		            if(optionShopping < 1 && optionShopping > 3) {
		            	while(true) {
		            		
		            		optionShopping = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite novamente, opção inválida"));
		            		if(optionShopping == 1 || optionShopping == 2) {
		            			break;
		            			
		            		}
		            	}
		            }
		            
		            if(optionShopping == 1) {
		            	int quantidadeProdutos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos que deseja comprar"));
		            	meuCliente.cadastraProduto(quantidadeProdutos);
		            }
		            else if(optionShopping == 2) {
		            	meuCliente.mostraCarrinho();
		            }else {
		            	break;
		            }
		        }
	        }
	        else {
	        	//opção de sair
	        	break;
	        }
	    }
    }
}
