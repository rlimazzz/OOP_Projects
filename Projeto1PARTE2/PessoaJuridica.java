class PessoaJuridica extends Cliente {
    private String cnpj;
    public PessoaJuridica(String nome, String cnpj) {

        super(nome);
        this.cnpj = cnpj;

    }

    public void setCnpj(String cnpj) {

        this.cnpj = cnpj;

    }

    public String getCnpj() {

        return this.cnpj;

    }

    public String getNome1() {

        return getNome();

    }

    public String juridicaFuncoes(int entrada) {

        if(entrada == 1) {

            return "Pessoa denunciada com sucesso!";

        }

        else if(entrada == 2) {

            return "Pessoa bloqueada com sucesso!";

        } else  {

            return "Pedido de amizade enviado com sucesso!";

        }
    }

}
