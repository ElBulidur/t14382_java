package br.com.juliopereira.application.services;

import java.util.ArrayList;
import java.util.List;

import br.com.juliopereira.domain.entidades.Produto;

public class EstoqueSingletonService {
	
	//Singleton
	private static final EstoqueSingletonService instance = new EstoqueSingletonService();
	private List<Produto> produtos;
	
	private EstoqueSingletonService() {
		produtos = new ArrayList<Produto>();
	}
	
	public static EstoqueSingletonService getInstance() {
		return instance;
	}
	
	public void setProdutos(List<Produto> produtos) {
		produtos.forEach(p -> this.produtos.add(p));
	}	

}
