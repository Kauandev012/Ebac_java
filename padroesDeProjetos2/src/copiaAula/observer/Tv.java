package copiaAula.observer;

public class Tv implements Observer {
    @Override
    public void update(Subject sub) {
        System.out.println("Recebendo a noticia via TV");
    }
}
