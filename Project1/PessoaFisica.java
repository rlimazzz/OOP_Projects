class PessoaFisica extends Pessoa {
    private String cpf;
    public PessoaFisica(String nome , String cpf) {

        super(nome);
        this.cpf = cpf;

    }

    public void setCpf(String cpf) {

        this.cpf = cpf;

    }

    public String getCpf() {

        return this.cpf;

    }

    public String getNome1() {

        return getNome();

    }

    public String fisicaFuncoes(int entrada) {

        if(entrada == 1) {

            return "Pessoa denunciada com sucesso!";

        }
        else if(entrada == 2) {

            return "Pessoa bloqueada com sucesso!";

        } else{

            return "Pedido de amizade enviado com sucesso!";

        }

    }
}
