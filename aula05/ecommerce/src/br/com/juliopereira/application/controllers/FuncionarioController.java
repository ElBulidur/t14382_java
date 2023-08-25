package br.com.juliopereira.application.controllers;

import java.util.ArrayList;

import br.com.juliopereira.domain.entidades.Funcionario;
import br.com.juliopereira.domain.repositories.FuncionarioRepository;

public class FuncionarioController {
	private FuncionarioRepository repo;
	
	public FuncionarioController() {
		this.repo = new FuncionarioRepository();
	}
	
	public void CriaFuncionario(String nome, String setor, Double salario) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.nome = nome;
		funcionario.setor = setor;
		funcionario.salario = salario;
		funcionario.ativo = true;
		
		this.repo.Criar(funcionario);
	}
	
	public void AtualizarFuncionario(int id, String nome, String setor, Double salario) {
		Funcionario funcionario = new Funcionario();

		funcionario.id = id;
		funcionario.nome = nome;
		funcionario.setor = setor;
		funcionario.salario = salario;
		
		this.repo.Atualizar(funcionario);

		System.out.println("Funcionario ATUALIZADO com sucesso!!!");
	}
	
	public ArrayList<Funcionario> PegarFuncionarios(){
		return this.repo.PegarTodos();
	}
	
	public Funcionario PegarFuncionarioPorId(int id) {
		var result = this.repo.PegarPorId(id);
		
		if(result == null) {
			System.out.println("Nao foi encontrado este funcionario no banco!!!");
		}
		
		return result;
		
	}
	
	public void DeletarFuncionario(int id) {
		this.repo.Deletar(id);
	}
	
}
