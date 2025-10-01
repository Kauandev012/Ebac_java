package projetoVendasJpa.dao;

import projetoVendasJpa.dao.generic.GenericJpaDAO;
import projetoVendasJpa.dao.generic.GenericJpaDB1DAO;
import projetoVendasJpa.domain.ProdutoJpa;

public class ProdutoJpaDAO   extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}
