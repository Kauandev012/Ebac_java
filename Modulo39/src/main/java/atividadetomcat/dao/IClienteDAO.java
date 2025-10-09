package atividadetomcat.dao;

import java.util.List;

import atividadetomcat.dao.generic.IGenericDAO;
import atividadetomcat.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{
	
	List<Cliente> filtrarClientes(String query);
}
