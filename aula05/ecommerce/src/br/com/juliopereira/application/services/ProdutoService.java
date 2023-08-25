package br.com.juliopereira.application.services;

import br.com.juliopereira.application.controllers.ProdutoController;

public class ProdutoService extends ProdutoController{

		public ProdutoService() {}
		
		public void NovoProduto(String codigo, String nome, String unidade, Double valor) {
			this.CriaProduto(codigo, nome, unidade, valor);
			
			System.out.println("Produto cadastrado com sucesso!");
		}
		
		public void ImprimirTodosOsProdutos() {
			var produtos = this.PegarProduto();
			
			for (var p : produtos) {
				System.out.println(
						String.format(
								"Produto: %s, Valor: %s", 
								p.nome, p.valor
							));
			}
		}
		
		
		
		
}
