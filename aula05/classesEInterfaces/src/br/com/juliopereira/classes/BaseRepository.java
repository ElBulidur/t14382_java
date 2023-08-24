package br.com.juliopereira.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.juliopereira.MysqlDB;

public class BaseRepository {
	private Connection conn;
	public String table;
	private String insertSQL;
	
	private ArrayList<String> campos;

	public BaseRepository(String table) {
		this.conn = new MysqlDB().getConnection();
		this.table = table;	
	}
	
	protected void setStatementValues(PreparedStatement stmt, Object obj) throws SQLException{};
	
	public void Criar(Object obj) {
		try {
			//3 criar o statment
			PreparedStatement stmt = this.conn.prepareStatement(this.insertSQL);

			// set os valores nos campos
			this.setStatementValues(stmt, obj);
			
			// executa a consulta
			stmt.execute();
			
		}catch(SQLException e) {
			throw new RuntimeException("Erro: " + e.getMessage());
		}
	}
	
	public void setInsertSQL(String sql) {
		this.insertSQL = sql;
	}
	
}
