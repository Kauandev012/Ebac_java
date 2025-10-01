package projetoVendasJpa.dao;

import projetoVendasJpa.dao.generic.IGenericJpaDAO;
import projetoVendasJpa.domain.ClienteJpa;

public interface IClienteJpaDAO <T extends Persistente> extends IGenericJpaDAO<T, Long> {
}
