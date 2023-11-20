package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAOImpl implements DAO {
	
	//DB�� ����
	//DB�� ���� �����ϴ� ����
	
	//DB�� �����ϴ� ����
	private Connection conn;
	//sql������ �����Ű�� ����� ���� ��ü
	private PreparedStatement pst;
	//������ ����
	private String query="";
	
	public ProductDAOImpl() {
		//DB ���������� �����ϴ� class �̱������� ����
		DatabaseConnection dbc = DatabaseConnection.getInstance();
		conn = dbc.getConnection();
	}

	public int insert(Product p) {
		// TODO Auto-generated method stub
		System.out.println("insert DAO success");
		query = "insert into product(pname, price, madeby) values(?,?,?)";
		try {
			pst = conn.prepareStatement(query);
			
			//? ���� ����
			pst.setString(1, p.getPname());
			pst.setInt(2, p.getPrice());
			pst.setString(3, p.getMadeby());
			
			return pst.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("insert error");
			e.printStackTrace();
		}
		return 0;
	}
	
	
	
	
	

}
