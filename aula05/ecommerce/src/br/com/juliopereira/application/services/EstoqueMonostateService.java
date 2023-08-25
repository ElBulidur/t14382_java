package br.com.juliopereira.application.services;

import java.util.ArrayList;
import java.util.List;

import br.com.juliopereira.domain.entidades.Produto;

public class EstoqueMonostateService {
	private List<Produto> produtos;
	
	
	public EstoqueMonostateService() {
		produtos = new ArrayList<Produto>();
	}
	
	public void setProdutos(List<Produto> produtos) {
		produtos.forEach(p -> this.produtos.add(p));
	}
	
	public List<Produto> getProdutos(){
		return produtos;
	}

}
