package tarefaPadroesDeProjetos1;

public class ContratosFabrica extends Fabrica  {
    @Override
    Carro retriveCarro(String solicitaNota) {
        if("A".equals(solicitaNota)){
            return new CarroCivic(4,"prata");
        }else if("B".equals(solicitaNota)) {
            return new CarroVirtus(4,"azul-royall");
        }
        return new CarroPadrao(2,"cinza");
    }
}
