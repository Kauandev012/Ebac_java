package tarefaTeste1;

import java.util.*;
import java.util.stream.Collectors;


public class ListaPessoasJunit {

    //variavel global
    private static List<Map<String,String>> pessoas = new ArrayList<>();


    //lista que separa por genero, codigo convencional
    private static void listaDePessoas(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Digite seu nome e genero separados por virgula (ou 'sair' para terminar): ");
            String entrada = scanner.nextLine();
            if (entrada.equals("sair"))break;

            String[] dados = entrada.split(",");
            if(dados.length <2){
                System.out.println("Entrada inválida, tente novamente.");
                continue;
            }

            String nome = dados[0].trim();
            String genero = dados[1].trim();

            Map<String,String> pessoa = new HashMap<>();
            pessoa.put("nome", nome);
            pessoa.put("genero", genero);
            pessoas.add(pessoa);
        }

        Map<String, List<String>> grupos = new HashMap<>();
        for (Map<String,String> p : pessoas) {
            String nome = p.get("nome");
            String genero = p.get("genero");
            grupos.putIfAbsent(genero, new ArrayList<>());
            grupos.get(genero).add(nome);
        }

        for (String genero : grupos.keySet()){
            System.out.println("Grupo" +  genero + ": " + grupos.get(genero));
        }
        scanner.close();
    }


    //metado com lambda, imprime somente mulheres
    public static void imprimeMulheres(){
        System.out.println("lista de mulheres: ");
        pessoas.stream()
                .filter(p -> p.get("genero").equalsIgnoreCase("F") || p.get("genero").equalsIgnoreCase("Feminino"))
                .forEach(p -> System.out.println(p.get("nome")));
    }

    //roda o codigo
    public static void main(String[] args) {
        listaDePessoas();
        imprimeMulheres();
    }
}
