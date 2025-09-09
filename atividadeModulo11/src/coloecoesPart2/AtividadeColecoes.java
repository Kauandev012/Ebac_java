package coloecoesPart2;

import java.util.*;

public class AtividadeColecoes {


    public static void main(String[] args) {
        listaDePessoas();
    }

    private static void listaDePessoas(){
        Scanner scanner = new Scanner(System.in);
        List<Map<String,String>> pessoas = new ArrayList<>();


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
}
