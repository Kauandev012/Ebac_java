package coloecoesPart1;

import java.util.Objects;

public class PessoaClasse implements Comparable<PessoaClasse> {

    private String nome;


    public PessoaClasse(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int compareTo(PessoaClasse outraPessoa) {
        return this.nome.compareTo(outraPessoa.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PessoaClasse that = (PessoaClasse) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

}
