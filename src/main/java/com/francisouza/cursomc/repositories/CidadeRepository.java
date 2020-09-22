package com.francisouza.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francisouza.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
