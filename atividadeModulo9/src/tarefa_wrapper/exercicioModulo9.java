package tarefa_wrapper;

public class exercicioModulo9 {


    public static void main(String[] args) {
        conversaoWrapperBoxing();
        conversaoExplicita();
    }

    private static void conversaoWrapperBoxing(){
        System.out.println(" **** conversão boxing(autoboxing) ****");
        int numeroPrimitivo = 15; //variavel primitivo

        Integer numeroWrapper = numeroPrimitivo; // Wrapper conversão boxing.

        System.out.println(numeroPrimitivo); // 15
        System.out.println(numeroWrapper); // 15

    }
     private static void conversaoExplicita(){
         System.out.println(" **** conversão Explicita ****");
        int numeroPrimitivo2 = 30; //numero primitivo

         Integer numeroWrapper2 = numeroPrimitivo2;// Wrapper conversão explicita

         System.out.println(numeroPrimitivo2); // 30
         System.out.println(numeroWrapper2); // 30
     }
}
