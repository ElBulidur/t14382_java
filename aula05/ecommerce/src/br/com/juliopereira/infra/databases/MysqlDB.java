package br.com.juliopereira.infra.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlDB {

	public static Connection getConnection(){
		String url = "jdbc:mysql://localhost:3306/app";
	    String usuario = "root";
	    String password = "root";
	
        try {
            return DriverManager.getConnection(url, usuario, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
	}
}
