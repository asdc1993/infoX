package br.com.infox.dal;

import java.sql.Connection;
import java.sql.DriverManager;

public class ModuloConexao {
	public static Connection conector() {
		java.sql.Connection conexao = null;
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://192.168.0.20:3306/dbinfox?useSSL=false";
		String user = "admin";
		String password = "123@senac";
		try {
			Class.forName(driver);
			conexao = DriverManager.getConnection(url, user, password);
			return conexao;
		} catch (Exception e) {
			return null;
		}
	}
}
