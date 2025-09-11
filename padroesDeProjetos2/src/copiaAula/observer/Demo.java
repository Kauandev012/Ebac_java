package copiaAula.observer;

public class Demo {

    public static void main(String[] args) {

        Jornalista jornalista = new Jornalista();
        jornalista.add(new Tv());
        jornalista.notifyAll("teste");
    }
}
