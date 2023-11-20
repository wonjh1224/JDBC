package JDBC;

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
	
	
}
