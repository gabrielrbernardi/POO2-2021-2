package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {	
	private static Connection conexao = null;
	
	private DbConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/poo", "root", "teste123");
		} 
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Database Connection ERROR!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getInstance() {
		if (conexao == null) {
			System.out.println("entrou");
			new DbConnection();
		}
		return conexao;
	}
}
