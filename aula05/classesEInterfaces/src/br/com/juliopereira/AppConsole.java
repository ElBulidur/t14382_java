package br.com.juliopereira;

import java.sql.Connection;

import br.com.juliopereira.abstracao.ProdutoRepositoryCA;

public class AppConsole {

	public static void main(String[] args) {
		//ProdutoRepository repoC = new ProdutoRepository("produtos");
		//repoC.CriarProduto("Banana", 10.56);

		ProdutoRepositoryCA repoCA = new ProdutoRepositoryCA("produtos");
		//repoCA.CriarProduto("Laranja", 5.56);
		//repoCA.AtualizarProduto(2, "Orange", 150.00);
		//System.out.println(repoCA.PegarPorId(2));
		//repoCA.Deletar(2);
		
		//ProdutoRepositoryI repoI = new ProdutoRepositoryI();
		//repoI.CriarProduto("Apple", 50.56);
		
		
		

	}

}
