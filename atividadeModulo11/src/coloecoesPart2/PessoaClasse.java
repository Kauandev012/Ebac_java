package coloecoesPart2;

import java.util.Objects;

public class PessoaClasse implements Comparable<PessoaClasse> {

    private String nome;
    private String genero;


    public PessoaClasse(String nome,  String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PessoaClasse that = (PessoaClasse) o;
        return Objects.equals(nome, that.nome) && Objects.equals(genero, that.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero);
    }

    @Override
    public String toString() {
        return "PessoaClasse{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    @Override
    public int compareTo(PessoaClasse o) {
        return 0;
    }
}
