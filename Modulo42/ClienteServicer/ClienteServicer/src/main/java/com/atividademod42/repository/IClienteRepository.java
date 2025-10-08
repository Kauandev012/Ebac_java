package com.atividademod42.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.atividademod42.domain.Cliente;

@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String> {

	Optional<Cliente> findByCpf(Long cpf);
}
