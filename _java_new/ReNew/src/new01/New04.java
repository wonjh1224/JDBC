package new01;

import java.util.HashMap;
import java.util.Scanner;

public class New04 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("갯수 입력");
		int cnt = scan.nextInt();
		
		for(int i=0; i<cnt; i++) {
			System.out.println("단어입력");
			String word = scan.next();
			System.out.println("의미입력");
			String mean = scan.next();
			map.put(word, mean);
		}
		
		for(String tmp : map.keySet()) {
			System.out.println(tmp+":"+map.get(tmp));
		}

		scan.close();

	}

}
