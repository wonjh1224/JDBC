package new01;

import java.util.Scanner;

public class New02 {

	public static void main(String[] args) {
		//
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		// 1���� ���� �Է��� ������ 5�� ����� ���
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��� �Է�");
		
		int a = scan.nextInt();
		
		for(int i=1; i<=a; i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
		
		scan.close();
		

	}

}
