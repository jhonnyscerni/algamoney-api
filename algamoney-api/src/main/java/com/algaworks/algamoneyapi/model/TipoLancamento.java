package com.algaworks.algamoneyapi.model;

public enum TipoLancamento {

	RECEITA("Receita"),
	DESPESA("Despesa");
	
	private String descricao;

	private TipoLancamento(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
