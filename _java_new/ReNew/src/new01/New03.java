package new01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class New03 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크
		 * 
		 * List, Set, Map
		 * 
		 * -List : 순서를 보장, 중복저장 가능, 배열과 동일
		 * -Set : 순서 보장 X, 중복저장 X
		 * -Map : 2가지의 데이터를 쌍으로 저장, 순서 보장X
		 *  - key(중복불가), value(중복가능)
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
		
		map.put("홍길동", 89);
		map.put("김길동", 79);
		map.put("박길동", 69);
		
		System.out.println(map);
		
		for(String tmp : map.keySet()) {
			System.out.print(tmp+":"+map.get(tmp));
		}

	}

}
