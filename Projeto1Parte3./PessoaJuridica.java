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
        return this.getNome();
    }

    public String juridicaFuncoes(int entrada) {
        if (entrada == 1) {
            return "Pessoa denunciada com sucesso!";
        } else {
            return entrada == 2 ? "Pessoa bloqueada com sucesso!" : "Pedido de amizade enviado com sucesso!";
        }
    }
}
