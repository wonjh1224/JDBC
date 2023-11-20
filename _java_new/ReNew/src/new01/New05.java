package new01;

import java.util.HashMap;
import java.util.Scanner;

public class New05 {

	public static void main(String[] args) {
		// New04 클래스의 단어장을 메서드로 분리
		// 메서드에서 리턴한 map을 받아서 출력 
		Scanner scan = new Scanner(System.in);
		
		New05 n = new New05();
		
		System.out.println("개수");
		int a = scan.nextInt();
		HashMap<String, String> map =  n.make(a, scan);
		
		for(String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}

	}
	//기능 : 단어, 의미를 입력받아 map을 구성
	//map은 메서드 안에서 생성하여 리턴
	HashMap<String, String> make(int a, Scanner scan){
		HashMap<String, String> map = new HashMap<String, String>();
		for(int i=0; i<a; i++) {
			System.out.println("단어");
			String word = scan.next();
			System.out.println("의미");
			String mean = scan.next();
			map.put(word, mean);
		}
		return map;
	}

//	String make(int a, Scanner scan) {
//		HashMap<String, String> map = new HashMap<String, String>();
//		for(int i=0; i<a; i++) {
//			
//			System.out.println("단어입력");
//			String word = scan.next();
//			
//			System.out.println("의미입력");
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
