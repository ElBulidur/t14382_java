package br.com.juliopereira.application.services;

import br.com.juliopereira.application.controllers.FuncionarioController;

public class FuncionarioService extends FuncionarioController {
	
	public FuncionarioService() {
		
	}
	
	public void NovoFuncionario(String nome, String setor, Double salario) {
		this.CriaFuncionario(nome, setor, salario);
		System.out.println("Funcionario CRIADO com sucesso!!!");
	}
	
	public void AumentarSalario(int id, Double aumento) {
		var funcionario = this.PegarFuncionarioPorId(id);
		
		this.AtualizarFuncionario(id, funcionario.nome, funcionario.setor, aumento);
	}
	
	public void ImprimirNomesDosFuncionarios() {
		var funcionarios = this.PegarFuncionarios();
		
		funcionarios.forEach(funcionario -> System.out.println(funcionario.nome));
	}

		
}
