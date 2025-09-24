package resourcesTest;

import main.dao.*;
import main.domain.Acessorio;
import main.domain.Carro;
import main.domain.Marca;
import org.junit.Test;
import org.w3c.dom.css.CSSImportRule;

import static org.junit.Assert.assertNotNull;

public class MarcaTest {

    private IMarcaDAO marcaDAO;

    private ICarroDAO carroDAO;

    private IAcessorioDAO acessorioDAO;

    public MarcaTest() {
        marcaDAO = new MarcaDAO();
        carroDAO = new CarroDAO();
        acessorioDAO = new AcessorioDAO();
    }

    @Test
    public void cadastrar(){
        Carro carro = criarCarro("a1");
        Acessorio acessorio = criarAcessorio("a1");

        Marca marc =  new Marca();
        marc.setMarca("Mitsubishi");
        marc.setModelo("eclipse");
        marc.setCarro(carro);
        marc.setAcessorio(acessorio);

        acessorio.setMarca(marc);
        marc = marcaDAO.cadastrar(marc);

        assertNotNull(marc);
        assertNotNull(marc.getId());

    }


    private Acessorio criarAcessorio(String a1) {
        Acessorio acessorio = new Acessorio();
        acessorio.setNome("Tapete");
        acessorio.setDescricao("tapate eclipse");

        return acessorioDAO.cadastrar(acessorio);
    }

    private Carro criarCarro(String a1) {
        Carro carro = new Carro();
        carro.setCor("Prata");
        carro.setCarroceria("Cupe");

        return  carroDAO.cadastrar(carro);
    }
}
