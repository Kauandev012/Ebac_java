package resourcesTest;

import main.dao.IProdutoDAO;
import main.dao.ProdutoDAO;
import main.domain.Produto;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {

    private IProdutoDAO produtoDAO;

    public ProdutoTest() {
        produtoDAO = new ProdutoDAO();
    }

    @Test
    public void cadastrar(){
        Produto produto = new Produto();
        produto.setNome("Monitor");
        produto.setCodigo("m1");
        produto.setDescricao("Monitor acer 120hz");
        produto = produtoDAO.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());

    }
}
