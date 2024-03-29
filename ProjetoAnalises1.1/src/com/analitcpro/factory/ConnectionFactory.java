package com.analitcpro.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	private static final String URL = "jdbc:mysql://localhost:3306/bancoappmain";

	public static Connection ConnectionToMySQL() throws Exception{

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		return conn;

	}

	
	public static void main(String[] args) throws Exception {
		
		Connection conn = ConnectionToMySQL();
		if (conn != null) {
			conn.close();
			System.out.println("Connection whit success");
		}
		
	}
}
