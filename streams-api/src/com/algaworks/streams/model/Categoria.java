package com.algaworks.streams.model;

public class Categoria {

	private String nome;

	public Categoria(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return getNome();
	}

}
