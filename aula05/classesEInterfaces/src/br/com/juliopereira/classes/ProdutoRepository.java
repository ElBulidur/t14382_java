package br.com.juliopereira.classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.juliopereira.ProdutoEntity;

public class ProdutoRepository extends BaseRepository {

	public ProdutoRepository(String table) {
		//1 injeta a tabela
		super(table); // produtos
		//2 criar o query sql
		super.setInsertSQL(String.format("INSERT INTO %s(nome, valor) VALUES (?, ?)", this.table));
	}
	
	// polimorfismo
	protected void setStatementValues(PreparedStatement stmt, Object obj) throws SQLException {
		ProdutoEntity produto = (ProdutoEntity) obj;
		
		stmt.setString(1, produto.getNome());
		stmt.setDouble(2, produto.getValor());
	}
	
	
	public void CriarProduto(String nome, Double valor) {
		ProdutoEntity produto = new ProdutoEntity();
		
		produto.nome = nome;
		produto.valor = valor;
		
		Criar(produto);
		System.out.println("Produto criado com sucesso!!!");
	}
	
}
