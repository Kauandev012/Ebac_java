package tarefaReflection;


@ItabelaAnnotatio(value = "Tabela")
public class TabelaClass {

    private String nome;

    //construtor
    public TabelaClass(String nome){

    }

    //get end set
    public String getNome(String tabela) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
