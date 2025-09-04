package TarafaCalculoMedia;

public class calculoMedia {

    public static void main(String args[]){

        calculadorMedia();
    }

    private static void calculadorMedia() {
        System.out.println(" **** calculadorMedia ***");

        int nota1 = 7;
        int nota2 = 5;
        int nota3 = 10;
        int nota4 = 9;

        int totalNotas = nota1 + nota2 + nota3 + nota4;

        double mediaNota = (double) totalNotas /4;

        System.out.println(mediaNota);
    }

}
