package word;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		WordManager wm = new WordManager();
		Scanner scan = new Scanner(System.in);

		int a = -1;
		while(a!=5) {
			System.out.println("1.단어등록|2.단어검색|3.단어수정");
			System.out.println("4.단어출력|5.종료|6.파일출력");
			a = scan.nextInt();
			switch(a) {
			case 1: wm.add(scan); break;
			case 2: wm.search(scan); break;
			case 3: wm.modify(scan); break;
			case 4: wm.printAll(); break;
			case 5: break;
			case 6: wm.filePrint(); break;
			default:System.out.println("잘못된 입력");
			
			}
		}
		
		
	}

}
