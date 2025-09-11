package tarefaPadroesDeProjetos1;

public abstract class Fabrica {

    public Carro criarCarro(String solicitaNota) {
        Carro carro = retriveCarro(solicitaNota);
        carro = preparaCarro(carro);
        return carro;
    }

    private Carro preparaCarro(Carro carro){
        carro.limparCarro();
        carro.verificaMotor();
        carro.ligarCarro();
        return carro;
    }
    abstract Carro retriveCarro(String solicitaNota);
}
