package br.com.juliopereira.abstracao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.juliopereira.ProdutoEntity;

public class ProdutoRepositoryCA extends BaseRepositoryCA<ProdutoEntity> {

	public ProdutoRepositoryCA(String table) {
		super(table);
		super.setInsertSQL(String.format("INSERT INTO %s(nome, valor) VALUES (?, ?)", this.table));
		super.setUpdateSQL(String.format("UPDATE %s set nome = ?, valor = ? WHERE id = ?", this.table));
	}

	@Override
	protected void setStatementValues(PreparedStatement stmt, ProdutoEntity entity) throws SQLException {

		stmt.setString(1, entity.nome);
		stmt.setDouble(2, entity.valor);
		
		if (entity.id != 0) stmt.setInt(3, entity.id);
		
	}
	
	@Override
	protected ProdutoEntity getEntity(ResultSet rs) {
		ProdutoEntity produto = new ProdutoEntity();
		
		try {
			
			produto.setId(rs.getInt("id"));
			produto.setNome(rs.getString("nome"));
			produto.setValor(rs.getDouble("valor"));
			
			return produto;
			
		}catch(SQLException e) {
			throw new RuntimeException("Erro:"+ e);
		}
		
	}

	
	
	
	
	public void CriarProduto(String nome, Double valor) {
		var produto = new ProdutoEntity();
		
		produto.nome = nome;
		produto.valor = valor;
		
		this.Criar(produto);
		
		System.out.println("Cadastrado com sucesso!!!");
	}	
	
	public void AtualizarProduto(int id, String nome, Double valor) {
		var produto = new ProdutoEntity();
		
		produto.id = id;
		produto.nome = nome;
		produto.valor = valor;
		
		this.Atualizar(produto);
		
		System.out.println("Atualizado com sucesso!!!");
	}

	
	
	
	
}
