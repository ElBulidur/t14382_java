package br.com.juliopereira.views;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.juliopereira.application.controllers.FuncionarioController;
import br.com.juliopereira.application.services.EstoqueMonostateService;
import br.com.juliopereira.application.services.EstoqueSingletonService;
import br.com.juliopereira.application.services.FuncionarioService;
import br.com.juliopereira.application.services.ProdutoService;
import br.com.juliopereira.domain.entidades.Produto;

public class AppConsole {

	public static void main(String[] args) {

		FuncionarioService srv1 = new FuncionarioService();
		ProdutoService srv2 = new ProdutoService();
		//srv1.ImprimirNomesDosFuncionarios();
		
		//srv2.ImprimirTodosOsProdutos();
		
		//srv2.NovoProduto(010, "Banana", "KG", 10.00);
		
		
		// TESTES COM FUNCIONARIOCONTROLLEREXEMPLO
		//srv.ImprimirFunciopnarios();
		//srv.ImprimirDadosFuncionario(1);
		//srv4.AtualizarFuncionario(1, "Julio Pereira", "Instrutor", 120.40, true);
		//srv.DeletarFuncionario(2);
		
		//TESTES COM FUNCIONARIOCONTROLLER
		//srv.CriaFuncionario("Henrique", "Tester", 450.63);
		//srv.AtualizarFuncionario(1, "Julio Pereira", "Instrutor", 1500.54);
		
		//var funcionarios = srv.PegarFuncionarios();
		//var funcionario = srv.PegarFuncionarioPorId(1);
		
		//funcionarios.forEach(funcionario -> System.out.println(funcionario.nome));
		
		var laranja = new Produto();
		laranja.nome = "laranja";

		var uva = new Produto();
		uva.nome = "uva";

		var pera = new Produto();
		pera.nome = "pera";

		List<Produto> produtos1 = (List) new ArrayList(Arrays.asList(laranja));
		List<Produto> produtos2 = (List) new ArrayList(Arrays.asList(uva, pera));
		
		// SINGLETON
		
		var estoque1 = EstoqueSingletonService.getInstance();
		estoque1.setProdutos(produtos1);

		var estoque2 = EstoqueSingletonService.getInstance();
		estoque2.setProdutos(produtos2);
		
		//System.out.println(estoque1);
		//System.out.println(estoque2);

		//System.out.println(estoque1 == estoque2);
		
		// MONOSTATE
		var estoque3 = new EstoqueMonostateService();
		estoque3.setProdutos(produtos1);
		
		var estoque4 = new EstoqueMonostateService();
		estoque4.setProdutos(produtos2);
		
		
		System.out.println(estoque3);
		System.out.println(estoque4);

		System.out.println(estoque3 == estoque4);
		
		System.out.println(estoque3.getProdutos() == estoque4.getProdutos());
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
