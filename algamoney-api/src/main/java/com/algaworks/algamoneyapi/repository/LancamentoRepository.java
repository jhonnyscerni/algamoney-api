package com.algaworks.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.algamoneyapi.model.Lancamento;
import com.algaworks.algamoneyapi.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> , LancamentoRepositoryQuery {

}
