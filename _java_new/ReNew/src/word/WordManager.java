package word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WordManager {

	ArrayList<Word> list = new ArrayList<Word>();

	public WordManager() {

	}

	void add(Scanner scan) {
		System.out.println("단어 등록 :");
		String word = scan.next();
		System.out.println("의미 등록 :");
		String mean = scan.next();
		Word wd = new Word();
		wd.setWord(word);
		wd.setMean(mean);
		list.add(wd);
		System.out.println("등록 완료");
	}

	void search(Scanner scan) {
		System.out.println("검색 단어 :");
		String word = scan.next();

		for (Word wd : list) {
			if (wd.getWord().equals(word)) {
				System.out.println(wd.toString());
				return;
			}
		}
		System.out.println("검색 결과 X");
	}

	void modify(Scanner scan) {
		System.out.println("검색 단어:");
		String word = scan.next();
		for (Word wd : list) {
			if (wd.getWord().equals(word)) {
				System.out.println("단어 수정>");
				String s = scan.next();
				wd.setWord(s);
				System.out.println("의미 수정>");
				String m = scan.next();
				wd.setMean(s);
				System.out.println("ㅇㄹ");
			}
		}
	}

	void printAll() {
		for (Word wd : list) {
			System.out.println(wd.toString());
		}
	}



	public void filePrint() throws IOException {
		FileWriter fw = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		StringBuffer sb = new StringBuffer();
		
		String data = "";
		int cnt = 0; //리스트의 index
		
		while(cnt < list.size()) {
			sb.append(list.get(cnt).toString());
			sb.append("\n");
			cnt++;
		}
		data = sb.toString();
		System.out.println(data);
		fw.write(data);
		fw.close();
		
	}

}
