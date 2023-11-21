package boardJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private static DatabaseConnection dbc = new DatabaseConnection();
	private Connection conn = null;
	private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	private String jdbcUrl = "jdbc:mysql://localhost:3306/javadb";
	private String user = "javaUser";
	private String password = "mysql";
	
	private DatabaseConnection() {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcUrl, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver Not Found");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connection Info Error");
		}
	}
	
	public static DatabaseConnection getInstance() {
		return dbc;
	}
	public Connection getConnection() {
		return conn;
	}
	
}
