package atividadePessoaAbstract;

public class Juridica  extends Pessoa {

    private String cnpj;

    //get end set
    public String getCnpj(String s) {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String identificaPessoa() {
        return cnpj;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                ", Sobrenome: " + getSobrenome() +
                ", CNPJ: " +  cnpj;
    }

}
