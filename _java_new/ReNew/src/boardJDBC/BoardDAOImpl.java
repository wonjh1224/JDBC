package boardJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import JDBC.DatabaseConnection;

public class BoardDAOImpl implements DAO {
	
	//db연결
	private Connection conn; 
	private PreparedStatement pst; 
	private String query;
	private ResultSet rs;
	
	public BoardDAOImpl () {
		//데이터베이스 정보 객체 생성
		DatabaseConnection dbc = DatabaseConnection.getInstance();
		conn = dbc.getConnection();
	}

	@Override
	public int insert(BoardVO b) {
		// TODO Auto-generated method stub
		System.out.println("insert DAO success!");
		query = "insert into board(title, writer, content) values(?,?,?)";
		try {
			pst = conn.prepareStatement(query);
			// ? 값을 세탕
			pst.setString(1, b.getTitle());
			pst.setString(2, b.getWriter());
			pst.setString(3, b.getContent());
			
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insert error");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<BoardVO> selectList() {
		System.out.println("list DAO success!");
		query = "select * from board order by bno desc";
		List<BoardVO> list = new ArrayList<BoardVO>();
		
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int bno = rs.getInt("bno");
				list.add(new BoardVO(bno, rs.getString("title"), rs.getString("writer"), rs.getString("moddate"), rs.getInt("readcount")));
			}
			return list;
			
		} catch (SQLException e) {
			System.out.println("list error");
			e.getStackTrace();	
		}
		
		return null;
	}

	@Override
	public BoardVO selectOne(int bno) {
		System.out.println("detail DAO success!");
		String rd = "update board set readcount=readcount+1 where bno=?";
		query = "select * from board where bno=?";
		try {
			pst = conn.prepareStatement(rd);
			pst.setInt(1, bno);
			pst.executeUpdate();
			pst = conn.prepareStatement(query);
			pst.setInt(1, bno);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				return new BoardVO(
						rs.getInt("bno"),
						rs.getString("title"),
						rs.getString("writer"),
						rs.getString("content"),
						rs.getString("regdate"),
						rs.getString("moddate"),
						rs.getInt("readcount"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("detail error");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int update(BoardVO b) {
		System.out.println("update success");
		query = "update board set title=?, content=?, moddate=now() where bno=?";
		try {
			pst = conn.prepareStatement(query);
			
			pst.setString(1, b.getTitle());
			pst.setString(2, b.getContent());
			pst.setInt(3, b.getBno());
			return pst.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("update error");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int bno) {
		// TODO Auto-generated method stub
		System.out.println("delete DAO success!!");
		query = "delete from board where bno=?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, bno);
			return pst.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("delete error");
			e.printStackTrace();
		}
		return 0;
	}
	
}
