package tarefaPadroesDeProjetos1;

public abstract class Carro {

    private int numPassageiros;
    private String cor;

    public Carro(int numPassageiros, String cor) {
        this.numPassageiros = numPassageiros;
        this.cor = cor;
    }

    protected Carro() {
    }

    public void ligarCarro(){
        System.out.println("Ligando o carro");
    }

    public void limparCarro(){
        System.out.println("Limpando o carro");
    }

    public void verificaMotor(){
        System.out.println("Checando o carro");
    }


    //get end set


    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
