package com.one.digitalonovation.gof.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.one.digitalonovation.gof.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {
    
}
