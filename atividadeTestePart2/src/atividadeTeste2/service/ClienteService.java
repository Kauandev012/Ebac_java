package atividadeTeste2.service;

import atividadeTeste2.DAO.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }

    public String buscar() {
        clienteDao.buscar();
        return "Sucesso";
    }

    public String excluir() {
        clienteDao.excluir();
        return "Sucesso";
    }

    public String atualizar() {
        clienteDao.atualiazar();
        return "Sucesso";
    }
}
