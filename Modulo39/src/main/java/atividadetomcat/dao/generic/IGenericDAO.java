package atividadetomcat.dao.generic;

import java.io.Serializable;
import java.util.Collection;

import atividadetomcat.domain.Persistence;
import atividadetomcat.exceptions.DAOException;
import atividadetomcat.exceptions.MaisDeUmRegistroException;
import atividadetomcat.exceptions.TableException;
import atividadetomcat.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericDAO <T extends Persistence, E extends Serializable> {
	
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;
  
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}
