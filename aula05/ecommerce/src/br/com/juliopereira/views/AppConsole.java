package br.com.juliopereira.views;

import br.com.juliopereira.application.controllers.FuncionarioController;

public class AppConsole {

	public static void main(String[] args) {
		
		FuncionarioController srv = new FuncionarioController();
		
		// TESTES COM FUNCIONARIOCONTROLLEREXEMPLO
		//srv.ImprimirFunciopnarios();
		//srv.ImprimirDadosFuncionario(1);
		//srv.AtualizarFuncionario(1, "Julio Pereira", "Instrutor", 120.40, true);
		//srv.DeletarFuncionario(2);
		
		//TESTES COM FUNCIONARIOCONTROLLER
		//srv.CriaFuncionario("Henrique", "Tester", 450.63);
		//srv.AtualizarFuncionario(1, "Julio Pereira", "Instrutor", 1500.54);
		
		var funcionarios = srv.PegarFuncionarios();
		var funcionario = srv.PegarFuncionarioPorId(1);
		
		//funcionarios.forEach(funcionario -> System.out.println(funcionario.nome));
		
		if (funcionario != null)
		 System.out.println(funcionario.nome);
		
		

	}

}
