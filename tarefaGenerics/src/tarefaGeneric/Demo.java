package tarefaGeneric;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<CarroToyota> ListaCarro1 = new ArrayList<>();
        ListaCarro1.add(new CarroToyota("supra"));

        List<CarroMitsubishi> listaCarro2 = new ArrayList<>();
        listaCarro2.add(new CarroMitsubishi("eclipse"));


        GenericCarro processador = new GenericCarro();
        System.out.println("***********");
        processador.processaLista(ListaCarro1);
        System.out.println("***********");
        processador.processaLista(listaCarro2);
    }

}
