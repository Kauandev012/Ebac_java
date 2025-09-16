package atividadeTeste2.DAO;

public class ClienteDaoMock implements IClienteDao {

    @Override
    public String salvar() {
        return "Sucesso";
    }

    @Override
    public String buscar() {
        return "Sucesso";
    }

    @Override
    public String excluir() {
        return "Sucesso";
    }

    @Override
    public String atualiazar() {
        return "Sucesso";
    }

}
