package br.com.juliopereira.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public interface IDatabases {
	Connection getConnection();
	
}