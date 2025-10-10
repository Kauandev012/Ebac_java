package atividadetomcat.service;

import java.util.List;


import atividadetomcat.domain.Cliente;
import atividadetomcat.exceptions.DAOException;
import atividadetomcat.services.generic.IGenericService;



public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);
}
