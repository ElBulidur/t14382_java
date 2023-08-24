package br.com.juliopereira.domain.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.juliopereira.domain.entidades.Funcionario;

public class FuncionarioRepository extends BaseRepository<Funcionario> {

	public FuncionarioRepository() {
		super("funcionarios");
		super.setInsertSQL(String.format("INSERT INTO %s(nome, setor, salario, ativo) VALUES (?, ?, ?, ?)", this.table));
		super.setUpdateSQL(String.format("UPDATE %s set nome = ?, setor = ?, salario = ?, ativo=? WHERE id = ?", this.table));
	}

	@Override
	protected void setStatementValues(PreparedStatement stmt, Funcionario entity) throws SQLException {

		stmt.setString(1, entity.nome);
		stmt.setString(2, entity.setor);
		stmt.setDouble(3, entity.salario);
		stmt.setBoolean(4, entity.ativo);
		
		if (entity.id != 0) stmt.setInt(5, entity.id);
		
	}

	@Override
	protected Funcionario getEntity(ResultSet rs) {
		var funcionario = new Funcionario();
		
		try {
			funcionario.setNome(rs.getString("nome"));
			funcionario.setSetor(rs.getString("setor"));
			funcionario.setSalario(rs.getDouble("salario"));
			funcionario.setAtivo(rs.getBoolean("ativo"));
			
			return funcionario;
		} catch (SQLException e) {
			throw new RuntimeException("Erro: "+ e);
		}
		
	}

	
}
