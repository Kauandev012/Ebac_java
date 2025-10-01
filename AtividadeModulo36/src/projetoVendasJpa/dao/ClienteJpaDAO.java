package projetoVendasJpa.dao;

import projetoVendasJpa.dao.generic.GenericJpaDB1DAO;
import projetoVendasJpa.domain.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa>{

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }
}
