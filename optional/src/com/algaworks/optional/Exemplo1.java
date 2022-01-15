package com.algaworks.optional;

import java.math.BigDecimal;

import com.algaworks.optional.domain.CatalogoProdutos;

public class Exemplo1 {

	public static void main(String[] args) {
		CatalogoProdutos catalogo = new CatalogoProdutos();
		
		catalogo.buscarOptional("Picanha 1kg").stream().forEach(produto -> {
			produto.setPreco(produto.getPreco().add(new BigDecimal(100)));
			
			System.out.println(produto.getPreco());
		});
	}
	
}
