package com.algaworks.optional.domain;

import java.math.BigDecimal;

public class Produto {

	enum Status {
		ATIVO, INATIVO
	}

	private String nome;
	private Status status;
	private BigDecimal preco;

	public Produto(String nome, Status status, BigDecimal preco) {
		super();
		this.nome = nome;
		this.status = status;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public Status getStatus() {
		return status;
	}

	public BigDecimal getPreco() {
		return preco;
	}
	
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public void inativar() {
		System.out.println("Inativando " + getNome());
		
		this.status = Status.INATIVO;
	}

}
