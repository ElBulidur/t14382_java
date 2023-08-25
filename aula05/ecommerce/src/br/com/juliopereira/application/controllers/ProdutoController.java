package br.com.juliopereira.application.controllers;

import java.util.ArrayList;

import br.com.juliopereira.domain.entidades.Produto;
import br.com.juliopereira.domain.repositories.ProdutoRepository;

public class ProdutoController {
	private ProdutoRepository repo;
	
	public ProdutoController() {
		this.repo = new ProdutoRepository();
	}
	
	
	public void CriaProduto(String codigo, String nome, String unidade, Double valor) {
		Produto produto = new Produto();
		
		produto.codigo = codigo;
		produto.nome = nome;
		produto.unidade = unidade;
		produto.valor = valor;
		
		this.repo.Criar(produto);
		
		//System.out.println("Funcionario CRIADO com sucesso!!!");
	}
	
	public void AtualizarProduto(int id, String codigo, String nome, String unidade, Double valor) {
		Produto produto = new Produto();
		
		produto.id = id;
		produto.codigo = codigo;
		produto.nome = nome;
		produto.unidade = unidade;
		produto.valor = valor;
		
		this.repo.Atualizar(produto);

		//System.out.println("Funcionario ATUALIZADO com sucesso!!!");
	}
	
	public ArrayList<Produto> PegarProduto(){
		return this.repo.PegarTodos();
	}
	
	public Produto PegarProdutoPorId(int id) {
		var result = this.repo.PegarPorId(id);
		
		return result;
		
	}
	
	public void DeletarProduto(int id) {
		this.repo.Deletar(id);
	}

}
