package com.atividademod42.usercase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividademod42.domain.Cliente;
import com.atividademod42.domain.Produto;
import com.atividademod42.repository.IProdutoRepository;

@Service
public class AlteraProduto {
	
	private IProdutoRepository produtoRepository;
	
	@Autowired
	public AlteraProduto(IProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public Produto alterarProduto(Long id, Cliente dadosAtualizados) {
		Produto clienteExistente = produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado com CPF: " + cpf));

        clienteExistente.setNome(dadosAtualizados.getNome());
        clienteExistente.setDescricao(dadosAtualizados.getDescricao());
        clienteExistente.setValor(dadosAtualizados.getValor());
        
        return clienteRepository.save(clienteExistente);
    }
}
