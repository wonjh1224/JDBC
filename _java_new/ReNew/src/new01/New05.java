package new01;

import java.util.HashMap;
import java.util.Scanner;

public class New05 {

	public static void main(String[] args) {
		// New04 Ŭ������ �ܾ����� �޼���� �и�
		// �޼��忡�� ������ map�� �޾Ƽ� ��� 
		Scanner scan = new Scanner(System.in);
		
		New05 n = new New05();
		
		System.out.println("����");
		int a = scan.nextInt();
		HashMap<String, String> map =  n.make(a, scan);
		
		for(String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}

	}
	//��� : �ܾ�, �ǹ̸� �Է¹޾� map�� ����
	//map�� �޼��� �ȿ��� �����Ͽ� ����
	HashMap<String, String> make(int a, Scanner scan){
		HashMap<String, String> map = new HashMap<String, String>();
		for(int i=0; i<a; i++) {
			System.out.println("�ܾ�");
			String word = scan.next();
			System.out.println("�ǹ�");
			String mean = scan.next();
			map.put(word, mean);
		}
		return map;
	}

//	String make(int a, Scanner scan) {
//		HashMap<String, String> map = new HashMap<String, String>();
//		for(int i=0; i<a; i++) {
//			
//			System.out.println("�ܾ��Է�");
//			String word = scan.next();
//			
//			System.out.println("�ǹ��Է�");
//			String mean = scan.next();
//			
//			map.put(word, mean);
//		}
//		
//		return map.toString();
//	
//		
//	}
//	
	
	
}
