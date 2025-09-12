package tarefaGeneric;

public abstract class Carro {

    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    //get end set


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    //toString


    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                '}';
    }
}
