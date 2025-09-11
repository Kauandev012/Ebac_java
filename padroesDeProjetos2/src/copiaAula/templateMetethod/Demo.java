package copiaAula.templateMetethod;

public class Demo {

    public static void main(String[] args) {

        Trabalhador t = new Carteiro();
        Trabalhador t2 = new Bombeiro();
        t.executarRotina();
        System.out.println("********");
        t2.executarRotina();
    }
}
