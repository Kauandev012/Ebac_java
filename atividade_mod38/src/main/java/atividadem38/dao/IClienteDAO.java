package atividadem38.dao;

import atividadem38.dao.generic.IGenericDAO;
import atividadem38.domain.Cliente;

import java.util.List;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

    List<Cliente> filtrarClientes(String query);

}
