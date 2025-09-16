import atividadeTeste2.TesteCliente;
import org.junit.Assert;
import org.junit.Test;


public class TesteClienteTeste {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Rodrigo");
        cli.adicionarNome1("Rodrigo");

        Assert.assertEquals("Rodrigo", cli.getNome());
    }
}
