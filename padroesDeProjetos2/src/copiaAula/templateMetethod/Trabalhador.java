package copiaAula.templateMetethod;

public abstract class Trabalhador {

    public void executarRotina(){

        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();

    }
    protected abstract void trabalhar();

    private void voltarParaCasa() {
        System.out.println("Voltando para casa");

    }

    private void irAoTrabalho() {
        System.out.println("indo para tralho ");
    }

    public void iniciarRotina(){
        System.out.println("iniciando rotina");
    }

    public void levantar(){
        System.out.println("levantando da cama");
    }

}
