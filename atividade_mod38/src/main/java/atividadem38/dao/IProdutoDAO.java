package atividadem38.dao;

import atividadem38.dao.generic.IGenericDAO;
import atividadem38.domain.Produto;

import java.util.List;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {

    List<Produto> filtrarProdutos(String query);
}
