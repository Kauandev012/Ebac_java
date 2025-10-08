package com.atividademod42.usercas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividademod42.domain.Cliente;
import com.atividademod42.repository.IClienteRepository;

@Service
public class AlteraCliente {
	
	private IClienteRepository clienteRepository;
	
	@Autowired
	public AlteraCliente(IClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente alterarCliente(Long cpf, Cliente dadosAtualizados) {
        Cliente clienteExistente = clienteRepository.findByCpf(cpf)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado com CPF: " + cpf));

        clienteExistente.setNome(dadosAtualizados.getNome());
        clienteExistente.setTel(dadosAtualizados.getTel());
        clienteExistente.setEmail(dadosAtualizados.getEmail());
        clienteExistente.setEnd(dadosAtualizados.getEnd());
        clienteExistente.setNumero(dadosAtualizados.getNumero());
        clienteExistente.setCidade(dadosAtualizados.getCidade());

        return clienteRepository.save(clienteExistente);
    }
	
}
