package board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		// �Խ��� ������ ó�� Ŭ����
		// CRUD (create:����, read:��ȸ, update:����, delete:����)
		// Board class(�Խñ۹�ȣ, ����, ����, �ۼ���, �ۼ���)
		// ��ȣ�� �ڵ����� ī��Ʈ�ǰ� ����
		// �ۼ����� ���� ��¥ �ð����� ���� �ڵ� ����
		
		BoardManager bm = new BoardManager();
		Scanner scan = new Scanner(System.in);

		int menu = -1;
		while(menu!=6) {
			bm.printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1 : bm.addBoard(scan); break;
			case 2 : bm.searchBoard(scan); break;
			case 3 : bm.modifyBoard(scan); break;
			case 4 : bm.removeBoard(scan); break;
			case 5 : bm.printBoard(); break;
			case 6 : System.out.println("����"); break;
			default : System.out.println("�߸��� �޴�"); break;
			}
		}
		
	}

}
