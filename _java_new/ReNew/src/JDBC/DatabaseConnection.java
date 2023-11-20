package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	//DB ����
	//DB Driver, URL, user, password
	//driver : com.mysql.cj.jdbc.Driver
	//url : jdbc:mysql://localhost:3306/db��(javadb)
	//user : javaUser
	//password : mysql
	
	private static DatabaseConnection dbc = new DatabaseConnection();
	private Connection conn = null;
	private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	private String jdbcUrl = "jdbc:mysql://localhost:3306/javadb";
	
	private DatabaseConnection() {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcUrl, "javaUser", "mysql");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� �� �����ϴ�.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("���������� ��Ȯ���� �ʽ��ϴ�.");
			e.printStackTrace();
		}
	}
	
	public static DatabaseConnection getInstance() {
		return dbc;
	}
	public Connection getConnection() {
		return conn;
	}
	
	
}
