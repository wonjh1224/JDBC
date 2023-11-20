package new02;

import java.util.Calendar;

class Counter{
	private static Counter instance;
	private int count;
	
	private Counter() {}
	
	public static Counter getInstance() {
		if(instance == null) {
			instance = new Counter();
		}
		return instance;
	}
	
	public int countMethod() {
		count++;
		return count;
	}
	
}

public class SingletonCount {

	public static void main(String[] args) {
		Counter c1 = Counter.getInstance();
		Counter c2 = Counter.getInstance();

		System.out.println(c1.countMethod());
		System.out.println(c2.countMethod());
		
		if(c1==c2) {
			System.out.println("°°Àº °´Ã¼");
		}else {
			System.out.println("´Ù¸¥ °´Ã¼");
		}
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
	}

}
