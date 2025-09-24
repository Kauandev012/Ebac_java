package main.domain;

import javax.persistence.*;


@Entity
@Table(name = "TB_ACESSORIO")
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="acessorio_seq")
    @SequenceGenerator(name="acessorio_seq", sequenceName ="sq_acessorio", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name="NOME",length=15, nullable = false)
    private String nome;

    @Column(name="DESCRICAO",length=100, nullable = false)
    private String descricao;

    @OneToOne(mappedBy = "acessorio")
    private Marca marca;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
