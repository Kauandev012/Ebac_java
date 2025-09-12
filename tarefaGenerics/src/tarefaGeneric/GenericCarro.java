package tarefaGeneric;

import java.util.List;

public class GenericCarro{

    private Object carro;

    public <T extends Carro> void processaLista(List<T> lista){
       System.out.println("processando lista de carros");

       for (T carro : lista ){
           System.out.println(carro.getModelo());
       }if(carro instanceof CarroMitsubishi){
           System.out.println("è um carro da Mitsubishi");
       } else if (carro instanceof CarroToyota){
           System.out.println("è um carro da Toyota");
       }
   }
}
