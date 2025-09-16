package atividadeTeste2.DAO;

public class ClienteDao implements IClienteDao{

    public String salvar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
        //return "Sucesso";
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
