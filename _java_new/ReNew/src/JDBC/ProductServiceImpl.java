package JDBC;

import java.util.List;

public class ProductServiceImpl implements Service {
	//ServiceImpl <-> DAO
	
	private DAO dao; //interface�� ����
	public ProductServiceImpl() {
		dao = new ProductDAOImpl(); //����ü
	}

	//����
	@Override
	public int register(Product p) {
		// ��ǰ��� �޼���
		System.out.println("register_service success!!");
		//dao���� ���Ǵ� �޼���� ���� db���� ����ϴ� ��ɾ�� ����ϰ� �޼��带 �ۼ�
		return dao.insert(p);
	}

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		System.out.println("list_service success!!");
		return dao.selectList();
	}

	@Override
	public Product detail(int pno) {
		System.out.println("datail_service success!!");
		return dao.selectOne(pno);
	}

	@Override
	public int modify(Product p) {
		// TODO Auto-generated method stub
		System.out.println("modify_service success!!");
		return dao.update(p);
	}

	@Override
	public int remove(int pno) {
		// TODO Auto-generated method stub
		System.out.println("remove_service success!!");
		return dao.delete(pno);
	}
	
	
}
