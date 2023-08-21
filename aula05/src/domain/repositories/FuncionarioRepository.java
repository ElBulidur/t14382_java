package aula05.src.domain.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import aula05.src.infra.databases.MysqlDB;


public class FuncionarioRepository {
    private Connection conexao;

    public FuncionarioRepository(){
        this.conexao = new MysqlDB().getConnection();
    }

    public void criar(String nome, String setor, Double salario, Boolean ativo){
        String sql = "INSERT INTO funcionarios(nome, setor, salario, ativo)"+
        " VALUES(?,?,?,?)";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1,nome);
            stmt.setString(2, setor);
            stmt.setDouble(3, salario);
            stmt.setBoolean(4, ativo);

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro: " + e.getMessage());
        }
    }

}
