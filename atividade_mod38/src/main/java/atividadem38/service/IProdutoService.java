package atividadem38.service;

import atividadem38.domain.Produto;
import atividadem38.services.generic.IGenericService;

import java.util.List;

public interface IProdutoService extends IGenericService<Produto, String> {

    List<Produto> filtrarProdutos(String query);
}
