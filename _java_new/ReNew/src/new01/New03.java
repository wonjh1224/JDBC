package new01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class New03 {

	public static void main(String[] args) {
		/* �÷��� �����ӿ�ũ
		 * 
		 * List, Set, Map
		 * 
		 * -List : ������ ����, �ߺ����� ����, �迭�� ����
		 * -Set : ���� ���� X, �ߺ����� X
		 * -Map : 2������ �����͸� ������ ����, ���� ����X
		 *  - key(�ߺ��Ұ�), value(�ߺ�����)
		 * */
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		for(Integer temp : list) {
			System.out.print(temp+" ");
		}
		
		System.out.println();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("ȫ�浿", 89);
		map.put("��浿", 79);
		map.put("�ڱ浿", 69);
		
		System.out.println(map);
		
		for(String tmp : map.keySet()) {
			System.out.print(tmp+":"+map.get(tmp));
		}

	}

}
