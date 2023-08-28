package br.com.juliopereira.views;

import br.com.juliopereira.application.services.CarrinhoService;
import br.com.juliopereira.application.services.FuncionarioService;
import br.com.juliopereira.application.services.ProdutoService;

public class AppConsole {

	public static void main(String[] args) {

		FuncionarioService func = new FuncionarioService();
		ProdutoService prod = new ProdutoService();
		CarrinhoService srv = new CarrinhoService();
		
		// Primeiro produto
		var produto1 = prod.PegarProdutoPorId(1);
		
		// adicionando produto no carrinho
		srv.adicionarProduto(produto1);
		
		// pegando o funcionario
		var funcionario = func.PegarFuncionarioPorId(1);
		
		srv.Checkout(04, funcionario);
		System.out.println("Caixa: "+srv.getCheckout().getCaixa());
		System.out.println("Funcionário: "+srv.getCheckout().getFuncionario());
		System.out.println("Total da compra: "+srv.getTotal());
		
		
	}

}
