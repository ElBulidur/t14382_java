package br.com.juliopereira.domain.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.juliopereira.domain.entidades.Produto;

public class ProdutoRepository extends BaseRepository<Produto>{

	public ProdutoRepository() {
		super("produtos");
		super.setInsertSQL(String.format("INSERT INTO %s(codigo, nome, unidade, valor) VALUES (?, ?, ?, ?)", this.table));
		super.setUpdateSQL(String.format("UPDATE %s set codigo = ?, nome = ?, unidade = ?, valor=? WHERE id = ?", this.table));
	}

	@Override
	protected void setStatementValues(PreparedStatement stmt, Produto entity) throws SQLException {
		stmt.setString(1, entity.codigo);
		stmt.setString(2, entity.nome);
		stmt.setString(3, entity.unidade);
		stmt.setDouble(4, entity.valor);
		
		if (entity.id != 0) stmt.setInt(5, entity.id);
		
	}

	@Override
	protected Produto getEntity(ResultSet rs) {
		var produto = new Produto();
		
		try {
			produto.setCodigo(rs.getString("codigo"));
			produto.setNome(rs.getString("nome"));
			produto.setUnidade(rs.getString("unidade"));
			produto.setValor(rs.getDouble("valor"));
			
			return produto;
		} catch (SQLException e) {
			throw new RuntimeException("Erro: "+ e);
		}
	}

}
