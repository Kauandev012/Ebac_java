package coloecoesPart1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AtividadeColecoes {

    public static void main(String[] args) {
        listaDePessoas();
    }

    private static void listaDePessoas(){
        System.out.println(" **** Listando pessoas ***");
        List<PessoaClasse> lista = new ArrayList<PessoaClasse>();


        PessoaClasse a = new PessoaClasse("Pedro");
        PessoaClasse b = new PessoaClasse("João");
        PessoaClasse c = new PessoaClasse("Luisa");
        PessoaClasse d = new PessoaClasse("Ana");
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        Collections.sort(lista);
        System.out.println(lista);


    }

}
