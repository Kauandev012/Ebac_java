package atividadePessoaAbstract;

public class Fisica extends  Pessoa {

    private String cpf;

    //get end set


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String identificaPessoa() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                ", Sobrenome: " + getSobrenome() +
                ", CPF: " + getCpf();
    }
}
