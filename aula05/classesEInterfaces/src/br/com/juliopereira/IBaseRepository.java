package br.com.juliopereira;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface IBaseRepository<Entity> {
	void Criar(Entity entity);
	
	void setStatementValues(PreparedStatement stmt, Entity entity) throws SQLException;	
	
	
}
