package com.algaworks.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.algaworks.streams.model.Produto;
import com.algaworks.streams.model.Produto.Status;

public class ExemploAnyMatch {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Água 2L", Status.ATIVO, new BigDecimal(9.9)));
		produtos.add(new Produto("Picanha 1kg", Status.ATIVO, new BigDecimal(109.5)));
		produtos.add(new Produto("Carvão", Status.INATIVO, new BigDecimal(34.2)));
		produtos.add(new Produto("Cerveja 600ml", Status.ATIVO, new BigDecimal(8.4)));
		produtos.add(new Produto("Cupim 2kg", Status.ATIVO, new BigDecimal(92)));
		
//		boolean temPicanha = false;
//		
//		for (Produto produto : produtos) {
//			if (produto.getNome().equals("Picanha 1kg")) {
//				temPicanha = true;
//				break;
//			}
//		}
		
		boolean temPicanha = produtos.stream()
			.anyMatch(p -> p.getNome().equals("Picanha 1kg"));
		
		System.out.println(temPicanha);
	}
	
}
