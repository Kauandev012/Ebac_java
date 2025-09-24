package main.domain;

import javax.persistence.*;

@Entity
@Table(name = "TB_MARCA")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="marca_seq")
    @SequenceGenerator(name="marca_seq", sequenceName ="sq_marca", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name="MARCA", length = 15, nullable = false)
    private String marca;

    @Column(name="MODELO", length = 15, nullable = false)
    private String modelo;

    @ManyToOne
    @JoinColumn(name="id_carro_fk",
            foreignKey = @ForeignKey(name="fk_carro_marca"),
            referencedColumnName = "id", nullable = false
    )
    private Carro carro;

    @OneToOne
    @JoinColumn(name="id_acessorio_fk",
            foreignKey = @ForeignKey(name="fk_acessorio_marca"),
            referencedColumnName = "id", nullable = false
    )
    private Acessorio acessorio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Acessorio getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }
}
