package aula05.src.infra.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import aula05.src.domain.entities.Funcionario;

public class MysqlDB {

    public static void main(String[] args){
        getConnection();
        System.out.println("conectou");
    }
    
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
