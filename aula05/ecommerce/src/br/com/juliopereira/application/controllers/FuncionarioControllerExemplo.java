package br.com.juliopereira.application.controllers;

import java.util.ArrayList;

import br.com.juliopereira.domain.entidades.Funcionario;
import br.com.juliopereira.domain.repositories.FuncionarioRepositoryExemplo;

public class FuncionarioControllerExemplo {

	private FuncionarioRepositoryExemplo repo;
	
	public FuncionarioControllerExemplo() {
		this.repo = new FuncionarioRepositoryExemplo();
	}
	
	public void CadastrarFuncionario(String nome, String setor, Double salario, Boolean ativo) {
		//var newFuncionario = new Object();

		repo.Criar(nome, setor, salario, ativo);
		
		System.out.println("Criado com sucesso!");
		
	}
	
	public void ImprimirFunciopnarios() {
		ArrayList<Funcionario> funcionarios = repo.LerFuncionarios();
		
		for (Funcionario u: funcionarios) {			
			System.out.println(u);
		}
		
		
	}
	
	public void ImprimirDadosFuncionario(int id) {
		Funcionario funcionario = repo.LerFuncionarioPorId(id);
		System.out.println(funcionario.nome);
		
	}
	
	public void AtualizarFuncionario(int id, String nome, String setor, Double salario, boolean ativo) {
		repo.Atualizar(id, nome, setor, salario, ativo);
		System.out.println("Atualizado com sucesso!!!");
	}
	
	public void DeletarFuncionario(int id) {
		repo.Deletar(id);
		
		System.out.print("Deletado com sucesso!!!");
	}
	
	
	
}
