package board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardManager implements BoardInterface{

	ArrayList<Board>list = new ArrayList<Board>();

	@Override
	public void printMenu() {
		System.out.println("--�Խ���--");
		System.out.println("1.�۾���|2.��ȸ|3.����|4.����|5.��ü���|6.����");
		System.out.println(">> menu : ");
	}

	@Override
	public void addBoard(Scanner scan) {
		System.out.println("--�Խñ� ���--");
		System.out.println("����:");
		scan.nextLine(); //���� ����ó����
		String title = scan.nextLine(); //�������� / scan.next() ���������
		System.out.println("�ۼ���:");
		String writer = scan.next();
		System.out.println("����:");
		scan.nextLine();
		String content =  scan.nextLine();
		Board b = new Board(title, writer, content);
		list.add(b);
		
	}

	@Override
	public void searchBoard(Scanner scan) {
		// �Խñ� �˻�
		// ��ȣ�� ���ٸ� ���� ������ ����
		// 1���� �˻�
		System.out.println("��ȸ�� ��ȣ:");
		int num = scan.nextInt();
		int index = list.indexOf(new Board(num));
		// index�� -1�̶�� ��ü�� ���ٴ� ���� �ǹ�
		if(index != -1) {
			//�ش� �Խñ��� �ִٸ�
			Board tmp = list.get(index);
			tmp.print();
			return;
		}else {
			System.out.println("��ġ�ϴ� ���� �����ϴ�");
		}
		
	}

	@Override
	public void modifyBoard(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("������ ��ȣ �Է�:");
		int num = scan.nextInt();
		int index = list.indexOf(new Board(num));
		if(index!=-1) {
			System.out.println("����:");
			scan.nextLine();
			String title = scan.nextLine();
			System.out.println("����:");
			//���� �Է°��� nextLine()�� ��� �˾Ƽ� ó��
			String content = scan.nextLine();
			Board b = list.get(index); // �˻��� ���� ������ ��ü
			b.setTitle(title);
			b.setContent(content);
			System.out.println("�����Ϸ�");
			return;
		}else {
			System.out.println("�Խñ��� �������� �ʽ��ϴ�");
		}
		
	}

	@Override
	public void removeBoard(Scanner scan) {
		System.out.println("������ ��ȣ �Է�:");
		int num = scan.nextInt();
		int index = list.indexOf(new Board(num));
		if(index != -1) {
			list.remove(index);
			System.out.println("�Խñ� ���� �Ϸ�");
		}else {
			System.out.println("�Խñ��� �������� �ʽ��ϴ�");
		}
		
	}

	@Override
	public void printBoard() {
		// ��ü���
		for(Board b : list) {
			System.out.println(b);
		}
		
	}
	
	
}
