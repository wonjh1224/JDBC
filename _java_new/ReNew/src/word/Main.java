package word;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		WordManager wm = new WordManager();
		Scanner scan = new Scanner(System.in);

		int a = -1;
		while(a!=5) {
			System.out.println("1.�ܾ���|2.�ܾ�˻�|3.�ܾ����");
			System.out.println("4.�ܾ����|5.����|6.�������");
			a = scan.nextInt();
			switch(a) {
			case 1: wm.add(scan); break;
			case 2: wm.search(scan); break;
			case 3: wm.modify(scan); break;
			case 4: wm.printAll(); break;
			case 5: break;
			case 6: wm.filePrint(); break;
			default:System.out.println("�߸��� �Է�");
			
			}
		}
		
		
	}

}
