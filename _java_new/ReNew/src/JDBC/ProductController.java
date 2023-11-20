package JDBC;

import java.util.List;
import java.util.Scanner;

public class ProductController {
	/* ��ǰ���, ��ǰ����Ʈ����, ��ǰ�󼼺���, ��ǰ����, ��ǰ����
	 * Controller <-> Service <-> DAO <-> DB
	 * Controller���� �б�ó�� ��� �޴��� ó�� 
	 * */
	
	private Scanner scan;
	private Service svc;
	private boolean flag; //���ắ��
	
	public ProductController() {
		scan = new Scanner(System.in);
		svc = new ProductServiceImpl(); //service ����ü
		flag = true;
		printMenu();
	}

	private void printMenu() {
		// flag�� true�� ��� �޴� ���
		while(flag) {
			System.out.println("--��ǰ�������α׷�--");
			System.out.println("1.��ǰ���|2.��ǰ���|3.��ǰ�˻�");
			System.out.println("4.��ǰ����|5.��ǰ����|6.����");
			System.out.println("menu >>");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:register(); break;
			case 2:list(); break;
			case 3:detail(); break;
			case 4:mmodify(); break;
			case 5:remove(); break;
			default:
				flag = false;
				break;
			}
		}
	}

	private void remove() {
		// TODO Auto-generated method stub
		
	}

	private void mmodify() {
		// TODO Auto-generated method stub
		
	}

	private void detail() {
		// ��ǰ �� ����
		System.out.println("��ǰ��ȣ > ");
		int pno = scan.nextInt();
		Product p = svc.detail(pno);
		System.out.println(p);
	}

	private void list() {
		// ��ǰ��ü ����Ʈ
		List<Product> list = svc.list();
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}

	private void register() {
		// ��ǰ���
		System.out.println("��ǰ��:");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println("��ǰ����:");
		int price = scan.nextInt();
		System.out.println("��ǰ�󼼳���:");
		scan.nextLine();
		String madeBy = scan.nextLine();
		
		Product p = new Product(name, price, madeBy);
		
		//svc���� ����� ��û�ϴ� �޼��带 �ۼ�
		//insert�� �ϰԵǸ� ���ϵǴ� ���� ��� ���� insert�Ǿ����� ���� ����
		//isOk insert �� ���ϵǴ� ���� ���� �ߵǸ� 1�� ����, �ȵǸ� 0�� ����
		int isOk = svc.register(p);
		System.out.println("��ǰ���"+((isOk>0)?"����":"����"));
		
		
	}
	
}
