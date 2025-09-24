package resourcesTest;

import main.dao.CarroDAO;
import main.dao.ICarroDAO;
import main.domain.Carro;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CarroTest {

    private ICarroDAO carroDAo;

    public CarroTest() {
        carroDAo = new CarroDAO();
    }

    @Test
    public void cadastrar() {
        Carro carro = new Carro();
        carro.setCor("Prata");
        carro.setCarroceria("Cupe");
        carro = carroDAo.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());
    }
}
