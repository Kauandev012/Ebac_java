package main.domain;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_CARRO")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator ="carro_seq")
    @SequenceGenerator(name="carro_seq", sequenceName ="sq_carro", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name="CARROCERIA", length = 15, nullable = false)
    private String carroceria;

    @Column(name="COR", length = 10, nullable = false)
    private String cor;

    @OneToMany(mappedBy = "carro")
    private List<Marca> marcas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


}
