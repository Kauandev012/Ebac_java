package tarefaPadroesDeProjetos1;

public class Demo {

    public static void main(String[] args) {
        Customer cliente = new Customer( "A",false);
        Fabrica fabrica = getFabrica(cliente);
        Carro carro = fabrica.criarCarro(cliente.getSolicitaNota());
    }

    private static Fabrica getFabrica(Customer cliente) {
        if(cliente.getTemContratoEmpresa()){
            return new ContratosFabrica();
        }else{
            return new SemContratosFabrica();
        }
    }

}
