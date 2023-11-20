package board;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Board {

	// ��ȣ, ����, ����, �ۼ���, �ۼ���
	// ��ȣ, �ۼ��� �ڵ��ۼ�
	// ��ȣ�� ���� ��ü�� ������ ���� ��ü�� ���� equals
	private static int count;
	private int num;
	private String title;
	private String content;
	private String writer;
	private String registerDate;

	public Board() {
		count++;
		this.num = count;
		SimpleDateFormat sh = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		this.registerDate = sh.format(new Date());
	}
	public Board(String title, String writer, String content) {
		this();
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	public Board(int num) {
		this.num = num;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(content, num, registerDate, title, writer);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		if(num != other.num) {
			return false;
		}
		return true;
	}
	
	public void print() {
		System.out.println("-----------------");
		System.out.println("��ȣ:"+num);
		System.out.println("����:"+title+"\n�ۼ���:"+writer+"\n�ۼ���:"+registerDate+"\n����:"+content);
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	
	@Override
	public String toString() {
		return "Board [num=" + num + ", title=" + title+ ", writer=" + writer
				+ ", registerDate=" + registerDate + "]";
	}
	
	

}
