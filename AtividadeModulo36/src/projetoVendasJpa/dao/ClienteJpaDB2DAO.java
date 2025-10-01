package projetoVendasJpa.dao;

import projetoVendasJpa.dao.generic.GenericJpaDB2DAO;
import projetoVendasJpa.domain.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa>{

    public ClienteJpaDB2DAO() {
        super(ClienteJpa.class);
    }
}
