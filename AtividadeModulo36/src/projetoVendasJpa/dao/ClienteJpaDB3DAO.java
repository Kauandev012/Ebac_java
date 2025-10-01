package projetoVendasJpa.dao;

import projetoVendasJpa.dao.generic.GenericJpaDB3DAO;
import projetoVendasJpa.domain.ClienteJpa2;

public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2>{

    public ClienteJpaDB3DAO() {
        super(ClienteJpa2.class);
    }
}
