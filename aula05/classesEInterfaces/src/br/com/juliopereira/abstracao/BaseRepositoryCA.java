package br.com.juliopereira.abstracao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.com.juliopereira.MysqlDB;

public abstract class BaseRepositoryCA<Entity> {
	private Connection conn;
	public String table;
	private String insertSQL;
	
	private String updateSQL;
		
	public BaseRepositoryCA(String table) {
		this.table = table;
		this.conn = new MysqlDB().getConnection();
	}
	
	protected abstract void setStatementValues(PreparedStatement stmt, Entity entity) throws SQLException;
	
	protected abstract Entity getEntity(ResultSet rs);

	// criar
 	public void Criar(Entity entity) {
		try {
			//3 criar o statment
			PreparedStatement stmt = this.conn.prepareStatement(this.insertSQL);

			// set os valores nos campos
			this.setStatementValues(stmt, entity);
			
			// executa a consulta
			stmt.execute();
			
		}catch(SQLException e) {
			throw new RuntimeException("Erro: " + e.getMessage());
		}
	}
	
	// atualizar
	public void Atualizar(Entity entity) {
		try {
			//3 criar o statment
			PreparedStatement stmt = this.conn.prepareStatement(this.updateSQL);

			// set os valores nos campos
			this.setStatementValues(stmt, entity);
			
			// executa a consulta
			stmt.execute();
			
		}catch(SQLException e) {
			throw new RuntimeException("Erro: " + e.getMessage());
		}
	}

	// Ler todos
	public ArrayList<Entity> PegarTodos() {
		String sql = String.format("SELECT * from %s", this.table);
		
		try {
			Statement stmt = this.conn.createStatement();

			stmt.execute(sql);
			ResultSet rs = stmt.getResultSet();
			
			ArrayList list = new ArrayList<Entity>();

			while(rs.next()) {
				Entity entity =  getEntity(rs);
				
				list.add(entity);
			}
			
			return list;
			
		}catch(SQLException e) {
			throw new RuntimeException("Erro:"+ e);
		}
	}
	
	// Ler Por Id
	public Entity PegarPorId(int id) {
		String sql = String.format("SELECT * from %s WHERE id = ?", this.table);
		
		try {
			PreparedStatement stmt = this.conn.prepareStatement(sql);
			stmt.setInt(1, id);

			stmt.execute();
			ResultSet rs = stmt.getResultSet();
			

			if(rs.next()) {
				return getEntity(rs);
			}
			
			return null;
			
			
		}catch(SQLException e) {
			throw new RuntimeException("Erro:"+ e);
		}
		
	}

	// Deletar
	public void Deletar(int id) {
		String sql = String.format("DELETE FROM %s WHERE id = ?", this.table);
		
		try {
			PreparedStatement stmt = this.conn.prepareStatement(sql);
			stmt.setInt(1, id);

			stmt.execute();
			
		}catch(SQLException e) {
			throw new RuntimeException("Erro:"+ e);
		}
	}
	
	public void setInsertSQL(String sql) {
		this.insertSQL = sql;
	}
	
	public void setUpdateSQL(String sql) {
		this.updateSQL = sql;
	}
	

}
