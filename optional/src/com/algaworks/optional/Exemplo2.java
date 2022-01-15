package com.algaworks.optional;

import java.math.BigDecimal;

import com.algaworks.optional.domain.CatalogoProdutos;

public class Exemplo2 {

	public static void main(String[] args) {
		CatalogoProdutos catalogo = new CatalogoProdutos();
		
//		BigDecimal preco = catalogo.buscarPreco("Picanha 1kg").orElse(BigDecimal.ZERO);
		
		BigDecimal preco = catalogo.buscarPreco("Picanha 12kg")
				.orElseThrow(() -> new RuntimeException("Preço do produto não encontrado"));
		
		System.out.println(preco);
	}
	
}
