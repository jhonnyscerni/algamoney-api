package com.algaworks.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.algamoneyapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
