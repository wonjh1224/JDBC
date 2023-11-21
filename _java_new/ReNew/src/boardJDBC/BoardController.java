package boardJDBC;

import java.util.List;
import java.util.Scanner;


public class BoardController {
	
	private Scanner scan;
	private Service svc;
	private boolean flag; 
	
	public BoardController() {
		scan = new Scanner(System.in);
		svc = new BoardServiceImpl();
		flag = true;
		printMenu();
	}
	
	private void printMenu() {
		// flag�� true�� ��� �޴� ���
		while(flag) {
			System.out.println("--�Խ���--");
			System.out.println("1.�۾���|2.�Խñ۸��|3.�ۻ󼼺���");
			System.out.println("4.�ۼ���|5.�ۻ���|6.����");
			System.out.println("menu >>");
			
			int menu = scan.nextInt();
			
			switch (menu) {
			case 1:register(); break;
			case 2:list(); break;
			case 3:detailList(); break;
			case 4:modify(); break;
			case 5:remove(); break;
			default: flag = false; break;
			}
		}
	}

	private void remove() {
		// TODO Auto-generated method stub
		System.out.println("���� �Խñ� ��ȣ>");
		int bno = scan.nextInt();
		
		int isOk = svc.remove(bno);
		System.out.println(isOk>0?"���� ����":"���� ����");
		
	}
	private void modify() {
		// TODO Auto-generated method stub
		System.out.println("���� �Խñ� ��ȣ>");
		int bno = scan.nextInt();
		System.out.println("���� :");
		String title = scan.next();
		System.out.println("���� :");
		scan.nextLine();
		String content = scan.nextLine();
		
		BoardVO b = new BoardVO(bno, title, content);
		
		int isOk = svc.modify(b);
		System.out.println(isOk>0?"���� ����":"���� ����");
		
	}

	private void detailList() {
		// TODO Auto-generated method stub
		System.out.println("�Խñ� ��ȣ > ");
		int bno = scan.nextInt();
		BoardVO b = svc.detail(bno);
		b.printDetail();
		
	}

	private void list() {
		// TODO Auto-generated method stub
		List<BoardVO> list = svc.list();
		for(BoardVO b : list) {
			System.out.println(b);
		}
		
	}

	private void register() {
		// TODO Auto-generated method stub
		System.out.println("����:");
		String title = scan.next();
		System.out.println("�ۼ���:");
		String writer = scan.next();
		scan.nextLine();
		System.out.println("����:");
		String content = scan.nextLine();
		
		BoardVO b = new BoardVO(title, writer, content);
		int isOk = svc.register(b);
		System.out.println("�Խñ۵��"+((isOk>0)?"����":"����"));
		
	}
	
}
