package br.com.juliopereira;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoRepositoryI implements IBaseRepository<ProdutoEntity> {
	public String table = "produtos";
	private Connection conn;
	private String insertSQL;
	
	public ProdutoRepositoryI() {
		this.conn = new MysqlDB().getConnection();
		
		this.insertSQL = String.format("INSERT INTO %s(nome, valor) VALUES (?, ?)", this.table);
	}

	@Override
	public void Criar(ProdutoEntity entity) {
		
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

	@Override
	public void setStatementValues(PreparedStatement stmt, ProdutoEntity entity) throws SQLException {

		stmt.setString(1, entity.nome);
		stmt.setDouble(2, entity.valor);
		
	}
	
	public void CriarProduto(String nome, Double valor) {
		var produto = new ProdutoEntity();
		
		produto.nome = nome;
		produto.valor = valor;
		
		this.Criar(produto);
		
		System.out.println("Cadastrado com sucesso!!!");
	}
	

}
