import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PessoaJuridica CNPJOTO = new PessoaJuridica("1231231", "123123123");
        PessoaFisica CPFJOTO = new PessoaFisica("12312312", "12312312");

        System.out.println("CADASTRE OU DENUNCIE, 1 - CNPJ, 2 - CPF");
        int option = scanner.nextInt();
        if(option == 1) {

            System.out.println("Digite o seu nome e sua cnpj");
            String nomePess = scanner.next();
            String cnpjota = scanner.next();
            CNPJOTO = new PessoaJuridica(nomePess, cnpjota);

        }
        else {

            System.out.println("Digite o seu nome e seu cpf");
            String nomePess = scanner.next();
            String cnpjota = scanner.next();
            CPFJOTO = new PessoaFisica(nomePess, cnpjota);

        }

        if(option == 1) {

            System.out.println(CNPJOTO.getCnpj() + ", está correta a cnpj? S/N ");
            String entr = scanner.next();

            if(entr == "N") {

                System.out.println("Digite denovo! (APOS ESSA TENTATIVA, ALTERAÇÕES SÃO BLOQUEADAS");
                String denovo = scanner.next();
                CNPJOTO.setCnpj(denovo);

            }
            System.out.println("SUA CNPJ " + CNPJOTO.getCnpj());

        }

        if(option == 2) {

            System.out.println(CPFJOTO.getCpf() + ", está correto o cpf? S/N ");
            String entr = scanner.next();

            if(entr == "N") {
                System.out.println("Digite denovo! (APOS ESSA TENTATIVA, ALTERAÇÕES SÃO BLOQUEADAS");
                String denovo = scanner.next();
                CPFJOTO.setCpf(denovo);

            }

            System.out.println("SEU CPF " + CPFJOTO.getCpf());

        }

        if(CPFJOTO.getCpf().length() == 11 && option == 2) {

            System.out.println(CPFJOTO.getNome1() + " CPF VALIDO");
            System.out.println("O que você quer fazer? 1 - DENUNCIAR, 2 - BLOQUEAR, 3 - PEDIDO DE AMIZADE?");
            int verifica = scanner.nextInt();
            System.out.println(CPFJOTO.fisicaFuncoes(verifica));


        }else if (CPFJOTO.getCpf() != "12312312"){

            System.out.println(CPFJOTO.getNome1() +" CPF INVALIDO");

        }

        if(CNPJOTO.getCnpj().length() == 14 && option == 1) {

            System.out.println(CNPJOTO.getNome1() +" CNPJ VALIDA");
            System.out.println("O que você quer fazer? 1 - DENUNCIAR, 2 - BLOQUEAR, 3 - PEDIDO DE AMIZADE? 4 - COMPRAR ALGO");
            int verifica = scanner.nextInt();
            System.out.println(CNPJOTO.juridicaFuncoes(verifica));

        }else if(CNPJOTO.getCnpj() != "123123123"){

            System.out.println(CNPJOTO.getNome1() + " CNPJ INVALIDA");

        }
    }
}
