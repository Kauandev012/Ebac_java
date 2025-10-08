package com.atividademod42.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.atividademod42.domain.Produto;
import com.atividademod42.domain.Produto.Status;

@Repository
public interface IProdutoRepository extends MongoRepository<Produto, String>{
	
	Optional<Produto> findByCodigo(String codigo);
	
	Page<Produto> findAllByStatus(Pageable pageable, Status status);
}
