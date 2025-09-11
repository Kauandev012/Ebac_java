package tarefaPadroesDeProjetos1;

public class SemContratosFabrica extends Fabrica {
    @Override
    Carro retriveCarro(String solicitaNota) {
        if("C".equals(solicitaNota)){
            return new CarroOnix(4,"Preto");
        }else if("D".equals(solicitaNota)){
            return new CarroUno(4,"branco");
        }
        return new CarroPadrao(2,"cinza");
    }
}
