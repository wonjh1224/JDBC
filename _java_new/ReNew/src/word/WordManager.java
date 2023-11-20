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
		System.out.println("�ܾ� ��� :");
		String word = scan.next();
		System.out.println("�ǹ� ��� :");
		String mean = scan.next();
		Word wd = new Word();
		wd.setWord(word);
		wd.setMean(mean);
		list.add(wd);
		System.out.println("��� �Ϸ�");
	}

	void search(Scanner scan) {
		System.out.println("�˻� �ܾ� :");
		String word = scan.next();

		for (Word wd : list) {
			if (wd.getWord().equals(word)) {
				System.out.println(wd.toString());
				return;
			}
		}
		System.out.println("�˻� ��� X");
	}

	void modify(Scanner scan) {
		System.out.println("�˻� �ܾ�:");
		String word = scan.next();
		for (Word wd : list) {
			if (wd.getWord().equals(word)) {
				System.out.println("�ܾ� ����>");
				String s = scan.next();
				wd.setWord(s);
				System.out.println("�ǹ� ����>");
				String m = scan.next();
				wd.setMean(s);
				System.out.println("����");
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
		int cnt = 0; //����Ʈ�� index
		
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
