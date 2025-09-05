package TarefaControleFluxos;

import java.util.Scanner;

public class CalculaMedia {

    //Classe principal
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int somaNota =  0; //da o valor 0 para a nota;

        for (int i = 1; i <=4; i++){
            System.out.println("Digite uma nota: " + (i) + ":");
            somaNota += s.nextInt();
        }//pergunta a nota e faz a condição de loop(quantas vezes a nota é perguntada)

        String resultadoDasNotas = getResult(somaNota);// pega o valor das notas;
            System.out.println(resultadoDasNotas);

        s.close();

    }
    private static String getResult(int somaNota){
        double mediaDasNotas = (double) somaNota / 4; //divide por 4 o resultado das notas
        System.out.println("Sua nota é:  "  + (mediaDasNotas) ); //imprime o resultado da mediaDasNotas
        if(mediaDasNotas >=7){
            return "Vc foi aprovado!!"; // condição 1
        }else if (mediaDasNotas >=5){
            return "Vc esta de recuperação !!"; //condição 2
        }else {
            return "vc foi reprovado";//condição 3
        }

    }
}



