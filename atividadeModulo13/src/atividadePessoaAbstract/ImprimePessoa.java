package atividadePessoaAbstract;


public class ImprimePessoa {

    public static void main(String[] args) {
        CriaPessoa();
    }

    public static void CriaPessoa(){
        System.out.println("**** Pessoa jurica ****");

        //Exemplo Pessoa juridica
        Juridica pessoa1 = new Juridica();
        pessoa1.setNome("Davi");
        pessoa1.setSobrenome("Oliveira");
        pessoa1.setCnpj("829348400001-43");
        System.out.println(pessoa1);


        System.out.println("**** Pessoa fisica ****");

        //Exemplo Pessoa fisica
        Fisica pessoa2 = new Fisica();
        pessoa2.setNome("Kauan");
        pessoa2.setSobrenome("Araujo");
        pessoa2.setCpf("12468901-19");
        System.out.println(pessoa2);

    }

}
