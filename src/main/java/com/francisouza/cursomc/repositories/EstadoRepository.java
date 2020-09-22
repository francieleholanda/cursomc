package com.francisouza.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francisouza.cursomc.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
