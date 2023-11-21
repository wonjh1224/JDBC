package boardJDBC;

import java.util.List;

public class BoardServiceImpl implements Service {

	private DAO dao;
	
	public BoardServiceImpl() {
		dao = new BoardDAOImpl();
	}

	@Override
	public int register(BoardVO b) {
		// 게시글 등록 메서드
		System.out.println("register_service success!");
		return dao.insert(b);
	}

	@Override
	public List<BoardVO> list() {
		System.out.println("list_service success!");
		return dao.selectList();
	}

	@Override
	public BoardVO detail(int bno) {
		System.out.println("detail_service success");
		return dao.selectOne(bno);
	}

	@Override
	public int modify(BoardVO b) {
		// TODO Auto-generated method stub
		System.out.println("modify_service success "+b);
		return dao.update(b);
	}

	@Override
	public int remove(int bno) {
		// TODO Auto-generated method stub
		System.out.println("remove_service success");
		return dao.delete(bno);
	}
	
}
