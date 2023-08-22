package br.com.juliopereira.domain.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.juliopereira.domain.entidades.Funcionario;
import br.com.juliopereira.infra.databases.MysqlDB;

public class FuncionarioRepository {
	//private Funcionario funcionario = new Funcionario();
	private Connection conn;
	
	public FuncionarioRepository() {
		this.conn = new MysqlDB().getConnection();
	}
	
	// criar
	public void Criar(String nome, String setor, Double salario, Boolean ativo){
        String sql = "INSERT INTO funcionarios(nome, setor, salario, ativo)"+
        " VALUES(?,?,?,?)";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1,nome);
            stmt.setString(2, setor);
            stmt.setDouble(3, salario);
            stmt.setBoolean(4, ativo);

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro: " + e.getMessage());
        }
	}
	
	public ArrayList<Funcionario> LerFuncionarios() {
		String sql = "SELECT * from funcionarios";
		
		
		ArrayList<Funcionario> funcionarios = new ArrayList();
		
		Funcionario funcionario = new Funcionario();
		
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet result = stmt.executeQuery();
			
			while(result.next()) {
				funcionario.setId(result.getInt("id"));
				funcionario.setNome(result.getString("nome"));
				funcionario.setSetor(result.getString("setor"));
				funcionario.setSalario(result.getDouble("salario"));
				funcionario.setAtivo(result.getBoolean("ativo"));
				
				funcionarios.add(funcionario);
			}
			
			return funcionarios;
			
		}catch(SQLException e) {
			throw new RuntimeException("Erro: " + e.getMessage());
		}
		
	}
	
	public Funcionario LerFuncionarioPorId(int id) {
		String sql = "SELECT * from funcionarios WHERE id=?";
		
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			
			ResultSet result = stmt.executeQuery();
			
			Funcionario funcionario = new Funcionario();
			
			if(result.next()) {
			
				funcionario.setId(result.getInt("id"));
				funcionario.setNome(result.getString("nome"));
				funcionario.setSetor(result.getString("setor"));
				funcionario.setSalario(result.getDouble("salario"));
				funcionario.setAtivo(result.getBoolean("ativo"));
			}
			
			return funcionario;
			
		}catch(SQLException e) {
			throw new RuntimeException("Erro: " + e.getMessage());
		}
		
	}
	
	public void Atualizar(int id, String nome, String setor, Double salario, Boolean ativo){
        String sql = "UPDATE funcionarios set nome = ?, setor = ?, salario = ?, ativo = ? WHERE id = ?";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1,nome);
            stmt.setString(2, setor);
            stmt.setDouble(3, salario);
            stmt.setBoolean(4, ativo);
            stmt.setInt(5, id);

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro: " + e.getMessage());
        }
	}
	
	public void Deletar(int id) {
		String sql = "DELETE FROM funcionarios WHERE id = ?";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.executeUpdate();
			
		}catch (SQLException e) {
            throw new RuntimeException("Erro: " + e.getMessage());
		}
		
	}
	
}
